package annotator;

import java.io.FileNotFoundException;
import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import type.Gene;
import type.Normal_Noun;
import type.Sentence;

public class NormalNone_Recognizer extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator <Annotation> it = aJCas.getAnnotationIndex(Gene.type).iterator();
    PosTagNamedEntityRecognizer recognizer = null;
      try {
       recognizer = new PosTagNamedEntityRecognizer();
      } catch (ResourceInitializationException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    while(it.hasNext()){
      Gene gene = (Gene)it.next();
    //  System.out.println("******************");
      String temp = gene.getWords();
      Map<Integer, Integer> index = recognizer.getGeneSpans(temp);
       int Begin = gene.getBegin() - gene.getOutershift();
    //  System.out.println(gene.getID());
      for (Integer id : index.keySet()){
       
          int start = id, end = index.get(id);
          int outershift = 0, innershift = 0;
          String word = temp.substring(start, end);
        //  System.out.println(word);
          //System.out.println(id + " " + end);
          for (int i = 0; i < start; i++){
            if (temp.charAt(i) == ' '){
              outershift++;
            }
          }
          for (int i = start; i < end; i++){
            if (temp.charAt(i) == ' '){
              innershift++;
            }
          }
          Normal_Noun NN = new Normal_Noun(aJCas);
          int head = Begin + id - outershift;
          int tail = Begin +  end - outershift - innershift - 1;
          NN.setBegin(head);
          NN.setEnd(tail);
          NN.setID(gene.getID());
          NN.setWords(word);
          NN.addToIndexes(aJCas);
      /*    System.out.println(NN.getID() + " "
                  + "       (" + NN.getBegin()
                  + ", " + NN.getEnd()
                  + ")       " 
                  + "         " + NN.getWords());    */   
      }
    }
  }

}
