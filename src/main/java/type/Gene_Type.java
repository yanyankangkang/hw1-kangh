package type;

/* First created by JCasGen Sun Sep 21 17:45:04 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Sep 22 16:58:58 EDT 2014
 * @generated */
public class Gene_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("type.Gene");
 
  /** @generated */
  final Feature casFeat_ID;
  /** @generated */
  final int     casFeatCode_ID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getID(int addr) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "type.Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setID(int addr, String v) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "type.Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_ID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Begin;
  /** @generated */
  final int     casFeatCode_Begin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "type.Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "type.Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_Begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "type.Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "type.Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Words;
  /** @generated */
  final int     casFeatCode_Words;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWords(int addr) {
        if (featOkTst && casFeat_Words == null)
      jcas.throwFeatMissing("Words", "type.Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Words);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWords(int addr, String v) {
        if (featOkTst && casFeat_Words == null)
      jcas.throwFeatMissing("Words", "type.Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_Words, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "type.Gene");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "type.Gene");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Outershift;
  /** @generated */
  final int     casFeatCode_Outershift;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOutershift(int addr) {
        if (featOkTst && casFeat_Outershift == null)
      jcas.throwFeatMissing("Outershift", "type.Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Outershift);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOutershift(int addr, int v) {
        if (featOkTst && casFeat_Outershift == null)
      jcas.throwFeatMissing("Outershift", "type.Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_Outershift, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Innershift;
  /** @generated */
  final int     casFeatCode_Innershift;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInnershift(int addr) {
        if (featOkTst && casFeat_Innershift == null)
      jcas.throwFeatMissing("Innershift", "type.Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Innershift);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInnershift(int addr, int v) {
        if (featOkTst && casFeat_Innershift == null)
      jcas.throwFeatMissing("Innershift", "type.Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_Innershift, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ID = jcas.getRequiredFeatureDE(casType, "ID", "uima.cas.String", featOkTst);
    casFeatCode_ID  = (null == casFeat_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ID).getCode();

 
    casFeat_Begin = jcas.getRequiredFeatureDE(casType, "Begin", "uima.cas.Integer", featOkTst);
    casFeatCode_Begin  = (null == casFeat_Begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Begin).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Words = jcas.getRequiredFeatureDE(casType, "Words", "uima.cas.String", featOkTst);
    casFeatCode_Words  = (null == casFeat_Words) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Words).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Double", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

 
    casFeat_Outershift = jcas.getRequiredFeatureDE(casType, "Outershift", "uima.cas.Integer", featOkTst);
    casFeatCode_Outershift  = (null == casFeat_Outershift) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Outershift).getCode();

 
    casFeat_Innershift = jcas.getRequiredFeatureDE(casType, "Innershift", "uima.cas.Integer", featOkTst);
    casFeatCode_Innershift  = (null == casFeat_Innershift) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Innershift).getCode();

  }
}



    