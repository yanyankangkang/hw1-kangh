package common;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;


public class reader extends CollectionReader_ImplBase {

  private File InputFile;
  private boolean read_flag = false; 
  public void initialize() throws ResourceInitializationException {
 //   System.out.println((String) getConfigParameterValue("InputFile"));
        InputFile = new File((String) getConfigParameterValue("InputFile"));
  }
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub
    
    JCas jcas = null;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }
    Scanner reader = new Scanner(InputFile);
    String text = "";
    int lines = 0;
  while(reader.hasNext()){
  //  while(lines++ < 20){
      text += reader.nextLine();
      text += "\n";
    }
   // System.out.println("end");
    jcas.setDocumentText(text); 
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub
  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    if (!read_flag){
      read_flag = true;
      return true;
    }
    return false;
  }

}
