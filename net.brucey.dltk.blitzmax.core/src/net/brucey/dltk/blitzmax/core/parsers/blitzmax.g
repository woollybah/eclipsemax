grammar blitzmax;
//options{
//	backtrack=true;
//}
@lexer::header {
package net.brucey.dltk.blitzmax.core.parsers;
}

@parser::header {
package net.brucey.dltk.blitzmax.core.parsers;

import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxBlock;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxConstDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxConstants;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxFieldDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxForStatement;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxFunctionDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxGlobalDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxImportStatement;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxLocalDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxMethodDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxModuleDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxObjectType;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxPrimitiveType;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxStringLiteral;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxStringType;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxType;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxTypeDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxTypeReference;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxVariableDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxVariableReference;
import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxFunctionExpression;
import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxModuleNameExpression;
import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxNumericLiteral;
import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxStrictExpression;
import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxTypedefExpression;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.Argument;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.declarations.FieldDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.expressions.Literal;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.references.VariableReference;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.statements.Statement;

import java.util.Iterator;
}
@lexer::members {
/** Handles context-sensitive lexing of implicit line joining such as
 *  the case where newline is ignored in cases like this:
 *  a = [3,
 *       4]
 */
public int implicitLineJoiningLevel = 0;
public int startPos=-1;
public void emitErrorMessage(String msg) {
}
}

@parser::members {
public DLTKBlitzMaxErrorReporter reporter;
	
public BlitzMaxModuleDeclaration decl;
	
public int length;
public void emitErrorMessage(String msg) {
	reporter.reportMessage(msg);
}
public void reportError(RecognitionException e) {
	if( reporter != null ) {
		reporter.reportError(e);
	}
}
}

@rulecatch {
catch (RecognitionException re) {
	if( reporter != null ) {
		reporter.reportError(re);
	}
	recover(input,re);
}
catch (Throwable extre) {
	//System.err.println(t);
	if( reporter != null ) {
		reporter.reportThrowable(extre);
	}
}
}

file_input:
    	(
    		//NEWLINE
    		//|
    		main_statements[decl.getStatements()]
    		/*	{ 
    				if( s != null ) {
    					Iterator i = s.iterator();
    					while( i.hasNext() ) {
    						Statement sst = (Statement)i.next();
    						if( sst != null ) {
		    					decl.addStatement( sst );
    						}
    					}
    				}
    			} */
    	
    	)*
    	EOF
	;

main_statements[List statements]
	:	(SUPERSTRICT NEWLINE
			{
				statements.add(new BlitzMaxStrictExpression(true));
			}
		| STRICT NEWLINE
			{
				statements.add(new BlitzMaxStrictExpression(false));
			}
		)
		| framework_stmt
		| module_stmt
		| moduleinfo_stmt
		| s1 = import_stmt
			{
				statements.add(s1);
			}
		| s3 = type_block
			{
				statements.add(s3);
			}
		| fb = function_block
			{
				statements.add(fb);
			}
		| statement_list[statements]
	;

type_block returns [ BlitzMaxTypeDeclaration typeDeclaration = null ]
	:	t = TYPE
		n = IDENTIFIER
		{
			typeDeclaration = new BlitzMaxTypeDeclaration(n.getText(), ((CommonToken) n).getStartIndex(),((CommonToken) n).getStopIndex()+1,
				((CommonToken) t).getStartIndex(),((CommonToken) t).getStopIndex() + 1);
			decl.addType(typeDeclaration);
		}
		(
			EXTENDS
			sup = IDENTIFIER

			{
				typeDeclaration.addSuperClass(new BlitzMaxTypeReference(sup));
			}
		)?
		
		( ABSTRACT 
			{
				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
			}
			
		| FINAL
		
			{
				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
			}
		
		)? 
		NEWLINE
		
		tcl = type_content_list
		{
			typeDeclaration.setBody(tcl);
		}
		
		( et = END TYPE | et = 'endtype' )
		{
			typeDeclaration.setEnd(((CommonToken) et).getStopIndex()+1);
			
			List s = typeDeclaration.getBody().getStatements();
			for (Iterator i = s.iterator(); i.hasNext();) {
				ASTNode node = (ASTNode) i.next();
				if (node instanceof FieldDeclaration) {
					typeDeclaration.getFieldList().add(node);
				}
			}
		}
		NEWLINE
	;

