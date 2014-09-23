

/* First created by JCasGen Mon Sep 22 16:18:58 EDT 2014 */
package type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 22 16:58:58 EDT 2014
 * XML source: /home/mac/workspace/11791/hw1-kangh/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Normal_Noun extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Normal_Noun.class);
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
  protected Normal_Noun() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Normal_Noun(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Normal_Noun(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Normal_Noun(JCas jcas, int begin, int end) {
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
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Normal_Noun");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "type.Normal_Noun");
    jcasType.ll_cas.ll_setStringValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_ID, v);}    
   
    
  //*--------------*
  //* Feature: Words

  /** getter for Words - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWords() {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Normal_Noun");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_Words);}
    
  /** setter for Words - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWords(String v) {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_Words == null)
      jcasType.jcas.throwFeatMissing("Words", "type.Normal_Noun");
    jcasType.ll_cas.ll_setStringValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_Words, v);}    
   
    
  //*--------------*
  //* Feature: Begin

  /** getter for Begin - gets Record the final begin
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "type.Normal_Noun");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets Record the final begin 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "type.Normal_Noun");
    jcasType.ll_cas.ll_setIntValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets Record the final end
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "type.Normal_Noun");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets Record the final end 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Normal_Noun_Type.featOkTst && ((Normal_Noun_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "type.Normal_Noun");
    jcasType.ll_cas.ll_setIntValue(addr, ((Normal_Noun_Type)jcasType).casFeatCode_End, v);}    
  }

    