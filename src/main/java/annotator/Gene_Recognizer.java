package annotator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import type.Gene;
import type.Sentence;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

import java.util.Iterator;

public class Gene_Recognizer extends JCasAnnotator_ImplBase {

  private static final int MAX_N_BEST_CHUNKS =10;
  private File modelFile = null;
  private ConfidenceChunker chunker = null;
  @Override
  public void initialize(UimaContext context){
    modelFile = new File("src/ne-en-bio-genetag.HmmChunker");
    try {
      chunker = (ConfidenceChunker) AbstractExternalizable.readObject(modelFile);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }
  @Override
  public void process(JCas aCas) throws AnalysisEngineProcessException {
    FSIterator <Annotation> it = aCas.getAnnotationIndex(Sentence.type).iterator();   
    try {
      chunker = (ConfidenceChunker) AbstractExternalizable.readObject(modelFile);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    int len = 0;
    while (it.hasNext()) {
      Sentence annot = (Sentence) it.next();
      String temp = annot.getWords(); 
      len++;
     /* String words[] = temp.split(" ");
      temp = "";
      for (String word : words){
        temp = String.join("", temp, word);
      }*/
      char[] cs = temp.toCharArray();
      Iterator<Chunk> gene_it  = chunker.nBestChunks(cs,0,cs.length, MAX_N_BEST_CHUNKS);
      while(gene_it.hasNext()) {
          Chunk chunk = gene_it.next();
          double conf = Math.pow(2.0,chunk.score());
          if (conf < 0.7){
            break;
          }
          int start = chunk.start();
          int end = chunk.end();
          String phrase = temp.substring(start,end);
          int outshift = 0, innershift = 0;
          for (int i = 0; i < start; i++){
            if (temp.charAt(i) == ' '){
              outshift++;
            }
          }
          for (int i = start; i < end; i++){
            if (temp.charAt(i) == ' '){
              innershift++;
            }
          }
          Gene gene = new Gene(aCas);
          gene.setBegin(start);
          gene.setEnd(end);
          gene.setID(annot.getID());
          gene.setWords(phrase);
          gene.setConfidence(conf);
          gene.setOutershift(outshift);
          gene.setInnershift(innershift);
          gene.addToIndexes(aCas);
        /*  System.out.println(annot.getID() + " "
                  + "       (" + (start - outshift)
                  + ", " + (end - outshift - innershift - 1)
                  + ")       " + chunk.type()
                  + "         " + phrase);     */   
       }
    }
  }

}