type_content_list returns [ Block typeContent = new Block() ]
	:	(
			const_def[typeContent.getStatements()]
			| global_def[typeContent.getStatements()]
			| field_def[typeContent.getStatements()]
			| mb = method_block
				{
					typeContent.addStatement(mb);
				}
			| fb = function_block
				{
					typeContent.addStatement(fb);
				}
			| rem_block
			| NEWLINE
		)*
	;
	
method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ]
	:	m = METHOD
		(
			(fd = function_definition
				{
					methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
				}
			
			( ABSTRACT 
				{
					methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
				}
				
			| 
			(
			FINAL
			
				{
					methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
				}
			
			)?
			)
			| n = NEW LPAREN rp = RPAREN
				{
					methodDeclaration = new BlitzMaxMethodDeclaration(m, new BlitzMaxFunctionExpression(n, null, null, rp));
				}
			| n = DELETE LPAREN rp = RPAREN
				{
					methodDeclaration = new BlitzMaxMethodDeclaration(m, new BlitzMaxFunctionExpression(n, null, null, rp));
				}
		)
		NEWLINE
		b = statement_block
			{
				methodDeclaration.acceptBody(b, true);
			}
		( em = END METHOD | em = 'endmethod' )
		{
			methodDeclaration.setEnd(((CommonToken) em).getStopIndex()+1);
		}
		)
		NEWLINE
	;

field_def [List statements]
	: FIELD 
		args = argument_list [false]
		{
			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					statements.add(new BlitzMaxFieldDeclaration((Declaration)i.next()));
				}
			}
		}
		NEWLINE
	;

global_def [List statements]
	: GLOBAL 
		args = argument_list [false]
		{
			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					statements.add(new BlitzMaxGlobalDeclaration((Declaration)i.next()));
				}
			}
		}
		NEWLINE
	;

const_def [List statements]
	: CONST
		args = argument_list [false]
		{
			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					statements.add(new BlitzMaxConstDeclaration((Declaration)i.next()));
				}
			}
		}
		NEWLINE
	;
	
local_def [List statements]
	:	LOCAL
		args = argument_list [false]
		{
			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					statements.add(new BlitzMaxLocalDeclaration((Declaration)i.next()));
				}
			}
		}
		NEWLINE
	;

function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ]
	:	f = FUNCTION
		fd = function_definition
			{
				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
			}
		b = statement_block
			{
				functionDeclaration.acceptBody(b, true);
			}
		( ef = END FUNCTION | ef = 'endfunction' )
		{
			functionDeclaration.setEnd(((CommonToken) ef).getStopIndex()+1);
		}
		NEWLINE
	;

statement_block returns [ BlitzMaxBlock statement = new BlitzMaxBlock() ]
@init{
		  	int startPos = -1;
		  	int endPos = -1;
		}
	:
		(
			(
				statement_list[statement.getStatements()]
				{
		  			//if( s != null ) {
			  			//Iterator i = s.iterator();
	  					//while( i.hasNext() ) {
		  				//	Statement sst = (Statement)i.next();
		  				//	if( sst != null ) {
		  				//		statement.addStatement( sst );
		  				if (!statement.getList().isEmpty()) {
		  						Statement sst = (Statement)statement.getList().getFirst();
		  						if( sst.sourceStart() < startPos || startPos == -1 ) {
		  							startPos = sst.sourceStart();
		  						} 
		  						if( sst.sourceEnd() > endPos || endPos == -1 ) {
		  							endPos = sst.sourceEnd();
		  						}
		  						
		  						sst = (Statement)statement.getList().getLast();
		  						if (sst != null) {
			  						if( sst.sourceStart() < startPos || startPos == -1 ) {
			  							startPos = sst.sourceStart();
			  						} 
			  						if( sst.sourceEnd() > endPos || endPos == -1 ) {
			  							endPos = sst.sourceEnd();
			  						}
		  						}
		  				}
		  				//}
		  			//}
				}
			)*
		)
	  {
	   	statement.setStart( startPos );
	   	statement.setEnd( endPos );
	  }	  

	;
	
