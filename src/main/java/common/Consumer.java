package common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Scanner;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;
import type.Gene;
/** Description of class Consumer 
* @author Kang Huang
* @version 1.0 Build on Sep 23, 2014.
*/
public class Consumer extends CasConsumer_ImplBase {
  private File outputFile = null;

  private static String outputPath = "outputFile";

  private Writer writer = null;

  private File testFile = null;

  private HashMap<String, Integer> table = new HashMap<String, Integer>();

  private int hit = 0, miss = 0, words = 0;

  @Override
  public void initialize() throws ResourceInitializationException {
    // System.out.println("*************");
    try {
      outputFile = new File((String) getConfigParameterValue(outputPath));
      writer = new BufferedWriter(new FileWriter(outputFile));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    testFile = new File("src/main/resources/data/sample.out");
    Scanner dict = null;
    try {
      dict = new Scanner(testFile);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    while (dict.hasNext()) {
      table.put(dict.nextLine(), 0);
      words++;
    }
  }

  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    // TODO Auto-generated method stub
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    // HashMap<String, Integer> hash = new HashMap<String, Integer>();
    FSIterator<Annotation> it = jcas.getAnnotationIndex(Gene.type).iterator();
    while (it.hasNext()) {
      Gene res = (Gene) it.next();
      try {
        String ans = res.getID() + "|" + (res.getBegin() - res.getOutershift()) + " "
                + (res.getEnd() - res.getOutershift() - res.getInnershift() - 1) + "|"
                + res.getWords();
        writer.write(ans + "\n");
        if (table.containsKey(ans)) {
          hit++;
        } else {
          miss++;
        }
        // }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    try {
      writer.close();
      System.out.println("Success");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    double P = hit * 1.0 / (hit + miss);
    double R = hit * 1.0 / words;
    System.out.println("Precision: " + P + " " + "Recall: " + R + " " + "F-Meause: " + 2 * P * R
            / (P + R));
  }

}
