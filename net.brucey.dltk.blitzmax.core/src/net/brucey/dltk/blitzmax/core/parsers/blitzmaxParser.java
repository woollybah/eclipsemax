// $ANTLR 3.1.2 C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g 2009-06-19 09:03:56

package net.brucey.dltk.blitzmax.core.parsers;

import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxConstants;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxFieldDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxForStatement;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxFunctionDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxImportStatement;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxMethodDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxModuleDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxPrimitiveType;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxStringLiteral;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUPERSTRICT", "STRICT", "TYPE", "IDENTIFIER", "EXTENDS", "ABSTRACT", "FINAL", "END", "METHOD", "FIELD", "GLOBAL", "CONST", "LOCAL", "FUNCTION", "LPAREN", "RPAREN", "COLON", "STRING_TYPE", "OBJECT_TYPE", "PERCENT", "POUND", "BANG", "DOLLAR", "LBRACK", "RBRACK", "COMMA", "VAR", "REM", "FOR", "EQUAL", "TO", "UNTIL", "STEP", "EACHIN", "NEXT", "REPEAT", "FOREVER", "TRUE", "FALSE", "WHILE", "WEND", "SELECT", "DEFAULT", "CASE", "IMPORT", "INCLUDE", "STRING_LITERAL", "FRAMEWORK", "MODULE", "MODULEINFO", "DOT", "DEBUGLOG", "IF", "THEN", "ELSE", "LINE_COMMENT", "EXTERN", "LONG_TYPE", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "BYTE_TYPE", "SHORT_TYPE", "POINTER", "NULL", "SUPER", "SELF", "NEW", "DELETE", "CONTINUE", "TRY", "CATCH", "THROW", "ASSERT", "DEBUGSTOP", "EXIT", "INCBIN", "INCBINPTR", "INCBINLEN", "NOT_TEST", "AND_TEST", "OR_TEST", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", "GREATER", "POWER", "TILDE", "UNDERSCORE", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", "PLUSEQUAL", "MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "VBAREQUAL", "LEFTSHIFT", "RIGHTSHIFT", "ARITHRIGHTSHIFT", "MOD", "FLOAT", "LONG", "INT", "POINTFLOAT", "EXPONENTFLOAT", "DIGITS", "FRACTION", "Exponent", "DIGIT", "ALPHA_LOWER", "ALPHA_UPPER", "WHITESPACE", "NEWLINE", "'endtype'", "'endmethod'", "'endfunction'", "'endrem'", "'endselect'", "'elseif'", "'endif'"
    };
    public static final int FUNCTION=17;
    public static final int WEND=44;
    public static final int SLASHEQUAL=104;
    public static final int STAR=89;
    public static final int WHILE=43;
    public static final int BYTE_TYPE=65;
    public static final int MOD=109;
    public static final int CONST=15;
    public static final int POINTER=67;
    public static final int CASE=47;
    public static final int NEW=71;
    public static final int GREATEREQUAL=100;
    public static final int EXTERN=60;
    public static final int EOF=-1;
    public static final int TYPE=6;
    public static final int NOTEQUAL=98;
    public static final int MINUSEQUAL=102;
    public static final int VBAR=91;
    public static final int RPAREN=19;
    public static final int FINAL=10;
    public static final int IMPORT=48;
    public static final int GREATER=94;
    public static final int STRING_LITERAL=50;
    public static final int ALPHA_LOWER=119;
    public static final int INCLUDE=49;
    public static final int LESS=93;
    public static final int VAR=30;
    public static final int SUPER=69;
    public static final int SELECT=45;
    public static final int RBRACK=28;
    public static final int EXIT=79;
    public static final int FLOAT_TYPE=63;
    public static final int STRICT=5;
    public static final int POUND=24;
    public static final int ALPHA_UPPER=120;
    public static final int OBJECT_TYPE=22;
    public static final int LINE_COMMENT=59;
    public static final int SUPERSTRICT=4;
    public static final int NULL=68;
    public static final int ELSE=58;
    public static final int NOT_TEST=83;
    public static final int WHITESPACE=121;
    public static final int POWER=95;
    public static final int UNDERSCORE=97;
    public static final int DOUBLE_TYPE=64;
    public static final int INT=112;
    public static final int DELETE=72;
    public static final int LOCAL=16;
    public static final int INT_TYPE=62;
    public static final int RIGHTSHIFT=107;
    public static final int ASSERT=77;
    public static final int TRY=74;
    public static final int INCBIN=80;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int INCBINPTR=81;
    public static final int T__129=129;
    public static final int FRAMEWORK=51;
    public static final int UNTIL=35;
    public static final int VBAREQUAL=105;
    public static final int STRING_TYPE=21;
    public static final int FIELD=13;
    public static final int REPEAT=39;
    public static final int END=11;
    public static final int CATCH=75;
    public static final int FALSE=42;
    public static final int LESSEQUAL=99;
    public static final int THROW=76;
    public static final int DOLLAR=26;
    public static final int DEBUGSTOP=78;
    public static final int EXPONENTFLOAT=114;
    public static final int SHORT_TYPE=66;
    public static final int LBRACK=27;
    public static final int INCBINLEN=82;
    public static final int DIGITS=115;
    public static final int LONG_TYPE=61;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int Exponent=117;
    public static final int STEP=36;
    public static final int FOR=32;
    public static final int FLOAT=110;
    public static final int ABSTRACT=9;
    public static final int FOREVER=40;
    public static final int POINTFLOAT=113;
    public static final int LPAREN=18;
    public static final int PLUSEQUAL=101;
    public static final int IF=56;
    public static final int SLASH=90;
    public static final int THEN=57;
    public static final int CONTINUE=73;
    public static final int COMMA=29;
    public static final int AMPER=92;
    public static final int IDENTIFIER=7;
    public static final int EQUAL=33;
    public static final int TILDE=96;
    public static final int LEFTSHIFT=106;
    public static final int PLUS=87;
    public static final int NEXT=38;
    public static final int DIGIT=118;
    public static final int DOT=54;
    public static final int DEBUGLOG=55;
    public static final int ARITHRIGHTSHIFT=108;
    public static final int MODULEINFO=53;
    public static final int PERCENT=23;
    public static final int TO=34;
    public static final int DEFAULT=46;
    public static final int BANG=25;
    public static final int MINUS=88;
    public static final int REM=31;
    public static final int MODULE=52;
    public static final int AND_TEST=84;
    public static final int SEMI=86;
    public static final int TRUE=41;
    public static final int COLON=20;
    public static final int EACHIN=37;
    public static final int NEWLINE=122;
    public static final int OR_TEST=85;
    public static final int FRACTION=116;
    public static final int GLOBAL=14;
    public static final int LONG=111;
    public static final int EXTENDS=8;
    public static final int SELF=70;
    public static final int METHOD=12;
    public static final int STAREQUAL=103;

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:87:1: file_input : (s= main_statements )* EOF ;
    public final void file_input() throws RecognitionException {
        ArrayList s = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:87:11: ( (s= main_statements )* EOF )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:88:6: (s= main_statements )* EOF
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:88:6: (s= main_statements )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SUPERSTRICT && LA1_0<=TYPE)||(LA1_0>=GLOBAL && LA1_0<=LOCAL)||(LA1_0>=REM && LA1_0<=FOR)||LA1_0==REPEAT||LA1_0==WHILE||(LA1_0>=IMPORT && LA1_0<=INCLUDE)||(LA1_0>=MODULE && LA1_0<=MODULEINFO)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:91:7: s= main_statements
            	    {
            	    pushFollow(FOLLOW_main_statements_in_file_input81);
            	    s=main_statements();

            	    state._fsp--;

            	     
            	        				if( s != null ) {
            	        					Iterator i = s.iterator();
            	        					while( i.hasNext() ) {
            	        						Statement sst = (Statement)i.next();
            	        						if( sst != null ) {
            	    		    					decl.addStatement( sst );
            	        						}
            	        					}
            	        				}
            	        			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file_input112); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:108:1: main_statements returns [ ArrayList statements = new ArrayList( ) ] : ( ( SUPERSTRICT | STRICT ) | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | s4= statement_list );
    public final ArrayList main_statements() throws RecognitionException {
        ArrayList statements =  new ArrayList( );

        Statement s1 = null;

        BlitzMaxTypeDeclaration s3 = null;

        ArrayList s4 = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:109:2: ( ( SUPERSTRICT | STRICT ) | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | s4= statement_list )
            int alt3=6;
            switch ( input.LA(1) ) {
            case SUPERSTRICT:
            case STRICT:
                {
                alt3=1;
                }
                break;
            case MODULE:
                {
                alt3=2;
                }
                break;
            case MODULEINFO:
                {
                alt3=3;
                }
                break;
            case IMPORT:
                {
                alt3=4;
                }
                break;
            case TYPE:
                {
                alt3=5;
                }
                break;
            case GLOBAL:
            case CONST:
            case LOCAL:
            case REM:
            case FOR:
            case REPEAT:
            case WHILE:
            case INCLUDE:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:109:4: ( SUPERSTRICT | STRICT )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:109:4: ( SUPERSTRICT | STRICT )
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
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:109:5: SUPERSTRICT
                            {
                            match(input,SUPERSTRICT,FOLLOW_SUPERSTRICT_in_main_statements128); 

                            				statements.add(new BlitzMaxStrictExpression(true));
                            			

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:113:5: STRICT
                            {
                            match(input,STRICT,FOLLOW_STRICT_in_main_statements139); 

                            				statements.add(new BlitzMaxStrictExpression(false));
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:118:5: module_stmt
                    {
                    pushFollow(FOLLOW_module_stmt_in_main_statements154);
                    module_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:119:5: moduleinfo_stmt
                    {
                    pushFollow(FOLLOW_moduleinfo_stmt_in_main_statements160);
                    moduleinfo_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:120:5: s1= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_main_statements170);
                    s1=import_stmt();

                    state._fsp--;


                    				statements.add(s1);
                    			

                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:124:5: s3= type_block
                    {
                    pushFollow(FOLLOW_type_block_in_main_statements185);
                    s3=type_block();

                    state._fsp--;


                    				statements.add(s3);
                    			

                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:128:5: s4= statement_list
                    {
                    pushFollow(FOLLOW_statement_list_in_main_statements200);
                    s4=statement_list();

                    state._fsp--;


                    				statements.addAll(s4);
                    			

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
        return statements;
    }
    // $ANTLR end "main_statements"


    // $ANTLR start "type_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:134:1: type_block returns [ BlitzMaxTypeDeclaration typeDeclaration = null ] : t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' ) ;
    public final BlitzMaxTypeDeclaration type_block() throws RecognitionException {
        BlitzMaxTypeDeclaration typeDeclaration =  null;

        Token t=null;
        Token n=null;
        Token sup=null;
        Token et=null;
        Block tcl = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:135:2: (t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:135:4: t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' )
            {
            t=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_block224); 
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block232); 

            			typeDeclaration = new BlitzMaxTypeDeclaration(n.getText(), ((CommonToken) n).getStartIndex(),((CommonToken) n).getStopIndex()+1,
            				((CommonToken) t).getStartIndex(),((CommonToken) t).getStopIndex() + 1);
            			decl.addType(typeDeclaration);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:142:3: ( EXTENDS sup= IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:143:4: EXTENDS sup= IDENTIFIER
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_type_block245); 
                    sup=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block254); 

                    				typeDeclaration.addSuperClass(new BlitzMaxTypeReference(sup));
                    			

                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:151:3: ( ABSTRACT | FINAL )?
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:151:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_type_block274); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:156:5: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_type_block290); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_type_content_list_in_type_block318);
            tcl=type_content_list();

            state._fsp--;


            			typeDeclaration.setBody(tcl);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:169:3: (et= END TYPE | et= 'endtype' )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:169:5: et= END TYPE
                    {
                    et=(Token)match(input,END,FOLLOW_END_in_type_block335); 
                    match(input,TYPE,FOLLOW_TYPE_in_type_block337); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:169:21: et= 'endtype'
                    {
                    et=(Token)match(input,123,FOLLOW_123_in_type_block345); 

                    }
                    break;

            }


            			typeDeclaration.setEnd(((CommonToken) et).getStopIndex()+1);
            		

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:175:1: type_content_list returns [ Block typeContent = new Block() ] : ( const_def | global_def | field_def[typeContent] | mb= method_block | fb= function_block | rem_block )* ;
    public final Block type_content_list() throws RecognitionException {
        Block typeContent =  new Block();

        BlitzMaxMethodDeclaration mb = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:176:2: ( ( const_def | global_def | field_def[typeContent] | mb= method_block | fb= function_block | rem_block )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:176:4: ( const_def | global_def | field_def[typeContent] | mb= method_block | fb= function_block | rem_block )*
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:176:4: ( const_def | global_def | field_def[typeContent] | mb= method_block | fb= function_block | rem_block )*
            loop7:
            do {
                int alt7=7;
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

                }

                switch (alt7) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:177:4: const_def
            	    {
            	    pushFollow(FOLLOW_const_def_in_type_content_list371);
            	    const_def();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:178:6: global_def
            	    {
            	    pushFollow(FOLLOW_global_def_in_type_content_list378);
            	    global_def();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:179:6: field_def[typeContent]
            	    {
            	    pushFollow(FOLLOW_field_def_in_type_content_list385);
            	    field_def(typeContent);

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:180:6: mb= method_block
            	    {
            	    pushFollow(FOLLOW_method_block_in_type_content_list397);
            	    mb=method_block();

            	    state._fsp--;


            	    					typeContent.addStatement(mb);
            	    				

            	    }
            	    break;
            	case 5 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:184:6: fb= function_block
            	    {
            	    pushFollow(FOLLOW_function_block_in_type_content_list414);
            	    fb=function_block();

            	    state._fsp--;


            	    					typeContent.addStatement(mb);
            	    				

            	    }
            	    break;
            	case 6 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:188:6: rem_block
            	    {
            	    pushFollow(FOLLOW_rem_block_in_type_content_list427);
            	    rem_block();

            	    state._fsp--;


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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:192:1: method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ] : m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) ) ;
    public final BlitzMaxMethodDeclaration method_block() throws RecognitionException {
        BlitzMaxMethodDeclaration methodDeclaration =  null;

        Token m=null;
        Token em=null;
        BlitzMaxFunctionExpression fd = null;

        Block b = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:193:2: (m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:193:4: m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) )
            {
            m=(Token)match(input,METHOD,FOLLOW_METHOD_in_method_block452); 
            pushFollow(FOLLOW_function_definition_in_method_block460);
            fd=function_definition();

            state._fsp--;


            				methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
            			
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:198:3: ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ABSTRACT) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=FINAL && LA10_0<=END)||(LA10_0>=GLOBAL && LA10_0<=LOCAL)||(LA10_0>=REM && LA10_0<=FOR)||(LA10_0>=NEXT && LA10_0<=REPEAT)||(LA10_0>=WHILE && LA10_0<=WEND)||LA10_0==INCLUDE||LA10_0==ELSE||(LA10_0>=124 && LA10_0<=125)||(LA10_0>=128 && LA10_0<=129)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:198:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_block471); 

                    				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:204:3: ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:204:3: ( FINAL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FINAL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:205:3: FINAL
                            {
                            match(input,FINAL,FOLLOW_FINAL_in_method_block494); 

                            				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
                            			

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_method_block519);
                    b=statement_block();

                    state._fsp--;


                    				methodDeclaration.acceptBody(b, true);
                    			
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:216:3: (em= END METHOD | em= 'endmethod' )
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
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:216:5: em= END METHOD
                            {
                            em=(Token)match(input,END,FOLLOW_END_in_method_block534); 
                            match(input,METHOD,FOLLOW_METHOD_in_method_block536); 

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:216:23: em= 'endmethod'
                            {
                            em=(Token)match(input,124,FOLLOW_124_in_method_block544); 

                            }
                            break;

                    }


                    			methodDeclaration.setEnd(((CommonToken) em).getStopIndex()+1);
                    		

                    }
                    break;

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
        return methodDeclaration;
    }
    // $ANTLR end "method_block"


    // $ANTLR start "field_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:223:1: field_def[Block b] : FIELD args= argument_list[false] ;
    public final void field_def(Block b) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:224:2: ( FIELD args= argument_list[false] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:224:4: FIELD args= argument_list[false]
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_def567); 
            pushFollow(FOLLOW_argument_list_in_field_def576);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					b.addStatement(new BlitzMaxFieldDeclaration((Declaration)i.next()));
            				}
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
    // $ANTLR end "field_def"


    // $ANTLR start "global_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:235:1: global_def : GLOBAL argument_list[false] ;
    public final void global_def() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:236:2: ( GLOBAL argument_list[false] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:236:4: GLOBAL argument_list[false]
            {
            match(input,GLOBAL,FOLLOW_GLOBAL_in_global_def593); 
            pushFollow(FOLLOW_argument_list_in_global_def595);
            argument_list(false);

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
    // $ANTLR end "global_def"


    // $ANTLR start "const_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:239:1: const_def : CONST argument_list[false] ;
    public final void const_def() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:240:2: ( CONST argument_list[false] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:240:4: CONST argument_list[false]
            {
            match(input,CONST,FOLLOW_CONST_in_const_def608); 
            pushFollow(FOLLOW_argument_list_in_const_def610);
            argument_list(false);

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
    // $ANTLR end "const_def"


    // $ANTLR start "local_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:243:1: local_def : LOCAL argument_list[false] ;
    public final void local_def() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:244:2: ( LOCAL argument_list[false] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:244:4: LOCAL argument_list[false]
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_def624); 
            pushFollow(FOLLOW_argument_list_in_local_def626);
            argument_list(false);

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
    // $ANTLR end "local_def"


    // $ANTLR start "function_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:247:1: function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ] : f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) ;
    public final BlitzMaxFunctionDeclaration function_block() throws RecognitionException {
        BlitzMaxFunctionDeclaration functionDeclaration =  null;

        Token f=null;
        Token ef=null;
        BlitzMaxFunctionExpression fd = null;

        Block b = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:248:2: (f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:248:4: f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' )
            {
            f=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block647); 
            pushFollow(FOLLOW_function_definition_in_function_block655);
            fd=function_definition();

            state._fsp--;


            				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
            			
            pushFollow(FOLLOW_statement_block_in_function_block668);
            b=statement_block();

            state._fsp--;


            				functionDeclaration.acceptBody(b, true);
            			
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:257:3: (ef= END FUNCTION | ef= 'endfunction' )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:257:5: ef= END FUNCTION
                    {
                    ef=(Token)match(input,END,FOLLOW_END_in_function_block683); 
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block685); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:257:25: ef= 'endfunction'
                    {
                    ef=(Token)match(input,125,FOLLOW_125_in_function_block693); 

                    }
                    break;

            }


            			functionDeclaration.setEnd(((CommonToken) ef).getStopIndex()+1);
            		

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:263:1: statement_block returns [ Block statement = new Block() ] : ( (s= statement_list )* ) ;
    public final Block statement_block() throws RecognitionException {
        Block statement =  new Block();

        ArrayList s = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:264:2: ( ( (s= statement_list )* ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:265:3: ( (s= statement_list )* )
            {

            		  	int startPos = -1;
            		  	int endPos = -1;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:269:3: ( (s= statement_list )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:270:4: (s= statement_list )*
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:270:4: (s= statement_list )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=GLOBAL && LA12_0<=LOCAL)||(LA12_0>=REM && LA12_0<=FOR)||LA12_0==REPEAT||LA12_0==WHILE||LA12_0==INCLUDE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:271:5: s= statement_list
            	    {
            	    pushFollow(FOLLOW_statement_list_in_statement_block735);
            	    s=statement_list();

            	    state._fsp--;


            	    		  			if( s != null ) {
            	    			  			Iterator i = s.iterator();
            	    	  					while( i.hasNext() ) {
            	    		  					Statement sst = (Statement)i.next();
            	    		  					if( sst != null ) {
            	    		  						statement.addStatement( sst );
            	    		  						if( sst.sourceStart() < startPos || startPos == -1 ) {
            	    		  							startPos = sst.sourceStart();
            	    		  						} 
            	    		  						if( sst.sourceEnd() > endPos || endPos == -1 ) {
            	    		  							endPos = sst.sourceEnd();
            	    		  						}
            	    		  					}
            	    		  				}
            	    		  			}
            	    				

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:298:1: statement_list returns [ ArrayList statements = new ArrayList( ) ] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def | global_def | local_def | rem_block );
    public final ArrayList statement_list() throws RecognitionException {
        ArrayList statements =  new ArrayList( );

        BlitzMaxForStatement s2 = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:299:2: ( include_stmt | s2= for_block | while_block | repeat_block | const_def | global_def | local_def | rem_block )
            int alt13=8;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:299:4: include_stmt
                    {
                    pushFollow(FOLLOW_include_stmt_in_statement_list776);
                    include_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:300:5: s2= for_block
                    {
                    pushFollow(FOLLOW_for_block_in_statement_list786);
                    s2=for_block();

                    state._fsp--;


                    				statements.add(s2);
                    			

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:304:5: while_block
                    {
                    pushFollow(FOLLOW_while_block_in_statement_list797);
                    while_block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:305:5: repeat_block
                    {
                    pushFollow(FOLLOW_repeat_block_in_statement_list803);
                    repeat_block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:306:5: const_def
                    {
                    pushFollow(FOLLOW_const_def_in_statement_list809);
                    const_def();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:307:5: global_def
                    {
                    pushFollow(FOLLOW_global_def_in_statement_list815);
                    global_def();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:308:5: local_def
                    {
                    pushFollow(FOLLOW_local_def_in_statement_list821);
                    local_def();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:309:5: rem_block
                    {
                    pushFollow(FOLLOW_rem_block_in_statement_list827);
                    rem_block();

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
        return statements;
    }
    // $ANTLR end "statement_list"


    // $ANTLR start "function_definition"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:312:1: function_definition returns [BlitzMaxFunctionExpression exp = null] : (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) ;
    public final BlitzMaxFunctionExpression function_definition() throws RecognitionException {
        BlitzMaxFunctionExpression exp =  null;

        Token name=null;
        Token rp=null;
        BlitzMaxTypedefExpression t = null;

        List<Declaration> args = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:313:2: ( (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:313:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:313:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:314:3: name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition850); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:315:5: (t= typedef )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON||(LA14_0>=PERCENT && LA14_0<=DOLLAR)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:315:5: t= typedef
                    {
                    pushFollow(FOLLOW_typedef_in_function_definition858);
                    t=typedef();

                    state._fsp--;


                    }
                    break;

            }

            match(input,LPAREN,FOLLOW_LPAREN_in_function_definition863); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:317:8: (args= argument_list[true] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:317:8: args= argument_list[true]
                    {
                    pushFollow(FOLLOW_argument_list_in_function_definition871);
                    args=argument_list(true);

                    state._fsp--;


                    }
                    break;

            }

            rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition881); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:325:1: typedef returns [BlitzMaxTypedefExpression expr = null] : ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) ;
    public final BlitzMaxTypedefExpression typedef() throws RecognitionException {
        BlitzMaxTypedefExpression expr =  null;

        BlitzMaxTypeReference nt = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:326:2: ( ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:327:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            {

            			boolean at = false;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:330:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:331:4: ( COLON nt= named_type ( array_type )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:331:4: ( COLON nt= named_type ( array_type )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:331:5: COLON nt= named_type ( array_type )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_typedef919); 
                    pushFollow(FOLLOW_named_type_in_typedef929);
                    nt=named_type();

                    state._fsp--;

                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:333:5: ( array_type )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LBRACK) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:333:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef936);
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:340:4: (nt= symbol_type ( array_type )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:340:4: (nt= symbol_type ( array_type )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:341:5: nt= symbol_type ( array_type )?
                    {
                    pushFollow(FOLLOW_symbol_type_in_typedef975);
                    nt=symbol_type();

                    state._fsp--;

                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:342:5: ( array_type )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LBRACK) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:342:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef982);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:354:1: named_type returns [ BlitzMaxTypeReference tr = null ] : ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | STRING_TYPE | OBJECT_TYPE | name= IDENTIFIER );
    public final BlitzMaxTypeReference named_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token name=null;
        Expression d = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:355:2: ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | STRING_TYPE | OBJECT_TYPE | name= IDENTIFIER )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:355:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:355:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
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
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:355:9: d= int_def
                            {
                            pushFollow(FOLLOW_int_def_in_named_type1033);
                            d=int_def();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:356:6: d= long_def
                            {
                            pushFollow(FOLLOW_long_def_in_named_type1044);
                            d=long_def();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:357:6: d= float_def
                            {
                            pushFollow(FOLLOW_float_def_in_named_type1055);
                            d=float_def();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:358:6: d= double_def
                            {
                            pushFollow(FOLLOW_double_def_in_named_type1066);
                            d=double_def();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:359:6: d= byte_def
                            {
                            pushFollow(FOLLOW_byte_def_in_named_type1077);
                            d=byte_def();

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:360:6: d= short_def
                            {
                            pushFollow(FOLLOW_short_def_in_named_type1088);
                            d=short_def();

                            state._fsp--;


                            }
                            break;

                    }


                    				tr = new BlitzMaxTypeReference(d);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:365:5: STRING_TYPE
                    {
                    match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_named_type1103); 

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:366:5: OBJECT_TYPE
                    {
                    match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_named_type1109); 

                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:367:5: name= IDENTIFIER
                    {
                    name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_type1119); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:373:1: function_type : function_definition ;
    public final void function_type() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:374:2: ( function_definition )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:374:4: function_definition
            {
            pushFollow(FOLLOW_function_definition_in_function_type1135);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:377:1: symbol_type returns [ BlitzMaxTypeReference tr = null ] : ( PERCENT | POUND | BANG | DOLLAR );
    public final BlitzMaxTypeReference symbol_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:378:2: ( PERCENT | POUND | BANG | DOLLAR )
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:384:1: array_type : LBRACK RBRACK ;
    public final void array_type() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:385:2: ( LBRACK RBRACK )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:385:4: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_array_type1179); 
            match(input,RBRACK,FOLLOW_RBRACK_in_array_type1181); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:388:1: argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ] : arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* ;
    public final List<Declaration> argument_list(boolean functionArgs) throws RecognitionException {
        List<Declaration> args =  new ArrayList<Declaration>();

        Declaration arg = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:389:2: (arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:389:4: arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )*
            {
            pushFollow(FOLLOW_argument_in_argument_list1201);
            arg=argument(functionArgs);

            state._fsp--;


            			args.add(arg);
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:393:3: ( COMMA arg= argument[functionArgs] )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:393:4: COMMA arg= argument[functionArgs]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argument_list1212); 
            	    pushFollow(FOLLOW_argument_in_argument_list1218);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:400:1: argument[boolean functionArg] returns [ Declaration arg = null ] : a= variable_definition[functionArg] ;
    public final Declaration argument(boolean functionArg) throws RecognitionException {
        Declaration arg =  null;

        Declaration a = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:401:2: (a= variable_definition[functionArg] )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:401:4: a= variable_definition[functionArg]
            {
            pushFollow(FOLLOW_variable_definition_in_argument1250);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:407:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );
    public final Declaration variable_definition(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Token n=null;
        Token v=null;
        BlitzMaxTypedefExpression t = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:408:2: ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:408:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:408:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:408:5: n= IDENTIFIER (t= typedef (v= VAR )? )?
                    {
                    n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_definition1276); 
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:409:4: (t= typedef (v= VAR )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==COLON||(LA23_0>=PERCENT && LA23_0<=DOLLAR)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:409:5: t= typedef (v= VAR )?
                            {
                            pushFollow(FOLLOW_typedef_in_variable_definition1286);
                            t=typedef();

                            state._fsp--;


                            					dec = new BlitzMaxVariableDeclaration(n, t);
                            				
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:414:5: (v= VAR )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==VAR) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:414:7: v= VAR
                                    {
                                    v=(Token)match(input,VAR,FOLLOW_VAR_in_variable_definition1309); 

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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:430:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_variable_definition1344);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:433:1: rem_block : REM ( options {greedy=false; } : . )* end_rem ;
    public final void rem_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:434:2: ( REM ( options {greedy=false; } : . )* end_rem )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:434:4: REM ( options {greedy=false; } : . )* end_rem
            {
            match(input,REM,FOLLOW_REM_in_rem_block1355); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:435:3: ( options {greedy=false; } : . )*
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
                case NEWLINE:
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
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:435:31: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            pushFollow(FOLLOW_end_rem_in_rem_block1377);
            end_rem();

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
    // $ANTLR end "rem_block"


    // $ANTLR start "end_rem"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:439:1: end_rem : ( END REM | 'endrem' );
    public final void end_rem() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:440:2: ( END REM | 'endrem' )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:440:4: END REM
                    {
                    match(input,END,FOLLOW_END_in_end_rem1389); 
                    match(input,REM,FOLLOW_REM_in_end_rem1391); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:441:5: 'endrem'
                    {
                    match(input,126,FOLLOW_126_in_end_rem1397); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:444:1: for_block returns [ BlitzMaxForStatement stmt = null ] : (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT ;
    public final BlitzMaxForStatement for_block() throws RecognitionException {
        BlitzMaxForStatement stmt =  null;

        Token f=null;
        Declaration vdef = null;

        Expression frm = null;

        Expression to = null;

        Expression sexp = null;

        Block sb = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:445:2: ( (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:445:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:445:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:446:4: f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_for_block1422); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:447:4: ( LOCAL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LOCAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:447:4: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_for_block1427); 

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_definition_in_for_block1437);
            vdef=variable_definition(false);

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_for_block1443); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:450:4: ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:451:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:451:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:452:5: frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )?
                    {
                    pushFollow(FOLLOW_expression_in_for_block1463);
                    frm=expression();

                    state._fsp--;


                    					stmt = new BlitzMaxForStatement(vdef, frm);
                    				
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:456:5: ( TO | UNTIL )
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
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:456:7: TO
                            {
                            match(input,TO,FOLLOW_TO_in_for_block1477); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
                            					

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:460:7: UNTIL
                            {
                            match(input,UNTIL,FOLLOW_UNTIL_in_for_block1492); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
                            				 	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_for_block1517);
                    to=expression();

                    state._fsp--;


                    					stmt.setToExpr(to);
                    				
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:470:5: ( STEP sexp= expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==STEP) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:470:7: STEP sexp= expression
                            {
                            match(input,STEP,FOLLOW_STEP_in_for_block1531); 
                            pushFollow(FOLLOW_expression_in_for_block1543);
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:478:5: EACHIN to= expression
                    {
                    match(input,EACHIN,FOLLOW_EACHIN_in_for_block1573); 

                    						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
                    				 	
                    pushFollow(FOLLOW_expression_in_for_block1591);
                    to=expression();

                    state._fsp--;


                    						stmt.setToExpr(to);
                    					

                    }
                    break;

            }


            }

            pushFollow(FOLLOW_statement_block_in_for_block1615);
            sb=statement_block();

            state._fsp--;


            			stmt.setBlock(sb);
            		
            match(input,NEXT,FOLLOW_NEXT_in_for_block1623); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:495:1: repeat_block : REPEAT statement_list ( FOREVER | UNTIL expression ) ;
    public final void repeat_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:496:2: ( REPEAT statement_list ( FOREVER | UNTIL expression ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:496:4: REPEAT statement_list ( FOREVER | UNTIL expression )
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat_block1635); 
            pushFollow(FOLLOW_statement_list_in_repeat_block1639);
            statement_list();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:498:3: ( FOREVER | UNTIL expression )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:498:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeat_block1644); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:498:14: UNTIL expression
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_repeat_block1648); 
                    pushFollow(FOLLOW_expression_in_repeat_block1650);
                    expression();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "repeat_block"


    // $ANTLR start "expression"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:501:1: expression returns [ Expression exp = null ] : (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal );
    public final Expression expression() throws RecognitionException {
        Expression exp =  null;

        Token id=null;
        Token t=null;
        Literal n = null;

        BlitzMaxStringLiteral s = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:502:2: (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal )
            int alt32=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAREN) ) {
                    alt32=3;
                }
                else if ( (LA32_1==EOF||(LA32_1>=SUPERSTRICT && LA32_1<=TYPE)||LA32_1==END||(LA32_1>=GLOBAL && LA32_1<=LOCAL)||LA32_1==RPAREN||LA32_1==COMMA||(LA32_1>=REM && LA32_1<=FOR)||(LA32_1>=TO && LA32_1<=STEP)||(LA32_1>=NEXT && LA32_1<=FOREVER)||(LA32_1>=WHILE && LA32_1<=WEND)||(LA32_1>=DEFAULT && LA32_1<=INCLUDE)||(LA32_1>=MODULE && LA32_1<=MODULEINFO)||(LA32_1>=THEN && LA32_1<=ELSE)||(LA32_1>=124 && LA32_1<=125)||(LA32_1>=127 && LA32_1<=129)) ) {
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:502:4: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1670); 

                    				exp = new BlitzMaxStringLiteral(id);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:506:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_expression1685);
                    n=number();

                    state._fsp--;


                    				exp = n;
                    			

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:510:5: cast_or_function_call
                    {
                    pushFollow(FOLLOW_cast_or_function_call_in_expression1696);
                    cast_or_function_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:511:5: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_expression1706); 

                    				exp = new BlitzMaxNumericLiteral(t, 1);
                    			

                    }
                    break;
                case 5 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:515:5: t= FALSE
                    {
                    t=(Token)match(input,FALSE,FOLLOW_FALSE_in_expression1721); 

                    				exp = new BlitzMaxNumericLiteral(t, 0);
                    			

                    }
                    break;
                case 6 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:519:5: s= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_expression1736);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:525:1: cast_or_function_call : IDENTIFIER LPAREN ( expression_list )? RPAREN ;
    public final void cast_or_function_call() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:526:2: ( IDENTIFIER LPAREN ( expression_list )? RPAREN )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:526:4: IDENTIFIER LPAREN ( expression_list )? RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call1752); 
            match(input,LPAREN,FOLLOW_LPAREN_in_cast_or_function_call1754); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:526:22: ( expression_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENTIFIER||(LA33_0>=TRUE && LA33_0<=FALSE)||LA33_0==STRING_LITERAL||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=FLOAT && LA33_0<=INT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:526:22: expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_cast_or_function_call1756);
                    expression_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_cast_or_function_call1759); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:529:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:530:2: ( expression ( COMMA expression )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:530:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list1770);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:530:15: ( COMMA expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:530:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list1773); 
            	    pushFollow(FOLLOW_expression_in_expression_list1775);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:533:1: while_block : WHILE expression statement_block WEND ;
    public final void while_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:534:2: ( WHILE expression statement_block WEND )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:534:4: WHILE expression statement_block WEND
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_block1788); 
            pushFollow(FOLLOW_expression_in_while_block1790);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_statement_block_in_while_block1794);
            statement_block();

            state._fsp--;

            match(input,WEND,FOLLOW_WEND_in_while_block1798); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:539:1: select_block : SELECT expression ( case_block )* ( default_block )? end_select ;
    public final void select_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:540:2: ( SELECT expression ( case_block )* ( default_block )? end_select )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:540:4: SELECT expression ( case_block )* ( default_block )? end_select
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_block1809); 
            pushFollow(FOLLOW_expression_in_select_block1811);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:541:3: ( case_block )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CASE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:541:3: case_block
            	    {
            	    pushFollow(FOLLOW_case_block_in_select_block1815);
            	    case_block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:542:3: ( default_block )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DEFAULT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:542:3: default_block
                    {
                    pushFollow(FOLLOW_default_block_in_select_block1820);
                    default_block();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_end_select_in_select_block1825);
            end_select();

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
    // $ANTLR end "select_block"


    // $ANTLR start "default_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:546:1: default_block : DEFAULT statement_list ;
    public final void default_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:547:2: ( DEFAULT statement_list )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:547:4: DEFAULT statement_list
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_default_block1836); 
            pushFollow(FOLLOW_statement_list_in_default_block1840);
            statement_list();

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:551:1: end_select : ( END SELECT | 'endselect' );
    public final void end_select() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:552:2: ( END SELECT | 'endselect' )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:552:4: END SELECT
                    {
                    match(input,END,FOLLOW_END_in_end_select1851); 
                    match(input,SELECT,FOLLOW_SELECT_in_end_select1853); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:553:5: 'endselect'
                    {
                    match(input,127,FOLLOW_127_in_end_select1859); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:556:1: case_block : CASE expression ( COMMA expression )* statement_list ;
    public final void case_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:557:2: ( CASE expression ( COMMA expression )* statement_list )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:557:4: CASE expression ( COMMA expression )* statement_list
            {
            match(input,CASE,FOLLOW_CASE_in_case_block1870); 
            pushFollow(FOLLOW_expression_in_case_block1872);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:557:20: ( COMMA expression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:557:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_block1875); 
            	    pushFollow(FOLLOW_expression_in_case_block1877);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            pushFollow(FOLLOW_statement_list_in_case_block1883);
            statement_list();

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:561:1: import_stmt returns [ Statement stmt = null ] : imp= IMPORT (l= string_literal | e= module_name ) ;
    public final Statement import_stmt() throws RecognitionException {
        Statement stmt =  null;

        Token imp=null;
        BlitzMaxStringLiteral l = null;

        BlitzMaxModuleNameExpression e = null;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:562:2: (imp= IMPORT (l= string_literal | e= module_name ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:562:4: imp= IMPORT (l= string_literal | e= module_name )
            {
            imp=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_stmt1902); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:563:3: (l= string_literal | e= module_name )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:564:4: l= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_import_stmt1915);
                    l=string_literal();

                    state._fsp--;


                    				stmt = new BlitzMaxImportStatement(imp, l);
                    			

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:569:4: e= module_name
                    {
                    pushFollow(FOLLOW_module_name_in_import_stmt1933);
                    e=module_name();

                    state._fsp--;


                    				stmt = new BlitzMaxImportStatement(imp, e);
                    			

                    }
                    break;

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
        return stmt;
    }
    // $ANTLR end "import_stmt"


    // $ANTLR start "include_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:576:1: include_stmt : INCLUDE STRING_LITERAL ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:577:2: ( INCLUDE STRING_LITERAL )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:577:4: INCLUDE STRING_LITERAL
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt1953); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include_stmt1955); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:580:1: framework_stmt : FRAMEWORK module_name ;
    public final void framework_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:581:2: ( FRAMEWORK module_name )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:581:4: FRAMEWORK module_name
            {
            match(input,FRAMEWORK,FOLLOW_FRAMEWORK_in_framework_stmt1966); 
            pushFollow(FOLLOW_module_name_in_framework_stmt1968);
            module_name();

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
    // $ANTLR end "framework_stmt"


    // $ANTLR start "module_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:584:1: module_stmt : MODULE module_name ;
    public final void module_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:585:2: ( MODULE module_name )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:585:4: MODULE module_name
            {
            match(input,MODULE,FOLLOW_MODULE_in_module_stmt1979); 
            pushFollow(FOLLOW_module_name_in_module_stmt1981);
            module_name();

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
    // $ANTLR end "module_stmt"


    // $ANTLR start "moduleinfo_stmt"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:588:1: moduleinfo_stmt : MODULEINFO STRING_LITERAL ;
    public final void moduleinfo_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:589:2: ( MODULEINFO STRING_LITERAL )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:589:4: MODULEINFO STRING_LITERAL
            {
            match(input,MODULEINFO,FOLLOW_MODULEINFO_in_moduleinfo_stmt1993); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleinfo_stmt1995); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:592:1: module_name returns [ BlitzMaxModuleNameExpression expr = null ] : (ns= IDENTIFIER DOT name= IDENTIFIER ) ;
    public final BlitzMaxModuleNameExpression module_name() throws RecognitionException {
        BlitzMaxModuleNameExpression expr =  null;

        Token ns=null;
        Token name=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:593:2: ( (ns= IDENTIFIER DOT name= IDENTIFIER ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:593:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:593:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:593:6: ns= IDENTIFIER DOT name= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2016); 
            match(input,DOT,FOLLOW_DOT_in_module_name2018); 
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2024); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:599:1: debuglog_stmt : DEBUGLOG expression ;
    public final void debuglog_stmt() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:2: ( DEBUGLOG expression )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:600:4: DEBUGLOG expression
            {
            match(input,DEBUGLOG,FOLLOW_DEBUGLOG_in_debuglog_stmt2040); 
            pushFollow(FOLLOW_expression_in_debuglog_stmt2042);
            expression();

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
    // $ANTLR end "debuglog_stmt"


    // $ANTLR start "if_block"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:603:1: if_block : IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) ;
    public final void if_block() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:604:2: ( IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:605:3: IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' )
            {
            match(input,IF,FOLLOW_IF_in_if_block2056); 
            pushFollow(FOLLOW_expression_in_if_block2058);
            expression();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:606:3: ( THEN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==THEN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:606:3: THEN
                    {
                    match(input,THEN,FOLLOW_THEN_in_if_block2062); 

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_block_in_if_block2070);
            statement_block();

            state._fsp--;

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:610:3: ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ELSE||LA43_0==128) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:611:4: ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:611:4: ( ELSE | ( ELSE IF | 'elseif' ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==ELSE) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==IF) ) {
                            alt42=2;
                        }
                        else if ( (LA42_1==END||(LA42_1>=GLOBAL && LA42_1<=LOCAL)||(LA42_1>=REM && LA42_1<=FOR)||LA42_1==REPEAT||LA42_1==WHILE||LA42_1==INCLUDE||LA42_1==129) ) {
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
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:612:5: ELSE
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_block2088); 

                            }
                            break;
                        case 2 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:613:7: ( ELSE IF | 'elseif' )
                            {
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:613:7: ( ELSE IF | 'elseif' )
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
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:614:6: ELSE IF
                                    {
                                    match(input,ELSE,FOLLOW_ELSE_in_if_block2103); 
                                    match(input,IF,FOLLOW_IF_in_if_block2105); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:615:8: 'elseif'
                                    {
                                    match(input,128,FOLLOW_128_in_if_block2114); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_if_block2134);
                    statement_block();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:622:3: ( END IF | 'endif' )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:623:4: END IF
                    {
                    match(input,END,FOLLOW_END_in_if_block2151); 
                    match(input,IF,FOLLOW_IF_in_if_block2153); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:624:6: 'endif'
                    {
                    match(input,129,FOLLOW_129_in_if_block2160); 

                    }
                    break;

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
    // $ANTLR end "if_block"


    // $ANTLR start "pointer_def"
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:676:1: pointer_def returns [int count = 0] : POINTER ( POINTER )* ;
    public final int pointer_def() throws RecognitionException {
        int count =  0;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:677:2: ( POINTER ( POINTER )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:677:4: POINTER ( POINTER )*
            {
            match(input,POINTER,FOLLOW_POINTER_in_pointer_def2468); 

            			count = 1;
            		
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:681:3: ( POINTER )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==POINTER) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:682:4: POINTER
            	    {
            	    match(input,POINTER,FOLLOW_POINTER_in_pointer_def2482); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:690:1: byte_def returns [Expression exp = null] : t= BYTE_TYPE (c= pointer_def )? ;
    public final Expression byte_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:691:2: (t= BYTE_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:691:4: t= BYTE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,BYTE_TYPE,FOLLOW_BYTE_TYPE_in_byte_def2514); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:692:5: (c= pointer_def )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==POINTER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:692:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_byte_def2522);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:699:1: int_def returns [Expression exp = null] : t= INT_TYPE (c= pointer_def )? ;
    public final Expression int_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:700:2: (t= INT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:700:4: t= INT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_int_def2547); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:701:5: (c= pointer_def )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==POINTER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:701:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_int_def2555);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:707:1: short_def returns [Expression exp = null] : t= SHORT_TYPE (c= pointer_def )? ;
    public final Expression short_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:708:2: (t= SHORT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:708:4: t= SHORT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_short_def2579); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:709:5: (c= pointer_def )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==POINTER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:709:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_short_def2587);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:716:1: long_def returns [Expression exp = null] : t= LONG_TYPE (c= pointer_def )? ;
    public final Expression long_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:717:2: (t= LONG_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:717:4: t= LONG_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_long_def2612); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:718:5: (c= pointer_def )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==POINTER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:718:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_long_def2620);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:725:1: float_def returns [Expression exp = null] : t= FLOAT_TYPE (c= pointer_def )? ;
    public final Expression float_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:726:2: (t= FLOAT_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:726:4: t= FLOAT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_float_def2645); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:727:5: (c= pointer_def )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==POINTER) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:727:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_float_def2653);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:734:1: double_def returns [Expression exp = null] : t= DOUBLE_TYPE (c= pointer_def )? ;
    public final Expression double_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:735:2: (t= DOUBLE_TYPE (c= pointer_def )? )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:735:4: t= DOUBLE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_double_def2678); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:736:5: (c= pointer_def )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==POINTER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:736:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_double_def2686);
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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:834:1: number returns [ Literal num = null ] : (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) ;
    public final Literal number() throws RecognitionException {
        Literal num =  null;

        Token s=null;
        Token n=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:835:2: ( (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:836:3: (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT )
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:836:3: (s= MINUS | s= PLUS )?
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:836:5: s= MINUS
                    {
                    s=(Token)match(input,MINUS,FOLLOW_MINUS_in_number3235); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:837:5: s= PLUS
                    {
                    s=(Token)match(input,PLUS,FOLLOW_PLUS_in_number3245); 

                    }
                    break;

            }

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:839:3: (n= FLOAT | n= LONG | n= INT )
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
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:839:4: n= FLOAT
                    {
                    n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number3259); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:840:5: n= LONG
                    {
                    n=(Token)match(input,LONG,FOLLOW_LONG_in_number3269); 

                    }
                    break;
                case 3 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:841:5: n= INT
                    {
                    n=(Token)match(input,INT,FOLLOW_INT_in_number3279); 

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
    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:900:1: string_literal returns [BlitzMaxStringLiteral str = null] : e= STRING_LITERAL ;
    public final BlitzMaxStringLiteral string_literal() throws RecognitionException {
        BlitzMaxStringLiteral str =  null;

        Token e=null;

        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:901:2: (e= STRING_LITERAL )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:901:4: e= STRING_LITERAL
            {
            e=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal3618); 

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
        "\1\uffff\1\5\1\uffff\1\5\2\uffff\11\5\1\uffff\1\5\1\uffff\15\5";
    static final String DFA24_minS =
        "\1\7\1\4\1\7\1\4\2\uffff\11\4\1\34\1\4\1\34\15\4";
    static final String DFA24_maxS =
        "\1\7\1\u0081\1\102\1\u0081\2\uffff\11\u0081\1\34\1\u0081\1\34\15"+
        "\u0081";
    static final String DFA24_acceptS =
        "\4\uffff\1\2\1\1\31\uffff";
    static final String DFA24_specialS =
        "\37\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\3\5\4\uffff\7\5\1\4\1\5\1\2\2\uffff\4\3\2\uffff\1\5\1\uffff"+
            "\3\5\1\uffff\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff"+
            "\2\5\4\uffff\1\5\100\uffff\3\5\1\uffff\3\5",
            "\1\16\15\uffff\1\14\1\15\46\uffff\1\7\1\6\1\10\1\11\1\12\1"+
            "\13",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\17\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\100\uffff\3\5\1\uffff\3\5",
            "",
            "",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\20\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\22\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\23\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\24\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\25\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\26\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\100\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\100\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\100\uffff\3\5\1\uffff\3\5",
            "\1\27",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\30\67\uffff\3\5\1\uffff\3\5",
            "\1\31",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\32\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\33\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\34\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\35\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\36\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\11\uffff\5\5\1\uffff\1\5\2\uffff"+
            "\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1\5\100\uffff"+
            "\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\30\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\11\uffff\5\5\1\uffff\1\5\2\uffff"+
            "\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1\5\100\uffff"+
            "\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\32\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\33\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\34\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\35\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff"+
            "\1\5\10\uffff\1\36\67\uffff\3\5\1\uffff\3\5"
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
            return "407:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );";
        }
    }
 

    public static final BitSet FOLLOW_main_statements_in_file_input81 = new BitSet(new long[]{0x003308818001C070L});
    public static final BitSet FOLLOW_EOF_in_file_input112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPERSTRICT_in_main_statements128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICT_in_main_statements139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_stmt_in_main_statements154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleinfo_stmt_in_main_statements160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_main_statements170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_block_in_main_statements185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_main_statements200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_block224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block232 = new BitSet(new long[]{0x003308818003FF70L,0x0800000000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_type_block245 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block254 = new BitSet(new long[]{0x003308818003FE70L,0x0800000000000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_type_block274 = new BitSet(new long[]{0x003308818003F870L,0x0800000000000000L});
    public static final BitSet FOLLOW_FINAL_in_type_block290 = new BitSet(new long[]{0x003308818003F870L,0x0800000000000000L});
    public static final BitSet FOLLOW_type_content_list_in_type_block318 = new BitSet(new long[]{0x0000000000000800L,0x0800000000000000L});
    public static final BitSet FOLLOW_END_in_type_block335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPE_in_type_block337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_type_block345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_type_content_list371 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_global_def_in_type_content_list378 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_field_def_in_type_content_list385 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_method_block_in_type_content_list397 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_function_block_in_type_content_list414 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_rem_block_in_type_content_list427 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_METHOD_in_method_block452 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_function_definition_in_method_block460 = new BitSet(new long[]{0x003308818001CE70L,0x1000000000000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_block471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_method_block494 = new BitSet(new long[]{0x003308818001C870L,0x1000000000000000L});
    public static final BitSet FOLLOW_statement_block_in_method_block519 = new BitSet(new long[]{0x0000000000000800L,0x1000000000000000L});
    public static final BitSet FOLLOW_END_in_method_block534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_METHOD_in_method_block536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_method_block544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_field_def567 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_field_def576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_global_def593 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_global_def595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_const_def608 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_const_def610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_local_def624 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_local_def626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block647 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_function_definition_in_function_block655 = new BitSet(new long[]{0x003308818001C870L,0x2000000000000000L});
    public static final BitSet FOLLOW_statement_block_in_function_block668 = new BitSet(new long[]{0x0000000000000800L,0x2000000000000000L});
    public static final BitSet FOLLOW_END_in_function_block683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_function_block693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_statement_block735 = new BitSet(new long[]{0x003308818001C072L});
    public static final BitSet FOLLOW_include_stmt_in_statement_list776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_block_in_statement_list786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_block_in_statement_list797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_block_in_statement_list803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_statement_list809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_def_in_statement_list815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_def_in_statement_list821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rem_block_in_statement_list827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition850 = new BitSet(new long[]{0x0000000007940000L});
    public static final BitSet FOLLOW_typedef_in_function_definition858 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_function_definition863 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_argument_list_in_function_definition871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_function_definition881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typedef919 = new BitSet(new long[]{0xE000000000600080L,0x0000000000000007L});
    public static final BitSet FOLLOW_named_type_in_typedef929 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_array_type_in_typedef936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_type_in_typedef975 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_array_type_in_typedef982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_def_in_named_type1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_def_in_named_type1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_def_in_named_type1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_def_in_named_type1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_def_in_named_type1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_def_in_named_type1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_named_type1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_TYPE_in_named_type1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_type1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_type1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_symbol_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_type1179 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RBRACK_in_array_type1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argument_list1201 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list1212 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_argument_list1218 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_variable_definition_in_argument1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_definition1276 = new BitSet(new long[]{0x0000000007900002L});
    public static final BitSet FOLLOW_typedef_in_variable_definition1286 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_VAR_in_variable_definition1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_variable_definition1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block1355 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_end_rem_in_rem_block1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_rem1389 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REM_in_end_rem1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_end_rem1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_block1422 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_LOCAL_in_for_block1427 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_definition_in_for_block1437 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQUAL_in_for_block1443 = new BitSet(new long[]{0x0004062000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1463 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_TO_in_for_block1477 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_UNTIL_in_for_block1492 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1517 = new BitSet(new long[]{0x003308D18001C070L});
    public static final BitSet FOLLOW_STEP_in_for_block1531 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1543 = new BitSet(new long[]{0x003308C18001C070L});
    public static final BitSet FOLLOW_EACHIN_in_for_block1573 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1591 = new BitSet(new long[]{0x003308C18001C070L});
    public static final BitSet FOLLOW_statement_block_in_for_block1615 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NEXT_in_for_block1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat_block1635 = new BitSet(new long[]{0x003308818001C070L});
    public static final BitSet FOLLOW_statement_list_in_repeat_block1639 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_FOREVER_in_repeat_block1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_repeat_block1648 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_repeat_block1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_expression1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_or_function_call_in_expression1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_expression1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call1752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_cast_or_function_call1754 = new BitSet(new long[]{0x0004060000080080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call1756 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_cast_or_function_call1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1770 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1773 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_expression_list1775 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_WHILE_in_while_block1788 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_while_block1790 = new BitSet(new long[]{0x003318818001C070L});
    public static final BitSet FOLLOW_statement_block_in_while_block1794 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_WEND_in_while_block1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_block1809 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_select_block1811 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_case_block_in_select_block1815 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_default_block_in_select_block1820 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_end_select_in_select_block1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_block1836 = new BitSet(new long[]{0x003308818001C070L});
    public static final BitSet FOLLOW_statement_list_in_default_block1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_select1851 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SELECT_in_end_select1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_end_select1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_block1870 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_case_block1872 = new BitSet(new long[]{0x00330881A001C070L});
    public static final BitSet FOLLOW_COMMA_in_case_block1875 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_case_block1877 = new BitSet(new long[]{0x00330881A001C070L});
    public static final BitSet FOLLOW_statement_list_in_case_block1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_stmt1902 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_string_literal_in_import_stmt1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_name_in_import_stmt1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt1953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include_stmt1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAMEWORK_in_framework_stmt1966 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_module_name_in_framework_stmt1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_stmt1979 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_module_name_in_module_stmt1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULEINFO_in_moduleinfo_stmt1993 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_moduleinfo_stmt1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2016 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_DOT_in_module_name2018 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGLOG_in_debuglog_stmt2040 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_debuglog_stmt2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_block2056 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_if_block2058 = new BitSet(new long[]{0x063308818001C870L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_THEN_in_if_block2062 = new BitSet(new long[]{0x043308818001C870L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_block_in_if_block2070 = new BitSet(new long[]{0x0400000000000800L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ELSE_in_if_block2088 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_if_block2103 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2105 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_if_block2114 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_block_in_if_block2134 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_if_block2151 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_if_block2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BYTE_TYPE_in_byte_def2514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_byte_def2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_int_def2547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_int_def2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_short_def2579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_short_def2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_long_def2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_long_def2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_float_def2645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_float_def2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_double_def2678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_double_def2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number3235 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_PLUS_in_number3245 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_FLOAT_in_number3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_number3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal3618 = new BitSet(new long[]{0x0000000000000002L});

}