statement_list[List statements]
	:	include_stmt
		| s2 = for_block
			{
				statements.add(s2);
			}
		| while_block
		| repeat_block
		| const_def[statements]
		| global_def[statements]
		| local_def[statements]
		| rem_block
		| if_block
		| DEBUGSTOP NEWLINE
		//| END NEWLINE
		| RETURN expression NEWLINE
		| cast_or_function_call NEWLINE
		| IDENTIFIER assignment expression NEWLINE
		//| expression // FIXME : should be a statement.. like a = 1
		| NEWLINE
	;

function_definition returns [BlitzMaxFunctionExpression exp = null]
	:	(
		name = IDENTIFIER
		t = typedef?
		LPAREN
		args = argument_list[true]?
		rp = RPAREN
		)
			{
				exp = new BlitzMaxFunctionExpression(name, t, args, rp);
			}
		;

typedef returns [BlitzMaxTypedefExpression expr = null]
@init{
			boolean at = false;
		}
	:	
		(
			(COLON
				nt = named_type
				(array_type
					{
						at = true;
					}
				)?
			)
			|
			(
				nt = symbol_type
				(array_type
					{
						at = true;
					}
				)?
			)
		)
		{
			expr = new BlitzMaxTypedefExpression(nt, at);
		}
	;

named_type returns [ BlitzMaxTypeReference tr = null ]
	:	( 	  d = int_def
			| d = long_def
			| d = float_def
			| d = double_def
			| d = byte_def
			| d = short_def
		)
			{
				tr = new BlitzMaxTypeReference(d);
			}
		| s = STRING_TYPE
			{
				tr = new BlitzMaxTypeReference( new BlitzMaxStringType(s) );
			}
		| o = OBJECT_TYPE
			{
				tr = new BlitzMaxTypeReference( new BlitzMaxObjectType(o) );
			}
		| name = IDENTIFIER
			{
				tr = new BlitzMaxTypeReference( new BlitzMaxVariableReference(name) );
			}
	;

function_type
	:	function_definition
	;

symbol_type returns [ BlitzMaxTypeReference tr = null ]
	:	(d = PERCENT
		| d = POUND
		| d = BANG
		| d = DOLLAR
		)
		{
			tr = new BlitzMaxTypeReference(d);
		}
	;

array_type
	:	LBRACK (number)? RBRACK
	;

argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ]
	:	arg = argument [functionArgs]
		{
			args.add(arg);
		}
		(COMMA arg = argument [functionArgs]
			{
				args.add(arg);
			}
		)*
	;

argument[boolean functionArg] returns [ Declaration arg = null ]
	:	a = variable_def[functionArg] (EQUAL simple_expression)?
		{
			arg = a;
		}
		| function_definition
	;

variable_definition[boolean functionArg] returns [ Declaration dec = null ]
	:	v = variable_def[functionArg] (NEWLINE | EQUAL
		(simple_expression NEWLINE)
		)?
		| function_definition
	;
	
variable_def[boolean functionArg] returns [ Declaration dec = null ]
	:	n = IDENTIFIER
			(t = typedef
				{
					dec = new BlitzMaxVariableDeclaration(n, t);
				}
				
				( v = VAR
					{
						if (!functionArg) {
							RecognitionException e = new RecognitionException(input);
							e.token = v;
							throw e;
						}
					}
				)?
			)?
			{
				if (t == null) {
					dec = new BlitzMaxVariableDeclaration(n, null);
				}
			}
	;

