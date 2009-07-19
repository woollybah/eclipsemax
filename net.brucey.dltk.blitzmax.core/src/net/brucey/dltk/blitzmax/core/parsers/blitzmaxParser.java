// $ANTLR 3.1.2 /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g 2009-07-19 14:47:05

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
import java.util.Map;
import java.util.HashMap;
public class blitzmaxParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUPERSTRICT", "NEWLINE", "STRICT", "TYPE", "IDENTIFIER", "EXTENDS", "ABSTRACT", "FINAL", "END", "METHOD", "FIELD", "GLOBAL", "CONST", "LOCAL", "FUNCTION", "DEBUGSTOP", "RETURN", "LPAREN", "RPAREN", "COLON", "STRING_TYPE", "OBJECT_TYPE", "PERCENT", "POUND", "BANG", "DOLLAR", "LBRACK", "RBRACK", "COMMA", "EQUAL", "VAR", "REM", "FOR", "TO", "UNTIL", "STEP", "EACHIN", "NEXT", "REPEAT", "FOREVER", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATEREQUAL", "GREATER", "PLUS", "MINUS", "OR_TEST", "STAR", "SLASH", "MOD", "AND_TEST", "NEW", "DOT", "SELF", "NULL", "LINE_CONTINUATION", "STRING_LITERAL", "NOT_TEST", "PLUSEQUAL", "MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "VBAREQUAL", "WHILE", "WEND", "SELECT", "DEFAULT", "CASE", "IMPORT", "INCLUDE", "FRAMEWORK", "MODULE", "MODULEINFO", "DEBUGLOG", "IF", "THEN", "ELSE", "EXTERN", "TRUE", "FALSE", "LONG_TYPE", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "BYTE_TYPE", "SHORT_TYPE", "POINTER", "SUPER", "DELETE", "CONTINUE", "TRY", "CATCH", "THROW", "ASSERT", "EXIT", "INCBIN", "INCBINPTR", "INCBINLEN", "SEMI", "VBAR", "AMPER", "POWER", "TILDE", "UNDERSCORE", "LEFTSHIFT", "RIGHTSHIFT", "ARITHRIGHTSHIFT", "FLOAT", "LONG", "INT", "POINTFLOAT", "EXPONENTFLOAT", "DIGITS", "FRACTION", "Exponent", "DIGIT", "ALPHA_LOWER", "ALPHA_UPPER", "WHITESPACE", "'endtype'", "'endmethod'", "'endfunction'", "'endrem'", "'endselect'", "'elseif'", "'endif'"
    };
    public static final int COMMA=32;
    public static final int CONST=16;
    public static final int MINUS=50;
    public static final int END=12;
    public static final int ARITHRIGHTSHIFT=111;
    public static final int BANG=28;
    public static final int METHOD=13;
    public static final int FALSE=84;
    public static final int FRACTION=118;
    public static final int ABSTRACT=10;
    public static final int THEN=80;
    public static final int STEP=39;
    public static final int TILDE=107;
    public static final int IMPORT=73;
    public static final int CONTINUE=94;
    public static final int NEWLINE=5;
    public static final int DOT=57;
    public static final int WEND=69;
    public static final int TO=37;
    public static final int PLUSEQUAL=63;
    public static final int T__128=128;
    public static final int FUNCTION=18;
    public static final int LOCAL=17;
    public static final int GLOBAL=15;
    public static final int INCLUDE=74;
    public static final int STRING_LITERAL=61;
    public static final int SELECT=70;
    public static final int DOUBLE_TYPE=88;
    public static final int MODULE=76;
    public static final int UNTIL=38;
    public static final int RPAREN=22;
    public static final int ASSERT=98;
    public static final int SUPERSTRICT=4;
    public static final int PLUS=49;
    public static final int EXTENDS=9;
    public static final int SUPER=92;
    public static final int EXTERN=82;
    public static final int SHORT_TYPE=90;
    public static final int NEW=56;
    public static final int T__130=130;
    public static final int FINAL=11;
    public static final int POINTFLOAT=115;
    public static final int DOLLAR=29;
    public static final int FOREVER=43;
    public static final int REPEAT=42;
    public static final int FIELD=14;
    public static final int LONG_TYPE=85;
    public static final int LBRACK=30;
    public static final int SEMI=103;
    public static final int CATCH=96;
    public static final int EXPONENTFLOAT=116;
    public static final int CASE=72;
    public static final int BYTE_TYPE=89;
    public static final int EQUAL=33;
    public static final int ELSE=81;
    public static final int T__125=125;
    public static final int LESSEQUAL=46;
    public static final int SELF=58;
    public static final int NULL=59;
    public static final int COLON=23;
    public static final int AMPER=105;
    public static final int POINTER=91;
    public static final int IDENTIFIER=8;
    public static final int T__124=124;
    public static final int TRUE=83;
    public static final int POUND=27;
    public static final int DEBUGSTOP=19;
    public static final int UNDERSCORE=108;
    public static final int THROW=97;
    public static final int TYPE=7;
    public static final int STRING_TYPE=24;
    public static final int LONG=113;
    public static final int PERCENT=26;
    public static final int FLOAT=112;
    public static final int MODULEINFO=77;
    public static final int T__126=126;
    public static final int SLASHEQUAL=66;
    public static final int MOD=54;
    public static final int STRICT=6;
    public static final int NOTEQUAL=44;
    public static final int LESS=45;
    public static final int ALPHA_LOWER=121;
    public static final int INT=114;
    public static final int T__127=127;
    public static final int VBAR=104;
    public static final int LPAREN=21;
    public static final int GREATER=48;
    public static final int DIGIT=120;
    public static final int EXIT=99;
    public static final int INT_TYPE=86;
    public static final int DELETE=93;
    public static final int FRAMEWORK=75;
    public static final int Exponent=119;
    public static final int OBJECT_TYPE=25;
    public static final int NOT_TEST=62;
    public static final int DIGITS=117;
    public static final int SLASH=53;
    public static final int POWER=106;
    public static final int WHILE=68;
    public static final int AND_TEST=55;
    public static final int INCBIN=100;
    public static final int REM=35;
    public static final int LINE_CONTINUATION=60;
    public static final int FLOAT_TYPE=87;
    public static final int T__129=129;
    public static final int WHITESPACE=123;
    public static final int VAR=34;
    public static final int DEBUGLOG=78;
    public static final int NEXT=41;
    public static final int INCBINPTR=101;
    public static final int RETURN=20;
    public static final int RIGHTSHIFT=110;
    public static final int MINUSEQUAL=64;
    public static final int INCBINLEN=102;
    public static final int IF=79;
    public static final int EOF=-1;
    public static final int ALPHA_UPPER=122;
    public static final int FOR=36;
    public static final int RBRACK=31;
    public static final int OR_TEST=51;
    public static final int GREATEREQUAL=47;
    public static final int DEFAULT=71;
    public static final int STAR=52;
    public static final int STAREQUAL=65;
    public static final int VBAREQUAL=67;
    public static final int TRY=95;
    public static final int LEFTSHIFT=109;
    public static final int EACHIN=40;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:96:1: file_input : ( main_statements[decl.getStatements()] )* EOF ;
    public final void file_input() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:96:11: ( ( main_statements[decl.getStatements()] )* EOF )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:97:6: ( main_statements[decl.getStatements()] )* EOF
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:97:6: ( main_statements[decl.getStatements()] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SUPERSTRICT && LA1_0<=IDENTIFIER)||LA1_0==END||(LA1_0>=GLOBAL && LA1_0<=RETURN)||(LA1_0>=REM && LA1_0<=FOR)||LA1_0==REPEAT||LA1_0==WHILE||(LA1_0>=IMPORT && LA1_0<=MODULEINFO)||LA1_0==IF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:100:7: main_statements[decl.getStatements()]
            	    {
            	    pushFollow(FOLLOW_main_statements_in_file_input86);
            	    main_statements(decl.getStatements());

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file_input116); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:117:1: main_statements[List statements] : ( ( SUPERSTRICT NEWLINE | STRICT NEWLINE ) | framework_stmt | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | fb= function_block | statement_list[statements] );
    public final void main_statements(List statements) throws RecognitionException {
        Statement s1 = null;

        BlitzMaxTypeDeclaration s3 = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:118:2: ( ( SUPERSTRICT NEWLINE | STRICT NEWLINE ) | framework_stmt | module_stmt | moduleinfo_stmt | s1= import_stmt | s3= type_block | fb= function_block | statement_list[statements] )
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
            case END:
            case GLOBAL:
            case CONST:
            case LOCAL:
            case DEBUGSTOP:
            case RETURN:
            case REM:
            case FOR:
            case REPEAT:
            case WHILE:
            case INCLUDE:
            case IF:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:118:4: ( SUPERSTRICT NEWLINE | STRICT NEWLINE )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:118:4: ( SUPERSTRICT NEWLINE | STRICT NEWLINE )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==SUPERSTRICT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==STRICT) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:118:5: SUPERSTRICT NEWLINE
                            {
                            match(input,SUPERSTRICT,FOLLOW_SUPERSTRICT_in_main_statements129); if (state.failed) return ;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements131); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              				statements.add(new BlitzMaxStrictExpression(true));
                              			
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:122:5: STRICT NEWLINE
                            {
                            match(input,STRICT,FOLLOW_STRICT_in_main_statements142); if (state.failed) return ;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements144); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              				statements.add(new BlitzMaxStrictExpression(false));
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:127:5: framework_stmt
                    {
                    pushFollow(FOLLOW_framework_stmt_in_main_statements159);
                    framework_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:128:5: module_stmt
                    {
                    pushFollow(FOLLOW_module_stmt_in_main_statements165);
                    module_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:129:5: moduleinfo_stmt
                    {
                    pushFollow(FOLLOW_moduleinfo_stmt_in_main_statements171);
                    moduleinfo_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:130:5: s1= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_main_statements181);
                    s1=import_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				statements.add(s1);
                      			
                    }

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:134:5: s3= type_block
                    {
                    pushFollow(FOLLOW_type_block_in_main_statements196);
                    s3=type_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				statements.add(s3);
                      			
                    }

                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:138:5: fb= function_block
                    {
                    pushFollow(FOLLOW_function_block_in_main_statements211);
                    fb=function_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				statements.add(fb);
                      			
                    }

                    }
                    break;
                case 8 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:142:5: statement_list[statements]
                    {
                    pushFollow(FOLLOW_statement_list_in_main_statements222);
                    statement_list(statements);

                    state._fsp--;
                    if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:145:1: type_block returns [ BlitzMaxTypeDeclaration typeDeclaration = null ] : t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE ;
    public final BlitzMaxTypeDeclaration type_block() throws RecognitionException {
        BlitzMaxTypeDeclaration typeDeclaration =  null;

        Token t=null;
        Token n=null;
        Token sup=null;
        Token et=null;
        Block tcl = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:146:2: (t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:146:4: t= TYPE n= IDENTIFIER ( EXTENDS sup= IDENTIFIER )? ( ABSTRACT | FINAL )? NEWLINE tcl= type_content_list (et= END TYPE | et= 'endtype' ) NEWLINE
            {
            t=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_block242); if (state.failed) return typeDeclaration;
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block250); if (state.failed) return typeDeclaration;
            if ( state.backtracking==0 ) {

              			typeDeclaration = new BlitzMaxTypeDeclaration(n.getText(), ((CommonToken) n).getStartIndex(),((CommonToken) n).getStopIndex()+1,
              				((CommonToken) t).getStartIndex(),((CommonToken) t).getStopIndex() + 1);
              			decl.addType(typeDeclaration);
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:153:3: ( EXTENDS sup= IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:154:4: EXTENDS sup= IDENTIFIER
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_type_block263); if (state.failed) return typeDeclaration;
                    sup=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block272); if (state.failed) return typeDeclaration;
                    if ( state.backtracking==0 ) {

                      				typeDeclaration.addSuperClass(new BlitzMaxTypeReference(sup));
                      			
                    }

                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:162:3: ( ABSTRACT | FINAL )?
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:162:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_type_block292); if (state.failed) return typeDeclaration;
                    if ( state.backtracking==0 ) {

                      				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:167:5: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_type_block308); if (state.failed) return typeDeclaration;
                    if ( state.backtracking==0 ) {

                      				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
                      			
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block329); if (state.failed) return typeDeclaration;
            pushFollow(FOLLOW_type_content_list_in_type_block340);
            tcl=type_content_list();

            state._fsp--;
            if (state.failed) return typeDeclaration;
            if ( state.backtracking==0 ) {

              			typeDeclaration.setBody(tcl);
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:181:3: (et= END TYPE | et= 'endtype' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==END) ) {
                alt6=1;
            }
            else if ( (LA6_0==124) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return typeDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:181:5: et= END TYPE
                    {
                    et=(Token)match(input,END,FOLLOW_END_in_type_block357); if (state.failed) return typeDeclaration;
                    match(input,TYPE,FOLLOW_TYPE_in_type_block359); if (state.failed) return typeDeclaration;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:181:21: et= 'endtype'
                    {
                    et=(Token)match(input,124,FOLLOW_124_in_type_block367); if (state.failed) return typeDeclaration;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			typeDeclaration.setEnd(((CommonToken) et).getStopIndex()+1);
              			
              			List s = typeDeclaration.getBody().getStatements();
              			for (Iterator i = s.iterator(); i.hasNext();) {
              				ASTNode node = (ASTNode) i.next();
              				if (node instanceof FieldDeclaration) {
              					typeDeclaration.getFieldList().add(node);
              				}
              			}
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block377); if (state.failed) return typeDeclaration;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:196:1: type_content_list returns [ Block typeContent = new Block() ] : ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )* ;
    public final Block type_content_list() throws RecognitionException {
        Block typeContent =  new Block();

        BlitzMaxMethodDeclaration mb = null;

        BlitzMaxFunctionDeclaration fb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:197:2: ( ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:197:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )*
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:197:4: ( const_def[typeContent.getStatements()] | global_def[typeContent.getStatements()] | field_def[typeContent.getStatements()] | mb= method_block | fb= function_block | rem_block | NEWLINE )*
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
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:198:4: const_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_const_def_in_type_content_list397);
            	    const_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:199:6: global_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_global_def_in_type_content_list405);
            	    global_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:200:6: field_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_field_def_in_type_content_list413);
            	    field_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 4 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:201:6: mb= method_block
            	    {
            	    pushFollow(FOLLOW_method_block_in_type_content_list425);
            	    mb=method_block();

            	    state._fsp--;
            	    if (state.failed) return typeContent;
            	    if ( state.backtracking==0 ) {

            	      					typeContent.addStatement(mb);
            	      				
            	    }

            	    }
            	    break;
            	case 5 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:205:6: fb= function_block
            	    {
            	    pushFollow(FOLLOW_function_block_in_type_content_list442);
            	    fb=function_block();

            	    state._fsp--;
            	    if (state.failed) return typeContent;
            	    if ( state.backtracking==0 ) {

            	      					typeContent.addStatement(fb);
            	      				
            	    }

            	    }
            	    break;
            	case 6 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:209:6: rem_block
            	    {
            	    pushFollow(FOLLOW_rem_block_in_type_content_list455);
            	    rem_block();

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 7 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:210:6: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_type_content_list462); if (state.failed) return typeContent;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:214:1: method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ] : m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE ;
    public final BlitzMaxMethodDeclaration method_block() throws RecognitionException {
        BlitzMaxMethodDeclaration methodDeclaration =  null;

        Token m=null;
        Token em=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:215:2: (m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:215:4: m= METHOD fd= function_definition ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE
            {
            m=(Token)match(input,METHOD,FOLLOW_METHOD_in_method_block487); if (state.failed) return methodDeclaration;
            pushFollow(FOLLOW_function_definition_in_method_block495);
            fd=function_definition();

            state._fsp--;
            if (state.failed) return methodDeclaration;
            if ( state.backtracking==0 ) {

              				methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
              			
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:220:3: ( ABSTRACT | ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ABSTRACT) ) {
                alt10=1;
            }
            else if ( (LA10_0==NEWLINE||LA10_0==FINAL) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return methodDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:220:5: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_block506); if (state.failed) return methodDeclaration;
                    if ( state.backtracking==0 ) {

                      				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:226:3: ( FINAL )? NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:226:3: ( FINAL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FINAL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:227:3: FINAL
                            {
                            match(input,FINAL,FOLLOW_FINAL_in_method_block529); if (state.failed) return methodDeclaration;
                            if ( state.backtracking==0 ) {

                              				methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
                              			
                            }

                            }
                            break;

                    }

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block549); if (state.failed) return methodDeclaration;
                    pushFollow(FOLLOW_statement_block_in_method_block557);
                    b=statement_block();

                    state._fsp--;
                    if (state.failed) return methodDeclaration;
                    if ( state.backtracking==0 ) {

                      				methodDeclaration.acceptBody(b, true);
                      			
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:239:3: (em= END METHOD | em= 'endmethod' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==END) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==125) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return methodDeclaration;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:239:5: em= END METHOD
                            {
                            em=(Token)match(input,END,FOLLOW_END_in_method_block572); if (state.failed) return methodDeclaration;
                            match(input,METHOD,FOLLOW_METHOD_in_method_block574); if (state.failed) return methodDeclaration;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:239:23: em= 'endmethod'
                            {
                            em=(Token)match(input,125,FOLLOW_125_in_method_block582); if (state.failed) return methodDeclaration;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      			methodDeclaration.setEnd(((CommonToken) em).getStopIndex()+1);
                      		
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block596); if (state.failed) return methodDeclaration;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:247:1: field_def[List statements] : FIELD args= argument_list[false] NEWLINE ;
    public final void field_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:248:2: ( FIELD args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:248:4: FIELD args= argument_list[false] NEWLINE
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_def609); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_field_def618);
            args=argument_list(false);

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			if (args != null) {
              				for (Iterator i = args.iterator(); i.hasNext();) {
              					statements.add(new BlitzMaxFieldDeclaration((Declaration)i.next()));
              				}
              			}
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_def628); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:260:1: global_def[List statements] : GLOBAL args= argument_list[false] NEWLINE ;
    public final void global_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:261:2: ( GLOBAL args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:261:4: GLOBAL args= argument_list[false] NEWLINE
            {
            match(input,GLOBAL,FOLLOW_GLOBAL_in_global_def641); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_global_def650);
            args=argument_list(false);

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			if (args != null) {
              				for (Iterator i = args.iterator(); i.hasNext();) {
              					statements.add(new BlitzMaxGlobalDeclaration((Declaration)i.next()));
              				}
              			}
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_global_def660); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:273:1: const_def[List statements] : CONST args= argument_list[false] NEWLINE ;
    public final void const_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:274:2: ( CONST args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:274:4: CONST args= argument_list[false] NEWLINE
            {
            match(input,CONST,FOLLOW_CONST_in_const_def673); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_const_def681);
            args=argument_list(false);

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			if (args != null) {
              				for (Iterator i = args.iterator(); i.hasNext();) {
              					statements.add(new BlitzMaxConstDeclaration((Declaration)i.next()));
              				}
              			}
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_const_def691); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:286:1: local_def[List statements] : LOCAL args= argument_list[false] NEWLINE ;
    public final void local_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:287:2: ( LOCAL args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:287:4: LOCAL args= argument_list[false] NEWLINE
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_def705); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_local_def713);
            args=argument_list(false);

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			if (args != null) {
              				for (Iterator i = args.iterator(); i.hasNext();) {
              					statements.add(new BlitzMaxLocalDeclaration((Declaration)i.next()));
              				}
              			}
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_local_def723); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:299:1: function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ] : f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE ;
    public final BlitzMaxFunctionDeclaration function_block() throws RecognitionException {
        BlitzMaxFunctionDeclaration functionDeclaration =  null;

        Token f=null;
        Token ef=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:300:2: (f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:300:4: f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE
            {
            f=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block742); if (state.failed) return functionDeclaration;
            pushFollow(FOLLOW_function_definition_in_function_block750);
            fd=function_definition();

            state._fsp--;
            if (state.failed) return functionDeclaration;
            if ( state.backtracking==0 ) {

              				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
              			
            }
            pushFollow(FOLLOW_statement_block_in_function_block763);
            b=statement_block();

            state._fsp--;
            if (state.failed) return functionDeclaration;
            if ( state.backtracking==0 ) {

              				functionDeclaration.acceptBody(b, true);
              			
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:309:3: (ef= END FUNCTION | ef= 'endfunction' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==END) ) {
                alt11=1;
            }
            else if ( (LA11_0==126) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return functionDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:309:5: ef= END FUNCTION
                    {
                    ef=(Token)match(input,END,FOLLOW_END_in_function_block778); if (state.failed) return functionDeclaration;
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block780); if (state.failed) return functionDeclaration;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:309:25: ef= 'endfunction'
                    {
                    ef=(Token)match(input,126,FOLLOW_126_in_function_block788); if (state.failed) return functionDeclaration;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			functionDeclaration.setEnd(((CommonToken) ef).getStopIndex()+1);
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_function_block798); if (state.failed) return functionDeclaration;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:316:1: statement_block returns [ BlitzMaxBlock statement = new BlitzMaxBlock() ] : ( ( statement_list[statement.getStatements()] )* ) ;
    public final BlitzMaxBlock statement_block() throws RecognitionException {
        BlitzMaxBlock statement =  new BlitzMaxBlock();


        		  	int startPos = -1;
        		  	int endPos = -1;
        		
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:321:2: ( ( ( statement_list[statement.getStatements()] )* ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:322:3: ( ( statement_list[statement.getStatements()] )* )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:322:3: ( ( statement_list[statement.getStatements()] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:323:4: ( statement_list[statement.getStatements()] )*
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:323:4: ( statement_list[statement.getStatements()] )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==END) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==NEWLINE) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==NEWLINE||LA12_0==IDENTIFIER||(LA12_0>=GLOBAL && LA12_0<=LOCAL)||(LA12_0>=DEBUGSTOP && LA12_0<=RETURN)||(LA12_0>=REM && LA12_0<=FOR)||LA12_0==REPEAT||LA12_0==WHILE||LA12_0==INCLUDE||LA12_0==IF) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:324:5: statement_list[statement.getStatements()]
            	    {
            	    pushFollow(FOLLOW_statement_list_in_statement_block830);
            	    statement_list(statement.getStatements());

            	    state._fsp--;
            	    if (state.failed) return statement;
            	    if ( state.backtracking==0 ) {

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

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	   	statement.setStart( startPos );
              	   	statement.setEnd( endPos );
              	  
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
        return statement;
    }
    // $ANTLR end "statement_block"


    // $ANTLR start "statement_list"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:363:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | END NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE );
    public final void statement_list(List statements) throws RecognitionException {
        BlitzMaxForStatement s2 = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:364:2: ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | END NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE )
            int alt13=15;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:364:4: include_stmt
                    {
                    pushFollow(FOLLOW_include_stmt_in_statement_list869);
                    include_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:365:5: s2= for_block
                    {
                    pushFollow(FOLLOW_for_block_in_statement_list879);
                    s2=for_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				statements.add(s2);
                      			
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:369:5: while_block
                    {
                    pushFollow(FOLLOW_while_block_in_statement_list890);
                    while_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:370:5: repeat_block
                    {
                    pushFollow(FOLLOW_repeat_block_in_statement_list896);
                    repeat_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:371:5: const_def[statements]
                    {
                    pushFollow(FOLLOW_const_def_in_statement_list902);
                    const_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:372:5: global_def[statements]
                    {
                    pushFollow(FOLLOW_global_def_in_statement_list909);
                    global_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:373:5: local_def[statements]
                    {
                    pushFollow(FOLLOW_local_def_in_statement_list916);
                    local_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:374:5: rem_block
                    {
                    pushFollow(FOLLOW_rem_block_in_statement_list923);
                    rem_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:375:5: if_block
                    {
                    pushFollow(FOLLOW_if_block_in_statement_list929);
                    if_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:376:5: DEBUGSTOP NEWLINE
                    {
                    match(input,DEBUGSTOP,FOLLOW_DEBUGSTOP_in_statement_list935); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list937); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:377:5: END NEWLINE
                    {
                    match(input,END,FOLLOW_END_in_statement_list943); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list945); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:378:5: RETURN expression NEWLINE
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement_list951); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement_list953);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list955); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:379:5: cast_or_function_call NEWLINE
                    {
                    pushFollow(FOLLOW_cast_or_function_call_in_statement_list961);
                    cast_or_function_call();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list963); if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:380:5: IDENTIFIER assignment expression NEWLINE
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement_list969); if (state.failed) return ;
                    pushFollow(FOLLOW_assignment_in_statement_list971);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement_list973);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list975); if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:382:5: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list984); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:385:1: function_definition returns [BlitzMaxFunctionExpression exp = null] : (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) ;
    public final BlitzMaxFunctionExpression function_definition() throws RecognitionException {
        BlitzMaxFunctionExpression exp =  null;

        Token name=null;
        Token rp=null;
        BlitzMaxTypedefExpression t = null;

        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:386:2: ( (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:386:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:386:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:387:3: name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition1007); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:388:5: (t= typedef )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON||(LA14_0>=PERCENT && LA14_0<=DOLLAR)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: t= typedef
                    {
                    pushFollow(FOLLOW_typedef_in_function_definition1015);
                    t=typedef();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            match(input,LPAREN,FOLLOW_LPAREN_in_function_definition1020); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:390:8: (args= argument_list[true] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: args= argument_list[true]
                    {
                    pushFollow(FOLLOW_argument_list_in_function_definition1028);
                    args=argument_list(true);

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition1038); if (state.failed) return exp;

            }

            if ( state.backtracking==0 ) {

              				exp = new BlitzMaxFunctionExpression(name, t, args, rp);
              			
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
        return exp;
    }
    // $ANTLR end "function_definition"


    // $ANTLR start "typedef"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:398:1: typedef returns [BlitzMaxTypedefExpression expr = null] : ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) ;
    public final BlitzMaxTypedefExpression typedef() throws RecognitionException {
        BlitzMaxTypedefExpression expr =  null;

        BlitzMaxTypeReference nt = null;



        			boolean at = false;
        		
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:402:2: ( ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:403:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:403:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==COLON) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=PERCENT && LA18_0<=DOLLAR)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:404:4: ( COLON nt= named_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:404:4: ( COLON nt= named_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:404:5: COLON nt= named_type ( array_type )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_typedef1076); if (state.failed) return expr;
                    pushFollow(FOLLOW_named_type_in_typedef1086);
                    nt=named_type();

                    state._fsp--;
                    if (state.failed) return expr;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:406:5: ( array_type )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LBRACK) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:406:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1093);
                            array_type();

                            state._fsp--;
                            if (state.failed) return expr;
                            if ( state.backtracking==0 ) {

                              						at = true;
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:413:4: (nt= symbol_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:413:4: (nt= symbol_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:414:5: nt= symbol_type ( array_type )?
                    {
                    pushFollow(FOLLOW_symbol_type_in_typedef1132);
                    nt=symbol_type();

                    state._fsp--;
                    if (state.failed) return expr;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:415:5: ( array_type )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LBRACK) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:415:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1139);
                            array_type();

                            state._fsp--;
                            if (state.failed) return expr;
                            if ( state.backtracking==0 ) {

                              						at = true;
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			expr = new BlitzMaxTypedefExpression(nt, at);
              		
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
        return expr;
    }
    // $ANTLR end "typedef"


    // $ANTLR start "named_type"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:427:1: named_type returns [ BlitzMaxTypeReference tr = null ] : ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER );
    public final BlitzMaxTypeReference named_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token s=null;
        Token o=null;
        Token name=null;
        Expression d = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:428:2: ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER )
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
                if (state.backtracking>0) {state.failed=true; return tr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:428:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:428:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
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
                        if (state.backtracking>0) {state.failed=true; return tr;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:428:9: d= int_def
                            {
                            pushFollow(FOLLOW_int_def_in_named_type1190);
                            d=int_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:429:6: d= long_def
                            {
                            pushFollow(FOLLOW_long_def_in_named_type1201);
                            d=long_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 3 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:430:6: d= float_def
                            {
                            pushFollow(FOLLOW_float_def_in_named_type1212);
                            d=float_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 4 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:431:6: d= double_def
                            {
                            pushFollow(FOLLOW_double_def_in_named_type1223);
                            d=double_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 5 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:432:6: d= byte_def
                            {
                            pushFollow(FOLLOW_byte_def_in_named_type1234);
                            d=byte_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 6 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:433:6: d= short_def
                            {
                            pushFollow(FOLLOW_short_def_in_named_type1245);
                            d=short_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference(d);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:438:5: s= STRING_TYPE
                    {
                    s=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_named_type1264); if (state.failed) return tr;
                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference( new BlitzMaxStringType(s) );
                      			
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:5: o= OBJECT_TYPE
                    {
                    o=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_named_type1279); if (state.failed) return tr;
                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference( new BlitzMaxObjectType(o) );
                      			
                    }

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:446:5: name= IDENTIFIER
                    {
                    name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_type1294); if (state.failed) return tr;
                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference( new BlitzMaxVariableReference(name) );
                      			
                    }

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:452:1: function_type : function_definition ;
    public final void function_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:453:2: ( function_definition )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:453:4: function_definition
            {
            pushFollow(FOLLOW_function_definition_in_function_type1310);
            function_definition();

            state._fsp--;
            if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:456:1: symbol_type returns [ BlitzMaxTypeReference tr = null ] : (d= PERCENT | d= POUND | d= BANG | d= DOLLAR ) ;
    public final BlitzMaxTypeReference symbol_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token d=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:457:2: ( (d= PERCENT | d= POUND | d= BANG | d= DOLLAR ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:457:4: (d= PERCENT | d= POUND | d= BANG | d= DOLLAR )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:457:4: (d= PERCENT | d= POUND | d= BANG | d= DOLLAR )
            int alt21=4;
            switch ( input.LA(1) ) {
            case PERCENT:
                {
                alt21=1;
                }
                break;
            case POUND:
                {
                alt21=2;
                }
                break;
            case BANG:
                {
                alt21=3;
                }
                break;
            case DOLLAR:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return tr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:457:5: d= PERCENT
                    {
                    d=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_symbol_type1330); if (state.failed) return tr;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:458:5: d= POUND
                    {
                    d=(Token)match(input,POUND,FOLLOW_POUND_in_symbol_type1340); if (state.failed) return tr;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:459:5: d= BANG
                    {
                    d=(Token)match(input,BANG,FOLLOW_BANG_in_symbol_type1350); if (state.failed) return tr;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:460:5: d= DOLLAR
                    {
                    d=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_symbol_type1360); if (state.failed) return tr;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			tr = new BlitzMaxTypeReference(d);
              		
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:467:1: array_type : LBRACK ( number )? RBRACK ;
    public final void array_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:2: ( LBRACK ( number )? RBRACK )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:4: LBRACK ( number )? RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_array_type1379); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:11: ( number )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=FLOAT && LA22_0<=INT)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:12: number
                    {
                    pushFollow(FOLLOW_number_in_array_type1382);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RBRACK,FOLLOW_RBRACK_in_array_type1386); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:471:1: argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ] : arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* ;
    public final List<Declaration> argument_list(boolean functionArgs) throws RecognitionException {
        List<Declaration> args =  new ArrayList<Declaration>();

        Declaration arg = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:472:2: (arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:472:4: arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )*
            {
            pushFollow(FOLLOW_argument_in_argument_list1406);
            arg=argument(functionArgs);

            state._fsp--;
            if (state.failed) return args;
            if ( state.backtracking==0 ) {

              			args.add(arg);
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:476:3: ( COMMA arg= argument[functionArgs] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:476:4: COMMA arg= argument[functionArgs]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argument_list1417); if (state.failed) return args;
            	    pushFollow(FOLLOW_argument_in_argument_list1423);
            	    arg=argument(functionArgs);

            	    state._fsp--;
            	    if (state.failed) return args;
            	    if ( state.backtracking==0 ) {

            	      				args.add(arg);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:483:1: argument[boolean functionArg] returns [ Declaration arg = null ] : (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition );
    public final Declaration argument(boolean functionArg) throws RecognitionException {
        Declaration arg =  null;

        Declaration a = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:2: (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:4: a= variable_def[functionArg] ( EQUAL simple_expression )?
                    {
                    pushFollow(FOLLOW_variable_def_in_argument1455);
                    a=variable_def(functionArg);

                    state._fsp--;
                    if (state.failed) return arg;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:34: ( EQUAL simple_expression )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==EQUAL) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:35: EQUAL simple_expression
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_argument1459); if (state.failed) return arg;
                            pushFollow(FOLLOW_simple_expression_in_argument1461);
                            simple_expression();

                            state._fsp--;
                            if (state.failed) return arg;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      			arg = a;
                      		
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:488:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_argument1473);
                    function_definition();

                    state._fsp--;
                    if (state.failed) return arg;

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
        return arg;
    }
    // $ANTLR end "argument"


    // $ANTLR start "variable_definition"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:491:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition );
    public final Declaration variable_definition(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Declaration v = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:492:2: (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:492:4: v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )?
                    {
                    pushFollow(FOLLOW_variable_def_in_variable_definition1493);
                    v=variable_def(functionArg);

                    state._fsp--;
                    if (state.failed) return dec;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:492:34: ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )?
                    int alt26=3;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NEWLINE) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==EQUAL) ) {
                        alt26=2;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:492:35: NEWLINE
                            {
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variable_definition1497); if (state.failed) return dec;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:492:45: EQUAL ( simple_expression NEWLINE )
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_variable_definition1501); if (state.failed) return dec;
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:493:3: ( simple_expression NEWLINE )
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:493:4: simple_expression NEWLINE
                            {
                            pushFollow(FOLLOW_simple_expression_in_variable_definition1506);
                            simple_expression();

                            state._fsp--;
                            if (state.failed) return dec;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variable_definition1508); if (state.failed) return dec;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:495:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_variable_definition1520);
                    function_definition();

                    state._fsp--;
                    if (state.failed) return dec;

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


    // $ANTLR start "variable_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:498:1: variable_def[boolean functionArg] returns [ Declaration dec = null ] : n= IDENTIFIER (t= typedef (v= VAR )? )? ;
    public final Declaration variable_def(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Token n=null;
        Token v=null;
        BlitzMaxTypedefExpression t = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:499:2: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:499:4: n= IDENTIFIER (t= typedef (v= VAR )? )?
            {
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_def1541); if (state.failed) return dec;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:500:4: (t= typedef (v= VAR )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==COLON||(LA29_0>=PERCENT && LA29_0<=DOLLAR)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:500:5: t= typedef (v= VAR )?
                    {
                    pushFollow(FOLLOW_typedef_in_variable_def1551);
                    t=typedef();

                    state._fsp--;
                    if (state.failed) return dec;
                    if ( state.backtracking==0 ) {

                      					dec = new BlitzMaxVariableDeclaration(n, t);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:505:5: (v= VAR )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==VAR) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:505:7: v= VAR
                            {
                            v=(Token)match(input,VAR,FOLLOW_VAR_in_variable_def1574); if (state.failed) return dec;
                            if ( state.backtracking==0 ) {

                              						if (!functionArg) {
                              							RecognitionException e = new RecognitionException(input);
                              							e.token = v;
                              							throw e;
                              						}
                              					
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              				if (t == null) {
              					dec = new BlitzMaxVariableDeclaration(n, null);
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
        return dec;
    }
    // $ANTLR end "variable_def"


    // $ANTLR start "rem_block"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:522:1: rem_block : REM NEWLINE rem_block_contents ;
    public final void rem_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:523:3: ( REM NEWLINE rem_block_contents )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:523:5: REM NEWLINE rem_block_contents
            {
            match(input,REM,FOLLOW_REM_in_rem_block1611); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_rem_block1613); if (state.failed) return ;
            pushFollow(FOLLOW_rem_block_contents_in_rem_block1618);
            rem_block_contents();

            state._fsp--;
            if (state.failed) return ;

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


    // $ANTLR start "rem_block_contents"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:527:1: rem_block_contents : ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) ) ;
    public final void rem_block_contents() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:528:3: ( ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:528:5: ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:528:5: ( . )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 127:
                    {
                    int LA30_1 = input.LA(2);

                    if ( (synpred65_blitzmax()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case END:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred65_blitzmax()) ) {
                        alt30=1;
                    }


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
                case DEBUGSTOP:
                case RETURN:
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
                case EQUAL:
                case VAR:
                case REM:
                case FOR:
                case TO:
                case UNTIL:
                case STEP:
                case EACHIN:
                case NEXT:
                case REPEAT:
                case FOREVER:
                case NOTEQUAL:
                case LESS:
                case LESSEQUAL:
                case GREATEREQUAL:
                case GREATER:
                case PLUS:
                case MINUS:
                case OR_TEST:
                case STAR:
                case SLASH:
                case MOD:
                case AND_TEST:
                case NEW:
                case DOT:
                case SELF:
                case NULL:
                case LINE_CONTINUATION:
                case STRING_LITERAL:
                case NOT_TEST:
                case PLUSEQUAL:
                case MINUSEQUAL:
                case STAREQUAL:
                case SLASHEQUAL:
                case VBAREQUAL:
                case WHILE:
                case WEND:
                case SELECT:
                case DEFAULT:
                case CASE:
                case IMPORT:
                case INCLUDE:
                case FRAMEWORK:
                case MODULE:
                case MODULEINFO:
                case DEBUGLOG:
                case IF:
                case THEN:
                case ELSE:
                case EXTERN:
                case TRUE:
                case FALSE:
                case LONG_TYPE:
                case INT_TYPE:
                case FLOAT_TYPE:
                case DOUBLE_TYPE:
                case BYTE_TYPE:
                case SHORT_TYPE:
                case POINTER:
                case SUPER:
                case DELETE:
                case CONTINUE:
                case TRY:
                case CATCH:
                case THROW:
                case ASSERT:
                case EXIT:
                case INCBIN:
                case INCBINPTR:
                case INCBINLEN:
                case SEMI:
                case VBAR:
                case AMPER:
                case POWER:
                case TILDE:
                case UNDERSCORE:
                case LEFTSHIFT:
                case RIGHTSHIFT:
                case ARITHRIGHTSHIFT:
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
                case 124:
                case 125:
                case 126:
                case 128:
                case 129:
                case 130:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:5: ( 'endrem' | END (~ REM rem_block_contents | REM ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==127) ) {
                alt32=1;
            }
            else if ( (LA32_0==END) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:6: 'endrem'
                    {
                    match(input,127,FOLLOW_127_in_rem_block_contents1639); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:17: END (~ REM rem_block_contents | REM )
                    {
                    match(input,END,FOLLOW_END_in_rem_block_contents1643); if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:21: (~ REM rem_block_contents | REM )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=SUPERSTRICT && LA31_0<=VAR)||(LA31_0>=FOR && LA31_0<=130)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==REM) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:22: ~ REM rem_block_contents
                            {
                            if ( (input.LA(1)>=SUPERSTRICT && input.LA(1)<=VAR)||(input.LA(1)>=FOR && input.LA(1)<=130) ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_rem_block_contents_in_rem_block_contents1649);
                            rem_block_contents();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:529:48: REM
                            {
                            match(input,REM,FOLLOW_REM_in_rem_block_contents1653); if (state.failed) return ;

                            }
                            break;

                    }


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
    // $ANTLR end "rem_block_contents"


    // $ANTLR start "for_block"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:545:1: for_block returns [ BlitzMaxForStatement stmt = null ] : (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE ;
    public final BlitzMaxForStatement for_block() throws RecognitionException {
        BlitzMaxForStatement stmt =  null;

        Token f=null;
        Declaration vdef = null;

        Expression frm = null;

        Expression to = null;

        Expression sexp = null;

        BlitzMaxBlock sb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:546:2: ( (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:546:4: (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:546:4: (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:547:4: f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_for_block1682); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:548:4: ( LOCAL )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LOCAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_for_block1687); if (state.failed) return stmt;

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_def_in_for_block1697);
            vdef=variable_def(false);

            state._fsp--;
            if (state.failed) return stmt;
            match(input,EQUAL,FOLLOW_EQUAL_in_for_block1703); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:551:4: ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENTIFIER||LA36_0==LPAREN||(LA36_0>=PLUS && LA36_0<=MINUS)||LA36_0==NEW||(LA36_0>=SELF && LA36_0<=NOT_TEST)||(LA36_0>=FLOAT && LA36_0<=INT)) ) {
                alt36=1;
            }
            else if ( (LA36_0==EACHIN) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:552:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:552:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:553:5: frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )?
                    {
                    pushFollow(FOLLOW_expression_in_for_block1723);
                    frm=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      					stmt = new BlitzMaxForStatement(vdef, frm);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:557:5: ( TO | UNTIL )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==TO) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==UNTIL) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return stmt;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:557:7: TO
                            {
                            match(input,TO,FOLLOW_TO_in_for_block1737); if (state.failed) return stmt;
                            if ( state.backtracking==0 ) {

                              						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:561:7: UNTIL
                            {
                            match(input,UNTIL,FOLLOW_UNTIL_in_for_block1752); if (state.failed) return stmt;
                            if ( state.backtracking==0 ) {

                              						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
                              				 	
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_for_block1777);
                    to=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      					stmt.setToExpr(to);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:571:5: ( STEP sexp= expression )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==STEP) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:571:7: STEP sexp= expression
                            {
                            match(input,STEP,FOLLOW_STEP_in_for_block1791); if (state.failed) return stmt;
                            pushFollow(FOLLOW_expression_in_for_block1803);
                            sexp=expression();

                            state._fsp--;
                            if (state.failed) return stmt;
                            if ( state.backtracking==0 ) {

                              						stmt.setStepExpr(sexp);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:579:5: EACHIN to= expression
                    {
                    match(input,EACHIN,FOLLOW_EACHIN_in_for_block1833); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
                      				 	
                    }
                    pushFollow(FOLLOW_expression_in_for_block1851);
                    to=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      						stmt.setToExpr(to);
                      					
                    }

                    }
                    break;

            }


            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1871); if (state.failed) return stmt;
            pushFollow(FOLLOW_statement_block_in_for_block1879);
            sb=statement_block();

            state._fsp--;
            if (state.failed) return stmt;
            if ( state.backtracking==0 ) {

              				stmt.setBlock(sb);
              			
            }
            match(input,NEXT,FOLLOW_NEXT_in_for_block1888); if (state.failed) return stmt;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1890); if (state.failed) return stmt;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:597:1: repeat_block : REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE ;
    public final void repeat_block() throws RecognitionException {
        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:598:2: ( REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:598:4: REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat_block1902); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1904); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_repeat_block1912);
            b=statement_block();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:600:3: ( FOREVER | UNTIL expression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==FOREVER) ) {
                alt37=1;
            }
            else if ( (LA37_0==UNTIL) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:600:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeat_block1917); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:600:14: UNTIL expression
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_repeat_block1921); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_repeat_block1923);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1928); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:628:1: expression returns [ Expression exp = null ] : expr ;
    public final Expression expression() throws RecognitionException {
        Expression exp =  null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:629:2: ( expr )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:629:4: expr
            {
            pushFollow(FOLLOW_expr_in_expression1944);
            expr();

            state._fsp--;
            if (state.failed) return exp;

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


    // $ANTLR start "expr"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:632:1: expr : simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )* ;
    public final void expr() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:633:5: ( simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:633:7: simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )*
            {
            pushFollow(FOLLOW_simple_expression_in_expr1959);
            simple_expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:634:4: ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==EQUAL||(LA38_0>=NOTEQUAL && LA38_0<=GREATER)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:634:6: ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression
            	    {
            	    if ( input.LA(1)==EQUAL||(input.LA(1)>=NOTEQUAL && input.LA(1)<=GREATER) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_simple_expression_in_expr1991);
            	    simple_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "expr"


    // $ANTLR start "simple_expression"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:637:1: simple_expression : term ( adding_operator term )* ;
    public final void simple_expression() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:638:5: ( term ( adding_operator term )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:638:7: term ( adding_operator term )*
            {
            pushFollow(FOLLOW_term_in_simple_expression2011);
            term();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:638:12: ( adding_operator term )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=PLUS && LA39_0<=OR_TEST)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:638:14: adding_operator term
            	    {
            	    pushFollow(FOLLOW_adding_operator_in_simple_expression2015);
            	    adding_operator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_term_in_simple_expression2017);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "simple_expression"


    // $ANTLR start "adding_operator"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:641:1: adding_operator : ( PLUS | MINUS | OR_TEST );
    public final void adding_operator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:642:5: ( PLUS | MINUS | OR_TEST )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
            {
            if ( (input.LA(1)>=PLUS && input.LA(1)<=OR_TEST) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        return ;
    }
    // $ANTLR end "adding_operator"


    // $ANTLR start "term"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:645:1: term : signed_factor ( multiplying_operator signed_factor )* ;
    public final void term() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:5: ( signed_factor ( multiplying_operator signed_factor )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:7: signed_factor ( multiplying_operator signed_factor )*
            {
            pushFollow(FOLLOW_signed_factor_in_term2062);
            signed_factor();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:21: ( multiplying_operator signed_factor )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=STAR && LA40_0<=AND_TEST)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:23: multiplying_operator signed_factor
            	    {
            	    pushFollow(FOLLOW_multiplying_operator_in_term2066);
            	    multiplying_operator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_signed_factor_in_term2068);
            	    signed_factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "term"


    // $ANTLR start "multiplying_operator"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:649:1: multiplying_operator : ( STAR | SLASH | MOD | AND_TEST );
    public final void multiplying_operator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:650:5: ( STAR | SLASH | MOD | AND_TEST )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
            {
            if ( (input.LA(1)>=STAR && input.LA(1)<=AND_TEST) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        return ;
    }
    // $ANTLR end "multiplying_operator"


    // $ANTLR start "signed_factor"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:653:1: signed_factor : ( PLUS | MINUS )? factor ;
    public final void signed_factor() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:654:5: ( ( PLUS | MINUS )? factor )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:654:7: ( PLUS | MINUS )? factor
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:654:7: ( PLUS | MINUS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=PLUS && LA41_0<=MINUS)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
                    {
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_factor_in_signed_factor2126);
            factor();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "signed_factor"


    // $ANTLR start "factor"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:657:1: factor : ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION );
    public final void factor() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:5: ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION )
            int alt44=7;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:7: ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:7: ( NEW )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NEW) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: NEW
                            {
                            match(input,NEW,FOLLOW_NEW_in_factor2143); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:12: ( IDENTIFIER DOT )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==IDENTIFIER) ) {
                            int LA43_1 = input.LA(2);

                            if ( (LA43_1==DOT) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:13: IDENTIFIER DOT
                    	    {
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor2147); if (state.failed) return ;
                    	    match(input,DOT,FOLLOW_DOT_in_factor2149); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor2153); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:659:7: func_var_designator
                    {
                    pushFollow(FOLLOW_func_var_designator_in_factor2161);
                    func_var_designator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:660:7: constant_expression
                    {
                    pushFollow(FOLLOW_constant_expression_in_factor2170);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:661:7: LPAREN simple_expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_factor2178); if (state.failed) return ;
                    pushFollow(FOLLOW_simple_expression_in_factor2180);
                    simple_expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_factor2182); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:662:7: SELF
                    {
                    match(input,SELF,FOLLOW_SELF_in_factor2190); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:663:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_factor2198); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:664:7: LINE_CONTINUATION
                    {
                    match(input,LINE_CONTINUATION,FOLLOW_LINE_CONTINUATION_in_factor2206); if (state.failed) return ;

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
    // $ANTLR end "factor"


    // $ANTLR start "func_var_designator"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:667:1: func_var_designator : IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN ;
    public final void func_var_designator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:5: ( IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:7: IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_var_designator2223); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:18: ( DOT IDENTIFIER )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==DOT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:19: DOT IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_func_var_designator2226); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_var_designator2228); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,LPAREN,FOLLOW_LPAREN_in_func_var_designator2232); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:43: ( expr ( COMMA expr )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENTIFIER||LA47_0==LPAREN||(LA47_0>=PLUS && LA47_0<=MINUS)||LA47_0==NEW||(LA47_0>=SELF && LA47_0<=NOT_TEST)||(LA47_0>=FLOAT && LA47_0<=INT)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:44: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_func_var_designator2235);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:49: ( COMMA expr )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==COMMA) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:668:50: COMMA expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_func_var_designator2238); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_func_var_designator2240);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_func_var_designator2247); if (state.failed) return ;

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
    // $ANTLR end "func_var_designator"


    // $ANTLR start "constant_expression"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:671:1: constant_expression : ( number | STRING_LITERAL | NOT_TEST factor );
    public final void constant_expression() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:672:2: ( number | STRING_LITERAL | NOT_TEST factor )
            int alt48=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case LONG:
            case INT:
                {
                alt48=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt48=2;
                }
                break;
            case NOT_TEST:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:672:4: number
                    {
                    pushFollow(FOLLOW_number_in_constant_expression2261);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:673:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant_expression2266); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:674:4: NOT_TEST factor
                    {
                    match(input,NOT_TEST,FOLLOW_NOT_TEST_in_constant_expression2271); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_constant_expression2273);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "constant_expression"


    // $ANTLR start "assignment"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:677:1: assignment : ( EQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL );
    public final void assignment() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:678:2: ( EQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
            {
            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLUSEQUAL && input.LA(1)<=VBAREQUAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "cast_or_function_call"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:686:1: cast_or_function_call : IDENTIFIER ( DOT IDENTIFIER )* ( LPAREN ( expression_list )? RPAREN | ( expression_list )? ) ;
    public final void cast_or_function_call() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:687:2: ( IDENTIFIER ( DOT IDENTIFIER )* ( LPAREN ( expression_list )? RPAREN | ( expression_list )? ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:687:4: IDENTIFIER ( DOT IDENTIFIER )* ( LPAREN ( expression_list )? RPAREN | ( expression_list )? )
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call2321); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:687:15: ( DOT IDENTIFIER )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==DOT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:687:16: DOT IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_cast_or_function_call2324); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call2326); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:688:2: ( LPAREN ( expression_list )? RPAREN | ( expression_list )? )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:689:2: LPAREN ( expression_list )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_cast_or_function_call2335); if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:689:9: ( expression_list )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==IDENTIFIER||LA50_0==LPAREN||(LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==NEW||(LA50_0>=SELF && LA50_0<=NOT_TEST)||(LA50_0>=FLOAT && LA50_0<=INT)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_cast_or_function_call2337);
                            expression_list();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_cast_or_function_call2340); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:691:3: ( expression_list )?
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:691:3: ( expression_list )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==IDENTIFIER||LA51_0==LPAREN||(LA51_0>=PLUS && LA51_0<=MINUS)||LA51_0==NEW||(LA51_0>=SELF && LA51_0<=NOT_TEST)||(LA51_0>=FLOAT && LA51_0<=INT)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_cast_or_function_call2348);
                            expression_list();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


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
    // $ANTLR end "cast_or_function_call"


    // $ANTLR start "expression_list"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:695:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:696:2: ( expression ( COMMA expression )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:696:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list2364);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:696:15: ( COMMA expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:696:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list2367); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_expression_list2369);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:699:1: while_block : WHILE expression NEWLINE statement_block WEND NEWLINE ;
    public final void while_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:700:2: ( WHILE expression NEWLINE statement_block WEND NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:700:4: WHILE expression NEWLINE statement_block WEND NEWLINE
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_block2382); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_while_block2384);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block2386); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_while_block2390);
            statement_block();

            state._fsp--;
            if (state.failed) return ;
            match(input,WEND,FOLLOW_WEND_in_while_block2394); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block2396); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:705:1: select_block : SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE ;
    public final void select_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:706:2: ( SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:706:4: SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_block2407); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_select_block2409);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block2411); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:707:3: ( case_block )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==CASE) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: case_block
            	    {
            	    pushFollow(FOLLOW_case_block_in_select_block2415);
            	    case_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:708:3: ( default_block )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DEFAULT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: default_block
                    {
                    pushFollow(FOLLOW_default_block_in_select_block2420);
                    default_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_end_select_in_select_block2425);
            end_select();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block2429); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:713:1: default_block : DEFAULT NEWLINE statement_block ;
    public final void default_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:714:2: ( DEFAULT NEWLINE statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:714:4: DEFAULT NEWLINE statement_block
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_default_block2440); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_default_block2442); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_default_block2446);
            statement_block();

            state._fsp--;
            if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:718:1: end_select : ( END SELECT | 'endselect' );
    public final void end_select() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:719:2: ( END SELECT | 'endselect' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==END) ) {
                alt56=1;
            }
            else if ( (LA56_0==128) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:719:4: END SELECT
                    {
                    match(input,END,FOLLOW_END_in_end_select2457); if (state.failed) return ;
                    match(input,SELECT,FOLLOW_SELECT_in_end_select2459); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:720:5: 'endselect'
                    {
                    match(input,128,FOLLOW_128_in_end_select2465); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:723:1: case_block : CASE expression ( COMMA expression )* NEWLINE statement_block ;
    public final void case_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:2: ( CASE expression ( COMMA expression )* NEWLINE statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:4: CASE expression ( COMMA expression )* NEWLINE statement_block
            {
            match(input,CASE,FOLLOW_CASE_in_case_block2476); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_case_block2478);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:20: ( COMMA expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_block2481); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_case_block2483);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            match(input,NEWLINE,FOLLOW_NEWLINE_in_case_block2487); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_case_block2491);
            statement_block();

            state._fsp--;
            if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:728:1: import_stmt returns [ Statement stmt = null ] : imp= IMPORT (l= string_literal | e= module_name ) NEWLINE ;
    public final Statement import_stmt() throws RecognitionException {
        Statement stmt =  null;

        Token imp=null;
        BlitzMaxStringLiteral l = null;

        BlitzMaxModuleNameExpression e = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:729:2: (imp= IMPORT (l= string_literal | e= module_name ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:729:4: imp= IMPORT (l= string_literal | e= module_name ) NEWLINE
            {
            imp=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_stmt2510); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:730:3: (l= string_literal | e= module_name )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==STRING_LITERAL) ) {
                alt58=1;
            }
            else if ( (LA58_0==IDENTIFIER) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:731:4: l= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_import_stmt2523);
                    l=string_literal();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      				stmt = new BlitzMaxImportStatement(imp, l);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:736:4: e= module_name
                    {
                    pushFollow(FOLLOW_module_name_in_import_stmt2541);
                    e=module_name();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      				stmt = new BlitzMaxImportStatement(imp, e);
                      			
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_import_stmt2554); if (state.failed) return stmt;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:744:1: include_stmt : INCLUDE STRING_LITERAL NEWLINE ;
    public final void include_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:745:2: ( INCLUDE STRING_LITERAL NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:745:4: INCLUDE STRING_LITERAL NEWLINE
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt2565); if (state.failed) return ;
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include_stmt2567); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_include_stmt2569); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:748:1: framework_stmt : FRAMEWORK module_name NEWLINE ;
    public final void framework_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:749:2: ( FRAMEWORK module_name NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:749:4: FRAMEWORK module_name NEWLINE
            {
            match(input,FRAMEWORK,FOLLOW_FRAMEWORK_in_framework_stmt2580); if (state.failed) return ;
            pushFollow(FOLLOW_module_name_in_framework_stmt2582);
            module_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_framework_stmt2584); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:752:1: module_stmt : MODULE module_name NEWLINE ;
    public final void module_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:753:2: ( MODULE module_name NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:753:4: MODULE module_name NEWLINE
            {
            match(input,MODULE,FOLLOW_MODULE_in_module_stmt2595); if (state.failed) return ;
            pushFollow(FOLLOW_module_name_in_module_stmt2597);
            module_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_module_stmt2599); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:756:1: moduleinfo_stmt : MODULEINFO STRING_LITERAL NEWLINE ;
    public final void moduleinfo_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:757:2: ( MODULEINFO STRING_LITERAL NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:757:4: MODULEINFO STRING_LITERAL NEWLINE
            {
            match(input,MODULEINFO,FOLLOW_MODULEINFO_in_moduleinfo_stmt2611); if (state.failed) return ;
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2613); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_moduleinfo_stmt2615); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:760:1: module_name returns [ BlitzMaxModuleNameExpression expr = null ] : (ns= IDENTIFIER DOT name= IDENTIFIER ) ;
    public final BlitzMaxModuleNameExpression module_name() throws RecognitionException {
        BlitzMaxModuleNameExpression expr =  null;

        Token ns=null;
        Token name=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:2: ( (ns= IDENTIFIER DOT name= IDENTIFIER ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:6: ns= IDENTIFIER DOT name= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2636); if (state.failed) return expr;
            match(input,DOT,FOLLOW_DOT_in_module_name2638); if (state.failed) return expr;
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2644); if (state.failed) return expr;

            }

            if ( state.backtracking==0 ) {

              			expr = new BlitzMaxModuleNameExpression(ns, name);
              		
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
        return expr;
    }
    // $ANTLR end "module_name"


    // $ANTLR start "debuglog_stmt"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:767:1: debuglog_stmt : DEBUGLOG expression NEWLINE ;
    public final void debuglog_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:768:2: ( DEBUGLOG expression NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:768:4: DEBUGLOG expression NEWLINE
            {
            match(input,DEBUGLOG,FOLLOW_DEBUGLOG_in_debuglog_stmt2660); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_debuglog_stmt2662);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_debuglog_stmt2664); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:771:1: if_block : IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE ;
    public final void if_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:772:2: ( IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:773:3: IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE
            {
            match(input,IF,FOLLOW_IF_in_if_block2678); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_if_block2680);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:774:3: ( THEN )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==THEN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: THEN
                    {
                    match(input,THEN,FOLLOW_THEN_in_if_block2684); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_block_in_if_block2692);
            statement_block();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:778:3: ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ELSE||LA62_0==129) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:779:4: ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:779:4: ( ELSE | 'elseif' expression ( THEN )? NEWLINE )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ELSE) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==129) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:780:5: ELSE
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_block2710); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:782:7: 'elseif' expression ( THEN )? NEWLINE
                            {
                            match(input,129,FOLLOW_129_in_if_block2724); if (state.failed) return ;
                            pushFollow(FOLLOW_expression_in_if_block2726);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:782:27: ( THEN )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==THEN) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: THEN
                                    {
                                    match(input,THEN,FOLLOW_THEN_in_if_block2728); if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,NEWLINE,FOLLOW_NEWLINE_in_if_block2731); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_if_block2745);
                    statement_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:788:3: ( END IF | 'endif' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==END) ) {
                alt63=1;
            }
            else if ( (LA63_0==130) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:789:4: END IF
                    {
                    match(input,END,FOLLOW_END_in_if_block2762); if (state.failed) return ;
                    match(input,IF,FOLLOW_IF_in_if_block2764); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:790:6: 'endif'
                    {
                    match(input,130,FOLLOW_130_in_if_block2771); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_if_block2779); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:844:1: pointer_def returns [int count = 0] : POINTER ( POINTER )* ;
    public final int pointer_def() throws RecognitionException {
        int count =  0;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:845:2: ( POINTER ( POINTER )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:845:4: POINTER ( POINTER )*
            {
            match(input,POINTER,FOLLOW_POINTER_in_pointer_def3085); if (state.failed) return count;
            if ( state.backtracking==0 ) {

              			count = 1;
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:849:3: ( POINTER )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==POINTER) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:850:4: POINTER
            	    {
            	    match(input,POINTER,FOLLOW_POINTER_in_pointer_def3099); if (state.failed) return count;
            	    if ( state.backtracking==0 ) {

            	      				count++;
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:858:1: byte_def returns [Expression exp = null] : t= BYTE_TYPE (c= pointer_def )? ;
    public final Expression byte_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:859:2: (t= BYTE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:859:4: t= BYTE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,BYTE_TYPE,FOLLOW_BYTE_TYPE_in_byte_def3131); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:860:5: (c= pointer_def )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==POINTER) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_byte_def3139);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.BYTE);
              		
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
        return exp;
    }
    // $ANTLR end "byte_def"


    // $ANTLR start "int_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:867:1: int_def returns [Expression exp = null] : t= INT_TYPE (c= pointer_def )? ;
    public final Expression int_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:868:2: (t= INT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:868:4: t= INT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_int_def3164); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:869:5: (c= pointer_def )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==POINTER) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_int_def3172);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.INT);
              		
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
        return exp;
    }
    // $ANTLR end "int_def"


    // $ANTLR start "short_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:875:1: short_def returns [Expression exp = null] : t= SHORT_TYPE (c= pointer_def )? ;
    public final Expression short_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:876:2: (t= SHORT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:876:4: t= SHORT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_short_def3196); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:877:5: (c= pointer_def )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==POINTER) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_short_def3204);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.SHORT);
              		
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
        return exp;
    }
    // $ANTLR end "short_def"


    // $ANTLR start "long_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:884:1: long_def returns [Expression exp = null] : t= LONG_TYPE (c= pointer_def )? ;
    public final Expression long_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:885:2: (t= LONG_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:885:4: t= LONG_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_long_def3229); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:886:5: (c= pointer_def )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==POINTER) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_long_def3237);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.LONG);
              		
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
        return exp;
    }
    // $ANTLR end "long_def"


    // $ANTLR start "float_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:893:1: float_def returns [Expression exp = null] : t= FLOAT_TYPE (c= pointer_def )? ;
    public final Expression float_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:894:2: (t= FLOAT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:894:4: t= FLOAT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_float_def3262); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:895:5: (c= pointer_def )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==POINTER) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_float_def3270);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.FLOAT);
              		
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
        return exp;
    }
    // $ANTLR end "float_def"


    // $ANTLR start "double_def"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:902:1: double_def returns [Expression exp = null] : t= DOUBLE_TYPE (c= pointer_def )? ;
    public final Expression double_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:903:2: (t= DOUBLE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:903:4: t= DOUBLE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_double_def3295); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:904:5: (c= pointer_def )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==POINTER) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_double_def3303);
                    c=pointer_def();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			exp = new BlitzMaxPrimitiveType(t, c, BlitzMaxType.DOUBLE);
              		
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
        return exp;
    }
    // $ANTLR end "double_def"


    // $ANTLR start "number"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1002:1: number returns [ Literal num = null ] : (n= FLOAT | n= LONG | n= INT ) ;
    public final Literal number() throws RecognitionException {
        Literal num =  null;

        Token n=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1003:2: ( (n= FLOAT | n= LONG | n= INT ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1007:3: (n= FLOAT | n= LONG | n= INT )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1007:3: (n= FLOAT | n= LONG | n= INT )
            int alt71=3;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt71=1;
                }
                break;
            case LONG:
                {
                alt71=2;
                }
                break;
            case INT:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return num;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1007:4: n= FLOAT
                    {
                    n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number3855); if (state.failed) return num;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1008:5: n= LONG
                    {
                    n=(Token)match(input,LONG,FOLLOW_LONG_in_number3865); if (state.failed) return num;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1009:5: n= INT
                    {
                    n=(Token)match(input,INT,FOLLOW_INT_in_number3875); if (state.failed) return num;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			num = new BlitzMaxNumericLiteral(null, n);
              		
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
        return num;
    }
    // $ANTLR end "number"


    // $ANTLR start "string_literal"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1068:1: string_literal returns [BlitzMaxStringLiteral str = null] : e= STRING_LITERAL ;
    public final BlitzMaxStringLiteral string_literal() throws RecognitionException {
        BlitzMaxStringLiteral str =  null;

        Token e=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1069:2: (e= STRING_LITERAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1069:4: e= STRING_LITERAL
            {
            e=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal4214); if (state.failed) return str;
            if ( state.backtracking==0 ) {

              			str = new BlitzMaxStringLiteral(e);
              		
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
        return str;
    }
    // $ANTLR end "string_literal"

    // $ANTLR start synpred65_blitzmax
    public final void synpred65_blitzmax_fragment() throws RecognitionException {   
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:528:5: ( . )
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:528:5: .
        {
        matchAny(input); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_blitzmax

    // $ANTLR start synpred108_blitzmax
    public final void synpred108_blitzmax_fragment() throws RecognitionException {   
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:689:2: ( LPAREN ( expression_list )? RPAREN )
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:689:2: LPAREN ( expression_list )? RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred108_blitzmax2335); if (state.failed) return ;
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:689:9: ( expression_list )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==IDENTIFIER||LA82_0==LPAREN||(LA82_0>=PLUS && LA82_0<=MINUS)||LA82_0==NEW||(LA82_0>=SELF && LA82_0<=NOT_TEST)||(LA82_0>=FLOAT && LA82_0<=INT)) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:0:0: expression_list
                {
                pushFollow(FOLLOW_expression_list_in_synpred108_blitzmax2337);
                expression_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred108_blitzmax2340); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_blitzmax

    // Delegated rules

    public final boolean synpred108_blitzmax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_blitzmax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_blitzmax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_blitzmax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA13_eotS =
        "\21\uffff";
    static final String DFA13_eofS =
        "\21\uffff";
    static final String DFA13_minS =
        "\1\5\14\uffff\1\5\3\uffff";
    static final String DFA13_maxS =
        "\1\117\14\uffff\1\162\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\17\1\16\1\15";
    static final String DFA13_specialS =
        "\21\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\16\2\uffff\1\15\3\uffff\1\13\2\uffff\1\6\1\5\1\7\1\uffff"+
            "\1\12\1\14\16\uffff\1\10\1\2\5\uffff\1\4\31\uffff\1\3\5\uffff"+
            "\1\1\4\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\2\uffff\1\20\14\uffff\1\20\13\uffff\1\17\17\uffff\2\20"+
            "\5\uffff\7\20\5\17\54\uffff\3\20",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "363:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | END NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE );";
        }
    }
    static final String DFA25_eotS =
        "\50\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\10\1\uffff\4\10\2\uffff\11\10\1\uffff\1\10\1\uffff\5"+
        "\10\3\uffff\2\10\3\uffff\6\10";
    static final String DFA25_minS =
        "\1\10\1\5\1\10\4\5\2\uffff\11\5\1\37\1\5\1\37\5\5\3\37\2\5\3\37"+
        "\6\5";
    static final String DFA25_maxS =
        "\1\10\1\41\1\132\4\42\2\uffff\6\133\3\42\1\162\1\133\1\162\5\133"+
        "\3\37\1\42\1\133\3\37\1\42\5\133";
    static final String DFA25_acceptS =
        "\7\uffff\1\2\1\1\37\uffff";
    static final String DFA25_specialS =
        "\50\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\10\17\uffff\1\7\1\10\1\2\2\uffff\1\3\1\4\1\5\1\6\2\uffff"+
            "\2\10",
            "\1\21\17\uffff\1\17\1\20\73\uffff\1\12\1\11\1\13\1\14\1\15"+
            "\1\16",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\22\1\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\22\1\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\22\1\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\22\1\uffff\3\10",
            "",
            "",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\23",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\25",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\26",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\27",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\30",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\31",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10",
            "\1\35\120\uffff\1\32\1\33\1\34",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\36",
            "\1\42\120\uffff\1\37\1\40\1\41",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\43",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\44",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\45",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\46",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\47",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\10\17\uffff\1\7\1\10\11\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\36",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\10\17\uffff\1\7\1\10\11\uffff\3\10",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\43",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\44",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\45",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\46",
            "\1\10\17\uffff\1\7\1\10\7\uffff\1\24\1\uffff\3\10\70\uffff"+
            "\1\47"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "483:1: argument[boolean functionArg] returns [ Declaration arg = null ] : (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition );";
        }
    }
    static final String DFA27_eotS =
        "\50\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\7\1\uffff\4\7\2\uffff\11\7\1\uffff\1\7\1\uffff\5\7\3"+
        "\uffff\2\7\3\uffff\6\7";
    static final String DFA27_minS =
        "\1\10\1\5\1\10\4\5\2\uffff\11\5\1\37\1\5\1\37\5\5\3\37\2\5\3\37"+
        "\6\5";
    static final String DFA27_maxS =
        "\1\10\1\41\1\132\4\42\2\uffff\6\133\3\42\1\162\1\133\1\162\5\133"+
        "\3\37\1\42\1\133\3\37\1\42\5\133";
    static final String DFA27_acceptS =
        "\7\uffff\1\1\1\2\37\uffff";
    static final String DFA27_specialS =
        "\50\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\7\17\uffff\1\10\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\3\uffff"+
            "\1\7",
            "\1\21\17\uffff\1\17\1\20\73\uffff\1\12\1\11\1\13\1\14\1\15"+
            "\1\16",
            "\1\7\17\uffff\1\10\10\uffff\1\22\2\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\22\2\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\22\2\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\22\2\uffff\2\7",
            "",
            "",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\23",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\25",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\26",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\27",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\30",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\31",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7",
            "\1\35\120\uffff\1\32\1\33\1\34",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\36",
            "\1\42\120\uffff\1\37\1\40\1\41",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\43",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\44",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\45",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\46",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\47",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\7\17\uffff\1\10\13\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\36",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\7\17\uffff\1\10\13\uffff\2\7",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\43",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\44",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\45",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\46",
            "\1\7\17\uffff\1\10\10\uffff\1\24\2\uffff\2\7\70\uffff\1\47"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "491:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition );";
        }
    }
    static final String DFA44_eotS =
        "\13\uffff";
    static final String DFA44_eofS =
        "\2\uffff\1\1\7\uffff\1\1";
    static final String DFA44_minS =
        "\1\10\1\uffff\1\5\5\uffff\1\10\1\uffff\1\5";
    static final String DFA44_maxS =
        "\1\162\1\uffff\1\u0082\5\uffff\1\10\1\uffff\1\u0082";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\2\1\uffff";
    static final String DFA44_specialS =
        "\13\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\14\uffff\1\4\42\uffff\1\1\1\uffff\1\5\1\6\1\7\2\3\61\uffff"+
            "\3\3",
            "",
            "\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\3\1\1\uffff\2\1\1\11\1"+
            "\1\11\uffff\2\1\1\uffff\5\1\2\uffff\1\1\1\uffff\14\1\1\uffff"+
            "\1\10\12\uffff\1\1\5\uffff\1\1\4\uffff\3\1\57\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\3\1\1\uffff\2\1\1\11\1"+
            "\1\11\uffff\2\1\1\uffff\5\1\2\uffff\1\1\1\uffff\14\1\1\uffff"+
            "\1\10\12\uffff\1\1\5\uffff\1\1\4\uffff\3\1\57\uffff\2\1"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "657:1: factor : ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION );";
        }
    }
    static final String DFA52_eotS =
        "\17\uffff";
    static final String DFA52_eofS =
        "\17\uffff";
    static final String DFA52_minS =
        "\1\5\1\0\15\uffff";
    static final String DFA52_maxS =
        "\1\162\1\0\15\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\15\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\2\uffff\1\2\14\uffff\1\1\33\uffff\2\2\5\uffff\1\2\1\uffff"+
            "\5\2\61\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "688:2: ( LPAREN ( expression_list )? RPAREN | ( expression_list )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_blitzmax()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_main_statements_in_file_input86 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE10L});
    public static final BitSet FOLLOW_EOF_in_file_input116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPERSTRICT_in_main_statements129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICT_in_main_statements142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_framework_stmt_in_main_statements159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_stmt_in_main_statements165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleinfo_stmt_in_main_statements171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_main_statements181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_block_in_main_statements196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_block_in_main_statements211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_main_statements222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_block242 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block250 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_EXTENDS_in_type_block263 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block272 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_type_block292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_type_block308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block329 = new BitSet(new long[]{0x000000080005F020L,0x1000000000000000L});
    public static final BitSet FOLLOW_type_content_list_in_type_block340 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000000L});
    public static final BitSet FOLLOW_END_in_type_block357 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TYPE_in_type_block359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_124_in_type_block367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_type_content_list397 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_global_def_in_type_content_list405 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_field_def_in_type_content_list413 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_method_block_in_type_content_list425 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_function_block_in_type_content_list442 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_rem_block_in_type_content_list455 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_NEWLINE_in_type_content_list462 = new BitSet(new long[]{0x000000080005E022L});
    public static final BitSet FOLLOW_METHOD_in_method_block487 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_function_definition_in_method_block495 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_block506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_method_block529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block549 = new BitSet(new long[]{0x00000418001F91F0L,0x200000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_method_block557 = new BitSet(new long[]{0x0000000000001000L,0x2000000000000000L});
    public static final BitSet FOLLOW_END_in_method_block572 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_METHOD_in_method_block574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_125_in_method_block582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_field_def609 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_field_def618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_field_def628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_global_def641 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_global_def650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_global_def660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_const_def673 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_const_def681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_const_def691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_local_def705 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_local_def713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_local_def723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block742 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_function_definition_in_function_block750 = new BitSet(new long[]{0x00000418001F91F0L,0x400000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_function_block763 = new BitSet(new long[]{0x0000000000001000L,0x4000000000000000L});
    public static final BitSet FOLLOW_END_in_function_block778 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_126_in_function_block788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_function_block798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_statement_block830 = new BitSet(new long[]{0x00000418001F91F2L,0x000000000000BE10L});
    public static final BitSet FOLLOW_include_stmt_in_statement_list869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_block_in_statement_list879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_block_in_statement_list890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_block_in_statement_list896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_statement_list902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_def_in_statement_list909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_def_in_statement_list916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rem_block_in_statement_list923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_block_in_statement_list929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGSTOP_in_statement_list935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_statement_list943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement_list951 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_statement_list953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_or_function_call_in_statement_list961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement_list969 = new BitSet(new long[]{0x8000000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_assignment_in_statement_list971 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_statement_list973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition1007 = new BitSet(new long[]{0x000000003CA00000L});
    public static final BitSet FOLLOW_typedef_in_function_definition1015 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_function_definition1020 = new BitSet(new long[]{0x0000000000400100L});
    public static final BitSet FOLLOW_argument_list_in_function_definition1028 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_function_definition1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typedef1076 = new BitSet(new long[]{0x0000000003000100L,0x0000000007E00000L});
    public static final BitSet FOLLOW_named_type_in_typedef1086 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_type_in_typedef1132 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_def_in_named_type1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_def_in_named_type1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_def_in_named_type1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_def_in_named_type1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_def_in_named_type1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_def_in_named_type1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_named_type1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_TYPE_in_named_type1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_type1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_type1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_symbol_type1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_symbol_type1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_symbol_type1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_symbol_type1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_type1379 = new BitSet(new long[]{0x0000000080000000L,0x0007000000000000L});
    public static final BitSet FOLLOW_number_in_array_type1382 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACK_in_array_type1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argument_list1406 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list1417 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_in_argument_list1423 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_variable_def_in_argument1455 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQUAL_in_argument1459 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_simple_expression_in_argument1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_argument1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_def_in_variable_definition1493 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_NEWLINE_in_variable_definition1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_variable_definition1501 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_simple_expression_in_variable_definition1506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_variable_definition1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_variable_definition1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_def1541 = new BitSet(new long[]{0x000000003C800002L});
    public static final BitSet FOLLOW_typedef_in_variable_def1551 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VAR_in_variable_def1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block1611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_rem_block1613 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_rem_block_contents_in_rem_block1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_rem_block_contents1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_rem_block_contents1643 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_rem_block_contents1646 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_rem_block_contents_in_rem_block_contents1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block_contents1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_block1682 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_LOCAL_in_for_block1687 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_def_in_for_block1697 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQUAL_in_for_block1703 = new BitSet(new long[]{0x7D06010000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_for_block1723 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_TO_in_for_block1737 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_UNTIL_in_for_block1752 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_for_block1777 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_STEP_in_for_block1791 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_for_block1803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EACHIN_in_for_block1833 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_for_block1851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1871 = new BitSet(new long[]{0x00000618001F91F0L,0x000000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_for_block1879 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEXT_in_for_block1888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat_block1902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1904 = new BitSet(new long[]{0x00000C58001F91F0L,0x000000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_repeat_block1912 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_FOREVER_in_repeat_block1917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_UNTIL_in_repeat_block1921 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_repeat_block1923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_expr1959 = new BitSet(new long[]{0x0001F00200000002L});
    public static final BitSet FOLLOW_set_in_expr1966 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_simple_expression_in_expr1991 = new BitSet(new long[]{0x0001F00200000002L});
    public static final BitSet FOLLOW_term_in_simple_expression2011 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_adding_operator_in_simple_expression2015 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_term_in_simple_expression2017 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_set_in_adding_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_factor_in_term2062 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_multiplying_operator_in_term2066 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_signed_factor_in_term2068 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_set_in_multiplying_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_factor2117 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_factor_in_signed_factor2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_factor2143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_factor2147 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DOT_in_factor2149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_factor2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_var_designator_in_factor2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_expression_in_factor2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factor2178 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_simple_expression_in_factor2180 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_factor2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_factor2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_factor2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_CONTINUATION_in_factor2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_func_var_designator2223 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_DOT_in_func_var_designator2226 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_func_var_designator2228 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_func_var_designator2232 = new BitSet(new long[]{0x7D06000000600100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expr_in_func_var_designator2235 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_COMMA_in_func_var_designator2238 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expr_in_func_var_designator2240 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_RPAREN_in_func_var_designator2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant_expression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant_expression2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_TEST_in_constant_expression2271 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_factor_in_constant_expression2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call2321 = new BitSet(new long[]{0x7F06000000200102L,0x0007000000000000L});
    public static final BitSet FOLLOW_DOT_in_cast_or_function_call2324 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call2326 = new BitSet(new long[]{0x7F06000000200102L,0x0007000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast_or_function_call2335 = new BitSet(new long[]{0x7D06000000600100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call2337 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_cast_or_function_call2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list2364 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list2367 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_expression_list2369 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_WHILE_in_while_block2382 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_while_block2384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block2386 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE30L});
    public static final BitSet FOLLOW_statement_block_in_while_block2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_WEND_in_while_block2394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_block2407 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_select_block2409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block2411 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000180L,0x0000000000000001L});
    public static final BitSet FOLLOW_case_block_in_select_block2415 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000180L,0x0000000000000001L});
    public static final BitSet FOLLOW_default_block_in_select_block2420 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000180L,0x0000000000000001L});
    public static final BitSet FOLLOW_end_select_in_select_block2425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_block2440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_default_block2442 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_default_block2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_select2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SELECT_in_end_select2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_end_select2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_block2476 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_case_block2478 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_COMMA_in_case_block2481 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_case_block2483 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_NEWLINE_in_case_block2487 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE10L});
    public static final BitSet FOLLOW_statement_block_in_case_block2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_stmt2510 = new BitSet(new long[]{0x2000000000000100L});
    public static final BitSet FOLLOW_string_literal_in_import_stmt2523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_module_name_in_import_stmt2541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_import_stmt2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt2565 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include_stmt2567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_include_stmt2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAMEWORK_in_framework_stmt2580 = new BitSet(new long[]{0x2000000000000100L});
    public static final BitSet FOLLOW_module_name_in_framework_stmt2582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_framework_stmt2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_stmt2595 = new BitSet(new long[]{0x2000000000000100L});
    public static final BitSet FOLLOW_module_name_in_module_stmt2597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_module_stmt2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULEINFO_in_moduleinfo_stmt2611 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_moduleinfo_stmt2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2636 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DOT_in_module_name2638 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGLOG_in_debuglog_stmt2660 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_debuglog_stmt2662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_debuglog_stmt2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_block2678 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_if_block2680 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000003BE10L,0x0000000000000006L});
    public static final BitSet FOLLOW_THEN_in_if_block2684 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000002BE10L,0x0000000000000006L});
    public static final BitSet FOLLOW_statement_block_in_if_block2692 = new BitSet(new long[]{0x0000000000001000L,0x0000000000020000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ELSE_in_if_block2710 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE10L,0x0000000000000004L});
    public static final BitSet FOLLOW_129_in_if_block2724 = new BitSet(new long[]{0x7D06000000200100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_in_if_block2726 = new BitSet(new long[]{0x0000000000000020L,0x0000000000010000L});
    public static final BitSet FOLLOW_THEN_in_if_block2728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_block2731 = new BitSet(new long[]{0x00000418001F91F0L,0x000000000000BE10L,0x0000000000000004L});
    public static final BitSet FOLLOW_statement_block_in_if_block2745 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_END_in_if_block2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_if_block2764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_130_in_if_block2771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_block2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def3085 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def3099 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_BYTE_TYPE_in_byte_def3131 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_byte_def3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_int_def3164 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_int_def3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_short_def3196 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_short_def3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_long_def3229 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_long_def3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_float_def3262 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_float_def3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_double_def3295 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_pointer_def_in_double_def3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_number3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_number3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred108_blitzmax2335 = new BitSet(new long[]{0x7D06000000600100L,0x0007000000000000L});
    public static final BitSet FOLLOW_expression_list_in_synpred108_blitzmax2337 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred108_blitzmax2340 = new BitSet(new long[]{0x0000000000000002L});

}