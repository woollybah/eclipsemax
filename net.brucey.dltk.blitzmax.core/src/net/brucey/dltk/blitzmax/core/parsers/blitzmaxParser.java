// $ANTLR 3.1.2 C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g 2009-07-08 09:10:26

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class blitzmaxParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUPERSTRICT", "NEWLINE", "STRICT", "TYPE", "IDENTIFIER", "EXTENDS", "ABSTRACT", "FINAL", "END", "METHOD", "FIELD", "GLOBAL", "CONST", "LOCAL", "FUNCTION", "LPAREN", "RPAREN", "COLON", "STRING_TYPE", "OBJECT_TYPE", "PERCENT", "POUND", "BANG", "DOLLAR", "LBRACK", "RBRACK", "COMMA", "VAR", "REM", "FOR", "EQUAL", "TO", "UNTIL", "STEP", "EACHIN", "NEXT", "REPEAT", "FOREVER", "TRUE", "FALSE", "WHILE", "WEND", "SELECT", "DEFAULT", "CASE", "IMPORT", "INCLUDE", "STRING_LITERAL", "FRAMEWORK", "MODULE", "MODULEINFO", "DOT", "DEBUGLOG", "IF", "THEN", "ELSE", "LINE_COMMENT", "EXTERN", "LONG_TYPE", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "BYTE_TYPE", "SHORT_TYPE", "POINTER", "NULL", "SUPER", "SELF", "NEW", "DELETE", "CONTINUE", "TRY", "CATCH", "THROW", "ASSERT", "DEBUGSTOP", "EXIT", "INCBIN", "INCBINPTR", "INCBINLEN", "NOT_TEST", "AND_TEST", "OR_TEST", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", "GREATER", "POWER", "TILDE", "UNDERSCORE", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", "PLUSEQUAL", "MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "VBAREQUAL", "LEFTSHIFT", "RIGHTSHIFT", "ARITHRIGHTSHIFT", "MOD", "FLOAT", "LONG", "INT", "POINTFLOAT", "EXPONENTFLOAT", "DIGITS", "FRACTION", "Exponent", "DIGIT", "ALPHA_LOWER", "ALPHA_UPPER", "WHITESPACE", "'endtype'", "'endmethod'", "'endfunction'", "'endrem'", "'endselect'", "'elseif'", "'endif'"
    };
    public static final int FUNCTION=18;
    public static final int WEND=45;
    public static final int SLASHEQUAL=105;
    public static final int STAR=90;
    public static final int WHILE=44;
    public static final int BYTE_TYPE=66;
    public static final int MOD=110;
    public static final int CONST=16;
    public static final int POINTER=68;
    public static final int CASE=48;
    public static final int NEW=72;
    public static final int GREATEREQUAL=101;
    public static final int EXTERN=61;
    public static final int EOF=-1;
    public static final int TYPE=7;
    public static final int NOTEQUAL=99;
    public static final int MINUSEQUAL=103;
    public static final int VBAR=92;
    public static final int RPAREN=20;
    public static final int FINAL=11;
    public static final int IMPORT=49;
    public static final int GREATER=95;
    public static final int STRING_LITERAL=51;
    public static final int ALPHA_LOWER=120;
    public static final int INCLUDE=50;
    public static final int LESS=94;
    public static final int VAR=31;
    public static final int SUPER=70;
    public static final int SELECT=46;
    public static final int RBRACK=29;
    public static final int EXIT=80;
    public static final int FLOAT_TYPE=64;
    public static final int STRICT=6;
    public static final int POUND=25;
    public static final int ALPHA_UPPER=121;
    public static final int OBJECT_TYPE=23;
    public static final int LINE_COMMENT=60;
    public static final int SUPERSTRICT=4;
    public static final int NULL=69;
    public static final int ELSE=59;
    public static final int NOT_TEST=84;
    public static final int WHITESPACE=122;
    public static final int POWER=96;
    public static final int UNDERSCORE=98;
    public static final int DOUBLE_TYPE=65;
    public static final int INT=113;
    public static final int DELETE=73;
    public static final int LOCAL=17;
    public static final int INT_TYPE=63;
    public static final int RIGHTSHIFT=108;
    public static final int ASSERT=78;
    public static final int TRY=75;
    public static final int INCBIN=81;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int INCBINPTR=82;
    public static final int T__129=129;
    public static final int FRAMEWORK=52;
    public static final int UNTIL=36;
    public static final int VBAREQUAL=106;
    public static final int STRING_TYPE=22;
    public static final int FIELD=14;
    public static final int REPEAT=40;
    public static final int END=12;
    public static final int CATCH=76;
    public static final int FALSE=43;
    public static final int LESSEQUAL=100;
    public static final int THROW=77;
    public static final int DOLLAR=27;
    public static final int DEBUGSTOP=79;
    public static final int EXPONENTFLOAT=115;
    public static final int SHORT_TYPE=67;
    public static final int LBRACK=28;
    public static final int INCBINLEN=83;
    public static final int DIGITS=116;
    public static final int LONG_TYPE=62;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int Exponent=118;
    public static final int FOR=33;
    public static final int STEP=37;
    public static final int FLOAT=111;
    public static final int ABSTRACT=10;
    public static final int FOREVER=41;
    public static final int POINTFLOAT=114;
    public static final int LPAREN=19;
    public static final int PLUSEQUAL=102;
    public static final int IF=57;
    public static final int SLASH=91;
    public static final int THEN=58;
    public static final int CONTINUE=74;
    public static final int COMMA=30;
    public static final int AMPER=93;
    public static final int IDENTIFIER=8;
    public static final int EQUAL=34;
    public static final int TILDE=97;
    public static final int LEFTSHIFT=107;
    public static final int PLUS=88;
    public static final int NEXT=39;
    public static final int DIGIT=119;
    public static final int DOT=55;
    public static final int DEBUGLOG=56;
    public static final int ARITHRIGHTSHIFT=109;
    public static final int MODULEINFO=54;
    public static final int PERCENT=24;
    public static final int TO=35;
    public static final int DEFAULT=47;
    public static final int BANG=26;
    public static final int MINUS=89;
    public static final int REM=32;
    public static final int AND_TEST=85;
    public static final int MODULE=53;
    public static final int SEMI=87;
    public static final int TRUE=42;
    public static final int COLON=21;
    public static final int EACHIN=38;
    public static final int NEWLINE=5;
    public static final int OR_TEST=86;
    public static final int FRACTION=117;
    public static final int GLOBAL=15;
    public static final int LONG=112;
    public static final int EXTENDS=9;
    public static final int SELF=71;
    public static final int METHOD=13;
    public static final int STAREQUAL=104;

    // delegates
    // delegators


        public blitzmaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public blitzmaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return blitzmaxParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g"; }


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



    // $ANTLR start "file_input"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:94:1: file_input : ( main_statements[decl.getStatements()] )* EOF ;
    public final void file_input() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:94:11: ( ( main_statements[decl.getStatements()] )* EOF )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:95:6: ( main_statements[decl.getStatements()] )* EOF
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:95:6: ( main_statements[decl.getStatements()] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SUPERSTRICT && LA1_0<=IDENTIFIER)||(LA1_0>=GLOBAL && LA1_0<=FUNCTION)||(LA1_0>=REM && LA1_0<=FOR)||LA1_0==REPEAT||(LA1_0>=TRUE && LA1_0<=WHILE)||(LA1_0>=IMPORT && LA1_0<=MODULEINFO)||(LA1_0>=PLUS && LA1_0<=MINUS)||(LA1_0>=FLOAT && LA1_0<=INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:98:7: main_statements[decl.getStatements()]
            	    {
            	    pushFollow(FOLLOW_main_statements_in_file_input77);
            	    main_statements(decl.getStatements());

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file_input107); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "file_input"


    // $ANTLR start "main_statements"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:115:1: main_statements[List statements] : ( ( SUPERSTRICT NEWLINE | STRICT NEWLINE ) | framework_stmt | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | fb= function_block | statement_list[statements] );
    public final void main_statements(List statements) throws RecognitionException {
        Statement s1 = null;

        BlitzMaxTypeDeclaration s3 = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:116:2: ( ( SUPERSTRICT NEWLINE | STRICT NEWLINE ) | framework_stmt | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | fb= function_block | statement_list[statements] )
            int alt3=8;
            switch ( input.LA(1) ) {
            case SUPERSTRICT:
            case STRICT:
                {
                alt3=1;
                }
                break;
            case FRAMEWORK:
                {
                alt3=2;
                }
                break;
            case MODULE:
                {
                alt3=3;
                }
                break;
            case MODULEINFO:
                {
                alt3=4;
                }
                break;
            case IMPORT:
                {
                alt3=5;
                }
                break;
            case TYPE:
                {
                alt3=6;
                }
                break;
            case FUNCTION:
                {
                alt3=7;
                }
                break;
            case NEWLINE:
            case IDENTIFIER:
            case GLOBAL:
            case CONST:
            case LOCAL:
            case REM:
            case FOR:
            case REPEAT:
            case TRUE:
            case FALSE:
            case WHILE:
            case INCLUDE:
            case STRING_LITERAL:
            case PLUS:
            case MINUS:
            case FLOAT:
            case LONG:
            case INT:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:116:4: ( SUPERSTRICT NEWLINE | STRICT NEWLINE )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:116:4: ( SUPERSTRICT NEWLINE | STRICT NEWLINE )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==SUPERSTRICT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==STRICT) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:116:5: SUPERSTRICT NEWLINE
                            {
                            match(input,SUPERSTRICT,FOLLOW_SUPERSTRICT_in_main_statements120); 
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements122); 

                            				statements.add(new BlitzMaxStrictExpression(true));
                            			

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:120:5: STRICT NEWLINE
                            {
                            match(input,STRICT,FOLLOW_STRICT_in_main_statements133); 
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements135); 

                            				statements.add(new BlitzMaxStrictExpression(false));
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:125:5: framework_stmt
                    {
                    pushFollow(FOLLOW_framework_stmt_in_main_statements150);
                    framework_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:126:5: module_stmt
                    {
                    pushFollow(FOLLOW_module_stmt_in_main_statements156);
                    module_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:127:5: moduleinfo_stmt
                    {
                    pushFollow(FOLLOW_moduleinfo_stmt_in_main_statements162);
                    moduleinfo_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:128:5: s1= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_main_statements172);
                    s1=import_stmt();

                    state._fsp--;


                    				statements.add(s1);
                    			

                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:132:5: s3= type_block
                    {
                    pushFollow(FOLLOW_type_block_in_main_statements187);
                    s3=type_block();

                    state._fsp--;


                    				statements.add(s3);
                    			

                    }
                    break;
                case 7 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:136:5: fb= function_block
                    {
                    pushFollow(FOLLOW_function_block_in_main_statements202);
                    fb=function_block();

                    state._fsp--;


                    				statements.add(fb);
                    			

                    }
                    break;
                case 8 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:140:5: statement_list[statements]
                    {
                    pushFollow(FOLLOW_statement_list_in_main_statements213);
                    statement_list(statements);

                    state._fsp--;


                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "main_statements"


    // $ANTLR start "type_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:143:1: type_block returns [ BlitzMaxTypeDeclaration typeDeclaration = null ] : t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE ;
    public final BlitzMaxTypeDeclaration type_block() throws RecognitionException {
        BlitzMaxTypeDeclaration typeDeclaration =  null;

        Token t=null;
        Token n=null;
        Token sup=null;
        Token et=null;
        Block tcl = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:144:2: (t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:144:4: t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE
            {
            t=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_block233); 
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block241); 

            			typeDeclaration = new BlitzMaxTypeDeclaration(n.getText(), ((CommonToken) n).getStartIndex(),((CommonToken) n).getStopIndex()+1,
            				((CommonToken) t).getStartIndex(),((CommonToken) t).getStopIndex() + 1);
            			decl.addType(typeDeclaration);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:151:3: ( EXTENDS sup= IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:152:4: EXTENDS sup= IDENTIFIER
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_type_block254); 
                    sup=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block263); 

                    				typeDeclaration.addSuperClass(new BlitzMaxTypeReference(sup));
                    			

                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:160:3: ( ABSTRACT | FINAL )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ABSTRACT) ) {
                alt5=1;
            }
            else if ( (LA5_0==FINAL) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:160:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_type_block283); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:165:5: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_type_block299); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
                    			

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block320); 
            pushFollow(FOLLOW_type_content_list_in_type_block331);
            tcl=type_content_list();

            state._fsp--;


            			typeDeclaration.setBody(tcl);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:179:3: (et= END TYPE | et= 'endtype' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==END) ) {
                alt6=1;
            }
            else if ( (LA6_0==123) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:179:5: et= END TYPE
                    {
                    et=(Token)match(input,END,FOLLOW_END_in_type_block348); 
                    match(input,TYPE,FOLLOW_TYPE_in_type_block350); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:179:21: et= 'endtype'
                    {
                    et=(Token)match(input,123,FOLLOW_123_in_type_block358); 

                    }
                    break;

            }


            			typeDeclaration.setEnd(((CommonToken) et).getStopIndex()+1);
            			
            			List s = typeDeclaration.getBody().getStatements();
            			for (Iterator i = s.iterator(); i.hasNext();) {
            				ASTNode node = (ASTNode) i.next();
            				if (node instanceof FieldDeclaration) {
            					typeDeclaration.getFieldList().add(node);
            				}
            			}
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block368); 

            }

        }

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
        finally {
        }
        return typeDeclaration;
    }
    // $ANTLR end "type_block"


    // $ANTLR start "type_content_list"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:194:1: type_content_list returns [ Block typeContent = new Block() ] : ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )* ;
    public final Block type_content_list() throws RecognitionException {
        Block typeContent =  new Block();

        BlitzMaxMethodDeclaration mb = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:195:2: ( ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:195:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )*
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:195:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )*
            loop7:
            do {
                int alt7=8;
                switch ( input.LA(1) ) {
                case CONST:
                    {
                    alt7=1;
                    }
                    break;
                case GLOBAL:
                    {
                    alt7=2;
                    }
                    break;
                case FIELD:
                    {
                    alt7=3;
                    }
                    break;
                case METHOD:
                    {
                    alt7=4;
                    }
                    break;
                case FUNCTION:
                    {
                    alt7=5;
                    }
                    break;
                case REM:
                    {
                    alt7=6;
                    }
                    break;
                case NEWLINE:
                    {
                    alt7=7;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:196:4: const_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_const_def_in_type_content_list388);
            	    const_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:197:6: global_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_global_def_in_type_content_list396);
            	    global_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:198:6: field_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_field_def_in_type_content_list404);
            	    field_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:199:6: mb= method_block
            	    {
            	    pushFollow(FOLLOW_method_block_in_type_content_list416);
            	    mb=method_block();

            	    state._fsp--;


            	    					typeContent.addStatement(mb);
            	    				

            	    }
            	    break;
            	case 5 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:203:6: fb= function_block
            	    {
            	    pushFollow(FOLLOW_function_block_in_type_content_list433);
            	    fb=function_block();

            	    state._fsp--;


            	    					typeContent.addStatement(fb);
            	    				

            	    }
            	    break;
            	case 6 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:207:6: rem_block
            	    {
            	    pushFollow(FOLLOW_rem_block_in_type_content_list446);
            	    rem_block();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:208:6: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_type_content_list453); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return typeContent;
    }
    // $ANTLR end "type_content_list"


    // $ANTLR start "method_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:212:1: method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ] : m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE ;
    public final BlitzMaxMethodDeclaration method_block() throws RecognitionException {
        BlitzMaxMethodDeclaration methodDeclaration =  null;

        Token m=null;
        Token em=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:213:2: (m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:213:4: m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE
            {
            m=(Token)match(input,METHOD,FOLLOW_METHOD_in_method_block478); 
            pushFollow(FOLLOW_function_definition_in_method_block486);
            fd=function_definition();

            state._fsp--;


            				methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
            			
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:218:3: ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ABSTRACT) ) {
                alt10=1;
            }
            else if ( (LA10_0==NEWLINE||LA10_0==FINAL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:218:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_block497); 

                    				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:224:3: ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:224:3: ( FINAL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FINAL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:225:3: FINAL
                            {
                            match(input,FINAL,FOLLOW_FINAL_in_method_block520); 

                            				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
                            			

                            }
                            break;

                    }

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block540); 
                    pushFollow(FOLLOW_statement_block_in_method_block548);
                    b=statement_block();

                    state._fsp--;


                    				methodDeclaration.acceptBody(b, true);
                    			
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:237:3: (em= END METHOD | em= 'endmethod' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==END) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==124) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:237:5: em= END METHOD
                            {
                            em=(Token)match(input,END,FOLLOW_END_in_method_block563); 
                            match(input,METHOD,FOLLOW_METHOD_in_method_block565); 

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:237:23: em= 'endmethod'
                            {
                            em=(Token)match(input,124,FOLLOW_124_in_method_block573); 

                            }
                            break;

                    }


                    			methodDeclaration.setEnd(((CommonToken) em).getStopIndex()+1);
                    		

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block587); 

            }

        }

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
        finally {
        }
        return methodDeclaration;
    }
    // $ANTLR end "method_block"


    // $ANTLR start "field_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:245:1: field_def[List statements] : FIELD args= argument_list[false] NEWLINE ;
    public final void field_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:246:2: ( FIELD args= argument_list[false] NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:246:4: FIELD args= argument_list[false] NEWLINE
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_def600); 
            pushFollow(FOLLOW_argument_list_in_field_def609);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxFieldDeclaration((Declaration)i.next()));
            				}
            			}
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_def619); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "field_def"


    // $ANTLR start "global_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:258:1: global_def[List statements] : GLOBAL args= argument_list[false] NEWLINE ;
    public final void global_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:259:2: ( GLOBAL args= argument_list[false] NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:259:4: GLOBAL args= argument_list[false] NEWLINE
            {
            match(input,GLOBAL,FOLLOW_GLOBAL_in_global_def632); 
            pushFollow(FOLLOW_argument_list_in_global_def641);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxGlobalDeclaration((Declaration)i.next()));
            				}
            			}
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_global_def651); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "global_def"


    // $ANTLR start "const_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:271:1: const_def[List statements] : CONST args= argument_list[false] NEWLINE ;
    public final void const_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:272:2: ( CONST args= argument_list[false] NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:272:4: CONST args= argument_list[false] NEWLINE
            {
            match(input,CONST,FOLLOW_CONST_in_const_def664); 
            pushFollow(FOLLOW_argument_list_in_const_def672);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxConstDeclaration((Declaration)i.next()));
            				}
            			}
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_const_def682); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "const_def"


    // $ANTLR start "local_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:284:1: local_def[List statements] : LOCAL args= argument_list[false] NEWLINE ;
    public final void local_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:285:2: ( LOCAL args= argument_list[false] NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:285:4: LOCAL args= argument_list[false] NEWLINE
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_def696); 
            pushFollow(FOLLOW_argument_list_in_local_def704);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxLocalDeclaration((Declaration)i.next()));
            				}
            			}
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_local_def714); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "local_def"


    // $ANTLR start "function_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:297:1: function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ] : f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE ;
    public final BlitzMaxFunctionDeclaration function_block() throws RecognitionException {
        BlitzMaxFunctionDeclaration functionDeclaration =  null;

        Token f=null;
        Token ef=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:298:2: (f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:298:4: f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE
            {
            f=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block733); 
            pushFollow(FOLLOW_function_definition_in_function_block741);
            fd=function_definition();

            state._fsp--;


            				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
            			
            pushFollow(FOLLOW_statement_block_in_function_block754);
            b=statement_block();

            state._fsp--;


            				functionDeclaration.acceptBody(b, true);
            			
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:307:3: (ef= END FUNCTION | ef= 'endfunction' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==END) ) {
                alt11=1;
            }
            else if ( (LA11_0==125) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:307:5: ef= END FUNCTION
                    {
                    ef=(Token)match(input,END,FOLLOW_END_in_function_block769); 
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block771); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:307:25: ef= 'endfunction'
                    {
                    ef=(Token)match(input,125,FOLLOW_125_in_function_block779); 

                    }
                    break;

            }


            			functionDeclaration.setEnd(((CommonToken) ef).getStopIndex()+1);
            		
            match(input,NEWLINE,FOLLOW_NEWLINE_in_function_block789); 

            }

        }

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
        finally {
        }
        return functionDeclaration;
    }
    // $ANTLR end "function_block"


    // $ANTLR start "statement_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:314:1: statement_block returns [ BlitzMaxBlock statement = new BlitzMaxBlock() ] : ( ( statement_list[statement.getStatements()] )* ) ;
    public final BlitzMaxBlock statement_block() throws RecognitionException {
        BlitzMaxBlock statement =  new BlitzMaxBlock();

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:315:2: ( ( ( statement_list[statement.getStatements()] )* ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:316:3: ( ( statement_list[statement.getStatements()] )* )
            {

            		  	int startPos = -1;
            		  	int endPos = -1;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:320:3: ( ( statement_list[statement.getStatements()] )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:321:4: ( statement_list[statement.getStatements()] )*
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:321:4: ( statement_list[statement.getStatements()] )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==NEWLINE||LA12_0==IDENTIFIER||(LA12_0>=GLOBAL && LA12_0<=LOCAL)||(LA12_0>=REM && LA12_0<=FOR)||LA12_0==REPEAT||(LA12_0>=TRUE && LA12_0<=WHILE)||(LA12_0>=INCLUDE && LA12_0<=STRING_LITERAL)||(LA12_0>=PLUS && LA12_0<=MINUS)||(LA12_0>=FLOAT && LA12_0<=INT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:322:5: statement_list[statement.getStatements()]
            	    {
            	    pushFollow(FOLLOW_statement_list_in_statement_block821);
            	    statement_list(statement.getStatements());

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            	   	statement.setStart( startPos );
            	   	statement.setEnd( endPos );
            	  

            }

        }

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
        finally {
        }
        return statement;
    }
    // $ANTLR end "statement_block"


    // $ANTLR start "statement_list"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:361:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | expression | NEWLINE );
    public final void statement_list(List statements) throws RecognitionException {
        BlitzMaxForStatement s2 = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:362:2: ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | expression | NEWLINE )
            int alt13=10;
            switch ( input.LA(1) ) {
            case INCLUDE:
                {
                alt13=1;
                }
                break;
            case FOR:
                {
                alt13=2;
                }
                break;
            case WHILE:
                {
                alt13=3;
                }
                break;
            case REPEAT:
                {
                alt13=4;
                }
                break;
            case CONST:
                {
                alt13=5;
                }
                break;
            case GLOBAL:
                {
                alt13=6;
                }
                break;
            case LOCAL:
                {
                alt13=7;
                }
                break;
            case REM:
                {
                alt13=8;
                }
                break;
            case IDENTIFIER:
            case TRUE:
            case FALSE:
            case STRING_LITERAL:
            case PLUS:
            case MINUS:
            case FLOAT:
            case LONG:
            case INT:
                {
                alt13=9;
                }
                break;
            case NEWLINE:
                {
                alt13=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:362:4: include_stmt
                    {
                    pushFollow(FOLLOW_include_stmt_in_statement_list860);
                    include_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:363:5: s2= for_block
                    {
                    pushFollow(FOLLOW_for_block_in_statement_list870);
                    s2=for_block();

                    state._fsp--;


                    				statements.add(s2);
                    			

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:367:5: while_block
                    {
                    pushFollow(FOLLOW_while_block_in_statement_list881);
                    while_block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:368:5: repeat_block
                    {
                    pushFollow(FOLLOW_repeat_block_in_statement_list887);
                    repeat_block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:369:5: const_def[statements]
                    {
                    pushFollow(FOLLOW_const_def_in_statement_list893);
                    const_def(statements);

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:370:5: global_def[statements]
                    {
                    pushFollow(FOLLOW_global_def_in_statement_list900);
                    global_def(statements);

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:371:5: local_def[statements]
                    {
                    pushFollow(FOLLOW_local_def_in_statement_list907);
                    local_def(statements);

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:372:5: rem_block
                    {
                    pushFollow(FOLLOW_rem_block_in_statement_list914);
                    rem_block();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:373:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement_list920);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:374:5: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list926); 

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "statement_list"


    // $ANTLR start "function_definition"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:377:1: function_definition returns [BlitzMaxFunctionExpression exp = null] : (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) ;
    public final BlitzMaxFunctionExpression function_definition() throws RecognitionException {
        BlitzMaxFunctionExpression exp =  null;

        Token name=null;
        Token rp=null;
        BlitzMaxTypedefExpression t = null;

        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:378:2: ( (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:378:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:378:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:379:3: name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition949); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:380:5: (t= typedef )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON||(LA14_0>=PERCENT && LA14_0<=DOLLAR)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:380:5: t= typedef
                    {
                    pushFollow(FOLLOW_typedef_in_function_definition957);
                    t=typedef();

                    state._fsp--;


                    }
                    break;

            }

            match(input,LPAREN,FOLLOW_LPAREN_in_function_definition962); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:382:8: (args= argument_list[true] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:382:8: args= argument_list[true]
                    {
                    pushFollow(FOLLOW_argument_list_in_function_definition970);
                    args=argument_list(true);

                    state._fsp--;


                    }
                    break;

            }

            rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition980); 

            }


            				exp = new BlitzMaxFunctionExpression(name, t, args, rp);
            			

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "function_definition"


    // $ANTLR start "typedef"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:390:1: typedef returns [BlitzMaxTypedefExpression expr = null] : ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) ;
    public final BlitzMaxTypedefExpression typedef() throws RecognitionException {
        BlitzMaxTypedefExpression expr =  null;

        BlitzMaxTypeReference nt = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:391:2: ( ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:392:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            {

            			boolean at = false;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:395:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COLON) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=PERCENT && LA18_0<=DOLLAR)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:396:4: ( COLON nt= named_type ( array_type )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:396:4: ( COLON nt= named_type ( array_type )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:396:5: COLON nt= named_type ( array_type )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_typedef1018); 
                    pushFollow(FOLLOW_named_type_in_typedef1028);
                    nt=named_type();

                    state._fsp--;

                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:398:5: ( array_type )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LBRACK) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:398:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1035);
                            array_type();

                            state._fsp--;


                            						at = true;
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:405:4: (nt= symbol_type ( array_type )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:405:4: (nt= symbol_type ( array_type )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:406:5: nt= symbol_type ( array_type )?
                    {
                    pushFollow(FOLLOW_symbol_type_in_typedef1074);
                    nt=symbol_type();

                    state._fsp--;

                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:407:5: ( array_type )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LBRACK) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:407:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1081);
                            array_type();

                            state._fsp--;


                            						at = true;
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			expr = new BlitzMaxTypedefExpression(nt, at);
            		

            }

        }

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
        finally {
        }
        return expr;
    }
    // $ANTLR end "typedef"


    // $ANTLR start "named_type"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:419:1: named_type returns [ BlitzMaxTypeReference tr = null ] : ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER );
    public final BlitzMaxTypeReference named_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token s=null;
        Token o=null;
        Token name=null;
        Expression d = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:420:2: ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER )
            int alt20=4;
            switch ( input.LA(1) ) {
            case LONG_TYPE:
            case INT_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case BYTE_TYPE:
            case SHORT_TYPE:
                {
                alt20=1;
                }
                break;
            case STRING_TYPE:
                {
                alt20=2;
                }
                break;
            case OBJECT_TYPE:
                {
                alt20=3;
                }
                break;
            case IDENTIFIER:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:420:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:420:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case INT_TYPE:
                        {
                        alt19=1;
                        }
                        break;
                    case LONG_TYPE:
                        {
                        alt19=2;
                        }
                        break;
                    case FLOAT_TYPE:
                        {
                        alt19=3;
                        }
                        break;
                    case DOUBLE_TYPE:
                        {
                        alt19=4;
                        }
                        break;
                    case BYTE_TYPE:
                        {
                        alt19=5;
                        }
                        break;
                    case SHORT_TYPE:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:420:9: d= int_def
                            {
                            pushFollow(FOLLOW_int_def_in_named_type1132);
                            d=int_def();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:421:6: d= long_def
                            {
                            pushFollow(FOLLOW_long_def_in_named_type1143);
                            d=long_def();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:422:6: d= float_def
                            {
                            pushFollow(FOLLOW_float_def_in_named_type1154);
                            d=float_def();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:423:6: d= double_def
                            {
                            pushFollow(FOLLOW_double_def_in_named_type1165);
                            d=double_def();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:424:6: d= byte_def
                            {
                            pushFollow(FOLLOW_byte_def_in_named_type1176);
                            d=byte_def();

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:425:6: d= short_def
                            {
                            pushFollow(FOLLOW_short_def_in_named_type1187);
                            d=short_def();

                            state._fsp--;


                            }
                            break;

                    }


                    				tr = new BlitzMaxTypeReference(d);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:430:5: s= STRING_TYPE
                    {
                    s=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_named_type1206); 

                    				tr = new BlitzMaxTypeReference( new BlitzMaxStringType(s) );
                    			

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:434:5: o= OBJECT_TYPE
                    {
                    o=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_named_type1221); 

                    				tr = new BlitzMaxTypeReference( new BlitzMaxObjectType(o) );
                    			

                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:438:5: name= IDENTIFIER
                    {
                    name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_type1236); 

                    				tr = new BlitzMaxTypeReference( new BlitzMaxVariableReference(name) );
                    			

                    }
                    break;

            }
        }

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
        finally {
        }
        return tr;
    }
    // $ANTLR end "named_type"


    // $ANTLR start "function_type"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:444:1: function_type : function_definition ;
    public final void function_type() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:445:2: ( function_definition )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:445:4: function_definition
            {
            pushFollow(FOLLOW_function_definition_in_function_type1252);
            function_definition();

            state._fsp--;


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "function_type"


    // $ANTLR start "symbol_type"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:448:1: symbol_type returns [ BlitzMaxTypeReference tr = null ] : ( PERCENT | POUND | BANG | DOLLAR );
    public final BlitzMaxTypeReference symbol_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:449:2: ( PERCENT | POUND | BANG | DOLLAR )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:
            {
            if ( (input.LA(1)>=PERCENT && input.LA(1)<=DOLLAR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

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
        finally {
        }
        return tr;
    }
    // $ANTLR end "symbol_type"


    // $ANTLR start "array_type"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:455:1: array_type : LBRACK RBRACK ;
    public final void array_type() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:456:2: ( LBRACK RBRACK )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:456:4: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_array_type1296); 
            match(input,RBRACK,FOLLOW_RBRACK_in_array_type1298); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "array_type"


    // $ANTLR start "argument_list"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:459:1: argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ] : arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* ;
    public final List<Declaration> argument_list(boolean functionArgs) throws RecognitionException {
        List<Declaration> args =  new ArrayList<Declaration>();

        Declaration arg = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:460:2: (arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:460:4: arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )*
            {
            pushFollow(FOLLOW_argument_in_argument_list1318);
            arg=argument(functionArgs);

            state._fsp--;


            			args.add(arg);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:464:3: ( COMMA arg= argument[functionArgs] )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:464:4: COMMA arg= argument[functionArgs]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argument_list1329); 
            	    pushFollow(FOLLOW_argument_in_argument_list1335);
            	    arg=argument(functionArgs);

            	    state._fsp--;


            	    				args.add(arg);
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return args;
    }
    // $ANTLR end "argument_list"


    // $ANTLR start "argument"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:471:1: argument[boolean functionArg] returns [ Declaration arg = null ] : a= variable_definition[functionArg] ;
    public final Declaration argument(boolean functionArg) throws RecognitionException {
        Declaration arg =  null;

        Declaration a = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:472:2: (a= variable_definition[functionArg] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:472:4: a= variable_definition[functionArg]
            {
            pushFollow(FOLLOW_variable_definition_in_argument1367);
            a=variable_definition(functionArg);

            state._fsp--;


            			arg = a;
            		

            }

        }

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
        finally {
        }
        return arg;
    }
    // $ANTLR end "argument"


    // $ANTLR start "variable_definition"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:478:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );
    public final Declaration variable_definition(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Token n=null;
        Token v=null;
        BlitzMaxTypedefExpression t = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:479:2: ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:479:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:479:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:479:5: n= IDENTIFIER (t= typedef (v= VAR )? )?
                    {
                    n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_definition1393); 
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:480:4: (t= typedef (v= VAR )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==COLON||(LA23_0>=PERCENT && LA23_0<=DOLLAR)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:480:5: t= typedef (v= VAR )?
                            {
                            pushFollow(FOLLOW_typedef_in_variable_definition1403);
                            t=typedef();

                            state._fsp--;


                            					dec = new BlitzMaxVariableDeclaration(n, t);
                            				
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:485:5: (v= VAR )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==VAR) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:485:7: v= VAR
                                    {
                                    v=(Token)match(input,VAR,FOLLOW_VAR_in_variable_definition1426); 

                                    						if (!functionArg) {
                                    							RecognitionException e = new RecognitionException(input);
                                    							e.token = v;
                                    							throw e;
                                    						}
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    				if (t == null) {
                    					dec = new BlitzMaxVariableDeclaration(n, null);
                    				}
                    			

                    }


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:501:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_variable_definition1461);
                    function_definition();

                    state._fsp--;


                    }
                    break;

            }
        }

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
        finally {
        }
        return dec;
    }
    // $ANTLR end "variable_definition"


    // $ANTLR start "rem_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:504:1: rem_block : REM NEWLINE ( options {greedy=false; } : . )* end_rem NEWLINE ;
    public final void rem_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:505:2: ( REM NEWLINE ( options {greedy=false; } : . )* end_rem NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:505:4: REM NEWLINE ( options {greedy=false; } : . )* end_rem NEWLINE
            {
            match(input,REM,FOLLOW_REM_in_rem_block1472); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_rem_block1474); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:506:3: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case END:
                    {
                    alt25=2;
                    }
                    break;
                case 126:
                    {
                    alt25=2;
                    }
                    break;
                case SUPERSTRICT:
                case NEWLINE:
                case STRICT:
                case TYPE:
                case IDENTIFIER:
                case EXTENDS:
                case ABSTRACT:
                case FINAL:
                case METHOD:
                case FIELD:
                case GLOBAL:
                case CONST:
                case LOCAL:
                case FUNCTION:
                case LPAREN:
                case RPAREN:
                case COLON:
                case STRING_TYPE:
                case OBJECT_TYPE:
                case PERCENT:
                case POUND:
                case BANG:
                case DOLLAR:
                case LBRACK:
                case RBRACK:
                case COMMA:
                case VAR:
                case REM:
                case FOR:
                case EQUAL:
                case TO:
                case UNTIL:
                case STEP:
                case EACHIN:
                case NEXT:
                case REPEAT:
                case FOREVER:
                case TRUE:
                case FALSE:
                case WHILE:
                case WEND:
                case SELECT:
                case DEFAULT:
                case CASE:
                case IMPORT:
                case INCLUDE:
                case STRING_LITERAL:
                case FRAMEWORK:
                case MODULE:
                case MODULEINFO:
                case DOT:
                case DEBUGLOG:
                case IF:
                case THEN:
                case ELSE:
                case LINE_COMMENT:
                case EXTERN:
                case LONG_TYPE:
                case INT_TYPE:
                case FLOAT_TYPE:
                case DOUBLE_TYPE:
                case BYTE_TYPE:
                case SHORT_TYPE:
                case POINTER:
                case NULL:
                case SUPER:
                case SELF:
                case NEW:
                case DELETE:
                case CONTINUE:
                case TRY:
                case CATCH:
                case THROW:
                case ASSERT:
                case DEBUGSTOP:
                case EXIT:
                case INCBIN:
                case INCBINPTR:
                case INCBINLEN:
                case NOT_TEST:
                case AND_TEST:
                case OR_TEST:
                case SEMI:
                case PLUS:
                case MINUS:
                case STAR:
                case SLASH:
                case VBAR:
                case AMPER:
                case LESS:
                case GREATER:
                case POWER:
                case TILDE:
                case UNDERSCORE:
                case NOTEQUAL:
                case LESSEQUAL:
                case GREATEREQUAL:
                case PLUSEQUAL:
                case MINUSEQUAL:
                case STAREQUAL:
                case SLASHEQUAL:
                case VBAREQUAL:
                case LEFTSHIFT:
                case RIGHTSHIFT:
                case ARITHRIGHTSHIFT:
                case MOD:
                case FLOAT:
                case LONG:
                case INT:
                case POINTFLOAT:
                case EXPONENTFLOAT:
                case DIGITS:
                case FRACTION:
                case Exponent:
                case DIGIT:
                case ALPHA_LOWER:
                case ALPHA_UPPER:
                case WHITESPACE:
                case 123:
                case 124:
                case 125:
                case 127:
                case 128:
                case 129:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:506:31: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            pushFollow(FOLLOW_end_rem_in_rem_block1496);
            end_rem();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_rem_block1500); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "rem_block"


    // $ANTLR start "end_rem"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:511:1: end_rem : ( END REM | 'endrem' );
    public final void end_rem() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:512:2: ( END REM | 'endrem' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==END) ) {
                alt26=1;
            }
            else if ( (LA26_0==126) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:512:4: END REM
                    {
                    match(input,END,FOLLOW_END_in_end_rem1512); 
                    match(input,REM,FOLLOW_REM_in_end_rem1514); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:513:5: 'endrem'
                    {
                    match(input,126,FOLLOW_126_in_end_rem1520); 

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "end_rem"


    // $ANTLR start "for_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:516:1: for_block returns [ BlitzMaxForStatement stmt = null ] : (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE ;
    public final BlitzMaxForStatement for_block() throws RecognitionException {
        BlitzMaxForStatement stmt =  null;

        Token f=null;
        Declaration vdef = null;

        Expression frm = null;

        Expression to = null;

        Expression sexp = null;

        BlitzMaxBlock sb = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:517:2: ( (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:517:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:517:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:518:4: f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_for_block1545); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:519:4: ( LOCAL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LOCAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:519:4: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_for_block1550); 

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_definition_in_for_block1560);
            vdef=variable_definition(false);

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_for_block1566); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:522:4: ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER||(LA30_0>=TRUE && LA30_0<=FALSE)||LA30_0==STRING_LITERAL||(LA30_0>=PLUS && LA30_0<=MINUS)||(LA30_0>=FLOAT && LA30_0<=INT)) ) {
                alt30=1;
            }
            else if ( (LA30_0==EACHIN) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:523:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:523:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:524:5: frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )?
                    {
                    pushFollow(FOLLOW_expression_in_for_block1586);
                    frm=expression();

                    state._fsp--;


                    					stmt = new BlitzMaxForStatement(vdef, frm);
                    				
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:528:5: ( TO | UNTIL )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==TO) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==UNTIL) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:528:7: TO
                            {
                            match(input,TO,FOLLOW_TO_in_for_block1600); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
                            					

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:532:7: UNTIL
                            {
                            match(input,UNTIL,FOLLOW_UNTIL_in_for_block1615); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
                            				 	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_for_block1640);
                    to=expression();

                    state._fsp--;


                    					stmt.setToExpr(to);
                    				
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:542:5: ( STEP sexp= expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==STEP) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:542:7: STEP sexp= expression
                            {
                            match(input,STEP,FOLLOW_STEP_in_for_block1654); 
                            pushFollow(FOLLOW_expression_in_for_block1666);
                            sexp=expression();

                            state._fsp--;


                            						stmt.setStepExpr(sexp);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:550:5: EACHIN to= expression
                    {
                    match(input,EACHIN,FOLLOW_EACHIN_in_for_block1696); 

                    						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
                    				 	
                    pushFollow(FOLLOW_expression_in_for_block1714);
                    to=expression();

                    state._fsp--;


                    						stmt.setToExpr(to);
                    					

                    }
                    break;

            }


            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1734); 
            pushFollow(FOLLOW_statement_block_in_for_block1742);
            sb=statement_block();

            state._fsp--;


            				stmt.setBlock(sb);
            			
            match(input,NEXT,FOLLOW_NEXT_in_for_block1751); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1753); 

            }

        }

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
        finally {
        }
        return stmt;
    }
    // $ANTLR end "for_block"


    // $ANTLR start "repeat_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:568:1: repeat_block : REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE ;
    public final void repeat_block() throws RecognitionException {
        BlitzMaxBlock b = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:569:2: ( REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:569:4: REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat_block1765); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1767); 
            pushFollow(FOLLOW_statement_block_in_repeat_block1775);
            b=statement_block();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:571:3: ( FOREVER | UNTIL expression )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FOREVER) ) {
                alt31=1;
            }
            else if ( (LA31_0==UNTIL) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:571:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeat_block1780); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:571:14: UNTIL expression
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_repeat_block1784); 
                    pushFollow(FOLLOW_expression_in_repeat_block1786);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1791); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "repeat_block"


    // $ANTLR start "expression"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:575:1: expression returns [ Expression exp = null ] : (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal );
    public final Expression expression() throws RecognitionException {
        Expression exp =  null;

        Token id=null;
        Token t=null;
        Literal n = null;

        BlitzMaxStringLiteral s = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:576:2: (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal )
            int alt32=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAREN) ) {
                    alt32=3;
                }
                else if ( (LA32_1==EOF||(LA32_1>=SUPERSTRICT && LA32_1<=IDENTIFIER)||LA32_1==END||(LA32_1>=GLOBAL && LA32_1<=FUNCTION)||LA32_1==RPAREN||LA32_1==COMMA||(LA32_1>=REM && LA32_1<=FOR)||(LA32_1>=TO && LA32_1<=STEP)||(LA32_1>=NEXT && LA32_1<=WEND)||(LA32_1>=DEFAULT && LA32_1<=MODULEINFO)||(LA32_1>=THEN && LA32_1<=ELSE)||(LA32_1>=PLUS && LA32_1<=MINUS)||(LA32_1>=FLOAT && LA32_1<=INT)||(LA32_1>=124 && LA32_1<=125)||(LA32_1>=127 && LA32_1<=129)) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case PLUS:
            case MINUS:
            case FLOAT:
            case LONG:
            case INT:
                {
                alt32=2;
                }
                break;
            case TRUE:
                {
                alt32=4;
                }
                break;
            case FALSE:
                {
                alt32=5;
                }
                break;
            case STRING_LITERAL:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:576:4: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1810); 

                    				exp = new BlitzMaxStringLiteral(id);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:580:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_expression1825);
                    n=number();

                    state._fsp--;


                    				exp = n;
                    			

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:584:5: cast_or_function_call
                    {
                    pushFollow(FOLLOW_cast_or_function_call_in_expression1836);
                    cast_or_function_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:585:5: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_expression1846); 

                    				exp = new BlitzMaxNumericLiteral(t, 1);
                    			

                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:589:5: t= FALSE
                    {
                    t=(Token)match(input,FALSE,FOLLOW_FALSE_in_expression1861); 

                    				exp = new BlitzMaxNumericLiteral(t, 0);
                    			

                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:593:5: s= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_expression1876);
                    s=string_literal();

                    state._fsp--;


                    				exp = s;
                    			

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "expression"


    // $ANTLR start "cast_or_function_call"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:599:1: cast_or_function_call : ( IDENTIFIER LPAREN ( expression_list )? RPAREN ) ;
    public final void cast_or_function_call() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:2: ( ( IDENTIFIER LPAREN ( expression_list )? RPAREN ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:4: ( IDENTIFIER LPAREN ( expression_list )? RPAREN )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:4: ( IDENTIFIER LPAREN ( expression_list )? RPAREN )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:5: IDENTIFIER LPAREN ( expression_list )? RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call1893); 
            match(input,LPAREN,FOLLOW_LPAREN_in_cast_or_function_call1895); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:23: ( expression_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENTIFIER||(LA33_0>=TRUE && LA33_0<=FALSE)||LA33_0==STRING_LITERAL||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=FLOAT && LA33_0<=INT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:23: expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_cast_or_function_call1897);
                    expression_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_cast_or_function_call1900); 

            }


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "cast_or_function_call"


    // $ANTLR start "expression_list"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:603:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:604:2: ( expression ( COMMA expression )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:604:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list1912);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:604:15: ( COMMA expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:604:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list1915); 
            	    pushFollow(FOLLOW_expression_in_expression_list1917);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "expression_list"


    // $ANTLR start "while_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:607:1: while_block : WHILE expression NEWLINE statement_block WEND NEWLINE ;
    public final void while_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:608:2: ( WHILE expression NEWLINE statement_block WEND NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:608:4: WHILE expression NEWLINE statement_block WEND NEWLINE
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_block1930); 
            pushFollow(FOLLOW_expression_in_while_block1932);
            expression();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block1934); 
            pushFollow(FOLLOW_statement_block_in_while_block1938);
            statement_block();

            state._fsp--;

            match(input,WEND,FOLLOW_WEND_in_while_block1942); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block1944); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "while_block"


    // $ANTLR start "select_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:613:1: select_block : SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE ;
    public final void select_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:614:2: ( SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:614:4: SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_block1955); 
            pushFollow(FOLLOW_expression_in_select_block1957);
            expression();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block1959); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:615:3: ( case_block )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CASE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:615:3: case_block
            	    {
            	    pushFollow(FOLLOW_case_block_in_select_block1963);
            	    case_block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:616:3: ( default_block )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DEFAULT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:616:3: default_block
                    {
                    pushFollow(FOLLOW_default_block_in_select_block1968);
                    default_block();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_end_select_in_select_block1973);
            end_select();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block1977); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "select_block"


    // $ANTLR start "default_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:621:1: default_block : DEFAULT NEWLINE statement_block ;
    public final void default_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:622:2: ( DEFAULT NEWLINE statement_block )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:622:4: DEFAULT NEWLINE statement_block
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_default_block1988); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_default_block1990); 
            pushFollow(FOLLOW_statement_block_in_default_block1994);
            statement_block();

            state._fsp--;


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "default_block"


    // $ANTLR start "end_select"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:626:1: end_select : ( END SELECT | 'endselect' );
    public final void end_select() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:627:2: ( END SELECT | 'endselect' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==END) ) {
                alt37=1;
            }
            else if ( (LA37_0==127) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:627:4: END SELECT
                    {
                    match(input,END,FOLLOW_END_in_end_select2005); 
                    match(input,SELECT,FOLLOW_SELECT_in_end_select2007); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:628:5: 'endselect'
                    {
                    match(input,127,FOLLOW_127_in_end_select2013); 

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "end_select"


    // $ANTLR start "case_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:631:1: case_block : CASE expression ( COMMA expression )* NEWLINE statement_block ;
    public final void case_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:2: ( CASE expression ( COMMA expression )* NEWLINE statement_block )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:4: CASE expression ( COMMA expression )* NEWLINE statement_block
            {
            match(input,CASE,FOLLOW_CASE_in_case_block2024); 
            pushFollow(FOLLOW_expression_in_case_block2026);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:20: ( COMMA expression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_block2029); 
            	    pushFollow(FOLLOW_expression_in_case_block2031);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,NEWLINE,FOLLOW_NEWLINE_in_case_block2035); 
            pushFollow(FOLLOW_statement_block_in_case_block2039);
            statement_block();

            state._fsp--;


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "case_block"


    // $ANTLR start "import_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:636:1: import_stmt returns [ Statement stmt = null ] : imp= IMPORT (l= string_literal | e= module_name ) NEWLINE ;
    public final Statement import_stmt() throws RecognitionException {
        Statement stmt =  null;

        Token imp=null;
        BlitzMaxStringLiteral l = null;

        BlitzMaxModuleNameExpression e = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:637:2: (imp= IMPORT (l= string_literal | e= module_name ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:637:4: imp= IMPORT (l= string_literal | e= module_name ) NEWLINE
            {
            imp=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_stmt2058); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:638:3: (l= string_literal | e= module_name )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==STRING_LITERAL) ) {
                alt39=1;
            }
            else if ( (LA39_0==IDENTIFIER) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:639:4: l= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_import_stmt2071);
                    l=string_literal();

                    state._fsp--;


                    				stmt = new BlitzMaxImportStatement(imp, l);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:644:4: e= module_name
                    {
                    pushFollow(FOLLOW_module_name_in_import_stmt2089);
                    e=module_name();

                    state._fsp--;


                    				stmt = new BlitzMaxImportStatement(imp, e);
                    			

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_import_stmt2102); 

            }

        }

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
        finally {
        }
        return stmt;
    }
    // $ANTLR end "import_stmt"


    // $ANTLR start "include_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:652:1: include_stmt : INCLUDE STRING_LITERAL NEWLINE ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:653:2: ( INCLUDE STRING_LITERAL NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:653:4: INCLUDE STRING_LITERAL NEWLINE
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt2113); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include_stmt2115); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_include_stmt2117); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "include_stmt"


    // $ANTLR start "framework_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:656:1: framework_stmt : FRAMEWORK module_name NEWLINE ;
    public final void framework_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:657:2: ( FRAMEWORK module_name NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:657:4: FRAMEWORK module_name NEWLINE
            {
            match(input,FRAMEWORK,FOLLOW_FRAMEWORK_in_framework_stmt2128); 
            pushFollow(FOLLOW_module_name_in_framework_stmt2130);
            module_name();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_framework_stmt2132); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "framework_stmt"


    // $ANTLR start "module_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:660:1: module_stmt : MODULE module_name NEWLINE ;
    public final void module_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:661:2: ( MODULE module_name NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:661:4: MODULE module_name NEWLINE
            {
            match(input,MODULE,FOLLOW_MODULE_in_module_stmt2143); 
            pushFollow(FOLLOW_module_name_in_module_stmt2145);
            module_name();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_module_stmt2147); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "module_stmt"


    // $ANTLR start "moduleinfo_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:664:1: moduleinfo_stmt : MODULEINFO STRING_LITERAL NEWLINE ;
    public final void moduleinfo_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:665:2: ( MODULEINFO STRING_LITERAL NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:665:4: MODULEINFO STRING_LITERAL NEWLINE
            {
            match(input,MODULEINFO,FOLLOW_MODULEINFO_in_moduleinfo_stmt2159); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2161); 
            match(input,NEWLINE,FOLLOW_NEWLINE_in_moduleinfo_stmt2163); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "moduleinfo_stmt"


    // $ANTLR start "module_name"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:668:1: module_name returns [ BlitzMaxModuleNameExpression expr = null ] : (ns= IDENTIFIER DOT name= IDENTIFIER ) ;
    public final BlitzMaxModuleNameExpression module_name() throws RecognitionException {
        BlitzMaxModuleNameExpression expr =  null;

        Token ns=null;
        Token name=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:2: ( (ns= IDENTIFIER DOT name= IDENTIFIER ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:6: ns= IDENTIFIER DOT name= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2184); 
            match(input,DOT,FOLLOW_DOT_in_module_name2186); 
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2192); 

            }


            			expr = new BlitzMaxModuleNameExpression(ns, name);
            		

            }

        }

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
        finally {
        }
        return expr;
    }
    // $ANTLR end "module_name"


    // $ANTLR start "debuglog_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:675:1: debuglog_stmt : DEBUGLOG expression NEWLINE ;
    public final void debuglog_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:676:2: ( DEBUGLOG expression NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:676:4: DEBUGLOG expression NEWLINE
            {
            match(input,DEBUGLOG,FOLLOW_DEBUGLOG_in_debuglog_stmt2208); 
            pushFollow(FOLLOW_expression_in_debuglog_stmt2210);
            expression();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_debuglog_stmt2212); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "debuglog_stmt"


    // $ANTLR start "if_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:679:1: if_block : IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) NEWLINE ;
    public final void if_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:680:2: ( IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) NEWLINE )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:681:3: IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) NEWLINE
            {
            match(input,IF,FOLLOW_IF_in_if_block2226); 
            pushFollow(FOLLOW_expression_in_if_block2228);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:682:3: ( THEN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==THEN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:682:3: THEN
                    {
                    match(input,THEN,FOLLOW_THEN_in_if_block2232); 

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_block_in_if_block2240);
            statement_block();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:686:3: ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ELSE||LA43_0==128) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:687:4: ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:687:4: ( ELSE | ( ELSE IF | 'elseif' ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==ELSE) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==IF) ) {
                            alt42=2;
                        }
                        else if ( (LA42_1==NEWLINE||LA42_1==IDENTIFIER||LA42_1==END||(LA42_1>=GLOBAL && LA42_1<=LOCAL)||(LA42_1>=REM && LA42_1<=FOR)||LA42_1==REPEAT||(LA42_1>=TRUE && LA42_1<=WHILE)||(LA42_1>=INCLUDE && LA42_1<=STRING_LITERAL)||(LA42_1>=PLUS && LA42_1<=MINUS)||(LA42_1>=FLOAT && LA42_1<=INT)||LA42_1==129) ) {
                            alt42=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA42_0==128) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:688:5: ELSE
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_block2258); 

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:689:7: ( ELSE IF | 'elseif' )
                            {
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:689:7: ( ELSE IF | 'elseif' )
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==ELSE) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==128) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }
                            switch (alt41) {
                                case 1 :
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:690:6: ELSE IF
                                    {
                                    match(input,ELSE,FOLLOW_ELSE_in_if_block2273); 
                                    match(input,IF,FOLLOW_IF_in_if_block2275); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:691:8: 'elseif'
                                    {
                                    match(input,128,FOLLOW_128_in_if_block2284); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_if_block2304);
                    statement_block();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:698:3: ( END IF | 'endif' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==END) ) {
                alt44=1;
            }
            else if ( (LA44_0==129) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:699:4: END IF
                    {
                    match(input,END,FOLLOW_END_in_if_block2321); 
                    match(input,IF,FOLLOW_IF_in_if_block2323); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:700:6: 'endif'
                    {
                    match(input,129,FOLLOW_129_in_if_block2330); 

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_if_block2338); 

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "if_block"


    // $ANTLR start "pointer_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:753:1: pointer_def returns [int count = 0] : POINTER ( POINTER )* ;
    public final int pointer_def() throws RecognitionException {
        int count =  0;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:754:2: ( POINTER ( POINTER )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:754:4: POINTER ( POINTER )*
            {
            match(input,POINTER,FOLLOW_POINTER_in_pointer_def2642); 

            			count = 1;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:758:3: ( POINTER )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==POINTER) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:759:4: POINTER
            	    {
            	    match(input,POINTER,FOLLOW_POINTER_in_pointer_def2656); 

            	    				count++;
            	    			

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return count;
    }
    // $ANTLR end "pointer_def"


    // $ANTLR start "byte_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:767:1: byte_def returns [Expression exp = null] : t= BYTE_TYPE (c= pointer_def )? ;
    public final Expression byte_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:768:2: (t= BYTE_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:768:4: t= BYTE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,BYTE_TYPE,FOLLOW_BYTE_TYPE_in_byte_def2688); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:769:5: (c= pointer_def )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==POINTER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:769:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_byte_def2696);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.BYTE);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "byte_def"


    // $ANTLR start "int_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:776:1: int_def returns [Expression exp = null] : t= INT_TYPE (c= pointer_def )? ;
    public final Expression int_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:777:2: (t= INT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:777:4: t= INT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_int_def2721); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:778:5: (c= pointer_def )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==POINTER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:778:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_int_def2729);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.INT);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "int_def"


    // $ANTLR start "short_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:784:1: short_def returns [Expression exp = null] : t= SHORT_TYPE (c= pointer_def )? ;
    public final Expression short_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:785:2: (t= SHORT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:785:4: t= SHORT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_short_def2753); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:786:5: (c= pointer_def )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==POINTER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:786:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_short_def2761);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.SHORT);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "short_def"


    // $ANTLR start "long_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:793:1: long_def returns [Expression exp = null] : t= LONG_TYPE (c= pointer_def )? ;
    public final Expression long_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:794:2: (t= LONG_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:794:4: t= LONG_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_long_def2786); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:795:5: (c= pointer_def )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==POINTER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:795:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_long_def2794);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.LONG);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "long_def"


    // $ANTLR start "float_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:802:1: float_def returns [Expression exp = null] : t= FLOAT_TYPE (c= pointer_def )? ;
    public final Expression float_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:803:2: (t= FLOAT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:803:4: t= FLOAT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_float_def2819); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:804:5: (c= pointer_def )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==POINTER) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:804:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_float_def2827);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.FLOAT);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "float_def"


    // $ANTLR start "double_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:811:1: double_def returns [Expression exp = null] : t= DOUBLE_TYPE (c= pointer_def )? ;
    public final Expression double_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:812:2: (t= DOUBLE_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:812:4: t= DOUBLE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_double_def2852); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:813:5: (c= pointer_def )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==POINTER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:813:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_double_def2860);
                    c=pointer_def();

                    state._fsp--;


                    }
                    break;

            }


            			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.DOUBLE);
            		

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "double_def"


    // $ANTLR start "number"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:911:1: number returns [ Literal num = null ] : (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) ;
    public final Literal number() throws RecognitionException {
        Literal num =  null;

        Token s=null;
        Token n=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:2: ( (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:913:3: (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:913:3: (s= MINUS | s= PLUS )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==MINUS) ) {
                alt52=1;
            }
            else if ( (LA52_0==PLUS) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:913:5: s= MINUS
                    {
                    s=(Token)match(input,MINUS,FOLLOW_MINUS_in_number3409); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:914:5: s= PLUS
                    {
                    s=(Token)match(input,PLUS,FOLLOW_PLUS_in_number3419); 

                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:916:3: (n= FLOAT | n= LONG | n= INT )
            int alt53=3;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt53=1;
                }
                break;
            case LONG:
                {
                alt53=2;
                }
                break;
            case INT:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:916:4: n= FLOAT
                    {
                    n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number3433); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:917:5: n= LONG
                    {
                    n=(Token)match(input,LONG,FOLLOW_LONG_in_number3443); 

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:918:5: n= INT
                    {
                    n=(Token)match(input,INT,FOLLOW_INT_in_number3453); 

                    }
                    break;

            }


            			num = new BlitzMaxNumericLiteral(s, n);
            		

            }

        }

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
        finally {
        }
        return num;
    }
    // $ANTLR end "number"


    // $ANTLR start "string_literal"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:977:1: string_literal returns [BlitzMaxStringLiteral str = null] : e= STRING_LITERAL ;
    public final BlitzMaxStringLiteral string_literal() throws RecognitionException {
        BlitzMaxStringLiteral str =  null;

        Token e=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:978:2: (e= STRING_LITERAL )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:978:4: e= STRING_LITERAL
            {
            e=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal3792); 

            			str = new BlitzMaxStringLiteral(e);
            		

            }

        }

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
        finally {
        }
        return str;
    }
    // $ANTLR end "string_literal"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\37\uffff";
    static final String DFA24_eofS =
        "\37\uffff";
    static final String DFA24_minS =
        "\1\10\1\5\1\10\1\5\2\uffff\11\5\1\35\1\5\1\35\15\5";
    static final String DFA24_maxS =
        "\1\10\1\42\1\103\1\42\2\uffff\6\104\3\42\1\35\1\104\1\35\5\104"+
        "\1\42\1\104\1\42\5\104";
    static final String DFA24_acceptS =
        "\4\uffff\1\1\1\2\31\uffff";
    static final String DFA24_specialS =
        "\37\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\1\4\15\uffff\1\5\1\4\1\2\2\uffff\4\3\2\uffff\1\4\3\uffff"+
            "\1\4",
            "\1\16\15\uffff\1\14\1\15\46\uffff\1\7\1\6\1\10\1\11\1\12\1"+
            "\13",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\17\1\uffff\2\4\2\uffff\1\4",
            "",
            "",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\20",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\22",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\23",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\24",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\25",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\26",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4",
            "\1\27",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\30",
            "\1\31",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\32",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\33",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\34",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\35",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\36",
            "\1\4\15\uffff\1\5\1\4\11\uffff\2\4\2\uffff\1\4",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\30",
            "\1\4\15\uffff\1\5\1\4\11\uffff\2\4\2\uffff\1\4",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\32",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\33",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\34",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\35",
            "\1\4\15\uffff\1\5\1\4\7\uffff\1\21\1\uffff\2\4\2\uffff\1\4"+
            "\41\uffff\1\36"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "478:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );";
        }
    }
 

    public static final BitSet FOLLOW_main_statements_in_file_input77 = new BitSet(new long[]{0x007E1D03000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_EOF_in_file_input107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPERSTRICT_in_main_statements120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICT_in_main_statements133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_framework_stmt_in_main_statements150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_stmt_in_main_statements156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleinfo_stmt_in_main_statements162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_main_statements172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_block_in_main_statements187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_block_in_main_statements202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_main_statements213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_block233 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block241 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_EXTENDS_in_type_block254 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block263 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_type_block283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_type_block299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block320 = new BitSet(new long[]{0x000000010005F020L,0x0800000000000000L});
    public static final BitSet FOLLOW_type_content_list_in_type_block331 = new BitSet(new long[]{0x0000000000001000L,0x0800000000000000L});
    public static final BitSet FOLLOW_END_in_type_block348 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TYPE_in_type_block350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_123_in_type_block358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_type_content_list388 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_global_def_in_type_content_list396 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_field_def_in_type_content_list404 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_method_block_in_type_content_list416 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_function_block_in_type_content_list433 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_rem_block_in_type_content_list446 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_NEWLINE_in_type_content_list453 = new BitSet(new long[]{0x000000010005E022L});
    public static final BitSet FOLLOW_METHOD_in_method_block478 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_function_definition_in_method_block486 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_block497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_method_block520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block540 = new BitSet(new long[]{0x007E1D03000791F0L,0x1003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_method_block548 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000000L});
    public static final BitSet FOLLOW_END_in_method_block563 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_METHOD_in_method_block565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_124_in_method_block573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_field_def600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_field_def609 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_field_def619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_global_def632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_global_def641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_global_def651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_const_def664 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_const_def672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_const_def682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_local_def696 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_local_def704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_local_def714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_function_definition_in_function_block741 = new BitSet(new long[]{0x007E1D03000791F0L,0x2003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_function_block754 = new BitSet(new long[]{0x0000000000001000L,0x2000000000000000L});
    public static final BitSet FOLLOW_END_in_function_block769 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_125_in_function_block779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_function_block789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_statement_block821 = new BitSet(new long[]{0x007E1D03000781F2L,0x0003800003000000L});
    public static final BitSet FOLLOW_include_stmt_in_statement_list860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_block_in_statement_list870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_block_in_statement_list881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_block_in_statement_list887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_statement_list893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_def_in_statement_list900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_def_in_statement_list907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rem_block_in_statement_list914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement_list920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition949 = new BitSet(new long[]{0x000000000F280000L});
    public static final BitSet FOLLOW_typedef_in_function_definition957 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_function_definition962 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_argument_list_in_function_definition970 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_function_definition980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typedef1018 = new BitSet(new long[]{0xC000000000C00100L,0x000000000000000FL});
    public static final BitSet FOLLOW_named_type_in_typedef1028 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_type_in_typedef1074 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_def_in_named_type1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_def_in_named_type1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_def_in_named_type1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_def_in_named_type1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_def_in_named_type1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_def_in_named_type1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_named_type1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_TYPE_in_named_type1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_type1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_type1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_symbol_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_type1296 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RBRACK_in_array_type1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argument_list1318 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list1329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_in_argument_list1335 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_variable_definition_in_argument1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_definition1393 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_typedef_in_variable_definition1403 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VAR_in_variable_definition1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_variable_definition1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block1472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_rem_block1474 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_end_rem_in_rem_block1496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_rem_block1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_rem1512 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_REM_in_end_rem1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_end_rem1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_block1545 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_LOCAL_in_for_block1550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_definition_in_for_block1560 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EQUAL_in_for_block1566 = new BitSet(new long[]{0x00080C4000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_for_block1586 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_TO_in_for_block1600 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_UNTIL_in_for_block1615 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_for_block1640 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_STEP_in_for_block1654 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_for_block1666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EACHIN_in_for_block1696 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_for_block1714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1734 = new BitSet(new long[]{0x007E1D83000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_for_block1742 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEXT_in_for_block1751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat_block1765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1767 = new BitSet(new long[]{0x007E1F13000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_repeat_block1775 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_FOREVER_in_repeat_block1780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_UNTIL_in_repeat_block1784 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_repeat_block1786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_expression1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_or_function_call_in_expression1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_expression1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call1893 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_cast_or_function_call1895 = new BitSet(new long[]{0x00080C0000100100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call1897 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_cast_or_function_call1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1912 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1915 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_expression_list1917 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_WHILE_in_while_block1930 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_while_block1932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block1934 = new BitSet(new long[]{0x007E3D03000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_while_block1938 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_WEND_in_while_block1942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_block1955 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_select_block1957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block1959 = new BitSet(new long[]{0x0001800000001000L,0x8000000000000000L});
    public static final BitSet FOLLOW_case_block_in_select_block1963 = new BitSet(new long[]{0x0001800000001000L,0x8000000000000000L});
    public static final BitSet FOLLOW_default_block_in_select_block1968 = new BitSet(new long[]{0x0001800000001000L,0x8000000000000000L});
    public static final BitSet FOLLOW_end_select_in_select_block1973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_block1988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_default_block1990 = new BitSet(new long[]{0x007E1D03000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_default_block1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_select2005 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SELECT_in_end_select2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_end_select2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_block2024 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_case_block2026 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_COMMA_in_case_block2029 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_case_block2031 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_NEWLINE_in_case_block2035 = new BitSet(new long[]{0x007E1D03000781F0L,0x0003800003000000L});
    public static final BitSet FOLLOW_statement_block_in_case_block2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_stmt2058 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_string_literal_in_import_stmt2071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_module_name_in_import_stmt2089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_import_stmt2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt2113 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include_stmt2115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_include_stmt2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAMEWORK_in_framework_stmt2128 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_module_name_in_framework_stmt2130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_framework_stmt2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_stmt2143 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_module_name_in_module_stmt2145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_module_stmt2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULEINFO_in_moduleinfo_stmt2159 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_moduleinfo_stmt2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2184 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_DOT_in_module_name2186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGLOG_in_debuglog_stmt2208 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_debuglog_stmt2210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_debuglog_stmt2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_block2226 = new BitSet(new long[]{0x00080C0000000100L,0x0003800003000000L});
    public static final BitSet FOLLOW_expression_in_if_block2228 = new BitSet(new long[]{0x0C7E1D03000791F0L,0x0003800003000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_THEN_in_if_block2232 = new BitSet(new long[]{0x087E1D03000791F0L,0x0003800003000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_block_in_if_block2240 = new BitSet(new long[]{0x0800000000001000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ELSE_in_if_block2258 = new BitSet(new long[]{0x007E1D03000791F0L,0x0003800003000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_if_block2273 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2275 = new BitSet(new long[]{0x007E1D03000791F0L,0x0003800003000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_if_block2284 = new BitSet(new long[]{0x007E1D03000791F0L,0x0003800003000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_block_in_if_block2304 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_if_block2321 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_129_in_if_block2330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_block2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_BYTE_TYPE_in_byte_def2688 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_byte_def2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_int_def2721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_int_def2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_short_def2753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_short_def2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_long_def2786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_long_def2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_float_def2819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_float_def2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_double_def2852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pointer_def_in_double_def2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number3409 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_PLUS_in_number3419 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_FLOAT_in_number3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_number3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal3792 = new BitSet(new long[]{0x0000000000000002L});

}