rem_block
  : REM NEWLINE
  	rem_block_contents
  ;

rem_block_contents
  : .*
    ('endrem' | END (~REM rem_block_contents | REM))
  ;

/*
remb
  : REM NEWLINE
  	remc
  ;

remc
  : (END REM )=> END REM
  | .* (END REM NEWLINE )
 //|    'endrem' NEWLINE
    //| REMC
  ;
*/
for_block returns [ BlitzMaxForStatement stmt = null ]
	:	(
			f = FOR
			LOCAL?
			vdef = variable_def[false]
			EQUAL
			(
			(
				frm = expression
				{
					stmt = new BlitzMaxForStatement(vdef, frm);
				}
				( TO
					{
						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
					}
				| UNTIL
				 	{
						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
				 	}
				)
	
			to = expression
				{
					stmt.setToExpr(to);
				}
				( STEP 
					sexp = expression
					{
						stmt.setStepExpr(sexp);
					}
				)?
			)
			|
				EACHIN
				 	{
						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
				 	}
				to = expression
					{
						stmt.setToExpr(to);
					}
			)
		)
		NEWLINE
		sb = statement_block
			{
				stmt.setBlock(sb);
			}
		NEXT NEWLINE
	;
	
repeat_block
	:	REPEAT NEWLINE
		b = statement_block
		(FOREVER | UNTIL expression)
		NEWLINE
	;
/*
expression returns [ Expression exp = null ]
	:	id = IDENTIFIER
			{
				exp = new BlitzMaxStringLiteral(id);
			}
		| n = number
			{
				exp = n;
			}
		| cast_or_function_call
		| t = TRUE
			{
				exp = new BlitzMaxNumericLiteral(t, 1);
			}
		| t = FALSE
			{
				exp = new BlitzMaxNumericLiteral(t, 0);
			}
		| s = string_literal
			{
				exp = s;
			}
	;
*/
expression returns [ Expression exp = null ]
	:	expr
	;
	
