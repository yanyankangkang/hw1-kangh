package type;

/* First created by JCasGen Sun Sep 21 17:45:04 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

/**
 * Updated by JCasGen Tue Sep 23 00:57:24 EDT 2014 XML source:
 * /home/mac/workspace/11791/hw1-kangh/src/main/resources/typeSystemDescriptor.xml
 * 
 * 
 */
public class Sentence extends Annotation {
  /**
   * 
   * 
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);

  /**
   * 
   * 
   */
  @SuppressWarnings("hiding")
  public final static int type = typeIndexID;

  /**
   * 
   * @return index of the type
   */
  @Override
  public int getTypeIndexID() {
    return typeIndexID;
  }

  /**
   * Never called. Disable default constructor
   * 
   * 
   */
  protected Sentence() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * 
   * @param addr
   *          low level Feature Structure reference
   * @param type
   *          the type of this Feature Structure
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /**
   * 
   * @param jcas
   *          JCas to which this Feature Structure belongs
   */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();
  }

  /**
   * 
   * @param jcas
   *          JCas to which this Feature Structure belongs
   * @param begin
   *          offset to the begin spot in the SofA
   * @param end
   *          offset to the end spot in the SofA
   */
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /**
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   *
   *  
   */
  private void readObject() {/* default - does nothing empty block */
  }

  // *--------------*
  // * Feature: ID

  /**
   * getter for ID - gets The ID of each sentence
   * 
   * 
   * @return value of the feature
   */
  public String getID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type) jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type) jcasType).casFeatCode_ID);
  }

  /**
   * setter for ID - sets The ID of each sentence
   * 
   * 
   * @param v
   *          value to set into the feature
   */
  public void setID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type) jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type) jcasType).casFeatCode_ID, v);
  }

  // *--------------*
  // * Feature: Words

  /**
   * getter for Words - gets all the words of sentence in each line
   * 
   * 
   * @return value of the feature
   */
  public String getWords() {
    if (Sentence_Type.featOkTst && ((Sentence_Type) jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type) jcasType).casFeatCode_Words);
  }

  /**
   * setter for Words - sets all the words of sentence in each line
   * 
   * 
   * @param v
   *          value to set into the feature
   */
  public void setWords(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type) jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type) jcasType).casFeatCode_Words, v);
  }
}
