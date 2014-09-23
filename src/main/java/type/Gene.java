package type;


/* First created by JCasGen Sun Sep 21 17:45:04 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 22 16:58:58 EDT 2014
 * XML source: /home/mac/workspace/11791/hw1-kangh/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ID

  /** getter for ID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_ID, v);}    
   
    
  //*--------------*
  //* Feature: Begin

  /** getter for Begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "type.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "type.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "type.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "type.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Words

  /** getter for Words - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWords() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_Words);}
    
  /** setter for Words - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWords(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_Words, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "type.Gene");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Gene_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "type.Gene");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Gene_Type)jcasType).casFeatCode_Confidence, v);}    
   
    
  //*--------------*
  //* Feature: Outershift

  /** getter for Outershift - gets record the shift before the words
   * @generated
   * @return value of the feature 
   */
  public int getOutershift() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Outershift == null)
      jcasType.jcas.throwFeatMissing("Outershift", "type.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Outershift);}
    
  /** setter for Outershift - sets record the shift before the words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutershift(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Outershift == null)
      jcasType.jcas.throwFeatMissing("Outershift", "type.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Outershift, v);}    
   
    
  //*--------------*
  //* Feature: Innershift

  /** getter for Innershift - gets Record blanks inside the words
   * @generated
   * @return value of the feature 
   */
  public int getInnershift() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Innershift == null)
      jcasType.jcas.throwFeatMissing("Innershift", "type.Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Innershift);}
    
  /** setter for Innershift - sets Record blanks inside the words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInnershift(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Innershift == null)
      jcasType.jcas.throwFeatMissing("Innershift", "type.Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Innershift, v);}    
  }

    