expr
    : simple_expression
	  ( (EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )*
    ;

simple_expression
    : term ( adding_operator term )*
    ;

adding_operator
    : PLUS | MINUS | OR_TEST
    ;

term
    : signed_factor ( multiplying_operator signed_factor )*
    ;

multiplying_operator
    : STAR | SLASH | MOD | AND_TEST
    ;

signed_factor
    : (PLUS | MINUS)? factor
    ;

factor
    : NEW? (IDENTIFIER DOT)* IDENTIFIER
    | NEW? func_var_designator 
    | constant_expression
    | LPAREN simple_expression RPAREN
    | SELF
    | NULL
    | LINE_CONTINUATION
    ;

func_var_designator
    : IDENTIFIER (DOT IDENTIFIER)* LPAREN (expr (COMMA expr)* )? RPAREN (DOT factor)?
    ;

constant_expression
	: number
	| TRUE
	| FALSE
	| STRING_LITERAL
	| NOT_TEST factor
	;

assignment
	:	EQUAL
	| PLUSEQUAL
	| MINUSEQUAL
	| STAREQUAL
	| SLASHEQUAL
	| VBAREQUAL
	;
	
cast_or_function_call
	:	IDENTIFIER (DOT IDENTIFIER)* 
	(
	(LPAREN)=> LPAREN
		expression_list? RPAREN
		(DOT expression)? 
	| 
	 expression_list?
	 )
	;

expression_list
	: expression (COMMA expression)*
	;

while_block
	:	WHILE expression NEWLINE
		statement_block
		WEND NEWLINE
	;

select_block
	:	SELECT expression NEWLINE
		case_block*
		default_block?
		end_select
		NEWLINE
	;

default_block
	: DEFAULT NEWLINE
		statement_block
	;

end_select
	: END SELECT
		| 'endselect'
	;

case_block
	:	CASE expression (COMMA expression)* NEWLINE
		statement_block
	;

import_stmt returns [ Statement stmt = null ]
	:	imp = IMPORT
		(
			l = string_literal
			{
				stmt = new BlitzMaxImportStatement(imp, l);
			}
		|
			e = module_name
			{
				stmt = new BlitzMaxImportStatement(imp, e);
			}
		)
		NEWLINE
	;

include_stmt
	:	INCLUDE STRING_LITERAL NEWLINE
	;

framework_stmt
	:	FRAMEWORK module_name NEWLINE
	;

module_stmt
	:	MODULE module_name NEWLINE
	;
	
moduleinfo_stmt
	:	MODULEINFO STRING_LITERAL NEWLINE
	;

module_name returns [ BlitzMaxModuleNameExpression expr = null ]
	:	( ns = IDENTIFIER DOT name = IDENTIFIER)
		{
			expr = new BlitzMaxModuleNameExpression(ns, name);
		}
	;

debuglog_stmt
	:	DEBUGLOG expression NEWLINE
	;

if_block
	:	
		IF expression
		THEN?
		
		statement_block
		
		(
			(
				ELSE 
				// FIXME : handle "Else If"
				| 'elseif' expression THEN? NEWLINE
			)
			
			statement_block
		)?
		
		(
			END IF
			| 'endif'
		)
		NEWLINE
	;

LINE_CONTINUATION
	:	'..' ('\r')? '\n' {$channel=HIDDEN;}
	;
	
SUPERSTRICT : 'superstrict';
STRICT : 'strict';

FRAMEWORK : 'framework';
MODULE : 'module';
MODULEINFO : 'moduleinfo';
IMPORT : 'import';
INCLUDE : 'include';

LOCAL : 'local' ;
GLOBAL : 'global' ;
TYPE : 'type';
FUNCTION : 'function';
METHOD : 'method';
EXTERN : 'extern';
EXTENDS : 'extends';
ABSTRACT : 'abstract';
FINAL : 'final';
FIELD : 'field';
CONST : 'const';
VAR : 'var';
RETURN : 'return';

REM : 'rem';

TRUE : 'true';
FALSE : 'false';

LONG_TYPE : 'long';
INT_TYPE : 'int';
FLOAT_TYPE : 'float';
DOUBLE_TYPE : 'double';
BYTE_TYPE : 'byte';
STRING_TYPE : 'string';
SHORT_TYPE : 'short';
OBJECT_TYPE : 'object';
POINTER  : 'ptr';

NULL : 'null';
SUPER : 'super';
SELF : 'self';
NEW : 'new';
DELETE : 'delete';


pointer_def returns [int count = 0]
	:	POINTER 
		{
			count = 1;
		}
		(
			POINTER
			{
				count++;
			}
		)*
		
	;

byte_def returns [Expression exp = null]
	:	t = BYTE_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.BYTE);
		}

	;

int_def returns [Expression exp = null]
	:	t = INT_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.INT);
		}
	;

short_def returns [Expression exp = null]
	:	t = SHORT_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.SHORT);
		}

	;

long_def returns [Expression exp = null]
	:	t = LONG_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.LONG);
		}

	;

float_def returns [Expression exp = null]
	:	t = FLOAT_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.FLOAT);
		}

	;

double_def returns [Expression exp = null]
	:	t = DOUBLE_TYPE
		c = pointer_def?
		{
			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.DOUBLE);
		}

	;

/*pointer_type
	:	BYTE_POINTER
		| INT_POINTER
		| SHORT_POINTER
		| LONG_POINTER
		| FLOAT_POINTER
		| DOUBLE_POINTER
	;
*/
FOR : 'for';
NEXT : 'next';
TO : 'to';
EACHIN : 'eachin';
STEP : 'step';
WHILE : 'while';
WEND : 'wend';
REPEAT : 'repeat';
UNTIL : 'until';
FOREVER : 'forever';
CONTINUE : 'continue';
SELECT : 'select';
CASE : 'case';
DEFAULT : 'default';
IF : 'if';
THEN : 'then';
ELSE : 'else';

