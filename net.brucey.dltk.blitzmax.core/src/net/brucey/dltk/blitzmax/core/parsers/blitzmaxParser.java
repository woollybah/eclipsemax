// $ANTLR 3.1.2 /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g 2009-06-20 22:04:34

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
    public static final int COMMA=29;
    public static final int CONST=15;
    public static final int MINUS=88;
    public static final int END=11;
    public static final int ARITHRIGHTSHIFT=108;
    public static final int BANG=25;
    public static final int METHOD=12;
    public static final int FALSE=42;
    public static final int FRACTION=116;
    public static final int ABSTRACT=9;
    public static final int THEN=57;
    public static final int STEP=36;
    public static final int T__123=123;
    public static final int TILDE=96;
    public static final int IMPORT=48;
    public static final int CONTINUE=73;
    public static final int NEWLINE=122;
    public static final int DOT=54;
    public static final int WEND=44;
    public static final int PLUSEQUAL=101;
    public static final int TO=34;
    public static final int T__128=128;
    public static final int FUNCTION=17;
    public static final int LOCAL=16;
    public static final int GLOBAL=14;
    public static final int INCLUDE=49;
    public static final int SELECT=45;
    public static final int STRING_LITERAL=50;
    public static final int MODULE=52;
    public static final int DOUBLE_TYPE=64;
    public static final int UNTIL=35;
    public static final int RPAREN=19;
    public static final int SUPERSTRICT=4;
    public static final int ASSERT=77;
    public static final int PLUS=87;
    public static final int EXTENDS=8;
    public static final int SUPER=69;
    public static final int EXTERN=60;
    public static final int SHORT_TYPE=66;
    public static final int NEW=71;
    public static final int FINAL=10;
    public static final int POINTFLOAT=113;
    public static final int DOLLAR=26;
    public static final int FOREVER=40;
    public static final int LINE_COMMENT=59;
    public static final int REPEAT=39;
    public static final int FIELD=13;
    public static final int LBRACK=27;
    public static final int LONG_TYPE=61;
    public static final int SEMI=86;
    public static final int CATCH=75;
    public static final int EXPONENTFLOAT=114;
    public static final int CASE=47;
    public static final int BYTE_TYPE=65;
    public static final int EQUAL=33;
    public static final int ELSE=58;
    public static final int LESSEQUAL=99;
    public static final int T__125=125;
    public static final int SELF=70;
    public static final int NULL=68;
    public static final int COLON=20;
    public static final int AMPER=92;
    public static final int IDENTIFIER=7;
    public static final int POINTER=67;
    public static final int T__124=124;
    public static final int TRUE=41;
    public static final int POUND=24;
    public static final int DEBUGSTOP=78;
    public static final int UNDERSCORE=97;
    public static final int THROW=76;
    public static final int TYPE=6;
    public static final int STRING_TYPE=21;
    public static final int LONG=111;
    public static final int PERCENT=23;
    public static final int FLOAT=110;
    public static final int MODULEINFO=53;
    public static final int T__126=126;
    public static final int SLASHEQUAL=104;
    public static final int MOD=109;
    public static final int NOTEQUAL=98;
    public static final int STRICT=5;
    public static final int LESS=93;
    public static final int ALPHA_LOWER=119;
    public static final int INT=112;
    public static final int T__127=127;
    public static final int GREATER=94;
    public static final int VBAR=91;
    public static final int LPAREN=18;
    public static final int DIGIT=118;
    public static final int EXIT=79;
    public static final int INT_TYPE=62;
    public static final int DELETE=72;
    public static final int FRAMEWORK=51;
    public static final int Exponent=117;
    public static final int OBJECT_TYPE=22;
    public static final int NOT_TEST=83;
    public static final int DIGITS=115;
    public static final int SLASH=90;
    public static final int POWER=95;
    public static final int WHILE=43;
    public static final int AND_TEST=84;
    public static final int INCBIN=80;
    public static final int REM=31;
    public static final int T__129=129;
    public static final int FLOAT_TYPE=63;
    public static final int WHITESPACE=121;
    public static final int VAR=30;
    public static final int DEBUGLOG=55;
    public static final int NEXT=38;
    public static final int INCBINPTR=81;
    public static final int RIGHTSHIFT=107;
    public static final int MINUSEQUAL=102;
    public static final int IF=56;
    public static final int INCBINLEN=82;
    public static final int EOF=-1;
    public static final int ALPHA_UPPER=120;
    public static final int FOR=32;
    public static final int OR_TEST=85;
    public static final int RBRACK=28;
    public static final int GREATEREQUAL=100;
    public static final int DEFAULT=46;
    public static final int VBAREQUAL=105;
    public static final int STAREQUAL=103;
    public static final int STAR=89;
    public static final int TRY=74;
    public static final int LEFTSHIFT=106;
    public static final int EACHIN=37;

    // delegates
    // delegators


        public blitzmaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public blitzmaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return blitzmaxParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g"; }


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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:91:1: file_input : ( main_statements[decl.getStatements()] )* EOF ;
    public final void file_input() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:91:11: ( ( main_statements[decl.getStatements()] )* EOF )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:92:6: ( main_statements[decl.getStatements()] )* EOF
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:92:6: ( main_statements[decl.getStatements()] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SUPERSTRICT && LA1_0<=TYPE)||(LA1_0>=GLOBAL && LA1_0<=LOCAL)||(LA1_0>=REM && LA1_0<=FOR)||LA1_0==REPEAT||LA1_0==WHILE||(LA1_0>=IMPORT && LA1_0<=INCLUDE)||(LA1_0>=MODULE && LA1_0<=MODULEINFO)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:95:7: main_statements[decl.getStatements()]
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:112:1: main_statements[List statements] : ( ( SUPERSTRICT | STRICT ) | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | statement_list[statements] );
    public final void main_statements(List statements) throws RecognitionException {
        Statement s1 = null;

        BlitzMaxTypeDeclaration s3 = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:113:2: ( ( SUPERSTRICT | STRICT ) | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | statement_list[statements] )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:113:4: ( SUPERSTRICT | STRICT )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:113:4: ( SUPERSTRICT | STRICT )
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:113:5: SUPERSTRICT
                            {
                            match(input,SUPERSTRICT,FOLLOW_SUPERSTRICT_in_main_statements120); 

                            				statements.add(new BlitzMaxStrictExpression(true));
                            			

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:117:5: STRICT
                            {
                            match(input,STRICT,FOLLOW_STRICT_in_main_statements131); 

                            				statements.add(new BlitzMaxStrictExpression(false));
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:122:5: module_stmt
                    {
                    pushFollow(FOLLOW_module_stmt_in_main_statements146);
                    module_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:123:5: moduleinfo_stmt
                    {
                    pushFollow(FOLLOW_moduleinfo_stmt_in_main_statements152);
                    moduleinfo_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:124:5: s1= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_main_statements162);
                    s1=import_stmt();

                    state._fsp--;


                    				statements.add(s1);
                    			

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:128:5: s3= type_block
                    {
                    pushFollow(FOLLOW_type_block_in_main_statements177);
                    s3=type_block();

                    state._fsp--;


                    				statements.add(s3);
                    			

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:132:5: statement_list[statements]
                    {
                    pushFollow(FOLLOW_statement_list_in_main_statements188);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:135:1: type_block returns [ BlitzMaxTypeDeclaration typeDeclaration = null ] : t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' ) ;
    public final BlitzMaxTypeDeclaration type_block() throws RecognitionException {
        BlitzMaxTypeDeclaration typeDeclaration =  null;

        Token t=null;
        Token n=null;
        Token sup=null;
        Token et=null;
        Block tcl = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:136:2: (t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:136:4: t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? tcl= type_content_list (et= END TYPE | et= 'endtype' )
            {
            t=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_block208); 
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block216); 

            			typeDeclaration = new BlitzMaxTypeDeclaration(n.getText(), ((CommonToken) n).getStartIndex(),((CommonToken) n).getStopIndex()+1,
            				((CommonToken) t).getStartIndex(),((CommonToken) t).getStopIndex() + 1);
            			decl.addType(typeDeclaration);
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:143:3: ( EXTENDS sup= IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:144:4: EXTENDS sup= IDENTIFIER
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_type_block229); 
                    sup=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block238); 

                    				typeDeclaration.addSuperClass(new BlitzMaxTypeReference(sup));
                    			

                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:152:3: ( ABSTRACT | FINAL )?
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:152:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_type_block258); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:157:5: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_type_block274); 

                    				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_type_content_list_in_type_block302);
            tcl=type_content_list();

            state._fsp--;


            			typeDeclaration.setBody(tcl);
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:170:3: (et= END TYPE | et= 'endtype' )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:170:5: et= END TYPE
                    {
                    et=(Token)match(input,END,FOLLOW_END_in_type_block319); 
                    match(input,TYPE,FOLLOW_TYPE_in_type_block321); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:170:21: et= 'endtype'
                    {
                    et=(Token)match(input,123,FOLLOW_123_in_type_block329); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:176:1: type_content_list returns [ Block typeContent = new Block() ] : ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block )* ;
    public final Block type_content_list() throws RecognitionException {
        Block typeContent =  new Block();

        BlitzMaxMethodDeclaration mb = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:177:2: ( ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:177:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block )*
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:177:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block )*
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
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:178:4: const_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_const_def_in_type_content_list355);
            	    const_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:179:6: global_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_global_def_in_type_content_list363);
            	    global_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:180:6: field_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_field_def_in_type_content_list371);
            	    field_def(typeContent.getStatements());

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:181:6: mb= method_block
            	    {
            	    pushFollow(FOLLOW_method_block_in_type_content_list383);
            	    mb=method_block();

            	    state._fsp--;


            	    					typeContent.addStatement(mb);
            	    				

            	    }
            	    break;
            	case 5 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:185:6: fb= function_block
            	    {
            	    pushFollow(FOLLOW_function_block_in_type_content_list400);
            	    fb=function_block();

            	    state._fsp--;


            	    					typeContent.addStatement(mb);
            	    				

            	    }
            	    break;
            	case 6 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:189:6: rem_block
            	    {
            	    pushFollow(FOLLOW_rem_block_in_type_content_list413);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:193:1: method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ] : m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) ) ;
    public final BlitzMaxMethodDeclaration method_block() throws RecognitionException {
        BlitzMaxMethodDeclaration methodDeclaration =  null;

        Token m=null;
        Token em=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:194:2: (m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:194:4: m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) )
            {
            m=(Token)match(input,METHOD,FOLLOW_METHOD_in_method_block438); 
            pushFollow(FOLLOW_function_definition_in_method_block446);
            fd=function_definition();

            state._fsp--;


            				methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
            			
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:199:3: ( ABSTRACT | ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ABSTRACT) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=FINAL && LA10_0<=END)||(LA10_0>=GLOBAL && LA10_0<=LOCAL)||(LA10_0>=REM && LA10_0<=FOR)||LA10_0==UNTIL||(LA10_0>=NEXT && LA10_0<=FOREVER)||(LA10_0>=WHILE && LA10_0<=WEND)||(LA10_0>=DEFAULT && LA10_0<=CASE)||LA10_0==INCLUDE||LA10_0==ELSE||(LA10_0>=124 && LA10_0<=125)||(LA10_0>=127 && LA10_0<=129)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:199:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_block457); 

                    				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
                    			

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:205:3: ( FINAL )? b= statement_block (em= END METHOD | em= 'endmethod' )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:205:3: ( FINAL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FINAL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:206:3: FINAL
                            {
                            match(input,FINAL,FOLLOW_FINAL_in_method_block480); 

                            				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
                            			

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_method_block505);
                    b=statement_block();

                    state._fsp--;


                    				methodDeclaration.acceptBody(b, true);
                    			
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:3: (em= END METHOD | em= 'endmethod' )
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:5: em= END METHOD
                            {
                            em=(Token)match(input,END,FOLLOW_END_in_method_block520); 
                            match(input,METHOD,FOLLOW_METHOD_in_method_block522); 

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:23: em= 'endmethod'
                            {
                            em=(Token)match(input,124,FOLLOW_124_in_method_block530); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:224:1: field_def[List statements] : FIELD args= argument_list[false] ;
    public final void field_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:225:2: ( FIELD args= argument_list[false] )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:225:4: FIELD args= argument_list[false]
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_def553); 
            pushFollow(FOLLOW_argument_list_in_field_def562);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxFieldDeclaration((Declaration)i.next()));
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:236:1: global_def[List statements] : GLOBAL args= argument_list[false] ;
    public final void global_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:237:2: ( GLOBAL args= argument_list[false] )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:237:4: GLOBAL args= argument_list[false]
            {
            match(input,GLOBAL,FOLLOW_GLOBAL_in_global_def581); 
            pushFollow(FOLLOW_argument_list_in_global_def590);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxGlobalDeclaration((Declaration)i.next()));
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
    // $ANTLR end "global_def"


    // $ANTLR start "const_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:248:1: const_def[List statements] : CONST args= argument_list[false] ;
    public final void const_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:249:2: ( CONST args= argument_list[false] )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:249:4: CONST args= argument_list[false]
            {
            match(input,CONST,FOLLOW_CONST_in_const_def609); 
            pushFollow(FOLLOW_argument_list_in_const_def617);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxConstDeclaration((Declaration)i.next()));
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
    // $ANTLR end "const_def"


    // $ANTLR start "local_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:260:1: local_def[List statements] : LOCAL args= argument_list[false] ;
    public final void local_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:261:2: ( LOCAL args= argument_list[false] )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:261:4: LOCAL args= argument_list[false]
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_def637); 
            pushFollow(FOLLOW_argument_list_in_local_def645);
            args=argument_list(false);

            state._fsp--;


            			if (args != null) {
            				for (Iterator i = args.iterator(); i.hasNext();) {
            					statements.add(new BlitzMaxLocalDeclaration((Declaration)i.next()));
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
    // $ANTLR end "local_def"


    // $ANTLR start "function_block"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:272:1: function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ] : f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) ;
    public final BlitzMaxFunctionDeclaration function_block() throws RecognitionException {
        BlitzMaxFunctionDeclaration functionDeclaration =  null;

        Token f=null;
        Token ef=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:273:2: (f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:273:4: f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' )
            {
            f=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block670); 
            pushFollow(FOLLOW_function_definition_in_function_block678);
            fd=function_definition();

            state._fsp--;


            				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
            			
            pushFollow(FOLLOW_statement_block_in_function_block691);
            b=statement_block();

            state._fsp--;


            				functionDeclaration.acceptBody(b, true);
            			
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:282:3: (ef= END FUNCTION | ef= 'endfunction' )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:282:5: ef= END FUNCTION
                    {
                    ef=(Token)match(input,END,FOLLOW_END_in_function_block706); 
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block708); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:282:25: ef= 'endfunction'
                    {
                    ef=(Token)match(input,125,FOLLOW_125_in_function_block716); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:288:1: statement_block returns [ BlitzMaxBlock statement = new BlitzMaxBlock() ] : ( ( statement_list[statement.getStatements()] )* ) ;
    public final BlitzMaxBlock statement_block() throws RecognitionException {
        BlitzMaxBlock statement =  new BlitzMaxBlock();

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:289:2: ( ( ( statement_list[statement.getStatements()] )* ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:290:3: ( ( statement_list[statement.getStatements()] )* )
            {

            		  	int startPos = -1;
            		  	int endPos = -1;
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:294:3: ( ( statement_list[statement.getStatements()] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:295:4: ( statement_list[statement.getStatements()] )*
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:295:4: ( statement_list[statement.getStatements()] )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=GLOBAL && LA12_0<=LOCAL)||(LA12_0>=REM && LA12_0<=FOR)||LA12_0==REPEAT||LA12_0==WHILE||LA12_0==INCLUDE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:296:5: statement_list[statement.getStatements()]
            	    {
            	    pushFollow(FOLLOW_statement_list_in_statement_block754);
            	    statement_list(statement.getStatements());

            	    state._fsp--;


            	    		  			//if( s != null ) {
            	    			  			//Iterator i = s.iterator();
            	    	  					//while( i.hasNext() ) {
            	    		  				//	Statement sst = (Statement)i.next();
            	    		  				//	if( sst != null ) {
            	    		  				//		statement.addStatement( sst );
            	    		  						Statement sst = (Statement)statement.getList().getFirst();
            	    		  						if( sst.sourceStart() < startPos || startPos == -1 ) {
            	    		  							startPos = sst.sourceStart();
            	    		  						} 
            	    		  						if( sst.sourceEnd() > endPos || endPos == -1 ) {
            	    		  							endPos = sst.sourceEnd();
            	    		  						}
            	    		  						
            	    		  						sst = (Statement)statement.getList().getLast();
            	    		  						if( sst.sourceStart() < startPos || startPos == -1 ) {
            	    		  							startPos = sst.sourceStart();
            	    		  						} 
            	    		  						if( sst.sourceEnd() > endPos || endPos == -1 ) {
            	    		  							endPos = sst.sourceEnd();
            	    		  						}
            	    		  					//}
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:332:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block );
    public final void statement_list(List statements) throws RecognitionException {
        BlitzMaxForStatement s2 = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:333:2: ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:333:4: include_stmt
                    {
                    pushFollow(FOLLOW_include_stmt_in_statement_list793);
                    include_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:334:5: s2= for_block
                    {
                    pushFollow(FOLLOW_for_block_in_statement_list803);
                    s2=for_block();

                    state._fsp--;


                    				statements.add(s2);
                    			

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:338:5: while_block
                    {
                    pushFollow(FOLLOW_while_block_in_statement_list814);
                    while_block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:339:5: repeat_block
                    {
                    pushFollow(FOLLOW_repeat_block_in_statement_list820);
                    repeat_block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:340:5: const_def[statements]
                    {
                    pushFollow(FOLLOW_const_def_in_statement_list826);
                    const_def(statements);

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:341:5: global_def[statements]
                    {
                    pushFollow(FOLLOW_global_def_in_statement_list833);
                    global_def(statements);

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:342:5: local_def[statements]
                    {
                    pushFollow(FOLLOW_local_def_in_statement_list840);
                    local_def(statements);

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:343:5: rem_block
                    {
                    pushFollow(FOLLOW_rem_block_in_statement_list847);
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
        return ;
    }
    // $ANTLR end "statement_list"


    // $ANTLR start "function_definition"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:346:1: function_definition returns [BlitzMaxFunctionExpression exp = null] : (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) ;
    public final BlitzMaxFunctionExpression function_definition() throws RecognitionException {
        BlitzMaxFunctionExpression exp =  null;

        Token name=null;
        Token rp=null;
        BlitzMaxTypedefExpression t = null;

        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:347:2: ( (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:347:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:347:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:348:3: name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition870); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:349:5: (t= typedef )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON||(LA14_0>=PERCENT && LA14_0<=DOLLAR)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:349:5: t= typedef
                    {
                    pushFollow(FOLLOW_typedef_in_function_definition878);
                    t=typedef();

                    state._fsp--;


                    }
                    break;

            }

            match(input,LPAREN,FOLLOW_LPAREN_in_function_definition883); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:351:8: (args= argument_list[true] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:351:8: args= argument_list[true]
                    {
                    pushFollow(FOLLOW_argument_list_in_function_definition891);
                    args=argument_list(true);

                    state._fsp--;


                    }
                    break;

            }

            rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition901); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:359:1: typedef returns [BlitzMaxTypedefExpression expr = null] : ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) ;
    public final BlitzMaxTypedefExpression typedef() throws RecognitionException {
        BlitzMaxTypedefExpression expr =  null;

        BlitzMaxTypeReference nt = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:360:2: ( ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:361:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            {

            			boolean at = false;
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:364:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:365:4: ( COLON nt= named_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:365:4: ( COLON nt= named_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:365:5: COLON nt= named_type ( array_type )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_typedef939); 
                    pushFollow(FOLLOW_named_type_in_typedef949);
                    nt=named_type();

                    state._fsp--;

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:367:5: ( array_type )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LBRACK) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:367:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef956);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:374:4: (nt= symbol_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:374:4: (nt= symbol_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:375:5: nt= symbol_type ( array_type )?
                    {
                    pushFollow(FOLLOW_symbol_type_in_typedef995);
                    nt=symbol_type();

                    state._fsp--;

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:376:5: ( array_type )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LBRACK) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:376:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1002);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:388:1: named_type returns [ BlitzMaxTypeReference tr = null ] : ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | STRING_TYPE | OBJECT_TYPE | name= IDENTIFIER );
    public final BlitzMaxTypeReference named_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token name=null;
        Expression d = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:389:2: ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | STRING_TYPE | OBJECT_TYPE | name= IDENTIFIER )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:389:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:389:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:389:9: d= int_def
                            {
                            pushFollow(FOLLOW_int_def_in_named_type1053);
                            d=int_def();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:390:6: d= long_def
                            {
                            pushFollow(FOLLOW_long_def_in_named_type1064);
                            d=long_def();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:391:6: d= float_def
                            {
                            pushFollow(FOLLOW_float_def_in_named_type1075);
                            d=float_def();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:392:6: d= double_def
                            {
                            pushFollow(FOLLOW_double_def_in_named_type1086);
                            d=double_def();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:393:6: d= byte_def
                            {
                            pushFollow(FOLLOW_byte_def_in_named_type1097);
                            d=byte_def();

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:394:6: d= short_def
                            {
                            pushFollow(FOLLOW_short_def_in_named_type1108);
                            d=short_def();

                            state._fsp--;


                            }
                            break;

                    }


                    				tr = new BlitzMaxTypeReference(d);
                    			

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:399:5: STRING_TYPE
                    {
                    match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_named_type1123); 

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:400:5: OBJECT_TYPE
                    {
                    match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_named_type1129); 

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:401:5: name= IDENTIFIER
                    {
                    name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_type1139); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:407:1: function_type : function_definition ;
    public final void function_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:408:2: ( function_definition )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:408:4: function_definition
            {
            pushFollow(FOLLOW_function_definition_in_function_type1155);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:411:1: symbol_type returns [ BlitzMaxTypeReference tr = null ] : ( PERCENT | POUND | BANG | DOLLAR );
    public final BlitzMaxTypeReference symbol_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:412:2: ( PERCENT | POUND | BANG | DOLLAR )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:418:1: array_type : LBRACK RBRACK ;
    public final void array_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:419:2: ( LBRACK RBRACK )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:419:4: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_array_type1199); 
            match(input,RBRACK,FOLLOW_RBRACK_in_array_type1201); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:422:1: argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ] : arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* ;
    public final List<Declaration> argument_list(boolean functionArgs) throws RecognitionException {
        List<Declaration> args =  new ArrayList<Declaration>();

        Declaration arg = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:423:2: (arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:423:4: arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )*
            {
            pushFollow(FOLLOW_argument_in_argument_list1221);
            arg=argument(functionArgs);

            state._fsp--;


            			args.add(arg);
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:427:3: ( COMMA arg= argument[functionArgs] )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:427:4: COMMA arg= argument[functionArgs]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argument_list1232); 
            	    pushFollow(FOLLOW_argument_in_argument_list1238);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:434:1: argument[boolean functionArg] returns [ Declaration arg = null ] : a= variable_definition[functionArg] ;
    public final Declaration argument(boolean functionArg) throws RecognitionException {
        Declaration arg =  null;

        Declaration a = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:435:2: (a= variable_definition[functionArg] )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:435:4: a= variable_definition[functionArg]
            {
            pushFollow(FOLLOW_variable_definition_in_argument1270);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:441:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );
    public final Declaration variable_definition(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Token n=null;
        Token v=null;
        BlitzMaxTypedefExpression t = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:2: ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:4: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:5: n= IDENTIFIER (t= typedef (v= VAR )? )?
                    {
                    n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_definition1296); 
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:443:4: (t= typedef (v= VAR )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==COLON||(LA23_0>=PERCENT && LA23_0<=DOLLAR)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:443:5: t= typedef (v= VAR )?
                            {
                            pushFollow(FOLLOW_typedef_in_variable_definition1306);
                            t=typedef();

                            state._fsp--;


                            					dec = new BlitzMaxVariableDeclaration(n, t);
                            				
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:448:5: (v= VAR )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==VAR) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:448:7: v= VAR
                                    {
                                    v=(Token)match(input,VAR,FOLLOW_VAR_in_variable_definition1329); 

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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:464:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_variable_definition1364);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:467:1: rem_block : REM ( options {greedy=false; } : . )* end_rem ;
    public final void rem_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:2: ( REM ( options {greedy=false; } : . )* end_rem )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:4: REM ( options {greedy=false; } : . )* end_rem
            {
            match(input,REM,FOLLOW_REM_in_rem_block1375); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:3: ( options {greedy=false; } : . )*
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
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:31: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            pushFollow(FOLLOW_end_rem_in_rem_block1397);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:473:1: end_rem : ( END REM | 'endrem' );
    public final void end_rem() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:474:2: ( END REM | 'endrem' )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:474:4: END REM
                    {
                    match(input,END,FOLLOW_END_in_end_rem1409); 
                    match(input,REM,FOLLOW_REM_in_end_rem1411); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:475:5: 'endrem'
                    {
                    match(input,126,FOLLOW_126_in_end_rem1417); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:478:1: for_block returns [ BlitzMaxForStatement stmt = null ] : (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT ;
    public final BlitzMaxForStatement for_block() throws RecognitionException {
        BlitzMaxForStatement stmt =  null;

        Token f=null;
        Declaration vdef = null;

        Expression frm = null;

        Expression to = null;

        Expression sexp = null;

        BlitzMaxBlock sb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:479:2: ( (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:479:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) sb= statement_block NEXT
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:479:4: (f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:480:4: f= FOR ( LOCAL )? vdef= variable_definition[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_for_block1442); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:481:4: ( LOCAL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LOCAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:481:4: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_for_block1447); 

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_definition_in_for_block1457);
            vdef=variable_definition(false);

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_for_block1463); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:4: ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:485:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:485:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:486:5: frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )?
                    {
                    pushFollow(FOLLOW_expression_in_for_block1483);
                    frm=expression();

                    state._fsp--;


                    					stmt = new BlitzMaxForStatement(vdef, frm);
                    				
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:490:5: ( TO | UNTIL )
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:490:7: TO
                            {
                            match(input,TO,FOLLOW_TO_in_for_block1497); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
                            					

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:494:7: UNTIL
                            {
                            match(input,UNTIL,FOLLOW_UNTIL_in_for_block1512); 

                            						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
                            				 	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_for_block1537);
                    to=expression();

                    state._fsp--;


                    					stmt.setToExpr(to);
                    				
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:5: ( STEP sexp= expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==STEP) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:7: STEP sexp= expression
                            {
                            match(input,STEP,FOLLOW_STEP_in_for_block1551); 
                            pushFollow(FOLLOW_expression_in_for_block1563);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:512:5: EACHIN to= expression
                    {
                    match(input,EACHIN,FOLLOW_EACHIN_in_for_block1593); 

                    						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
                    				 	
                    pushFollow(FOLLOW_expression_in_for_block1611);
                    to=expression();

                    state._fsp--;


                    						stmt.setToExpr(to);
                    					

                    }
                    break;

            }


            }

            pushFollow(FOLLOW_statement_block_in_for_block1635);
            sb=statement_block();

            state._fsp--;


            			stmt.setBlock(sb);
            		
            match(input,NEXT,FOLLOW_NEXT_in_for_block1643); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:1: repeat_block : REPEAT b= statement_block ( FOREVER | UNTIL expression ) ;
    public final void repeat_block() throws RecognitionException {
        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:530:2: ( REPEAT b= statement_block ( FOREVER | UNTIL expression ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:530:4: REPEAT b= statement_block ( FOREVER | UNTIL expression )
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat_block1655); 
            pushFollow(FOLLOW_statement_block_in_repeat_block1663);
            b=statement_block();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:532:3: ( FOREVER | UNTIL expression )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:532:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeat_block1668); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:532:14: UNTIL expression
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_repeat_block1672); 
                    pushFollow(FOLLOW_expression_in_repeat_block1674);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:535:1: expression returns [ Expression exp = null ] : (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal );
    public final Expression expression() throws RecognitionException {
        Expression exp =  null;

        Token id=null;
        Token t=null;
        Literal n = null;

        BlitzMaxStringLiteral s = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:536:2: (id= IDENTIFIER | n= number | cast_or_function_call | t= TRUE | t= FALSE | s= string_literal )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:536:4: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1694); 

                    				exp = new BlitzMaxStringLiteral(id);
                    			

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:540:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_expression1709);
                    n=number();

                    state._fsp--;


                    				exp = n;
                    			

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:544:5: cast_or_function_call
                    {
                    pushFollow(FOLLOW_cast_or_function_call_in_expression1720);
                    cast_or_function_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:545:5: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_expression1730); 

                    				exp = new BlitzMaxNumericLiteral(t, 1);
                    			

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:549:5: t= FALSE
                    {
                    t=(Token)match(input,FALSE,FOLLOW_FALSE_in_expression1745); 

                    				exp = new BlitzMaxNumericLiteral(t, 0);
                    			

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:553:5: s= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_expression1760);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:559:1: cast_or_function_call : IDENTIFIER LPAREN ( expression_list )? RPAREN ;
    public final void cast_or_function_call() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:2: ( IDENTIFIER LPAREN ( expression_list )? RPAREN )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:4: IDENTIFIER LPAREN ( expression_list )? RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call1776); 
            match(input,LPAREN,FOLLOW_LPAREN_in_cast_or_function_call1778); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:22: ( expression_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENTIFIER||(LA33_0>=TRUE && LA33_0<=FALSE)||LA33_0==STRING_LITERAL||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=FLOAT && LA33_0<=INT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:22: expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_cast_or_function_call1780);
                    expression_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_cast_or_function_call1783); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:563:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:2: ( expression ( COMMA expression )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list1794);
            expression();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:15: ( COMMA expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list1797); 
            	    pushFollow(FOLLOW_expression_in_expression_list1799);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:567:1: while_block : WHILE expression statement_block WEND ;
    public final void while_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:568:2: ( WHILE expression statement_block WEND )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:568:4: WHILE expression statement_block WEND
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_block1812); 
            pushFollow(FOLLOW_expression_in_while_block1814);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_statement_block_in_while_block1818);
            statement_block();

            state._fsp--;

            match(input,WEND,FOLLOW_WEND_in_while_block1822); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:573:1: select_block : SELECT expression ( case_block )* ( default_block )? end_select ;
    public final void select_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:574:2: ( SELECT expression ( case_block )* ( default_block )? end_select )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:574:4: SELECT expression ( case_block )* ( default_block )? end_select
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_block1833); 
            pushFollow(FOLLOW_expression_in_select_block1835);
            expression();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:575:3: ( case_block )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CASE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:575:3: case_block
            	    {
            	    pushFollow(FOLLOW_case_block_in_select_block1839);
            	    case_block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:576:3: ( default_block )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DEFAULT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:576:3: default_block
                    {
                    pushFollow(FOLLOW_default_block_in_select_block1844);
                    default_block();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_end_select_in_select_block1849);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:580:1: default_block : DEFAULT statement_block ;
    public final void default_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:581:2: ( DEFAULT statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:581:4: DEFAULT statement_block
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_default_block1860); 
            pushFollow(FOLLOW_statement_block_in_default_block1864);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:585:1: end_select : ( END SELECT | 'endselect' );
    public final void end_select() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:586:2: ( END SELECT | 'endselect' )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:586:4: END SELECT
                    {
                    match(input,END,FOLLOW_END_in_end_select1875); 
                    match(input,SELECT,FOLLOW_SELECT_in_end_select1877); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:587:5: 'endselect'
                    {
                    match(input,127,FOLLOW_127_in_end_select1883); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:590:1: case_block : CASE expression ( COMMA expression )* statement_block ;
    public final void case_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:591:2: ( CASE expression ( COMMA expression )* statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:591:4: CASE expression ( COMMA expression )* statement_block
            {
            match(input,CASE,FOLLOW_CASE_in_case_block1894); 
            pushFollow(FOLLOW_expression_in_case_block1896);
            expression();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:591:20: ( COMMA expression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:591:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_block1899); 
            	    pushFollow(FOLLOW_expression_in_case_block1901);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            pushFollow(FOLLOW_statement_block_in_case_block1907);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:595:1: import_stmt returns [ Statement stmt = null ] : imp= IMPORT (l= string_literal | e= module_name ) ;
    public final Statement import_stmt() throws RecognitionException {
        Statement stmt =  null;

        Token imp=null;
        BlitzMaxStringLiteral l = null;

        BlitzMaxModuleNameExpression e = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:596:2: (imp= IMPORT (l= string_literal | e= module_name ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:596:4: imp= IMPORT (l= string_literal | e= module_name )
            {
            imp=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_stmt1926); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:597:3: (l= string_literal | e= module_name )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:598:4: l= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_import_stmt1939);
                    l=string_literal();

                    state._fsp--;


                    				stmt = new BlitzMaxImportStatement(imp, l);
                    			

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:603:4: e= module_name
                    {
                    pushFollow(FOLLOW_module_name_in_import_stmt1957);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:610:1: include_stmt : INCLUDE STRING_LITERAL ;
    public final void include_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:611:2: ( INCLUDE STRING_LITERAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:611:4: INCLUDE STRING_LITERAL
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt1977); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include_stmt1979); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:614:1: framework_stmt : FRAMEWORK module_name ;
    public final void framework_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:615:2: ( FRAMEWORK module_name )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:615:4: FRAMEWORK module_name
            {
            match(input,FRAMEWORK,FOLLOW_FRAMEWORK_in_framework_stmt1990); 
            pushFollow(FOLLOW_module_name_in_framework_stmt1992);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:618:1: module_stmt : MODULE module_name ;
    public final void module_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:619:2: ( MODULE module_name )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:619:4: MODULE module_name
            {
            match(input,MODULE,FOLLOW_MODULE_in_module_stmt2003); 
            pushFollow(FOLLOW_module_name_in_module_stmt2005);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:622:1: moduleinfo_stmt : MODULEINFO STRING_LITERAL ;
    public final void moduleinfo_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:623:2: ( MODULEINFO STRING_LITERAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:623:4: MODULEINFO STRING_LITERAL
            {
            match(input,MODULEINFO,FOLLOW_MODULEINFO_in_moduleinfo_stmt2017); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2019); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:626:1: module_name returns [ BlitzMaxModuleNameExpression expr = null ] : (ns= IDENTIFIER DOT name= IDENTIFIER ) ;
    public final BlitzMaxModuleNameExpression module_name() throws RecognitionException {
        BlitzMaxModuleNameExpression expr =  null;

        Token ns=null;
        Token name=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:627:2: ( (ns= IDENTIFIER DOT name= IDENTIFIER ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:627:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:627:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:627:6: ns= IDENTIFIER DOT name= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2040); 
            match(input,DOT,FOLLOW_DOT_in_module_name2042); 
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2048); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:633:1: debuglog_stmt : DEBUGLOG expression ;
    public final void debuglog_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:634:2: ( DEBUGLOG expression )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:634:4: DEBUGLOG expression
            {
            match(input,DEBUGLOG,FOLLOW_DEBUGLOG_in_debuglog_stmt2064); 
            pushFollow(FOLLOW_expression_in_debuglog_stmt2066);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:637:1: if_block : IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) ;
    public final void if_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:638:2: ( IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:639:3: IF expression ( THEN )? statement_block ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )? ( END IF | 'endif' )
            {
            match(input,IF,FOLLOW_IF_in_if_block2080); 
            pushFollow(FOLLOW_expression_in_if_block2082);
            expression();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:640:3: ( THEN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==THEN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:640:3: THEN
                    {
                    match(input,THEN,FOLLOW_THEN_in_if_block2086); 

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_block_in_if_block2094);
            statement_block();

            state._fsp--;

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:644:3: ( ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ELSE||LA43_0==128) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:645:4: ( ELSE | ( ELSE IF | 'elseif' ) ) statement_block
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:645:4: ( ELSE | ( ELSE IF | 'elseif' ) )
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:5: ELSE
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_block2112); 

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:647:7: ( ELSE IF | 'elseif' )
                            {
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:647:7: ( ELSE IF | 'elseif' )
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
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:648:6: ELSE IF
                                    {
                                    match(input,ELSE,FOLLOW_ELSE_in_if_block2127); 
                                    match(input,IF,FOLLOW_IF_in_if_block2129); 

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:649:8: 'elseif'
                                    {
                                    match(input,128,FOLLOW_128_in_if_block2138); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_if_block2158);
                    statement_block();

                    state._fsp--;


                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:656:3: ( END IF | 'endif' )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:657:4: END IF
                    {
                    match(input,END,FOLLOW_END_in_if_block2175); 
                    match(input,IF,FOLLOW_IF_in_if_block2177); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:6: 'endif'
                    {
                    match(input,129,FOLLOW_129_in_if_block2184); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:710:1: pointer_def returns [int count = 0] : POINTER ( POINTER )* ;
    public final int pointer_def() throws RecognitionException {
        int count =  0;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:711:2: ( POINTER ( POINTER )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:711:4: POINTER ( POINTER )*
            {
            match(input,POINTER,FOLLOW_POINTER_in_pointer_def2492); 

            			count = 1;
            		
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:715:3: ( POINTER )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==POINTER) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:716:4: POINTER
            	    {
            	    match(input,POINTER,FOLLOW_POINTER_in_pointer_def2506); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:1: byte_def returns [Expression exp = null] : t= BYTE_TYPE (c= pointer_def )? ;
    public final Expression byte_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:725:2: (t= BYTE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:725:4: t= BYTE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,BYTE_TYPE,FOLLOW_BYTE_TYPE_in_byte_def2538); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:726:5: (c= pointer_def )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==POINTER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:726:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_byte_def2546);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:733:1: int_def returns [Expression exp = null] : t= INT_TYPE (c= pointer_def )? ;
    public final Expression int_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:734:2: (t= INT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:734:4: t= INT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_int_def2571); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:735:5: (c= pointer_def )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==POINTER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:735:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_int_def2579);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:741:1: short_def returns [Expression exp = null] : t= SHORT_TYPE (c= pointer_def )? ;
    public final Expression short_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:742:2: (t= SHORT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:742:4: t= SHORT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_short_def2603); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:743:5: (c= pointer_def )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==POINTER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:743:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_short_def2611);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:750:1: long_def returns [Expression exp = null] : t= LONG_TYPE (c= pointer_def )? ;
    public final Expression long_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:751:2: (t= LONG_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:751:4: t= LONG_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_long_def2636); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:752:5: (c= pointer_def )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==POINTER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:752:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_long_def2644);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:759:1: float_def returns [Expression exp = null] : t= FLOAT_TYPE (c= pointer_def )? ;
    public final Expression float_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:760:2: (t= FLOAT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:760:4: t= FLOAT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_float_def2669); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:5: (c= pointer_def )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==POINTER) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_float_def2677);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:768:1: double_def returns [Expression exp = null] : t= DOUBLE_TYPE (c= pointer_def )? ;
    public final Expression double_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:769:2: (t= DOUBLE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:769:4: t= DOUBLE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_double_def2702); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:770:5: (c= pointer_def )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==POINTER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:770:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_double_def2710);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:868:1: number returns [ Literal num = null ] : (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) ;
    public final Literal number() throws RecognitionException {
        Literal num =  null;

        Token s=null;
        Token n=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:869:2: ( (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:870:3: (s= MINUS | s= PLUS )? (n= FLOAT | n= LONG | n= INT )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:870:3: (s= MINUS | s= PLUS )?
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:870:5: s= MINUS
                    {
                    s=(Token)match(input,MINUS,FOLLOW_MINUS_in_number3259); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:871:5: s= PLUS
                    {
                    s=(Token)match(input,PLUS,FOLLOW_PLUS_in_number3269); 

                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:873:3: (n= FLOAT | n= LONG | n= INT )
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:873:4: n= FLOAT
                    {
                    n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number3283); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:874:5: n= LONG
                    {
                    n=(Token)match(input,LONG,FOLLOW_LONG_in_number3293); 

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:875:5: n= INT
                    {
                    n=(Token)match(input,INT,FOLLOW_INT_in_number3303); 

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:934:1: string_literal returns [BlitzMaxStringLiteral str = null] : e= STRING_LITERAL ;
    public final BlitzMaxStringLiteral string_literal() throws RecognitionException {
        BlitzMaxStringLiteral str =  null;

        Token e=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:935:2: (e= STRING_LITERAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:935:4: e= STRING_LITERAL
            {
            e=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal3642); 

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
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\17\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\100\uffff\3\5\1\uffff\3\5",
            "",
            "",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\20\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\22\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\23\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\24\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\25\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\26\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\100\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\100\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\100\uffff\3\5\1\uffff\3\5",
            "\1\27",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\30\67\uffff\3\5\1\uffff\3\5",
            "\1\31",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\32\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\33\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\34\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\35\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\36\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\11\uffff\5\5\1\uffff\1\5\2\uffff\3"+
            "\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1\5\100\uffff"+
            "\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\30\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\11\uffff\5\5\1\uffff\1\5\2\uffff\3"+
            "\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1\5\100\uffff"+
            "\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\32\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\33\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\34\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\35\67\uffff\3\5\1\uffff\3\5",
            "\3\5\4\uffff\7\5\1\4\1\5\7\uffff\1\21\1\uffff\5\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\2\5\1\uffff\4\5\2\uffff\2\5\4\uffff\1"+
            "\5\10\uffff\1\36\67\uffff\3\5\1\uffff\3\5"
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
            return "441:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : ( (n= IDENTIFIER (t= typedef (v= VAR )? )? ) | function_definition );";
        }
    }
 

    public static final BitSet FOLLOW_main_statements_in_file_input77 = new BitSet(new long[]{0x003308818001C070L});
    public static final BitSet FOLLOW_EOF_in_file_input107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPERSTRICT_in_main_statements120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICT_in_main_statements131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_stmt_in_main_statements146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleinfo_stmt_in_main_statements152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_main_statements162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_block_in_main_statements177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_main_statements188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_block208 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block216 = new BitSet(new long[]{0x003308818003FF70L,0x0800000000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_type_block229 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block238 = new BitSet(new long[]{0x003308818003FE70L,0x0800000000000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_type_block258 = new BitSet(new long[]{0x003308818003F870L,0x0800000000000000L});
    public static final BitSet FOLLOW_FINAL_in_type_block274 = new BitSet(new long[]{0x003308818003F870L,0x0800000000000000L});
    public static final BitSet FOLLOW_type_content_list_in_type_block302 = new BitSet(new long[]{0x0000000000000800L,0x0800000000000000L});
    public static final BitSet FOLLOW_END_in_type_block319 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPE_in_type_block321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_type_block329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_type_content_list355 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_global_def_in_type_content_list363 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_field_def_in_type_content_list371 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_method_block_in_type_content_list383 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_function_block_in_type_content_list400 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_rem_block_in_type_content_list413 = new BitSet(new long[]{0x003308818003F072L});
    public static final BitSet FOLLOW_METHOD_in_method_block438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_function_definition_in_method_block446 = new BitSet(new long[]{0x003308818001CE70L,0x1000000000000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_block457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_method_block480 = new BitSet(new long[]{0x003308818001C870L,0x1000000000000000L});
    public static final BitSet FOLLOW_statement_block_in_method_block505 = new BitSet(new long[]{0x0000000000000800L,0x1000000000000000L});
    public static final BitSet FOLLOW_END_in_method_block520 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_METHOD_in_method_block522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_method_block530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_field_def553 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_field_def562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_global_def581 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_global_def590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_const_def609 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_const_def617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_local_def637 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_list_in_local_def645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block670 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_function_definition_in_function_block678 = new BitSet(new long[]{0x003308818001C870L,0x2000000000000000L});
    public static final BitSet FOLLOW_statement_block_in_function_block691 = new BitSet(new long[]{0x0000000000000800L,0x2000000000000000L});
    public static final BitSet FOLLOW_END_in_function_block706 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_function_block716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_statement_block754 = new BitSet(new long[]{0x003308818001C072L});
    public static final BitSet FOLLOW_include_stmt_in_statement_list793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_block_in_statement_list803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_block_in_statement_list814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_block_in_statement_list820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_statement_list826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_def_in_statement_list833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_def_in_statement_list840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rem_block_in_statement_list847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition870 = new BitSet(new long[]{0x0000000007940000L});
    public static final BitSet FOLLOW_typedef_in_function_definition878 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_function_definition883 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_argument_list_in_function_definition891 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_function_definition901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typedef939 = new BitSet(new long[]{0xE000000000600080L,0x0000000000000007L});
    public static final BitSet FOLLOW_named_type_in_typedef949 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_array_type_in_typedef956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_type_in_typedef995 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_def_in_named_type1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_def_in_named_type1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_def_in_named_type1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_def_in_named_type1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_def_in_named_type1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_def_in_named_type1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_named_type1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_TYPE_in_named_type1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_type1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_type1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_symbol_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_type1199 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RBRACK_in_array_type1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argument_list1221 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list1232 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_argument_in_argument_list1238 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_variable_definition_in_argument1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_definition1296 = new BitSet(new long[]{0x0000000007900002L});
    public static final BitSet FOLLOW_typedef_in_variable_definition1306 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_VAR_in_variable_definition1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_variable_definition1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block1375 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_end_rem_in_rem_block1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_rem1409 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REM_in_end_rem1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_end_rem1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_block1442 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_LOCAL_in_for_block1447 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_definition_in_for_block1457 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQUAL_in_for_block1463 = new BitSet(new long[]{0x0004062000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1483 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_TO_in_for_block1497 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_UNTIL_in_for_block1512 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1537 = new BitSet(new long[]{0x003308D18001C070L});
    public static final BitSet FOLLOW_STEP_in_for_block1551 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1563 = new BitSet(new long[]{0x003308C18001C070L});
    public static final BitSet FOLLOW_EACHIN_in_for_block1593 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_for_block1611 = new BitSet(new long[]{0x003308C18001C070L});
    public static final BitSet FOLLOW_statement_block_in_for_block1635 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NEXT_in_for_block1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat_block1655 = new BitSet(new long[]{0x003309898001C070L});
    public static final BitSet FOLLOW_statement_block_in_repeat_block1663 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_FOREVER_in_repeat_block1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_repeat_block1672 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_repeat_block1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_expression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_or_function_call_in_expression1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_expression1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call1776 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_cast_or_function_call1778 = new BitSet(new long[]{0x0004060000080080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call1780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RPAREN_in_cast_or_function_call1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1794 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1797 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_expression_list1799 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_WHILE_in_while_block1812 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_while_block1814 = new BitSet(new long[]{0x003318818001C070L});
    public static final BitSet FOLLOW_statement_block_in_while_block1818 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_WEND_in_while_block1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_block1833 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_select_block1835 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_case_block_in_select_block1839 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_default_block_in_select_block1844 = new BitSet(new long[]{0x0000C00000000800L,0x8000000000000000L});
    public static final BitSet FOLLOW_end_select_in_select_block1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_block1860 = new BitSet(new long[]{0x003308818001C070L});
    public static final BitSet FOLLOW_statement_block_in_default_block1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_select1875 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SELECT_in_end_select1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_end_select1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_block1894 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_case_block1896 = new BitSet(new long[]{0x00330881A001C070L});
    public static final BitSet FOLLOW_COMMA_in_case_block1899 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_case_block1901 = new BitSet(new long[]{0x00330881A001C070L});
    public static final BitSet FOLLOW_statement_block_in_case_block1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_stmt1926 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_string_literal_in_import_stmt1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_name_in_import_stmt1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt1977 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include_stmt1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAMEWORK_in_framework_stmt1990 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_module_name_in_framework_stmt1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_stmt2003 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_module_name_in_module_stmt2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULEINFO_in_moduleinfo_stmt2017 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2040 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_DOT_in_module_name2042 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGLOG_in_debuglog_stmt2064 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_debuglog_stmt2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_block2080 = new BitSet(new long[]{0x0004060000000080L,0x0001C00001800000L});
    public static final BitSet FOLLOW_expression_in_if_block2082 = new BitSet(new long[]{0x063308818001C870L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_THEN_in_if_block2086 = new BitSet(new long[]{0x043308818001C870L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_block_in_if_block2094 = new BitSet(new long[]{0x0400000000000800L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ELSE_in_if_block2112 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_if_block2127 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2129 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_if_block2138 = new BitSet(new long[]{0x003308818001C870L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_statement_block_in_if_block2158 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_if_block2175 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IF_in_if_block2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_if_block2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def2506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BYTE_TYPE_in_byte_def2538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_byte_def2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_int_def2571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_int_def2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_short_def2603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_short_def2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_long_def2636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_long_def2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_float_def2669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_float_def2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_double_def2702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_pointer_def_in_double_def2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number3259 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_PLUS_in_number3269 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_FLOAT_in_number3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_number3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal3642 = new BitSet(new long[]{0x0000000000000002L});

}