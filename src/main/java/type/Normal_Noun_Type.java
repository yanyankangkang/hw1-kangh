
/* First created by JCasGen Mon Sep 22 16:18:58 EDT 2014 */
package type;

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
public class Normal_Noun_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Normal_Noun_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Normal_Noun_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Normal_Noun(addr, Normal_Noun_Type.this);
  			   Normal_Noun_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Normal_Noun(addr, Normal_Noun_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Normal_Noun.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("type.Normal_Noun");
 
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
      jcas.throwFeatMissing("ID", "type.Normal_Noun");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setID(int addr, String v) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "type.Normal_Noun");
    ll_cas.ll_setStringValue(addr, casFeatCode_ID, v);}
    
  
 
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
      jcas.throwFeatMissing("Words", "type.Normal_Noun");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Words);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWords(int addr, String v) {
        if (featOkTst && casFeat_Words == null)
      jcas.throwFeatMissing("Words", "type.Normal_Noun");
    ll_cas.ll_setStringValue(addr, casFeatCode_Words, v);}
    
  
 
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
      jcas.throwFeatMissing("Begin", "type.Normal_Noun");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "type.Normal_Noun");
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
      jcas.throwFeatMissing("End", "type.Normal_Noun");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "type.Normal_Noun");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Normal_Noun_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ID = jcas.getRequiredFeatureDE(casType, "ID", "uima.cas.String", featOkTst);
    casFeatCode_ID  = (null == casFeat_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ID).getCode();

 
    casFeat_Words = jcas.getRequiredFeatureDE(casType, "Words", "uima.cas.String", featOkTst);
    casFeatCode_Words  = (null == casFeat_Words) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Words).getCode();

 
    casFeat_Begin = jcas.getRequiredFeatureDE(casType, "Begin", "uima.cas.Integer", featOkTst);
    casFeatCode_Begin  = (null == casFeat_Begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Begin).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

  }
}



    