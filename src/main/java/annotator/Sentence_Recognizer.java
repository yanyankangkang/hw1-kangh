package annotator;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import type.Sentence;


public class Sentence_Recognizer extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    String text = aCas.getDocumentText();
    String lines[] = text.split("\\n");
    System.out.println(lines.length); 
    for (int i = 0;  i < lines.length; i++){      
     Sentence Line = new Sentence(aCas);
     String s[] = lines[i].split(" ", 2);
    //  System.out.println("*************************"); 
     Line.setID(s[0]);
     Line.setWords(s[1]);
     Line.addToIndexes(aCas);
    }
  }
}