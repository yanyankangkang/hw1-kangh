package annotator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import org.apache.uima.resource.ResourceInitializationException;

import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class PosTagNamedEntityRecognizer {

  private StanfordCoreNLP pipeline;
 // static private HashMap<String, Integer> dict = new HashMap<String, Integer>();
  //private File inputFile;
  public PosTagNamedEntityRecognizer() throws ResourceInitializationException, FileNotFoundException {
    Properties props = new Properties();
    props.put("annotators", "tokenize, ssplit, pos");
    pipeline = new StanfordCoreNLP(props);
  /*    inputFile = new File("src/main/resources/data/dict.in");
      Scanner in = new Scanner(inputFile); 
      while(in.hasNext()){
       String word = in.nextLine();   
         if (word.endsWith("~withdrawn")){ 
        //   System.out.println("**********");
           word = word.substring(0, word.length() - "~withdrawn".length());
        //   System.out.println("**********");
         }
         dict.put(word, 1);
      //   System.out.println(word + " ");
      
      }*/
  }
 /* public boolean deep(CoreLabel token){
    String s = token.originalText();
    int pos = token.beginPosition();
    if (s.length() > 10){
      return true;
    }
    else {
    
     if(pos > 0 && s.length() > 5){
      for (int i = 0; i < s.length(); i++){
        if(s.charAt(i) >='A' && s.charAt(i) <= 'Z'){
          return true;
        }
      }
    }
     else{
       return dict.containsKey(s);
     }
    }
    return false;
  }*/
  public Map<Integer, Integer> getGeneSpans(String text) {
    Map<Integer, Integer> begin2end = new HashMap<Integer, Integer>();
    Annotation document = new Annotation(text);
    pipeline.annotate(document);
    List<CoreMap> sentences = document.get(SentencesAnnotation.class);
    for (CoreMap sentence : sentences) {
      List<CoreLabel> candidate = new ArrayList<CoreLabel>();
      for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
        String pos = token.get(PartOfSpeechAnnotation.class);
        if (pos.startsWith("NN") || pos.startsWith("JJ")) {
        //  System.out.println(token);
          candidate.add(token);
        } else if (candidate.size() > 0) {
          int begin = candidate.get(0).beginPosition();
          int end = candidate.get(candidate.size() - 1).endPosition();
          begin2end.put(begin, end);
          candidate.clear();
        }
      }
      if (candidate.size() > 0) {
        int begin = candidate.get(0).beginPosition();
        int end = candidate.get(candidate.size() - 1).endPosition();
        begin2end.put(begin, end);
        candidate.clear();
      }
    }
    return begin2end;
  }

}
