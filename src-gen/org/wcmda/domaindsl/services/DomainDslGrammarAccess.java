/*
 * generated by Xtext 2.12.0
 */
package org.wcmda.domaindsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DomainDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//	elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractElement:
		//	PackageDeclaration | Type | Import;
		@Override public ParserRule getRule() { return rule; }
		
		//PackageDeclaration | Type | Import
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }
		
		//Import
		public RuleCall getImportParserRuleCall_2() { return cImportParserRuleCall_2; }
	}
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PackageDeclaration:
		//	'package' name=QualifiedName '{'
		//	elements+=AbstractElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName '{' elements+=AbstractElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_3_0() { return cElementsAbstractElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ETypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.EType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cNameIntKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLongKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDoubleKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cCurrencyKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cDateKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cDateTimeKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cTimeStampKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		
		//EType:
		//	name='Int' | 'String' | 'Long' | 'Double' | 'Currency' | 'Date' | 'DateTime' | 'TimeStamp';
		@Override public ParserRule getRule() { return rule; }
		
		//name='Int' | 'String' | 'Long' | 'Double' | 'Currency' | 'Date' | 'DateTime' | 'TimeStamp'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name='Int'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'Int'
		public Keyword getNameIntKeyword_0_0() { return cNameIntKeyword_0_0; }
		
		//'String'
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }
		
		//'Long'
		public Keyword getLongKeyword_2() { return cLongKeyword_2; }
		
		//'Double'
		public Keyword getDoubleKeyword_3() { return cDoubleKeyword_3; }
		
		//'Currency'
		public Keyword getCurrencyKeyword_4() { return cCurrencyKeyword_4; }
		
		//'Date'
		public Keyword getDateKeyword_5() { return cDateKeyword_5; }
		
		//'DateTime'
		public Keyword getDateTimeKeyword_6() { return cDateTimeKeyword_6; }
		
		//'TimeStamp'
		public Keyword getTimeStampKeyword_7() { return cTimeStampKeyword_7; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	DataType | Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//	'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{'
		//	features+=Feature*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{' features+=Feature* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity|QualifiedName]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ValueTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.valueType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//valueType:
		//	INT | STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//INT | STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}
	public class ValidatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Validator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Keyword cNameMinKeyword_0_0_0 = (Keyword)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_0_2_0 = (RuleCall)cValueAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cNameMaxKeyword_1_0_0 = (Keyword)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValueAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_1_2_0 = (RuleCall)cValueAssignment_1_2.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cNameOptKeyword_2_0 = (Keyword)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cNameAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final Keyword cNamePatternKeyword_3_0_0 = (Keyword)cNameAssignment_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cSvalueAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cSvalueSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cSvalueAssignment_3_2.eContents().get(0);
		
		//Validator:
		//	name='min' ':' value=INT | name='max' ':' value=INT | name='opt' | name='pattern' ':' svalue=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name='min' ':' value=INT | name='max' ':' value=INT | name='opt' | name='pattern' ':' svalue=STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name='min' ':' value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//name='min'
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//'min'
		public Keyword getNameMinKeyword_0_0_0() { return cNameMinKeyword_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//value=INT
		public Assignment getValueAssignment_0_2() { return cValueAssignment_0_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_2_0() { return cValueINTTerminalRuleCall_0_2_0; }
		
		//name='max' ':' value=INT
		public Group getGroup_1() { return cGroup_1; }
		
		//name='max'
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//'max'
		public Keyword getNameMaxKeyword_1_0_0() { return cNameMaxKeyword_1_0_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//value=INT
		public Assignment getValueAssignment_1_2() { return cValueAssignment_1_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_2_0() { return cValueINTTerminalRuleCall_1_2_0; }
		
		//name='opt'
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//'opt'
		public Keyword getNameOptKeyword_2_0() { return cNameOptKeyword_2_0; }
		
		//name='pattern' ':' svalue=STRING
		public Group getGroup_3() { return cGroup_3; }
		
		//name='pattern'
		public Assignment getNameAssignment_3_0() { return cNameAssignment_3_0; }
		
		//'pattern'
		public Keyword getNamePatternKeyword_3_0_0() { return cNamePatternKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//svalue=STRING
		public Assignment getSvalueAssignment_3_2() { return cSvalueAssignment_3_2; }
		
		//STRING
		public RuleCall getSvalueSTRINGTerminalRuleCall_3_2_0() { return cSvalueSTRINGTerminalRuleCall_3_2_0; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.wcmda.domaindsl.DomainDsl.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cManyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cManyManyKeyword_0_0 = (Keyword)cManyAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeTypeCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cTypeTypeCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEqualsSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDefaultValAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDefaultValSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDefaultValAssignment_4_1.eContents().get(0);
		private final Assignment cValdiatorsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValdiatorsValidatorParserRuleCall_5_0 = (RuleCall)cValdiatorsAssignment_5.eContents().get(0);
		
		//Feature:
		//	many?='many'? name=ID ':' type=[Type|QualifiedName] ('=' defaultVal=STRING)? valdiators+=Validator*;
		@Override public ParserRule getRule() { return rule; }
		
		//many?='many'? name=ID ':' type=[Type|QualifiedName] ('=' defaultVal=STRING)? valdiators+=Validator*
		public Group getGroup() { return cGroup; }
		
		//many?='many'?
		public Assignment getManyAssignment_0() { return cManyAssignment_0; }
		
		//'many'
		public Keyword getManyManyKeyword_0_0() { return cManyManyKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[Type|QualifiedName]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_3_0() { return cTypeTypeCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_3_0_1() { return cTypeTypeQualifiedNameParserRuleCall_3_0_1; }
		
		//('=' defaultVal=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'='
		public Keyword getEqualsSignKeyword_4_0() { return cEqualsSignKeyword_4_0; }
		
		//defaultVal=STRING
		public Assignment getDefaultValAssignment_4_1() { return cDefaultValAssignment_4_1; }
		
		//STRING
		public RuleCall getDefaultValSTRINGTerminalRuleCall_4_1_0() { return cDefaultValSTRINGTerminalRuleCall_4_1_0; }
		
		//valdiators+=Validator*
		public Assignment getValdiatorsAssignment_5() { return cValdiatorsAssignment_5; }
		
		//Validator
		public RuleCall getValdiatorsValidatorParserRuleCall_5_0() { return cValdiatorsValidatorParserRuleCall_5_0; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final AbstractElementElements pAbstractElement;
	private final PackageDeclarationElements pPackageDeclaration;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final ETypeElements pEType;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final ValueTypeElements pValueType;
	private final ValidatorElements pValidator;
	private final FeatureElements pFeature;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pEType = new ETypeElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pValueType = new ValueTypeElements();
		this.pValidator = new ValidatorElements();
		this.pFeature = new FeatureElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.wcmda.domaindsl.DomainDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Domainmodel:
	//	elements+=AbstractElement*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//AbstractElement:
	//	PackageDeclaration | Type | Import;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//PackageDeclaration:
	//	'package' name=QualifiedName '{'
	//	elements+=AbstractElement*
	//	'}';
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//EType:
	//	name='Int' | 'String' | 'Long' | 'Double' | 'Currency' | 'Date' | 'DateTime' | 'TimeStamp';
	public ETypeElements getETypeAccess() {
		return pEType;
	}
	
	public ParserRule getETypeRule() {
		return getETypeAccess().getRule();
	}
	
	//Type:
	//	DataType | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//	'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{'
	//	features+=Feature*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//valueType:
	//	INT | STRING;
	public ValueTypeElements getValueTypeAccess() {
		return pValueType;
	}
	
	public ParserRule getValueTypeRule() {
		return getValueTypeAccess().getRule();
	}
	
	//Validator:
	//	name='min' ':' value=INT | name='max' ':' value=INT | name='opt' | name='pattern' ':' svalue=STRING;
	public ValidatorElements getValidatorAccess() {
		return pValidator;
	}
	
	public ParserRule getValidatorRule() {
		return getValidatorAccess().getRule();
	}
	
	//Feature:
	//	many?='many'? name=ID ':' type=[Type|QualifiedName] ('=' defaultVal=STRING)? valdiators+=Validator*;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
