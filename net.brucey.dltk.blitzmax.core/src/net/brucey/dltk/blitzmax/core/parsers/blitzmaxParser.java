// $ANTLR 3.1.2 /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g 2009-07-19 16:45:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUPERSTRICT", "NEWLINE", "STRICT", "TYPE", "IDENTIFIER", "EXTENDS", "ABSTRACT", "FINAL", "END", "METHOD", "NEW", "LPAREN", "RPAREN", "DELETE", "FIELD", "GLOBAL", "CONST", "LOCAL", "FUNCTION", "DEBUGSTOP", "RETURN", "COLON", "STRING_TYPE", "OBJECT_TYPE", "PERCENT", "POUND", "BANG", "DOLLAR", "LBRACK", "RBRACK", "COMMA", "EQUAL", "VAR", "REM", "FOR", "TO", "UNTIL", "STEP", "EACHIN", "NEXT", "REPEAT", "FOREVER", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATEREQUAL", "GREATER", "PLUS", "MINUS", "OR_TEST", "STAR", "SLASH", "MOD", "AND_TEST", "DOT", "SELF", "NULL", "LINE_CONTINUATION", "TRUE", "FALSE", "STRING_LITERAL", "NOT_TEST", "PLUSEQUAL", "MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "VBAREQUAL", "WHILE", "WEND", "SELECT", "DEFAULT", "CASE", "IMPORT", "INCLUDE", "FRAMEWORK", "MODULE", "MODULEINFO", "DEBUGLOG", "IF", "THEN", "ELSE", "EXTERN", "LONG_TYPE", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "BYTE_TYPE", "SHORT_TYPE", "POINTER", "SUPER", "CONTINUE", "TRY", "CATCH", "THROW", "ASSERT", "EXIT", "INCBIN", "INCBINPTR", "INCBINLEN", "SEMI", "VBAR", "AMPER", "POWER", "TILDE", "UNDERSCORE", "LEFTSHIFT", "RIGHTSHIFT", "ARITHRIGHTSHIFT", "FLOAT", "LONG", "INT", "POINTFLOAT", "EXPONENTFLOAT", "DIGITS", "FRACTION", "Exponent", "DIGIT", "ALPHA_LOWER", "ALPHA_UPPER", "WHITESPACE", "'endtype'", "'endmethod'", "'endfunction'", "'endrem'", "'endselect'", "'elseif'", "'endif'"
    };
    public static final int COMMA=34;
    public static final int CONST=20;
    public static final int MINUS=52;
    public static final int END=12;
    public static final int ARITHRIGHTSHIFT=111;
    public static final int BANG=30;
    public static final int METHOD=13;
    public static final int FALSE=63;
    public static final int FRACTION=118;
    public static final int ABSTRACT=10;
    public static final int THEN=83;
    public static final int STEP=41;
    public static final int TILDE=107;
    public static final int IMPORT=76;
    public static final int CONTINUE=94;
    public static final int NEWLINE=5;
    public static final int DOT=58;
    public static final int WEND=72;
    public static final int TO=39;
    public static final int PLUSEQUAL=66;
    public static final int T__128=128;
    public static final int FUNCTION=22;
    public static final int LOCAL=21;
    public static final int GLOBAL=19;
    public static final int INCLUDE=77;
    public static final int STRING_LITERAL=64;
    public static final int SELECT=73;
    public static final int DOUBLE_TYPE=89;
    public static final int MODULE=79;
    public static final int UNTIL=40;
    public static final int RPAREN=16;
    public static final int ASSERT=98;
    public static final int SUPERSTRICT=4;
    public static final int PLUS=51;
    public static final int EXTENDS=9;
    public static final int SUPER=93;
    public static final int EXTERN=85;
    public static final int SHORT_TYPE=91;
    public static final int NEW=14;
    public static final int T__130=130;
    public static final int FINAL=11;
    public static final int POINTFLOAT=115;
    public static final int DOLLAR=31;
    public static final int FOREVER=45;
    public static final int REPEAT=44;
    public static final int FIELD=18;
    public static final int LONG_TYPE=86;
    public static final int LBRACK=32;
    public static final int SEMI=103;
    public static final int CATCH=96;
    public static final int EXPONENTFLOAT=116;
    public static final int CASE=75;
    public static final int BYTE_TYPE=90;
    public static final int EQUAL=35;
    public static final int ELSE=84;
    public static final int T__125=125;
    public static final int LESSEQUAL=48;
    public static final int SELF=59;
    public static final int NULL=60;
    public static final int COLON=25;
    public static final int AMPER=105;
    public static final int POINTER=92;
    public static final int IDENTIFIER=8;
    public static final int T__124=124;
    public static final int TRUE=62;
    public static final int POUND=29;
    public static final int DEBUGSTOP=23;
    public static final int UNDERSCORE=108;
    public static final int THROW=97;
    public static final int TYPE=7;
    public static final int STRING_TYPE=26;
    public static final int LONG=113;
    public static final int PERCENT=28;
    public static final int FLOAT=112;
    public static final int MODULEINFO=80;
    public static final int T__126=126;
    public static final int SLASHEQUAL=69;
    public static final int MOD=56;
    public static final int STRICT=6;
    public static final int NOTEQUAL=46;
    public static final int LESS=47;
    public static final int ALPHA_LOWER=121;
    public static final int INT=114;
    public static final int T__127=127;
    public static final int VBAR=104;
    public static final int LPAREN=15;
    public static final int GREATER=50;
    public static final int DIGIT=120;
    public static final int EXIT=99;
    public static final int INT_TYPE=87;
    public static final int DELETE=17;
    public static final int FRAMEWORK=78;
    public static final int Exponent=119;
    public static final int OBJECT_TYPE=27;
    public static final int NOT_TEST=65;
    public static final int DIGITS=117;
    public static final int SLASH=55;
    public static final int POWER=106;
    public static final int WHILE=71;
    public static final int AND_TEST=57;
    public static final int INCBIN=100;
    public static final int REM=37;
    public static final int LINE_CONTINUATION=61;
    public static final int FLOAT_TYPE=88;
    public static final int T__129=129;
    public static final int WHITESPACE=123;
    public static final int VAR=36;
    public static final int DEBUGLOG=81;
    public static final int NEXT=43;
    public static final int INCBINPTR=101;
    public static final int RETURN=24;
    public static final int RIGHTSHIFT=110;
    public static final int MINUSEQUAL=67;
    public static final int INCBINLEN=102;
    public static final int IF=82;
    public static final int EOF=-1;
    public static final int ALPHA_UPPER=122;
    public static final int FOR=38;
    public static final int RBRACK=33;
    public static final int OR_TEST=53;
    public static final int GREATEREQUAL=49;
    public static final int DEFAULT=74;
    public static final int STAR=54;
    public static final int STAREQUAL=68;
    public static final int VBAREQUAL=70;
    public static final int TRY=95;
    public static final int LEFTSHIFT=109;
    public static final int EACHIN=42;

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

                if ( ((LA1_0>=SUPERSTRICT && LA1_0<=IDENTIFIER)||(LA1_0>=GLOBAL && LA1_0<=RETURN)||(LA1_0>=REM && LA1_0<=FOR)||LA1_0==REPEAT||LA1_0==WHILE||(LA1_0>=IMPORT && LA1_0<=MODULEINFO)||LA1_0==IF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:100:7: main_statements[decl.getStatements()]
            	    {
            	    pushFollow(FOLLOW_main_statements_in_file_input79);
            	    main_statements(decl.getStatements());

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file_input109); if (state.failed) return ;

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
                            match(input,SUPERSTRICT,FOLLOW_SUPERSTRICT_in_main_statements122); if (state.failed) return ;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements124); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              				statements.add(new BlitzMaxStrictExpression(true));
                              			
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:122:5: STRICT NEWLINE
                            {
                            match(input,STRICT,FOLLOW_STRICT_in_main_statements135); if (state.failed) return ;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_main_statements137); if (state.failed) return ;
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
                    pushFollow(FOLLOW_framework_stmt_in_main_statements152);
                    framework_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:128:5: module_stmt
                    {
                    pushFollow(FOLLOW_module_stmt_in_main_statements158);
                    module_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:129:5: moduleinfo_stmt
                    {
                    pushFollow(FOLLOW_moduleinfo_stmt_in_main_statements164);
                    moduleinfo_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:130:5: s1= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_main_statements174);
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
                    pushFollow(FOLLOW_type_block_in_main_statements189);
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
                    pushFollow(FOLLOW_function_block_in_main_statements204);
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
                    pushFollow(FOLLOW_statement_list_in_main_statements215);
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
            t=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_block235); if (state.failed) return typeDeclaration;
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block243); if (state.failed) return typeDeclaration;
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
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_type_block256); if (state.failed) return typeDeclaration;
                    sup=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_block265); if (state.failed) return typeDeclaration;
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
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_type_block285); if (state.failed) return typeDeclaration;
                    if ( state.backtracking==0 ) {

                      				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccAbstract);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:167:5: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_type_block301); if (state.failed) return typeDeclaration;
                    if ( state.backtracking==0 ) {

                      				typeDeclaration.setModifiers(typeDeclaration.getModifiers() | Modifiers.AccFinal);
                      			
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block322); if (state.failed) return typeDeclaration;
            pushFollow(FOLLOW_type_content_list_in_type_block333);
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
                    et=(Token)match(input,END,FOLLOW_END_in_type_block350); if (state.failed) return typeDeclaration;
                    match(input,TYPE,FOLLOW_TYPE_in_type_block352); if (state.failed) return typeDeclaration;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:181:21: et= 'endtype'
                    {
                    et=(Token)match(input,124,FOLLOW_124_in_type_block360); if (state.failed) return typeDeclaration;

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
            match(input,NEWLINE,FOLLOW_NEWLINE_in_type_block370); if (state.failed) return typeDeclaration;

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
            	    pushFollow(FOLLOW_const_def_in_type_content_list390);
            	    const_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:199:6: global_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_global_def_in_type_content_list398);
            	    global_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:200:6: field_def[typeContent.getStatements()]
            	    {
            	    pushFollow(FOLLOW_field_def_in_type_content_list406);
            	    field_def(typeContent.getStatements());

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 4 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:201:6: mb= method_block
            	    {
            	    pushFollow(FOLLOW_method_block_in_type_content_list418);
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
            	    pushFollow(FOLLOW_function_block_in_type_content_list435);
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
            	    pushFollow(FOLLOW_rem_block_in_type_content_list448);
            	    rem_block();

            	    state._fsp--;
            	    if (state.failed) return typeContent;

            	    }
            	    break;
            	case 7 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:210:6: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_type_content_list455); if (state.failed) return typeContent;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:214:1: method_block returns [ BlitzMaxMethodDeclaration methodDeclaration = null ] : m= METHOD ( (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN ) NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE ;
    public final BlitzMaxMethodDeclaration method_block() throws RecognitionException {
        BlitzMaxMethodDeclaration methodDeclaration =  null;

        Token m=null;
        Token n=null;
        Token rp=null;
        Token em=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:215:2: (m= METHOD ( (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN ) NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:215:4: m= METHOD ( (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN ) NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) ) NEWLINE
            {
            m=(Token)match(input,METHOD,FOLLOW_METHOD_in_method_block480); if (state.failed) return methodDeclaration;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:216:3: ( (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN ) NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:4: (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN ) NEWLINE b= statement_block (em= END METHOD | em= 'endmethod' )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:4: (fd= function_definition ( ABSTRACT | ( FINAL )? ) | n= NEW LPAREN rp= RPAREN | n= DELETE LPAREN rp= RPAREN )
            int alt10=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt10=1;
                }
                break;
            case NEW:
                {
                alt10=2;
                }
                break;
            case DELETE:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return methodDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:217:5: fd= function_definition ( ABSTRACT | ( FINAL )? )
                    {
                    pushFollow(FOLLOW_function_definition_in_method_block494);
                    fd=function_definition();

                    state._fsp--;
                    if (state.failed) return methodDeclaration;
                    if ( state.backtracking==0 ) {

                      					methodDeclaration = new BlitzMaxMethodDeclaration(m, fd);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:222:4: ( ABSTRACT | ( FINAL )? )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ABSTRACT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==NEWLINE||LA9_0==FINAL) ) {
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:222:6: ABSTRACT
                            {
                            match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_block511); if (state.failed) return methodDeclaration;
                            if ( state.backtracking==0 ) {

                              					methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccAbstract);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:228:4: ( FINAL )?
                            {
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:228:4: ( FINAL )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==FINAL) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:229:4: FINAL
                                    {
                                    match(input,FINAL,FOLLOW_FINAL_in_method_block539); if (state.failed) return methodDeclaration;
                                    if ( state.backtracking==0 ) {

                                      					methodDeclaration.setModifiers(methodDeclaration.getModifiers() | Modifiers.AccFinal);
                                      				
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:237:6: n= NEW LPAREN rp= RPAREN
                    {
                    n=(Token)match(input,NEW,FOLLOW_NEW_in_method_block575); if (state.failed) return methodDeclaration;
                    match(input,LPAREN,FOLLOW_LPAREN_in_method_block577); if (state.failed) return methodDeclaration;
                    rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_block583); if (state.failed) return methodDeclaration;
                    if ( state.backtracking==0 ) {

                      					methodDeclaration = new BlitzMaxMethodDeclaration(m, new BlitzMaxFunctionExpression(n, null, null, rp));
                      				
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:241:6: n= DELETE LPAREN rp= RPAREN
                    {
                    n=(Token)match(input,DELETE,FOLLOW_DELETE_in_method_block600); if (state.failed) return methodDeclaration;
                    match(input,LPAREN,FOLLOW_LPAREN_in_method_block602); if (state.failed) return methodDeclaration;
                    rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_block608); if (state.failed) return methodDeclaration;
                    if ( state.backtracking==0 ) {

                      					methodDeclaration = new BlitzMaxMethodDeclaration(m, new BlitzMaxFunctionExpression(n, null, null, rp));
                      				
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block622); if (state.failed) return methodDeclaration;
            pushFollow(FOLLOW_statement_block_in_method_block630);
            b=statement_block();

            state._fsp--;
            if (state.failed) return methodDeclaration;
            if ( state.backtracking==0 ) {

              				methodDeclaration.acceptBody(b, true);
              			
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:251:3: (em= END METHOD | em= 'endmethod' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==END) ) {
                alt11=1;
            }
            else if ( (LA11_0==125) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return methodDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:251:5: em= END METHOD
                    {
                    em=(Token)match(input,END,FOLLOW_END_in_method_block645); if (state.failed) return methodDeclaration;
                    match(input,METHOD,FOLLOW_METHOD_in_method_block647); if (state.failed) return methodDeclaration;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:251:23: em= 'endmethod'
                    {
                    em=(Token)match(input,125,FOLLOW_125_in_method_block655); if (state.failed) return methodDeclaration;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			methodDeclaration.setEnd(((CommonToken) em).getStopIndex()+1);
              		
            }

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_method_block669); if (state.failed) return methodDeclaration;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:259:1: field_def[List statements] : FIELD args= argument_list[false] NEWLINE ;
    public final void field_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:260:2: ( FIELD args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:260:4: FIELD args= argument_list[false] NEWLINE
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_def682); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_field_def691);
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
            match(input,NEWLINE,FOLLOW_NEWLINE_in_field_def701); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:272:1: global_def[List statements] : GLOBAL args= argument_list[false] NEWLINE ;
    public final void global_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:273:2: ( GLOBAL args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:273:4: GLOBAL args= argument_list[false] NEWLINE
            {
            match(input,GLOBAL,FOLLOW_GLOBAL_in_global_def714); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_global_def723);
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
            match(input,NEWLINE,FOLLOW_NEWLINE_in_global_def733); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:285:1: const_def[List statements] : CONST args= argument_list[false] NEWLINE ;
    public final void const_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:286:2: ( CONST args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:286:4: CONST args= argument_list[false] NEWLINE
            {
            match(input,CONST,FOLLOW_CONST_in_const_def746); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_const_def754);
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
            match(input,NEWLINE,FOLLOW_NEWLINE_in_const_def764); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:298:1: local_def[List statements] : LOCAL args= argument_list[false] NEWLINE ;
    public final void local_def(List statements) throws RecognitionException {
        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:299:2: ( LOCAL args= argument_list[false] NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:299:4: LOCAL args= argument_list[false] NEWLINE
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_def778); if (state.failed) return ;
            pushFollow(FOLLOW_argument_list_in_local_def786);
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
            match(input,NEWLINE,FOLLOW_NEWLINE_in_local_def796); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:311:1: function_block returns [ BlitzMaxFunctionDeclaration functionDeclaration = null ] : f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE ;
    public final BlitzMaxFunctionDeclaration function_block() throws RecognitionException {
        BlitzMaxFunctionDeclaration functionDeclaration =  null;

        Token f=null;
        Token ef=null;
        BlitzMaxFunctionExpression fd = null;

        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:312:2: (f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:312:4: f= FUNCTION fd= function_definition b= statement_block (ef= END FUNCTION | ef= 'endfunction' ) NEWLINE
            {
            f=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block815); if (state.failed) return functionDeclaration;
            pushFollow(FOLLOW_function_definition_in_function_block823);
            fd=function_definition();

            state._fsp--;
            if (state.failed) return functionDeclaration;
            if ( state.backtracking==0 ) {

              				functionDeclaration = new BlitzMaxFunctionDeclaration(f, fd);
              			
            }
            pushFollow(FOLLOW_statement_block_in_function_block836);
            b=statement_block();

            state._fsp--;
            if (state.failed) return functionDeclaration;
            if ( state.backtracking==0 ) {

              				functionDeclaration.acceptBody(b, true);
              			
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:321:3: (ef= END FUNCTION | ef= 'endfunction' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==END) ) {
                alt12=1;
            }
            else if ( (LA12_0==126) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return functionDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:321:5: ef= END FUNCTION
                    {
                    ef=(Token)match(input,END,FOLLOW_END_in_function_block851); if (state.failed) return functionDeclaration;
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_function_block853); if (state.failed) return functionDeclaration;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:321:25: ef= 'endfunction'
                    {
                    ef=(Token)match(input,126,FOLLOW_126_in_function_block861); if (state.failed) return functionDeclaration;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			functionDeclaration.setEnd(((CommonToken) ef).getStopIndex()+1);
              		
            }
            match(input,NEWLINE,FOLLOW_NEWLINE_in_function_block871); if (state.failed) return functionDeclaration;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:328:1: statement_block returns [ BlitzMaxBlock statement = new BlitzMaxBlock() ] : ( ( statement_list[statement.getStatements()] )* ) ;
    public final BlitzMaxBlock statement_block() throws RecognitionException {
        BlitzMaxBlock statement =  new BlitzMaxBlock();


        		  	int startPos = -1;
        		  	int endPos = -1;
        		
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:333:2: ( ( ( statement_list[statement.getStatements()] )* ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:334:3: ( ( statement_list[statement.getStatements()] )* )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:334:3: ( ( statement_list[statement.getStatements()] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:335:4: ( statement_list[statement.getStatements()] )*
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:335:4: ( statement_list[statement.getStatements()] )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==NEWLINE||LA13_0==IDENTIFIER||(LA13_0>=GLOBAL && LA13_0<=LOCAL)||(LA13_0>=DEBUGSTOP && LA13_0<=RETURN)||(LA13_0>=REM && LA13_0<=FOR)||LA13_0==REPEAT||LA13_0==WHILE||LA13_0==INCLUDE||LA13_0==IF) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:336:5: statement_list[statement.getStatements()]
            	    {
            	    pushFollow(FOLLOW_statement_list_in_statement_block903);
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
            	    break loop13;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:375:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE );
    public final void statement_list(List statements) throws RecognitionException {
        BlitzMaxForStatement s2 = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:376:2: ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE )
            int alt14=14;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:376:4: include_stmt
                    {
                    pushFollow(FOLLOW_include_stmt_in_statement_list942);
                    include_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:377:5: s2= for_block
                    {
                    pushFollow(FOLLOW_for_block_in_statement_list952);
                    s2=for_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				statements.add(s2);
                      			
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:381:5: while_block
                    {
                    pushFollow(FOLLOW_while_block_in_statement_list963);
                    while_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:382:5: repeat_block
                    {
                    pushFollow(FOLLOW_repeat_block_in_statement_list969);
                    repeat_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:383:5: const_def[statements]
                    {
                    pushFollow(FOLLOW_const_def_in_statement_list975);
                    const_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:384:5: global_def[statements]
                    {
                    pushFollow(FOLLOW_global_def_in_statement_list982);
                    global_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:385:5: local_def[statements]
                    {
                    pushFollow(FOLLOW_local_def_in_statement_list989);
                    local_def(statements);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:386:5: rem_block
                    {
                    pushFollow(FOLLOW_rem_block_in_statement_list996);
                    rem_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:387:5: if_block
                    {
                    pushFollow(FOLLOW_if_block_in_statement_list1002);
                    if_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:388:5: DEBUGSTOP NEWLINE
                    {
                    match(input,DEBUGSTOP,FOLLOW_DEBUGSTOP_in_statement_list1008); if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list1010); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:390:5: RETURN expression NEWLINE
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement_list1019); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement_list1021);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list1023); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:391:5: cast_or_function_call NEWLINE
                    {
                    pushFollow(FOLLOW_cast_or_function_call_in_statement_list1029);
                    cast_or_function_call();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list1031); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:392:5: IDENTIFIER assignment expression NEWLINE
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement_list1037); if (state.failed) return ;
                    pushFollow(FOLLOW_assignment_in_statement_list1039);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement_list1041);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list1043); if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:394:5: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement_list1052); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:397:1: function_definition returns [BlitzMaxFunctionExpression exp = null] : (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) ;
    public final BlitzMaxFunctionExpression function_definition() throws RecognitionException {
        BlitzMaxFunctionExpression exp =  null;

        Token name=null;
        Token rp=null;
        BlitzMaxTypedefExpression t = null;

        List<Declaration> args = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:398:2: ( (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:398:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:398:4: (name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:399:3: name= IDENTIFIER (t= typedef )? LPAREN (args= argument_list[true] )? rp= RPAREN
            {
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition1075); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:400:5: (t= typedef )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLON||(LA15_0>=PERCENT && LA15_0<=DOLLAR)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:400:5: t= typedef
                    {
                    pushFollow(FOLLOW_typedef_in_function_definition1083);
                    t=typedef();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            match(input,LPAREN,FOLLOW_LPAREN_in_function_definition1088); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:402:8: (args= argument_list[true] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:402:8: args= argument_list[true]
                    {
                    pushFollow(FOLLOW_argument_list_in_function_definition1096);
                    args=argument_list(true);

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition1106); if (state.failed) return exp;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:410:1: typedef returns [BlitzMaxTypedefExpression expr = null] : ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) ;
    public final BlitzMaxTypedefExpression typedef() throws RecognitionException {
        BlitzMaxTypedefExpression expr =  null;

        BlitzMaxTypeReference nt = null;



        			boolean at = false;
        		
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:414:2: ( ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:415:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:415:3: ( ( COLON nt= named_type ( array_type )? ) | (nt= symbol_type ( array_type )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=PERCENT && LA19_0<=DOLLAR)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:416:4: ( COLON nt= named_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:416:4: ( COLON nt= named_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:416:5: COLON nt= named_type ( array_type )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_typedef1144); if (state.failed) return expr;
                    pushFollow(FOLLOW_named_type_in_typedef1154);
                    nt=named_type();

                    state._fsp--;
                    if (state.failed) return expr;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:418:5: ( array_type )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LBRACK) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:418:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1161);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:425:4: (nt= symbol_type ( array_type )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:425:4: (nt= symbol_type ( array_type )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:426:5: nt= symbol_type ( array_type )?
                    {
                    pushFollow(FOLLOW_symbol_type_in_typedef1200);
                    nt=symbol_type();

                    state._fsp--;
                    if (state.failed) return expr;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:427:5: ( array_type )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LBRACK) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:427:6: array_type
                            {
                            pushFollow(FOLLOW_array_type_in_typedef1207);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:439:1: named_type returns [ BlitzMaxTypeReference tr = null ] : ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER );
    public final BlitzMaxTypeReference named_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token s=null;
        Token o=null;
        Token name=null;
        Expression d = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:440:2: ( (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def ) | s= STRING_TYPE | o= OBJECT_TYPE | name= IDENTIFIER )
            int alt21=4;
            switch ( input.LA(1) ) {
            case LONG_TYPE:
            case INT_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case BYTE_TYPE:
            case SHORT_TYPE:
                {
                alt21=1;
                }
                break;
            case STRING_TYPE:
                {
                alt21=2;
                }
                break;
            case OBJECT_TYPE:
                {
                alt21=3;
                }
                break;
            case IDENTIFIER:
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:440:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:440:4: (d= int_def | d= long_def | d= float_def | d= double_def | d= byte_def | d= short_def )
                    int alt20=6;
                    switch ( input.LA(1) ) {
                    case INT_TYPE:
                        {
                        alt20=1;
                        }
                        break;
                    case LONG_TYPE:
                        {
                        alt20=2;
                        }
                        break;
                    case FLOAT_TYPE:
                        {
                        alt20=3;
                        }
                        break;
                    case DOUBLE_TYPE:
                        {
                        alt20=4;
                        }
                        break;
                    case BYTE_TYPE:
                        {
                        alt20=5;
                        }
                        break;
                    case SHORT_TYPE:
                        {
                        alt20=6;
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:440:9: d= int_def
                            {
                            pushFollow(FOLLOW_int_def_in_named_type1258);
                            d=int_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:441:6: d= long_def
                            {
                            pushFollow(FOLLOW_long_def_in_named_type1269);
                            d=long_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 3 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:442:6: d= float_def
                            {
                            pushFollow(FOLLOW_float_def_in_named_type1280);
                            d=float_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 4 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:443:6: d= double_def
                            {
                            pushFollow(FOLLOW_double_def_in_named_type1291);
                            d=double_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 5 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:444:6: d= byte_def
                            {
                            pushFollow(FOLLOW_byte_def_in_named_type1302);
                            d=byte_def();

                            state._fsp--;
                            if (state.failed) return tr;

                            }
                            break;
                        case 6 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:445:6: d= short_def
                            {
                            pushFollow(FOLLOW_short_def_in_named_type1313);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:450:5: s= STRING_TYPE
                    {
                    s=(Token)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_named_type1332); if (state.failed) return tr;
                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference( new BlitzMaxStringType(s) );
                      			
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:454:5: o= OBJECT_TYPE
                    {
                    o=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_named_type1347); if (state.failed) return tr;
                    if ( state.backtracking==0 ) {

                      				tr = new BlitzMaxTypeReference( new BlitzMaxObjectType(o) );
                      			
                    }

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:458:5: name= IDENTIFIER
                    {
                    name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_type1362); if (state.failed) return tr;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:464:1: function_type : function_definition ;
    public final void function_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:465:2: ( function_definition )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:465:4: function_definition
            {
            pushFollow(FOLLOW_function_definition_in_function_type1378);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:468:1: symbol_type returns [ BlitzMaxTypeReference tr = null ] : (d= PERCENT | d= POUND | d= BANG | d= DOLLAR ) ;
    public final BlitzMaxTypeReference symbol_type() throws RecognitionException {
        BlitzMaxTypeReference tr =  null;

        Token d=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:2: ( (d= PERCENT | d= POUND | d= BANG | d= DOLLAR ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:4: (d= PERCENT | d= POUND | d= BANG | d= DOLLAR )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:4: (d= PERCENT | d= POUND | d= BANG | d= DOLLAR )
            int alt22=4;
            switch ( input.LA(1) ) {
            case PERCENT:
                {
                alt22=1;
                }
                break;
            case POUND:
                {
                alt22=2;
                }
                break;
            case BANG:
                {
                alt22=3;
                }
                break;
            case DOLLAR:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return tr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:469:5: d= PERCENT
                    {
                    d=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_symbol_type1398); if (state.failed) return tr;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:470:5: d= POUND
                    {
                    d=(Token)match(input,POUND,FOLLOW_POUND_in_symbol_type1408); if (state.failed) return tr;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:471:5: d= BANG
                    {
                    d=(Token)match(input,BANG,FOLLOW_BANG_in_symbol_type1418); if (state.failed) return tr;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:472:5: d= DOLLAR
                    {
                    d=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_symbol_type1428); if (state.failed) return tr;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:479:1: array_type : LBRACK ( number )? RBRACK ;
    public final void array_type() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:480:2: ( LBRACK ( number )? RBRACK )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:480:4: LBRACK ( number )? RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_array_type1447); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:480:11: ( number )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=FLOAT && LA23_0<=INT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:480:12: number
                    {
                    pushFollow(FOLLOW_number_in_array_type1450);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RBRACK,FOLLOW_RBRACK_in_array_type1454); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:483:1: argument_list[boolean functionArgs ] returns [ List<Declaration> args = new ArrayList<Declaration>() ] : arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* ;
    public final List<Declaration> argument_list(boolean functionArgs) throws RecognitionException {
        List<Declaration> args =  new ArrayList<Declaration>();

        Declaration arg = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:2: (arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:484:4: arg= argument[functionArgs] ( COMMA arg= argument[functionArgs] )*
            {
            pushFollow(FOLLOW_argument_in_argument_list1474);
            arg=argument(functionArgs);

            state._fsp--;
            if (state.failed) return args;
            if ( state.backtracking==0 ) {

              			args.add(arg);
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:488:3: ( COMMA arg= argument[functionArgs] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:488:4: COMMA arg= argument[functionArgs]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_argument_list1485); if (state.failed) return args;
            	    pushFollow(FOLLOW_argument_in_argument_list1491);
            	    arg=argument(functionArgs);

            	    state._fsp--;
            	    if (state.failed) return args;
            	    if ( state.backtracking==0 ) {

            	      				args.add(arg);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:495:1: argument[boolean functionArg] returns [ Declaration arg = null ] : (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition );
    public final Declaration argument(boolean functionArg) throws RecognitionException {
        Declaration arg =  null;

        Declaration a = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:496:2: (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:496:4: a= variable_def[functionArg] ( EQUAL simple_expression )?
                    {
                    pushFollow(FOLLOW_variable_def_in_argument1523);
                    a=variable_def(functionArg);

                    state._fsp--;
                    if (state.failed) return arg;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:496:34: ( EQUAL simple_expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==EQUAL) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:496:35: EQUAL simple_expression
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_argument1527); if (state.failed) return arg;
                            pushFollow(FOLLOW_simple_expression_in_argument1529);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:500:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_argument1541);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:503:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition );
    public final Declaration variable_definition(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Declaration v = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:2: (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:4: v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )?
                    {
                    pushFollow(FOLLOW_variable_def_in_variable_definition1561);
                    v=variable_def(functionArg);

                    state._fsp--;
                    if (state.failed) return dec;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:34: ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )?
                    int alt27=3;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NEWLINE) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==EQUAL) ) {
                        alt27=2;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:35: NEWLINE
                            {
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variable_definition1565); if (state.failed) return dec;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:504:45: EQUAL ( simple_expression NEWLINE )
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_variable_definition1569); if (state.failed) return dec;
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:505:3: ( simple_expression NEWLINE )
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:505:4: simple_expression NEWLINE
                            {
                            pushFollow(FOLLOW_simple_expression_in_variable_definition1574);
                            simple_expression();

                            state._fsp--;
                            if (state.failed) return dec;
                            match(input,NEWLINE,FOLLOW_NEWLINE_in_variable_definition1576); if (state.failed) return dec;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:507:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_variable_definition1588);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:510:1: variable_def[boolean functionArg] returns [ Declaration dec = null ] : n= IDENTIFIER (t= typedef (v= VAR )? )? ;
    public final Declaration variable_def(boolean functionArg) throws RecognitionException {
        Declaration dec =  null;

        Token n=null;
        Token v=null;
        BlitzMaxTypedefExpression t = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:511:2: (n= IDENTIFIER (t= typedef (v= VAR )? )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:511:4: n= IDENTIFIER (t= typedef (v= VAR )? )?
            {
            n=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_def1609); if (state.failed) return dec;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:512:4: (t= typedef (v= VAR )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COLON||(LA30_0>=PERCENT && LA30_0<=DOLLAR)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:512:5: t= typedef (v= VAR )?
                    {
                    pushFollow(FOLLOW_typedef_in_variable_def1619);
                    t=typedef();

                    state._fsp--;
                    if (state.failed) return dec;
                    if ( state.backtracking==0 ) {

                      					dec = new BlitzMaxVariableDeclaration(n, t);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:517:5: (v= VAR )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==VAR) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:517:7: v= VAR
                            {
                            v=(Token)match(input,VAR,FOLLOW_VAR_in_variable_def1642); if (state.failed) return dec;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:534:1: rem_block : REM NEWLINE rem_block_contents ;
    public final void rem_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:535:3: ( REM NEWLINE rem_block_contents )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:535:5: REM NEWLINE rem_block_contents
            {
            match(input,REM,FOLLOW_REM_in_rem_block1679); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_rem_block1681); if (state.failed) return ;
            pushFollow(FOLLOW_rem_block_contents_in_rem_block1686);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:539:1: rem_block_contents : ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) ) ;
    public final void rem_block_contents() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:540:3: ( ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:540:5: ( . )* ( 'endrem' | END (~ REM rem_block_contents | REM ) )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:540:5: ( . )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 127:
                    {
                    alt31=2;
                    }
                    break;
                case END:
                    {
                    alt31=2;
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
                case NEW:
                case LPAREN:
                case RPAREN:
                case DELETE:
                case FIELD:
                case GLOBAL:
                case CONST:
                case LOCAL:
                case FUNCTION:
                case DEBUGSTOP:
                case RETURN:
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
                case DOT:
                case SELF:
                case NULL:
                case LINE_CONTINUATION:
                case TRUE:
                case FALSE:
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
                case LONG_TYPE:
                case INT_TYPE:
                case FLOAT_TYPE:
                case DOUBLE_TYPE:
                case BYTE_TYPE:
                case SHORT_TYPE:
                case POINTER:
                case SUPER:
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
                    alt31=1;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:540:5: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:5: ( 'endrem' | END (~ REM rem_block_contents | REM ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==127) ) {
                alt33=1;
            }
            else if ( (LA33_0==END) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:6: 'endrem'
                    {
                    match(input,127,FOLLOW_127_in_rem_block_contents1707); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:17: END (~ REM rem_block_contents | REM )
                    {
                    match(input,END,FOLLOW_END_in_rem_block_contents1711); if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:21: (~ REM rem_block_contents | REM )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=SUPERSTRICT && LA32_0<=VAR)||(LA32_0>=FOR && LA32_0<=130)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==REM) ) {
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
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:22: ~ REM rem_block_contents
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

                            pushFollow(FOLLOW_rem_block_contents_in_rem_block_contents1717);
                            rem_block_contents();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:541:48: REM
                            {
                            match(input,REM,FOLLOW_REM_in_rem_block_contents1721); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:557:1: for_block returns [ BlitzMaxForStatement stmt = null ] : (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE ;
    public final BlitzMaxForStatement for_block() throws RecognitionException {
        BlitzMaxForStatement stmt =  null;

        Token f=null;
        Declaration vdef = null;

        Expression frm = null;

        Expression to = null;

        Expression sexp = null;

        BlitzMaxBlock sb = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:558:2: ( (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:558:4: (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) ) NEWLINE sb= statement_block NEXT NEWLINE
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:558:4: (f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:559:4: f= FOR ( LOCAL )? vdef= variable_def[false] EQUAL ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_for_block1750); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:4: ( LOCAL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LOCAL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:560:4: LOCAL
                    {
                    match(input,LOCAL,FOLLOW_LOCAL_in_for_block1755); if (state.failed) return stmt;

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_def_in_for_block1765);
            vdef=variable_def(false);

            state._fsp--;
            if (state.failed) return stmt;
            match(input,EQUAL,FOLLOW_EQUAL_in_for_block1771); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:563:4: ( (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? ) | EACHIN to= expression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENTIFIER||(LA37_0>=NEW && LA37_0<=LPAREN)||(LA37_0>=PLUS && LA37_0<=MINUS)||(LA37_0>=SELF && LA37_0<=NOT_TEST)||(LA37_0>=FLOAT && LA37_0<=INT)) ) {
                alt37=1;
            }
            else if ( (LA37_0==EACHIN) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:564:4: (frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )? )
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:565:5: frm= expression ( TO | UNTIL ) to= expression ( STEP sexp= expression )?
                    {
                    pushFollow(FOLLOW_expression_in_for_block1791);
                    frm=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      					stmt = new BlitzMaxForStatement(vdef, frm);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:569:5: ( TO | UNTIL )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==TO) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==UNTIL) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return stmt;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:569:7: TO
                            {
                            match(input,TO,FOLLOW_TO_in_for_block1805); if (state.failed) return stmt;
                            if ( state.backtracking==0 ) {

                              						stmt.setForType(BlitzMaxConstants.FORTYPE_TO);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:573:7: UNTIL
                            {
                            match(input,UNTIL,FOLLOW_UNTIL_in_for_block1820); if (state.failed) return stmt;
                            if ( state.backtracking==0 ) {

                              						stmt.setForType(BlitzMaxConstants.FORTYPE_UNTIL);
                              				 	
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_for_block1845);
                    to=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      					stmt.setToExpr(to);
                      				
                    }
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:583:5: ( STEP sexp= expression )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==STEP) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:583:7: STEP sexp= expression
                            {
                            match(input,STEP,FOLLOW_STEP_in_for_block1859); if (state.failed) return stmt;
                            pushFollow(FOLLOW_expression_in_for_block1871);
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
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:591:5: EACHIN to= expression
                    {
                    match(input,EACHIN,FOLLOW_EACHIN_in_for_block1901); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      						stmt.setForType(BlitzMaxConstants.FORTYPE_EACHIN);
                      				 	
                    }
                    pushFollow(FOLLOW_expression_in_for_block1919);
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

            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1939); if (state.failed) return stmt;
            pushFollow(FOLLOW_statement_block_in_for_block1947);
            sb=statement_block();

            state._fsp--;
            if (state.failed) return stmt;
            if ( state.backtracking==0 ) {

              				stmt.setBlock(sb);
              			
            }
            match(input,NEXT,FOLLOW_NEXT_in_for_block1956); if (state.failed) return stmt;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_for_block1958); if (state.failed) return stmt;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:609:1: repeat_block : REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE ;
    public final void repeat_block() throws RecognitionException {
        BlitzMaxBlock b = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:610:2: ( REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:610:4: REPEAT NEWLINE b= statement_block ( FOREVER | UNTIL expression ) NEWLINE
            {
            match(input,REPEAT,FOLLOW_REPEAT_in_repeat_block1970); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1972); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_repeat_block1980);
            b=statement_block();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:612:3: ( FOREVER | UNTIL expression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FOREVER) ) {
                alt38=1;
            }
            else if ( (LA38_0==UNTIL) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:612:4: FOREVER
                    {
                    match(input,FOREVER,FOLLOW_FOREVER_in_repeat_block1985); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:612:14: UNTIL expression
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_repeat_block1989); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_repeat_block1991);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_block1996); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:640:1: expression returns [ Expression exp = null ] : expr ;
    public final Expression expression() throws RecognitionException {
        Expression exp =  null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:641:2: ( expr )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:641:4: expr
            {
            pushFollow(FOLLOW_expr_in_expression2012);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:644:1: expr : simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )* ;
    public final void expr() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:645:5: ( simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:645:7: simple_expression ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )*
            {
            pushFollow(FOLLOW_simple_expression_in_expr2027);
            simple_expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:4: ( ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==EQUAL||(LA39_0>=NOTEQUAL && LA39_0<=GREATER)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:646:6: ( EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATEREQUAL | GREATER ) simple_expression
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

            	    pushFollow(FOLLOW_simple_expression_in_expr2059);
            	    simple_expression();

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
    // $ANTLR end "expr"


    // $ANTLR start "simple_expression"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:649:1: simple_expression : term ( adding_operator term )* ;
    public final void simple_expression() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:650:5: ( term ( adding_operator term )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:650:7: term ( adding_operator term )*
            {
            pushFollow(FOLLOW_term_in_simple_expression2079);
            term();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:650:12: ( adding_operator term )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=PLUS && LA40_0<=OR_TEST)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:650:14: adding_operator term
            	    {
            	    pushFollow(FOLLOW_adding_operator_in_simple_expression2083);
            	    adding_operator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_term_in_simple_expression2085);
            	    term();

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
    // $ANTLR end "simple_expression"


    // $ANTLR start "adding_operator"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:653:1: adding_operator : ( PLUS | MINUS | OR_TEST );
    public final void adding_operator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:654:5: ( PLUS | MINUS | OR_TEST )
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:657:1: term : signed_factor ( multiplying_operator signed_factor )* ;
    public final void term() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:5: ( signed_factor ( multiplying_operator signed_factor )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:7: signed_factor ( multiplying_operator signed_factor )*
            {
            pushFollow(FOLLOW_signed_factor_in_term2130);
            signed_factor();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:21: ( multiplying_operator signed_factor )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=STAR && LA41_0<=AND_TEST)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:658:23: multiplying_operator signed_factor
            	    {
            	    pushFollow(FOLLOW_multiplying_operator_in_term2134);
            	    multiplying_operator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_signed_factor_in_term2136);
            	    signed_factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:661:1: multiplying_operator : ( STAR | SLASH | MOD | AND_TEST );
    public final void multiplying_operator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:662:5: ( STAR | SLASH | MOD | AND_TEST )
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:665:1: signed_factor : ( PLUS | MINUS )? factor ;
    public final void signed_factor() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:666:5: ( ( PLUS | MINUS )? factor )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:666:7: ( PLUS | MINUS )? factor
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:666:7: ( PLUS | MINUS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=PLUS && LA42_0<=MINUS)) ) {
                alt42=1;
            }
            switch (alt42) {
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

            pushFollow(FOLLOW_factor_in_signed_factor2194);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:669:1: factor : ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | ( NEW )? func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION );
    public final void factor() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:5: ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | ( NEW )? func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:7: ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:7: ( NEW )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NEW) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:7: NEW
                            {
                            match(input,NEW,FOLLOW_NEW_in_factor2211); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:12: ( IDENTIFIER DOT )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==IDENTIFIER) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==DOT) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:670:13: IDENTIFIER DOT
                    	    {
                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor2215); if (state.failed) return ;
                    	    match(input,DOT,FOLLOW_DOT_in_factor2217); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor2221); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:671:7: ( NEW )? func_var_designator
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:671:7: ( NEW )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==NEW) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:671:7: NEW
                            {
                            match(input,NEW,FOLLOW_NEW_in_factor2229); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_func_var_designator_in_factor2232);
                    func_var_designator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:672:7: constant_expression
                    {
                    pushFollow(FOLLOW_constant_expression_in_factor2241);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:673:7: LPAREN simple_expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_factor2249); if (state.failed) return ;
                    pushFollow(FOLLOW_simple_expression_in_factor2251);
                    simple_expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_factor2253); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:674:7: SELF
                    {
                    match(input,SELF,FOLLOW_SELF_in_factor2261); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:675:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_factor2269); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:676:7: LINE_CONTINUATION
                    {
                    match(input,LINE_CONTINUATION,FOLLOW_LINE_CONTINUATION_in_factor2277); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:679:1: func_var_designator : IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN ( DOT factor )? ;
    public final void func_var_designator() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:5: ( IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN ( DOT factor )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:7: IDENTIFIER ( DOT IDENTIFIER )* LPAREN ( expr ( COMMA expr )* )? RPAREN ( DOT factor )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_var_designator2294); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:18: ( DOT IDENTIFIER )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==DOT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:19: DOT IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_func_var_designator2297); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_var_designator2299); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match(input,LPAREN,FOLLOW_LPAREN_in_func_var_designator2303); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:43: ( expr ( COMMA expr )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENTIFIER||(LA49_0>=NEW && LA49_0<=LPAREN)||(LA49_0>=PLUS && LA49_0<=MINUS)||(LA49_0>=SELF && LA49_0<=NOT_TEST)||(LA49_0>=FLOAT && LA49_0<=INT)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:44: expr ( COMMA expr )*
                    {
                    pushFollow(FOLLOW_expr_in_func_var_designator2306);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:49: ( COMMA expr )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==COMMA) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:50: COMMA expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_func_var_designator2309); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_func_var_designator2311);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_func_var_designator2318); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:73: ( DOT factor )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DOT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:680:74: DOT factor
                    {
                    match(input,DOT,FOLLOW_DOT_in_func_var_designator2321); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_func_var_designator2323);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "func_var_designator"


    // $ANTLR start "constant_expression"
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:683:1: constant_expression : ( number | TRUE | FALSE | STRING_LITERAL | NOT_TEST factor );
    public final void constant_expression() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:684:2: ( number | TRUE | FALSE | STRING_LITERAL | NOT_TEST factor )
            int alt51=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case LONG:
            case INT:
                {
                alt51=1;
                }
                break;
            case TRUE:
                {
                alt51=2;
                }
                break;
            case FALSE:
                {
                alt51=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt51=4;
                }
                break;
            case NOT_TEST:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:684:4: number
                    {
                    pushFollow(FOLLOW_number_in_constant_expression2339);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:685:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_constant_expression2344); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:686:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_constant_expression2349); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:687:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant_expression2354); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:688:4: NOT_TEST factor
                    {
                    match(input,NOT_TEST,FOLLOW_NOT_TEST_in_constant_expression2359); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_constant_expression2361);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:691:1: assignment : ( EQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL );
    public final void assignment() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:692:2: ( EQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL )
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:700:1: cast_or_function_call : IDENTIFIER ( DOT IDENTIFIER )* ( ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )? | ( expression_list )? ) ;
    public final void cast_or_function_call() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:701:2: ( IDENTIFIER ( DOT IDENTIFIER )* ( ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )? | ( expression_list )? ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:701:4: IDENTIFIER ( DOT IDENTIFIER )* ( ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )? | ( expression_list )? )
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call2409); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:701:15: ( DOT IDENTIFIER )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==DOT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:701:16: DOT IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_cast_or_function_call2412); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_cast_or_function_call2414); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:702:2: ( ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )? | ( expression_list )? )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:703:2: ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )?
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_cast_or_function_call2428); if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:704:3: ( expression_list )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==IDENTIFIER||(LA53_0>=NEW && LA53_0<=LPAREN)||(LA53_0>=PLUS && LA53_0<=MINUS)||(LA53_0>=SELF && LA53_0<=NOT_TEST)||(LA53_0>=FLOAT && LA53_0<=INT)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:704:3: expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_cast_or_function_call2432);
                            expression_list();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_cast_or_function_call2435); if (state.failed) return ;
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:705:3: ( DOT expression )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:705:4: DOT expression
                            {
                            match(input,DOT,FOLLOW_DOT_in_cast_or_function_call2440); if (state.failed) return ;
                            pushFollow(FOLLOW_expression_in_cast_or_function_call2442);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:707:3: ( expression_list )?
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:707:3: ( expression_list )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==IDENTIFIER||(LA55_0>=NEW && LA55_0<=LPAREN)||(LA55_0>=PLUS && LA55_0<=MINUS)||(LA55_0>=SELF && LA55_0<=NOT_TEST)||(LA55_0>=FLOAT && LA55_0<=INT)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:707:3: expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_cast_or_function_call2453);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:711:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:712:2: ( expression ( COMMA expression )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:712:4: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list2469);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:712:15: ( COMMA expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:712:16: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list2472); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_expression_list2474);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:715:1: while_block : WHILE expression NEWLINE statement_block WEND NEWLINE ;
    public final void while_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:716:2: ( WHILE expression NEWLINE statement_block WEND NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:716:4: WHILE expression NEWLINE statement_block WEND NEWLINE
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_block2487); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_while_block2489);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block2491); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_while_block2495);
            statement_block();

            state._fsp--;
            if (state.failed) return ;
            match(input,WEND,FOLLOW_WEND_in_while_block2499); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_while_block2501); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:721:1: select_block : SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE ;
    public final void select_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:722:2: ( SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:722:4: SELECT expression NEWLINE ( case_block )* ( default_block )? end_select NEWLINE
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_block2512); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_select_block2514);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block2516); if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:723:3: ( case_block )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==CASE) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:723:3: case_block
            	    {
            	    pushFollow(FOLLOW_case_block_in_select_block2520);
            	    case_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:3: ( default_block )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DEFAULT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:724:3: default_block
                    {
                    pushFollow(FOLLOW_default_block_in_select_block2525);
                    default_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_end_select_in_select_block2530);
            end_select();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_select_block2534); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:729:1: default_block : DEFAULT NEWLINE statement_block ;
    public final void default_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:730:2: ( DEFAULT NEWLINE statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:730:4: DEFAULT NEWLINE statement_block
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_default_block2545); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_default_block2547); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_default_block2551);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:734:1: end_select : ( END SELECT | 'endselect' );
    public final void end_select() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:735:2: ( END SELECT | 'endselect' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==END) ) {
                alt60=1;
            }
            else if ( (LA60_0==128) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:735:4: END SELECT
                    {
                    match(input,END,FOLLOW_END_in_end_select2562); if (state.failed) return ;
                    match(input,SELECT,FOLLOW_SELECT_in_end_select2564); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:736:5: 'endselect'
                    {
                    match(input,128,FOLLOW_128_in_end_select2570); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:739:1: case_block : CASE expression ( COMMA expression )* NEWLINE statement_block ;
    public final void case_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:740:2: ( CASE expression ( COMMA expression )* NEWLINE statement_block )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:740:4: CASE expression ( COMMA expression )* NEWLINE statement_block
            {
            match(input,CASE,FOLLOW_CASE_in_case_block2581); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_case_block2583);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:740:20: ( COMMA expression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:740:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_block2586); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_case_block2588);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            match(input,NEWLINE,FOLLOW_NEWLINE_in_case_block2592); if (state.failed) return ;
            pushFollow(FOLLOW_statement_block_in_case_block2596);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:744:1: import_stmt returns [ Statement stmt = null ] : imp= IMPORT (l= string_literal | e= module_name ) NEWLINE ;
    public final Statement import_stmt() throws RecognitionException {
        Statement stmt =  null;

        Token imp=null;
        BlitzMaxStringLiteral l = null;

        BlitzMaxModuleNameExpression e = null;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:745:2: (imp= IMPORT (l= string_literal | e= module_name ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:745:4: imp= IMPORT (l= string_literal | e= module_name ) NEWLINE
            {
            imp=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_stmt2615); if (state.failed) return stmt;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:746:3: (l= string_literal | e= module_name )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==STRING_LITERAL) ) {
                alt62=1;
            }
            else if ( (LA62_0==IDENTIFIER) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:747:4: l= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_import_stmt2628);
                    l=string_literal();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      				stmt = new BlitzMaxImportStatement(imp, l);
                      			
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:752:4: e= module_name
                    {
                    pushFollow(FOLLOW_module_name_in_import_stmt2646);
                    e=module_name();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {

                      				stmt = new BlitzMaxImportStatement(imp, e);
                      			
                    }

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_import_stmt2659); if (state.failed) return stmt;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:760:1: include_stmt : INCLUDE STRING_LITERAL NEWLINE ;
    public final void include_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:2: ( INCLUDE STRING_LITERAL NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:761:4: INCLUDE STRING_LITERAL NEWLINE
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt2670); if (state.failed) return ;
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include_stmt2672); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_include_stmt2674); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:764:1: framework_stmt : FRAMEWORK module_name NEWLINE ;
    public final void framework_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:765:2: ( FRAMEWORK module_name NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:765:4: FRAMEWORK module_name NEWLINE
            {
            match(input,FRAMEWORK,FOLLOW_FRAMEWORK_in_framework_stmt2685); if (state.failed) return ;
            pushFollow(FOLLOW_module_name_in_framework_stmt2687);
            module_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_framework_stmt2689); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:768:1: module_stmt : MODULE module_name NEWLINE ;
    public final void module_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:769:2: ( MODULE module_name NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:769:4: MODULE module_name NEWLINE
            {
            match(input,MODULE,FOLLOW_MODULE_in_module_stmt2700); if (state.failed) return ;
            pushFollow(FOLLOW_module_name_in_module_stmt2702);
            module_name();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_module_stmt2704); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:772:1: moduleinfo_stmt : MODULEINFO STRING_LITERAL NEWLINE ;
    public final void moduleinfo_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:773:2: ( MODULEINFO STRING_LITERAL NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:773:4: MODULEINFO STRING_LITERAL NEWLINE
            {
            match(input,MODULEINFO,FOLLOW_MODULEINFO_in_moduleinfo_stmt2716); if (state.failed) return ;
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2718); if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_moduleinfo_stmt2720); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:776:1: module_name returns [ BlitzMaxModuleNameExpression expr = null ] : (ns= IDENTIFIER DOT name= IDENTIFIER ) ;
    public final BlitzMaxModuleNameExpression module_name() throws RecognitionException {
        BlitzMaxModuleNameExpression expr =  null;

        Token ns=null;
        Token name=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:777:2: ( (ns= IDENTIFIER DOT name= IDENTIFIER ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:777:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:777:4: (ns= IDENTIFIER DOT name= IDENTIFIER )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:777:6: ns= IDENTIFIER DOT name= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2741); if (state.failed) return expr;
            match(input,DOT,FOLLOW_DOT_in_module_name2743); if (state.failed) return expr;
            name=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module_name2749); if (state.failed) return expr;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:783:1: debuglog_stmt : DEBUGLOG expression NEWLINE ;
    public final void debuglog_stmt() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:784:2: ( DEBUGLOG expression NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:784:4: DEBUGLOG expression NEWLINE
            {
            match(input,DEBUGLOG,FOLLOW_DEBUGLOG_in_debuglog_stmt2765); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_debuglog_stmt2767);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_debuglog_stmt2769); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:787:1: if_block : IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE ;
    public final void if_block() throws RecognitionException {
        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:788:2: ( IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:789:3: IF expression ( THEN )? statement_block ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )? ( END IF | 'endif' ) NEWLINE
            {
            match(input,IF,FOLLOW_IF_in_if_block2783); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_if_block2785);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:790:3: ( THEN )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==THEN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:790:3: THEN
                    {
                    match(input,THEN,FOLLOW_THEN_in_if_block2789); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_block_in_if_block2797);
            statement_block();

            state._fsp--;
            if (state.failed) return ;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:794:3: ( ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ELSE||LA66_0==129) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:795:4: ( ELSE | 'elseif' expression ( THEN )? NEWLINE ) statement_block
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:795:4: ( ELSE | 'elseif' expression ( THEN )? NEWLINE )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==ELSE) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==129) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:796:5: ELSE
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_if_block2815); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:798:7: 'elseif' expression ( THEN )? NEWLINE
                            {
                            match(input,129,FOLLOW_129_in_if_block2829); if (state.failed) return ;
                            pushFollow(FOLLOW_expression_in_if_block2831);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:798:27: ( THEN )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==THEN) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:798:27: THEN
                                    {
                                    match(input,THEN,FOLLOW_THEN_in_if_block2833); if (state.failed) return ;

                                    }
                                    break;

                            }

                            match(input,NEWLINE,FOLLOW_NEWLINE_in_if_block2836); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_block_in_if_block2850);
                    statement_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:804:3: ( END IF | 'endif' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==END) ) {
                alt67=1;
            }
            else if ( (LA67_0==130) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:805:4: END IF
                    {
                    match(input,END,FOLLOW_END_in_if_block2867); if (state.failed) return ;
                    match(input,IF,FOLLOW_IF_in_if_block2869); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:806:6: 'endif'
                    {
                    match(input,130,FOLLOW_130_in_if_block2876); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_if_block2884); if (state.failed) return ;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:860:1: pointer_def returns [int count = 0] : POINTER ( POINTER )* ;
    public final int pointer_def() throws RecognitionException {
        int count =  0;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:861:2: ( POINTER ( POINTER )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:861:4: POINTER ( POINTER )*
            {
            match(input,POINTER,FOLLOW_POINTER_in_pointer_def3190); if (state.failed) return count;
            if ( state.backtracking==0 ) {

              			count = 1;
              		
            }
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:865:3: ( POINTER )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==POINTER) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:866:4: POINTER
            	    {
            	    match(input,POINTER,FOLLOW_POINTER_in_pointer_def3204); if (state.failed) return count;
            	    if ( state.backtracking==0 ) {

            	      				count++;
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:874:1: byte_def returns [Expression exp = null] : t= BYTE_TYPE (c= pointer_def )? ;
    public final Expression byte_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:875:2: (t= BYTE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:875:4: t= BYTE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,BYTE_TYPE,FOLLOW_BYTE_TYPE_in_byte_def3236); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:876:5: (c= pointer_def )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==POINTER) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:876:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_byte_def3244);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:883:1: int_def returns [Expression exp = null] : t= INT_TYPE (c= pointer_def )? ;
    public final Expression int_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:884:2: (t= INT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:884:4: t= INT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_int_def3269); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:885:5: (c= pointer_def )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==POINTER) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:885:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_int_def3277);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:891:1: short_def returns [Expression exp = null] : t= SHORT_TYPE (c= pointer_def )? ;
    public final Expression short_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:892:2: (t= SHORT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:892:4: t= SHORT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_short_def3301); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:893:5: (c= pointer_def )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==POINTER) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:893:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_short_def3309);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:900:1: long_def returns [Expression exp = null] : t= LONG_TYPE (c= pointer_def )? ;
    public final Expression long_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:901:2: (t= LONG_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:901:4: t= LONG_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_long_def3334); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:902:5: (c= pointer_def )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==POINTER) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:902:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_long_def3342);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:909:1: float_def returns [Expression exp = null] : t= FLOAT_TYPE (c= pointer_def )? ;
    public final Expression float_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:910:2: (t= FLOAT_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:910:4: t= FLOAT_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_float_def3367); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:911:5: (c= pointer_def )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==POINTER) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:911:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_float_def3375);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:918:1: double_def returns [Expression exp = null] : t= DOUBLE_TYPE (c= pointer_def )? ;
    public final Expression double_def() throws RecognitionException {
        Expression exp =  null;

        Token t=null;
        int c = 0;


        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:919:2: (t= DOUBLE_TYPE (c= pointer_def )? )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:919:4: t= DOUBLE_TYPE (c= pointer_def )?
            {
            t=(Token)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_double_def3400); if (state.failed) return exp;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:920:5: (c= pointer_def )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==POINTER) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:920:5: c= pointer_def
                    {
                    pushFollow(FOLLOW_pointer_def_in_double_def3408);
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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1018:1: number returns [ Literal num = null ] : (n= FLOAT | n= LONG | n= INT ) ;
    public final Literal number() throws RecognitionException {
        Literal num =  null;

        Token n=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:2: ( (n= FLOAT | n= LONG | n= INT ) )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1023:3: (n= FLOAT | n= LONG | n= INT )
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1023:3: (n= FLOAT | n= LONG | n= INT )
            int alt75=3;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt75=1;
                }
                break;
            case LONG:
                {
                alt75=2;
                }
                break;
            case INT:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return num;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1023:4: n= FLOAT
                    {
                    n=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_number3960); if (state.failed) return num;

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1024:5: n= LONG
                    {
                    n=(Token)match(input,LONG,FOLLOW_LONG_in_number3970); if (state.failed) return num;

                    }
                    break;
                case 3 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1025:5: n= INT
                    {
                    n=(Token)match(input,INT,FOLLOW_INT_in_number3980); if (state.failed) return num;

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
    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1084:1: string_literal returns [BlitzMaxStringLiteral str = null] : e= STRING_LITERAL ;
    public final BlitzMaxStringLiteral string_literal() throws RecognitionException {
        BlitzMaxStringLiteral str =  null;

        Token e=null;

        try {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1085:2: (e= STRING_LITERAL )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1085:4: e= STRING_LITERAL
            {
            e=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal4319); if (state.failed) return str;
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

    // $ANTLR start synpred1_blitzmax
    public final void synpred1_blitzmax_fragment() throws RecognitionException {   
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:703:2: ( LPAREN )
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:703:3: LPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_blitzmax2424); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_blitzmax

    // Delegated rules

    public final boolean synpred1_blitzmax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_blitzmax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA14_eotS =
        "\20\uffff";
    static final String DFA14_eofS =
        "\20\uffff";
    static final String DFA14_minS =
        "\1\5\13\uffff\1\5\3\uffff";
    static final String DFA14_maxS =
        "\1\122\13\uffff\1\162\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\16\1\15\1\14";
    static final String DFA14_specialS =
        "\20\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\15\2\uffff\1\14\12\uffff\1\6\1\5\1\7\1\uffff\1\12\1\13\14"+
            "\uffff\1\10\1\2\5\uffff\1\4\32\uffff\1\3\5\uffff\1\1\4\uffff"+
            "\1\11",
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
            "\1\17\2\uffff\1\17\5\uffff\2\17\23\uffff\1\16\17\uffff\2\17"+
            "\5\uffff\10\17\5\16\51\uffff\3\17",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "375:1: statement_list[List statements] : ( include_stmt | s2= for_block | while_block | repeat_block | const_def[statements] | global_def[statements] | local_def[statements] | rem_block | if_block | DEBUGSTOP NEWLINE | RETURN expression NEWLINE | cast_or_function_call NEWLINE | IDENTIFIER assignment expression NEWLINE | NEWLINE );";
        }
    }
    static final String DFA26_eotS =
        "\50\uffff";
    static final String DFA26_eofS =
        "\50\uffff";
    static final String DFA26_minS =
        "\1\10\1\5\1\10\4\5\2\uffff\11\5\1\41\1\5\1\41\5\5\3\41\2\5\3\41"+
        "\6\5";
    static final String DFA26_maxS =
        "\1\10\1\43\1\133\4\44\2\uffff\6\134\3\44\1\162\1\134\1\162\5\134"+
        "\3\41\1\44\1\134\3\41\1\44\5\134";
    static final String DFA26_acceptS =
        "\7\uffff\1\2\1\1\37\uffff";
    static final String DFA26_specialS =
        "\50\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\10\11\uffff\1\7\1\10\10\uffff\1\2\2\uffff\1\3\1\4\1\5\1"+
            "\6\2\uffff\2\10",
            "\1\21\21\uffff\1\17\1\20\72\uffff\1\12\1\11\1\13\1\14\1\15"+
            "\1\16",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\22\1\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\22\1\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\22\1\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\22\1\uffff\3\10",
            "",
            "",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\23",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\25",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\26",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\27",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\30",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\31",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10",
            "\1\35\116\uffff\1\32\1\33\1\34",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\36",
            "\1\42\116\uffff\1\37\1\40\1\41",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\43",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\44",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\45",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\46",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\47",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\10\11\uffff\1\7\1\10\21\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\36",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\10\11\uffff\1\7\1\10\21\uffff\3\10",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\43",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\44",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\45",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\46",
            "\1\10\11\uffff\1\7\1\10\17\uffff\1\24\1\uffff\3\10\67\uffff"+
            "\1\47"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "495:1: argument[boolean functionArg] returns [ Declaration arg = null ] : (a= variable_def[functionArg] ( EQUAL simple_expression )? | function_definition );";
        }
    }
    static final String DFA28_eotS =
        "\50\uffff";
    static final String DFA28_eofS =
        "\1\uffff\1\7\1\uffff\4\7\2\uffff\11\7\1\uffff\1\7\1\uffff\5\7\3"+
        "\uffff\2\7\3\uffff\6\7";
    static final String DFA28_minS =
        "\1\10\1\5\1\10\4\5\2\uffff\11\5\1\41\1\5\1\41\5\5\3\41\2\5\3\41"+
        "\6\5";
    static final String DFA28_maxS =
        "\1\10\1\43\1\133\4\44\2\uffff\6\134\3\44\1\162\1\134\1\162\5\134"+
        "\3\41\1\44\1\134\3\41\1\44\5\134";
    static final String DFA28_acceptS =
        "\7\uffff\1\1\1\2\37\uffff";
    static final String DFA28_specialS =
        "\50\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1",
            "\1\7\11\uffff\1\10\11\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\3\uffff"+
            "\1\7",
            "\1\21\21\uffff\1\17\1\20\72\uffff\1\12\1\11\1\13\1\14\1\15"+
            "\1\16",
            "\1\7\11\uffff\1\10\20\uffff\1\22\2\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\22\2\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\22\2\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\22\2\uffff\2\7",
            "",
            "",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\23",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\25",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\26",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\27",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\30",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\31",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7",
            "\1\35\116\uffff\1\32\1\33\1\34",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\36",
            "\1\42\116\uffff\1\37\1\40\1\41",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\43",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\44",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\45",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\46",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\47",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\7\11\uffff\1\10\23\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\36",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\7\11\uffff\1\10\23\uffff\2\7",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\43",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\44",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\45",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\46",
            "\1\7\11\uffff\1\10\20\uffff\1\24\2\uffff\2\7\67\uffff\1\47"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "503:1: variable_definition[boolean functionArg] returns [ Declaration dec = null ] : (v= variable_def[functionArg] ( NEWLINE | EQUAL ( simple_expression NEWLINE ) )? | function_definition );";
        }
    }
    static final String DFA46_eotS =
        "\14\uffff";
    static final String DFA46_eofS =
        "\14\uffff";
    static final String DFA46_minS =
        "\2\10\1\5\5\uffff\1\10\2\uffff\1\5";
    static final String DFA46_maxS =
        "\1\162\1\10\1\u0082\5\uffff\1\10\2\uffff\1\u0082";
    static final String DFA46_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\2\1\1\1\uffff";
    static final String DFA46_specialS =
        "\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\5\uffff\1\1\1\4\53\uffff\1\5\1\6\1\7\4\3\56\uffff\3\3",
            "\1\2",
            "\1\12\2\uffff\1\12\3\uffff\1\12\2\uffff\1\11\1\12\2\uffff\3"+
            "\12\1\uffff\2\12\11\uffff\2\12\1\uffff\5\12\2\uffff\1\12\1\uffff"+
            "\14\12\1\10\14\uffff\1\12\5\uffff\1\12\4\uffff\3\12\54\uffff"+
            "\2\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "\1\12\2\uffff\1\12\3\uffff\1\12\2\uffff\1\11\1\12\2\uffff\3"+
            "\12\1\uffff\2\12\11\uffff\2\12\1\uffff\5\12\2\uffff\1\12\1\uffff"+
            "\14\12\1\10\14\uffff\1\12\5\uffff\1\12\4\uffff\3\12\54\uffff"+
            "\2\12"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "669:1: factor : ( ( NEW )? ( IDENTIFIER DOT )* IDENTIFIER | ( NEW )? func_var_designator | constant_expression | LPAREN simple_expression RPAREN | SELF | NULL | LINE_CONTINUATION );";
        }
    }
    static final String DFA56_eotS =
        "\21\uffff";
    static final String DFA56_eofS =
        "\21\uffff";
    static final String DFA56_minS =
        "\1\5\1\0\17\uffff";
    static final String DFA56_maxS =
        "\1\162\1\0\17\uffff";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\15\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\2\uffff\1\2\5\uffff\1\2\1\1\43\uffff\2\2\6\uffff\7\2\56"+
            "\uffff\3\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "702:2: ( ( LPAREN )=> LPAREN ( expression_list )? RPAREN ( DOT expression )? | ( expression_list )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_blitzmax()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_main_statements_in_file_input79 = new BitSet(new long[]{0x0000106001F801F0L,0x000000000005F080L});
    public static final BitSet FOLLOW_EOF_in_file_input109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPERSTRICT_in_main_statements122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICT_in_main_statements135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_main_statements137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_framework_stmt_in_main_statements152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_stmt_in_main_statements158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleinfo_stmt_in_main_statements164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_main_statements174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_block_in_main_statements189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_block_in_main_statements204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_main_statements215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_block235 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block243 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_EXTENDS_in_type_block256 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_block265 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_type_block285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_type_block301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block322 = new BitSet(new long[]{0x00000020005C3020L,0x1000000000000000L});
    public static final BitSet FOLLOW_type_content_list_in_type_block333 = new BitSet(new long[]{0x0000000000001000L,0x1000000000000000L});
    public static final BitSet FOLLOW_END_in_type_block350 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TYPE_in_type_block352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_124_in_type_block360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_type_block370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_type_content_list390 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_global_def_in_type_content_list398 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_field_def_in_type_content_list406 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_method_block_in_type_content_list418 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_function_block_in_type_content_list435 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_rem_block_in_type_content_list448 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_NEWLINE_in_type_content_list455 = new BitSet(new long[]{0x00000020005C2022L});
    public static final BitSet FOLLOW_METHOD_in_method_block480 = new BitSet(new long[]{0x0000000000024100L});
    public static final BitSet FOLLOW_function_definition_in_method_block494 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_block511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_method_block539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEW_in_method_block575 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_method_block577 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_method_block583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DELETE_in_method_block600 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_method_block602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_method_block608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block622 = new BitSet(new long[]{0x0000106001F811F0L,0x200000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_method_block630 = new BitSet(new long[]{0x0000000000001000L,0x2000000000000000L});
    public static final BitSet FOLLOW_END_in_method_block645 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_METHOD_in_method_block647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_125_in_method_block655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_method_block669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_in_field_def682 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_field_def691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_field_def701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_in_global_def714 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_global_def723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_global_def733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_const_def746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_const_def754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_const_def764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_in_local_def778 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_list_in_local_def786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_local_def796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_function_definition_in_function_block823 = new BitSet(new long[]{0x0000106001F811F0L,0x400000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_function_block836 = new BitSet(new long[]{0x0000000000001000L,0x4000000000000000L});
    public static final BitSet FOLLOW_END_in_function_block851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FUNCTION_in_function_block853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_126_in_function_block861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_function_block871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_statement_block903 = new BitSet(new long[]{0x0000106001F801F2L,0x000000000005F080L});
    public static final BitSet FOLLOW_include_stmt_in_statement_list942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_block_in_statement_list952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_block_in_statement_list963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_block_in_statement_list969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_def_in_statement_list975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_def_in_statement_list982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_def_in_statement_list989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rem_block_in_statement_list996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_block_in_statement_list1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGSTOP_in_statement_list1008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement_list1019 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_statement_list1021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_or_function_call_in_statement_list1029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement_list1037 = new BitSet(new long[]{0x0000000800000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_assignment_in_statement_list1039 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_statement_list1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement_list1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition1075 = new BitSet(new long[]{0x00000000F2008000L});
    public static final BitSet FOLLOW_typedef_in_function_definition1083 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function_definition1088 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_argument_list_in_function_definition1096 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function_definition1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typedef1144 = new BitSet(new long[]{0x000000000C000100L,0x000000000FC00000L});
    public static final BitSet FOLLOW_named_type_in_typedef1154 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_type_in_typedef1200 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_array_type_in_typedef1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_def_in_named_type1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_def_in_named_type1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_def_in_named_type1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_def_in_named_type1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_def_in_named_type1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_def_in_named_type1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_named_type1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_TYPE_in_named_type1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_type1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_type1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_symbol_type1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_symbol_type1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_symbol_type1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_symbol_type1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_type1447 = new BitSet(new long[]{0x0000000200000000L,0x0007000000000000L});
    public static final BitSet FOLLOW_number_in_array_type1450 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACK_in_array_type1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_argument_list1474 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list1485 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argument_in_argument_list1491 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_variable_def_in_argument1523 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_EQUAL_in_argument1527 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_simple_expression_in_argument1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_argument1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_def_in_variable_definition1561 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_NEWLINE_in_variable_definition1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_variable_definition1569 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_simple_expression_in_variable_definition1574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_variable_definition1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_variable_definition1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable_def1609 = new BitSet(new long[]{0x00000000F2000002L});
    public static final BitSet FOLLOW_typedef_in_variable_def1619 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_VAR_in_variable_def1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block1679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_rem_block1681 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_rem_block_contents_in_rem_block1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_rem_block_contents1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_rem_block_contents1711 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_rem_block_contents1714 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_rem_block_contents_in_rem_block_contents1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_rem_block_contents1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_block1750 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_LOCAL_in_for_block1755 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_def_in_for_block1765 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_EQUAL_in_for_block1771 = new BitSet(new long[]{0xF81804000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_for_block1791 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_TO_in_for_block1805 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_UNTIL_in_for_block1820 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_for_block1845 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_STEP_in_for_block1859 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_for_block1871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EACHIN_in_for_block1901 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_for_block1919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1939 = new BitSet(new long[]{0x0000186001F801F0L,0x000000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_for_block1947 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NEXT_in_for_block1956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_for_block1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat_block1970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1972 = new BitSet(new long[]{0x0000316001F801F0L,0x000000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_repeat_block1980 = new BitSet(new long[]{0x0000210000000000L});
    public static final BitSet FOLLOW_FOREVER_in_repeat_block1985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_UNTIL_in_repeat_block1989 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_repeat_block1991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_block1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_expr2027 = new BitSet(new long[]{0x0007C00800000002L});
    public static final BitSet FOLLOW_set_in_expr2034 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_simple_expression_in_expr2059 = new BitSet(new long[]{0x0007C00800000002L});
    public static final BitSet FOLLOW_term_in_simple_expression2079 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_adding_operator_in_simple_expression2083 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_term_in_simple_expression2085 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_set_in_adding_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_factor_in_term2130 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_multiplying_operator_in_term2134 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_signed_factor_in_term2136 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_set_in_multiplying_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_factor2185 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_factor_in_signed_factor2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_factor2211 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_factor2215 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_DOT_in_factor2217 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_factor2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_factor2229 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_func_var_designator_in_factor2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_expression_in_factor2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factor2249 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_simple_expression_in_factor2251 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_factor2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_factor2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_factor2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_CONTINUATION_in_factor2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_func_var_designator2294 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_DOT_in_func_var_designator2297 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_func_var_designator2299 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_func_var_designator2303 = new BitSet(new long[]{0xF81800000001C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expr_in_func_var_designator2306 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_COMMA_in_func_var_designator2309 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expr_in_func_var_designator2311 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_RPAREN_in_func_var_designator2318 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_DOT_in_func_var_designator2321 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_factor_in_func_var_designator2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constant_expression2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant_expression2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant_expression2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant_expression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_TEST_in_constant_expression2359 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_factor_in_constant_expression2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call2409 = new BitSet(new long[]{0xFC1800000000C102L,0x0007000000000003L});
    public static final BitSet FOLLOW_DOT_in_cast_or_function_call2412 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_cast_or_function_call2414 = new BitSet(new long[]{0xFC1800000000C102L,0x0007000000000003L});
    public static final BitSet FOLLOW_LPAREN_in_cast_or_function_call2428 = new BitSet(new long[]{0xF81800000001C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call2432 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_cast_or_function_call2435 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_DOT_in_cast_or_function_call2440 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_cast_or_function_call2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_list_in_cast_or_function_call2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list2469 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list2472 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_expression_list2474 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_WHILE_in_while_block2487 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_while_block2489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block2491 = new BitSet(new long[]{0x0000106001F801F0L,0x000000000005F180L});
    public static final BitSet FOLLOW_statement_block_in_while_block2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_WEND_in_while_block2499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_while_block2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_block2512 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_select_block2514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block2516 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_case_block_in_select_block2520 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_default_block_in_select_block2525 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_end_select_in_select_block2530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_select_block2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_block2545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_default_block2547 = new BitSet(new long[]{0x0000106001F801F0L,0x000000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_default_block2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_select2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SELECT_in_end_select2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_end_select2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_block2581 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_case_block2583 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_COMMA_in_case_block2586 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_case_block2588 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_NEWLINE_in_case_block2592 = new BitSet(new long[]{0x0000106001F801F0L,0x000000000005F080L});
    public static final BitSet FOLLOW_statement_block_in_case_block2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_stmt2615 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_string_literal_in_import_stmt2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_module_name_in_import_stmt2646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_import_stmt2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include_stmt2672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_include_stmt2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAMEWORK_in_framework_stmt2685 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_module_name_in_framework_stmt2687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_framework_stmt2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_stmt2700 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_module_name_in_module_stmt2702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_module_stmt2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULEINFO_in_moduleinfo_stmt2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_moduleinfo_stmt2718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_moduleinfo_stmt2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2741 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_DOT_in_module_name2743 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_module_name2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEBUGLOG_in_debuglog_stmt2765 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_debuglog_stmt2767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_debuglog_stmt2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_block2783 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_if_block2785 = new BitSet(new long[]{0x0000106001F811F0L,0x00000000001DF080L,0x0000000000000006L});
    public static final BitSet FOLLOW_THEN_in_if_block2789 = new BitSet(new long[]{0x0000106001F811F0L,0x000000000015F080L,0x0000000000000006L});
    public static final BitSet FOLLOW_statement_block_in_if_block2797 = new BitSet(new long[]{0x0000000000001000L,0x0000000000100000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ELSE_in_if_block2815 = new BitSet(new long[]{0x0000106001F811F0L,0x000000000005F080L,0x0000000000000004L});
    public static final BitSet FOLLOW_129_in_if_block2829 = new BitSet(new long[]{0xF81800000000C100L,0x0007000000000003L});
    public static final BitSet FOLLOW_expression_in_if_block2831 = new BitSet(new long[]{0x0000000000000020L,0x0000000000080000L});
    public static final BitSet FOLLOW_THEN_in_if_block2833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_block2836 = new BitSet(new long[]{0x0000106001F811F0L,0x000000000005F080L,0x0000000000000004L});
    public static final BitSet FOLLOW_statement_block_in_if_block2850 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_END_in_if_block2867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_IF_in_if_block2869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_130_in_if_block2876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_if_block2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def3190 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_POINTER_in_pointer_def3204 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_BYTE_TYPE_in_byte_def3236 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_byte_def3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_int_def3269 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_int_def3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_TYPE_in_short_def3301 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_short_def3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_long_def3334 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_long_def3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_float_def3367 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_float_def3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_double_def3400 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_pointer_def_in_double_def3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_number3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_number3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_blitzmax2424 = new BitSet(new long[]{0x0000000000000002L});

}