TRY : 'try';
CATCH : 'catch';
THROW : 'throw';
ASSERT : 'assert';
DEBUGLOG: 'debuglog';
DEBUGSTOP : 'debugstop';

EXIT : 'exit';
END : 'end';

INCBIN : 'incbin';
INCBINPTR : 'incbinptr';
INCBINLEN : 'incbinlen';

NOT_TEST : 'not';
AND_TEST : 'and';
OR_TEST : 'or';

SEMI	: ';' ;
PLUS	: '+' ;
MINUS	: '-' ;
STAR	: '*' ;
SLASH	: '/' ;
VBAR	: '|' ;
AMPER	: '&' ;
LESS	: '<' ;
GREATER	: '>' ;
EQUAL	: '=' ;
PERCENT	: '%' ;
POWER : '^' ;
COLON 	: ':' ;
COMMA	: ',' ;
TILDE	: '~' ;
POUND	: '#' ;
BANG	: '!' ;
DOLLAR	: '$' ;

DOT : '.' ;
UNDERSCORE : '_' ;


LPAREN	: '(' ;//{implicitLineJoiningLevel++;} ;

RPAREN	: ')' ;//{implicitLineJoiningLevel--;} ;

LBRACK	: '[' ;//{implicitLineJoiningLevel++;} ;

RBRACK	: ']' ;//{implicitLineJoiningLevel--;} ;


NOTEQUAL: '<>' ;
LESSEQUAL	: '<=' ;
GREATEREQUAL	: '>=' ;
PLUSEQUAL	: ':+' ;
MINUSEQUAL	: ':-' ;
STAREQUAL	: ':*' ;
SLASHEQUAL	: ':/' ;
VBAREQUAL	: ':|' ;
LEFTSHIFT	: 'shl';
RIGHTSHIFT	: 'shr';
ARITHRIGHTSHIFT : 'sar';

MOD		: 'mod' ;

number returns [ Literal num = null ]
	:	
		/*( s = MINUS
		| s = PLUS)?
		*/
		(n = FLOAT
		| n = LONG
		| n = INT)
		{
			num = new BlitzMaxNumericLiteral(null, n);
		}
	;
	
FLOAT  	:	POINTFLOAT | EXPONENTFLOAT ;

fragment
POINTFLOAT
	:	DIGITS? FRACTION | DIGITS DOT
	;

fragment
FRACTION 
	:	DOT DIGITS ;

fragment
EXPONENTFLOAT 
	:	(DIGITS | POINTFLOAT) Exponent
	;

fragment
Exponent
	:	('e' | 'E') ( '+' | '-' )? DIGITS
	;

LONG 	:	 INT;

fragment
INT :   // Hex
        '$' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
    |   MINUS? DIGITS*
    ;

fragment
ALPHA_LOWER
	:	'a' .. 'z'
	;

fragment
ALPHA_UPPER
	:	'A' .. 'Z'
	;

fragment
DIGITS : ( DIGIT )+ ;

fragment
DIGIT 	: '0' .. '9'
	;

IDENTIFIER:	( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE)
        ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )*
    ;

WHITESPACE : (' '|'\t')+ {$channel=HIDDEN;}
	; 

string_literal returns [BlitzMaxStringLiteral str = null]
	: e = STRING_LITERAL
		{
			str = new BlitzMaxStringLiteral(e);
		}
	;
	
STRING_LITERAL 
	:	'"' ( options {greedy=false;} : . )* '"'
	;

NEWLINE
    :   (('\r')? '\n' )+
    | '\'' ~('\n'|'\r')* ('\r')? '\n' // single line comment
        //{if ( startPos==0 || implicitLineJoiningLevel>0 )
        //{$channel=HIDDEN;}
        //}
    ;
    

