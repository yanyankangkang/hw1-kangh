/**
 * @deprecated
 */
package annotator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import type.Sentence;

/**
 * 
 * Split original text into lines consists of ID and words
 * @author Kang Huang
 * @version 1.0 Build on Sep 23, 2014.
 */
public class Sentence_Recognizer extends JCasAnnotator_ImplBase {

  @Override
  /**
   * read original text line by line, and split each line into ID and Words into annotation which stored in aCas. 
   * 
   * @param aCas 
   *          A JCas object provides the starting point for working with the CAS using Java Cover Classes for each type, generated by the utility JCasGen.  
   */
  public void process(JCas aCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
 /*   String text = aCas.getDocumentText();
    String lines[] = text.split("\\n");
    System.out.println(lines.length);
    for (int i = 0; i < lines.length; i++) {
      Sentence Line = new Sentence(aCas);
      String s[] = lines[i].split(" ", 2);
      Line.setID(s[0]);
      Line.setWords(s[1]);
      Line.addToIndexes(aCas);
    }*/
  }
}