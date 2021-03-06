package org.wcmda.domaindsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.wcmda.domaindsl.services.DomainDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'datatype'", "'entity'", "'extends'", "'min'", "':'", "'max'", "'opt'", "'pattern'", "'many'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainDsl.g"; }



     	private DomainDslGrammarAccess grammarAccess;

        public InternalDomainDslParser(TokenStream input, DomainDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected DomainDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainDsl.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalDomainDsl.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalDomainDsl.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalDomainDsl.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalDomainDsl.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainDsl.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalDomainDsl.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalDomainDsl.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.wcmda.domaindsl.DomainDsl.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDomainDsl.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDomainDsl.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDomainDsl.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDomainDsl.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:113:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // InternalDomainDsl.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // InternalDomainDsl.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainDsl.g:115:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainDsl.g:124:3: this_Type_1= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainDsl.g:133:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDomainDsl.g:145:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDomainDsl.g:145:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDomainDsl.g:146:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDomainDsl.g:152:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:158:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalDomainDsl.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalDomainDsl.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalDomainDsl.g:160:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalDomainDsl.g:164:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDomainDsl.g:165:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDomainDsl.g:165:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDomainDsl.g:166:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.wcmda.domaindsl.DomainDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainDsl.g:187:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==14||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainDsl.g:188:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalDomainDsl.g:188:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalDomainDsl.g:189:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.wcmda.domaindsl.DomainDsl.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // InternalDomainDsl.g:214:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDomainDsl.g:214:47: (iv_ruleImport= ruleImport EOF )
            // InternalDomainDsl.g:215:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDomainDsl.g:221:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:227:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDomainDsl.g:228:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDomainDsl.g:228:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDomainDsl.g:229:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDomainDsl.g:233:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDomainDsl.g:234:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDomainDsl.g:234:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDomainDsl.g:235:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.wcmda.domaindsl.DomainDsl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDomainDsl.g:256:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDomainDsl.g:256:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDomainDsl.g:257:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDomainDsl.g:263:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:269:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDomainDsl.g:270:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDomainDsl.g:270:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDomainDsl.g:271:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDomainDsl.g:281:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainDsl.g:282:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDomainDsl.g:292:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDomainDsl.g:292:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDomainDsl.g:293:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDomainDsl.g:299:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDomainDsl.g:305:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDomainDsl.g:306:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDomainDsl.g:306:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDomainDsl.g:307:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDomainDsl.g:314:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainDsl.g:315:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleType"
    // InternalDomainDsl.g:332:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDomainDsl.g:332:45: (iv_ruleType= ruleType EOF )
            // InternalDomainDsl.g:333:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainDsl.g:339:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:345:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalDomainDsl.g:346:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalDomainDsl.g:346:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainDsl.g:347:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainDsl.g:356:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDomainDsl.g:368:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDomainDsl.g:368:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDomainDsl.g:369:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDomainDsl.g:375:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDomainDsl.g:381:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDomainDsl.g:382:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDomainDsl.g:382:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDomainDsl.g:383:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDomainDsl.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainDsl.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainDsl.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalDomainDsl.g:389:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainDsl.g:409:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomainDsl.g:409:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomainDsl.g:410:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainDsl.g:416:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:422:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalDomainDsl.g:423:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalDomainDsl.g:423:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalDomainDsl.g:424:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDomainDsl.g:428:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainDsl.g:429:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainDsl.g:429:4: (lv_name_1_0= RULE_ID )
            // InternalDomainDsl.g:430:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomainDsl.g:446:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainDsl.g:447:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDomainDsl.g:451:4: ( ( ruleQualifiedName ) )
                    // InternalDomainDsl.g:452:5: ( ruleQualifiedName )
                    {
                    // InternalDomainDsl.g:452:5: ( ruleQualifiedName )
                    // InternalDomainDsl.g:453:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomainDsl.g:472:3: ( (lv_features_5_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainDsl.g:473:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalDomainDsl.g:473:4: (lv_features_5_0= ruleFeature )
            	    // InternalDomainDsl.g:474:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"org.wcmda.domaindsl.DomainDsl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleValidator"
    // InternalDomainDsl.g:499:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // InternalDomainDsl.g:499:50: (iv_ruleValidator= ruleValidator EOF )
            // InternalDomainDsl.g:500:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // InternalDomainDsl.g:506:1: ruleValidator returns [EObject current=null] : ( ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) | ( (lv_name_6_0= 'opt' ) ) | ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token lv_svalue_9_0=null;


        	enterRule();

        try {
            // InternalDomainDsl.g:512:2: ( ( ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) | ( (lv_name_6_0= 'opt' ) ) | ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) ) ) )
            // InternalDomainDsl.g:513:2: ( ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) | ( (lv_name_6_0= 'opt' ) ) | ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) ) )
            {
            // InternalDomainDsl.g:513:2: ( ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) ) | ( (lv_name_6_0= 'opt' ) ) | ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDomainDsl.g:514:3: ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
                    {
                    // InternalDomainDsl.g:514:3: ( ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
                    // InternalDomainDsl.g:515:4: ( (lv_name_0_0= 'min' ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
                    {
                    // InternalDomainDsl.g:515:4: ( (lv_name_0_0= 'min' ) )
                    // InternalDomainDsl.g:516:5: (lv_name_0_0= 'min' )
                    {
                    // InternalDomainDsl.g:516:5: (lv_name_0_0= 'min' )
                    // InternalDomainDsl.g:517:6: lv_name_0_0= 'min'
                    {
                    lv_name_0_0=(Token)match(input,20,FOLLOW_11); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getValidatorAccess().getNameMinKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "min");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidatorAccess().getColonKeyword_0_1());
                    			
                    // InternalDomainDsl.g:533:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalDomainDsl.g:534:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalDomainDsl.g:534:5: (lv_value_2_0= RULE_INT )
                    // InternalDomainDsl.g:535:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getValidatorAccess().getValueINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainDsl.g:553:3: ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalDomainDsl.g:553:3: ( ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalDomainDsl.g:554:4: ( (lv_name_3_0= 'max' ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalDomainDsl.g:554:4: ( (lv_name_3_0= 'max' ) )
                    // InternalDomainDsl.g:555:5: (lv_name_3_0= 'max' )
                    {
                    // InternalDomainDsl.g:555:5: (lv_name_3_0= 'max' )
                    // InternalDomainDsl.g:556:6: lv_name_3_0= 'max'
                    {
                    lv_name_3_0=(Token)match(input,22,FOLLOW_11); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getValidatorAccess().getNameMaxKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_3_0, "max");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getValidatorAccess().getColonKeyword_1_1());
                    			
                    // InternalDomainDsl.g:572:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalDomainDsl.g:573:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalDomainDsl.g:573:5: (lv_value_5_0= RULE_INT )
                    // InternalDomainDsl.g:574:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getValidatorAccess().getValueINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDomainDsl.g:592:3: ( (lv_name_6_0= 'opt' ) )
                    {
                    // InternalDomainDsl.g:592:3: ( (lv_name_6_0= 'opt' ) )
                    // InternalDomainDsl.g:593:4: (lv_name_6_0= 'opt' )
                    {
                    // InternalDomainDsl.g:593:4: (lv_name_6_0= 'opt' )
                    // InternalDomainDsl.g:594:5: lv_name_6_0= 'opt'
                    {
                    lv_name_6_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_name_6_0, grammarAccess.getValidatorAccess().getNameOptKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValidatorRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_6_0, "opt");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDomainDsl.g:607:3: ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) )
                    {
                    // InternalDomainDsl.g:607:3: ( ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) ) )
                    // InternalDomainDsl.g:608:4: ( (lv_name_7_0= 'pattern' ) ) otherlv_8= ':' ( (lv_svalue_9_0= RULE_STRING ) )
                    {
                    // InternalDomainDsl.g:608:4: ( (lv_name_7_0= 'pattern' ) )
                    // InternalDomainDsl.g:609:5: (lv_name_7_0= 'pattern' )
                    {
                    // InternalDomainDsl.g:609:5: (lv_name_7_0= 'pattern' )
                    // InternalDomainDsl.g:610:6: lv_name_7_0= 'pattern'
                    {
                    lv_name_7_0=(Token)match(input,24,FOLLOW_11); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getValidatorAccess().getNamePatternKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_7_0, "pattern");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getValidatorAccess().getColonKeyword_3_1());
                    			
                    // InternalDomainDsl.g:626:4: ( (lv_svalue_9_0= RULE_STRING ) )
                    // InternalDomainDsl.g:627:5: (lv_svalue_9_0= RULE_STRING )
                    {
                    // InternalDomainDsl.g:627:5: (lv_svalue_9_0= RULE_STRING )
                    // InternalDomainDsl.g:628:6: lv_svalue_9_0= RULE_STRING
                    {
                    lv_svalue_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_svalue_9_0, grammarAccess.getValidatorAccess().getSvalueSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"svalue",
                    							lv_svalue_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainDsl.g:649:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalDomainDsl.g:649:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalDomainDsl.g:650:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainDsl.g:656:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )? ( (lv_valdiators_6_0= ruleValidator ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_defaultVal_5_0=null;
        EObject lv_valdiators_6_0 = null;



        	enterRule();

        try {
            // InternalDomainDsl.g:662:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )? ( (lv_valdiators_6_0= ruleValidator ) )* ) )
            // InternalDomainDsl.g:663:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )? ( (lv_valdiators_6_0= ruleValidator ) )* )
            {
            // InternalDomainDsl.g:663:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )? ( (lv_valdiators_6_0= ruleValidator ) )* )
            // InternalDomainDsl.g:664:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )? ( (lv_valdiators_6_0= ruleValidator ) )*
            {
            // InternalDomainDsl.g:664:3: ( (lv_many_0_0= 'many' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainDsl.g:665:4: (lv_many_0_0= 'many' )
                    {
                    // InternalDomainDsl.g:665:4: (lv_many_0_0= 'many' )
                    // InternalDomainDsl.g:666:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,25,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalDomainDsl.g:678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainDsl.g:679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainDsl.g:679:4: (lv_name_1_0= RULE_ID )
            // InternalDomainDsl.g:680:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalDomainDsl.g:700:3: ( ( ruleQualifiedName ) )
            // InternalDomainDsl.g:701:4: ( ruleQualifiedName )
            {
            // InternalDomainDsl.g:701:4: ( ruleQualifiedName )
            // InternalDomainDsl.g:702:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainDsl.g:716:3: (otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainDsl.g:717:4: otherlv_4= '=' ( (lv_defaultVal_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalDomainDsl.g:721:4: ( (lv_defaultVal_5_0= RULE_STRING ) )
                    // InternalDomainDsl.g:722:5: (lv_defaultVal_5_0= RULE_STRING )
                    {
                    // InternalDomainDsl.g:722:5: (lv_defaultVal_5_0= RULE_STRING )
                    // InternalDomainDsl.g:723:6: lv_defaultVal_5_0= RULE_STRING
                    {
                    lv_defaultVal_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_defaultVal_5_0, grammarAccess.getFeatureAccess().getDefaultValSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultVal",
                    							lv_defaultVal_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomainDsl.g:740:3: ( (lv_valdiators_6_0= ruleValidator ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20||(LA12_0>=22 && LA12_0<=24)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomainDsl.g:741:4: (lv_valdiators_6_0= ruleValidator )
            	    {
            	    // InternalDomainDsl.g:741:4: (lv_valdiators_6_0= ruleValidator )
            	    // InternalDomainDsl.g:742:5: lv_valdiators_6_0= ruleValidator
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getValdiatorsValidatorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_valdiators_6_0=ruleValidator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valdiators",
            	    						lv_valdiators_6_0,
            	    						"org.wcmda.domaindsl.DomainDsl.Validator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000064802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000066800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000005D00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001D00002L});

}