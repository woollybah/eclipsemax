// $ANTLR 3.1.2 C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g 2009-06-19 09:03:57

package net.brucey.dltk.blitzmax.core.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class blitzmaxLexer extends Lexer {
    public static final int WEND=44;
    public static final int FUNCTION=17;
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
    public static final int VBAR=91;
    public static final int MINUSEQUAL=102;
    public static final int FINAL=10;
    public static final int RPAREN=19;
    public static final int IMPORT=48;
    public static final int STRING_LITERAL=50;
    public static final int GREATER=94;
    public static final int INCLUDE=49;
    public static final int ALPHA_LOWER=119;
    public static final int LESS=93;
    public static final int VAR=30;
    public static final int SUPER=69;
    public static final int SELECT=45;
    public static final int EXIT=79;
    public static final int RBRACK=28;
    public static final int FLOAT_TYPE=63;
    public static final int STRICT=5;
    public static final int POUND=24;
    public static final int LINE_COMMENT=59;
    public static final int OBJECT_TYPE=22;
    public static final int ALPHA_UPPER=120;
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
    public static final int IF=56;
    public static final int PLUSEQUAL=101;
    public static final int SLASH=90;
    public static final int THEN=57;
    public static final int CONTINUE=73;
    public static final int COMMA=29;
    public static final int IDENTIFIER=7;
    public static final int AMPER=92;
    public static final int EQUAL=33;
    public static final int TILDE=96;
    public static final int NEXT=38;
    public static final int PLUS=87;
    public static final int LEFTSHIFT=106;
    public static final int DIGIT=118;
    public static final int DEBUGLOG=55;
    public static final int DOT=54;
    public static final int ARITHRIGHTSHIFT=108;
    public static final int MODULEINFO=53;
    public static final int PERCENT=23;
    public static final int TO=34;
    public static final int DEFAULT=46;
    public static final int BANG=25;
    public static final int REM=31;
    public static final int MINUS=88;
    public static final int AND_TEST=84;
    public static final int MODULE=52;
    public static final int TRUE=41;
    public static final int SEMI=86;
    public static final int COLON=20;
    public static final int EACHIN=37;
    public static final int NEWLINE=122;
    public static final int OR_TEST=85;
    public static final int GLOBAL=14;
    public static final int FRACTION=116;
    public static final int LONG=111;
    public static final int SELF=70;
    public static final int EXTENDS=8;
    public static final int METHOD=12;
    public static final int STAREQUAL=103;

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    public int implicitLineJoiningLevel = 0;
    public int startPos=-1;
    public void emitErrorMessage(String msg) {
    }


    // delegates
    // delegators

    public blitzmaxLexer() {;} 
    public blitzmaxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public blitzmaxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g"; }

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:18:8: ( 'endtype' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:18:10: 'endtype'
            {
            match("endtype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:19:8: ( 'endmethod' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:19:10: 'endmethod'
            {
            match("endmethod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:20:8: ( 'endfunction' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:20:10: 'endfunction'
            {
            match("endfunction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:21:8: ( 'endrem' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:21:10: 'endrem'
            {
            match("endrem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:22:8: ( 'endselect' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:22:10: 'endselect'
            {
            match("endselect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:23:8: ( 'elseif' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:23:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:24:8: ( 'endif' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:24:10: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:2: ( '\\'' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:4: '\\'' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('\''); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:9: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:23: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:629:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "SUPERSTRICT"
    public final void mSUPERSTRICT() throws RecognitionException {
        try {
            int _type = SUPERSTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:13: ( 'superstrict' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:632:15: 'superstrict'
            {
            match("superstrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPERSTRICT"

    // $ANTLR start "STRICT"
    public final void mSTRICT() throws RecognitionException {
        try {
            int _type = STRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:633:8: ( 'strict' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:633:10: 'strict'
            {
            match("strict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRICT"

    // $ANTLR start "FRAMEWORK"
    public final void mFRAMEWORK() throws RecognitionException {
        try {
            int _type = FRAMEWORK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:635:11: ( 'framework' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:635:13: 'framework'
            {
            match("framework"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FRAMEWORK"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:636:8: ( 'module' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:636:10: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "MODULEINFO"
    public final void mMODULEINFO() throws RecognitionException {
        try {
            int _type = MODULEINFO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:637:12: ( 'moduleinfo' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:637:14: 'moduleinfo'
            {
            match("moduleinfo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULEINFO"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:638:8: ( 'import' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:638:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:639:9: ( 'include' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:639:11: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "LOCAL"
    public final void mLOCAL() throws RecognitionException {
        try {
            int _type = LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:641:7: ( 'local' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:641:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCAL"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:642:8: ( 'global' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:642:10: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:643:6: ( 'type' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:643:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:644:10: ( 'function' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:644:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "METHOD"
    public final void mMETHOD() throws RecognitionException {
        try {
            int _type = METHOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:645:8: ( 'method' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:645:10: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:646:8: ( 'extern' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:646:10: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:647:9: ( 'extends' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:647:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:648:10: ( 'abstract' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:648:12: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:649:7: ( 'final' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:649:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FIELD"
    public final void mFIELD() throws RecognitionException {
        try {
            int _type = FIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:650:7: ( 'field' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:650:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIELD"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:651:7: ( 'const' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:651:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:652:5: ( 'var' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:652:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:654:5: ( 'rem' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:654:7: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:656:6: ( 'true' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:656:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:657:7: ( 'false' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:657:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "LONG_TYPE"
    public final void mLONG_TYPE() throws RecognitionException {
        try {
            int _type = LONG_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:659:11: ( 'long' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:659:13: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG_TYPE"

    // $ANTLR start "INT_TYPE"
    public final void mINT_TYPE() throws RecognitionException {
        try {
            int _type = INT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:660:10: ( 'int' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:660:12: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_TYPE"

    // $ANTLR start "FLOAT_TYPE"
    public final void mFLOAT_TYPE() throws RecognitionException {
        try {
            int _type = FLOAT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:661:12: ( 'float' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:661:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_TYPE"

    // $ANTLR start "DOUBLE_TYPE"
    public final void mDOUBLE_TYPE() throws RecognitionException {
        try {
            int _type = DOUBLE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:662:13: ( 'double' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:662:15: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_TYPE"

    // $ANTLR start "BYTE_TYPE"
    public final void mBYTE_TYPE() throws RecognitionException {
        try {
            int _type = BYTE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:663:11: ( 'byte' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:663:13: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE_TYPE"

    // $ANTLR start "STRING_TYPE"
    public final void mSTRING_TYPE() throws RecognitionException {
        try {
            int _type = STRING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:664:13: ( 'string' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:664:15: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_TYPE"

    // $ANTLR start "SHORT_TYPE"
    public final void mSHORT_TYPE() throws RecognitionException {
        try {
            int _type = SHORT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:665:12: ( 'short' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:665:14: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHORT_TYPE"

    // $ANTLR start "OBJECT_TYPE"
    public final void mOBJECT_TYPE() throws RecognitionException {
        try {
            int _type = OBJECT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:666:13: ( 'object' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:666:15: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT_TYPE"

    // $ANTLR start "POINTER"
    public final void mPOINTER() throws RecognitionException {
        try {
            int _type = POINTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:667:10: ( 'ptr' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:667:12: 'ptr'
            {
            match("ptr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINTER"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:6: ( 'null' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:669:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:670:7: ( 'super' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:670:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:671:6: ( 'self' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:671:8: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:672:5: ( 'new' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:672:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:673:8: ( 'delete' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:673:10: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:752:5: ( 'for' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:752:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:753:6: ( 'next' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:753:8: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:754:4: ( 'to' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:754:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "EACHIN"
    public final void mEACHIN() throws RecognitionException {
        try {
            int _type = EACHIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:755:8: ( 'eachin' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:755:10: 'eachin'
            {
            match("eachin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EACHIN"

    // $ANTLR start "STEP"
    public final void mSTEP() throws RecognitionException {
        try {
            int _type = STEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:756:6: ( 'step' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:756:8: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STEP"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:757:7: ( 'while' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:757:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WEND"
    public final void mWEND() throws RecognitionException {
        try {
            int _type = WEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:758:6: ( 'wend' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:758:8: 'wend'
            {
            match("wend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEND"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:759:8: ( 'repeat' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:759:10: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:760:7: ( 'until' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:760:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "FOREVER"
    public final void mFOREVER() throws RecognitionException {
        try {
            int _type = FOREVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:761:9: ( 'forever' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:761:11: 'forever'
            {
            match("forever"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREVER"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:762:10: ( 'continue' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:762:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:763:8: ( 'select' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:763:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:764:6: ( 'case' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:764:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:765:9: ( 'default' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:765:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:766:4: ( 'if' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:766:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:767:6: ( 'then' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:767:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:768:6: ( 'else' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:768:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:770:5: ( 'try' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:770:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:771:7: ( 'catch' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:771:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:772:7: ( 'throw' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:772:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:773:8: ( 'assert' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:773:10: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "DEBUGLOG"
    public final void mDEBUGLOG() throws RecognitionException {
        try {
            int _type = DEBUGLOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:774:9: ( 'debuglog' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:774:11: 'debuglog'
            {
            match("debuglog"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEBUGLOG"

    // $ANTLR start "DEBUGSTOP"
    public final void mDEBUGSTOP() throws RecognitionException {
        try {
            int _type = DEBUGSTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:775:11: ( 'debugstop' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:775:13: 'debugstop'
            {
            match("debugstop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEBUGSTOP"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:777:6: ( 'exit' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:777:8: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:778:5: ( 'end' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:778:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "INCBIN"
    public final void mINCBIN() throws RecognitionException {
        try {
            int _type = INCBIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:780:8: ( 'incbin' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:780:10: 'incbin'
            {
            match("incbin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCBIN"

    // $ANTLR start "INCBINPTR"
    public final void mINCBINPTR() throws RecognitionException {
        try {
            int _type = INCBINPTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:781:11: ( 'incbinptr' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:781:13: 'incbinptr'
            {
            match("incbinptr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCBINPTR"

    // $ANTLR start "INCBINLEN"
    public final void mINCBINLEN() throws RecognitionException {
        try {
            int _type = INCBINLEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:782:11: ( 'incbinlen' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:782:13: 'incbinlen'
            {
            match("incbinlen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCBINLEN"

    // $ANTLR start "NOT_TEST"
    public final void mNOT_TEST() throws RecognitionException {
        try {
            int _type = NOT_TEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:784:10: ( 'not' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:784:12: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_TEST"

    // $ANTLR start "AND_TEST"
    public final void mAND_TEST() throws RecognitionException {
        try {
            int _type = AND_TEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:785:10: ( 'and' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:785:12: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND_TEST"

    // $ANTLR start "OR_TEST"
    public final void mOR_TEST() throws RecognitionException {
        try {
            int _type = OR_TEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:786:9: ( 'or' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:786:11: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR_TEST"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:788:6: ( ';' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:788:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:789:6: ( '+' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:789:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:790:7: ( '-' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:790:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:791:6: ( '*' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:791:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:792:7: ( '/' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:792:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:793:6: ( '|' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:793:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "AMPER"
    public final void mAMPER() throws RecognitionException {
        try {
            int _type = AMPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:794:7: ( '&' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:794:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:795:6: ( '<' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:795:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:796:9: ( '>' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:796:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:797:7: ( '=' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:797:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:798:9: ( '%' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:798:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:799:7: ( '^' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:799:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:800:8: ( ':' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:800:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:801:7: ( ',' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:801:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:802:7: ( '~' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:802:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:803:7: ( '#' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:803:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:804:6: ( '!' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:804:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:805:8: ( '$' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:805:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:807:5: ( '.' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:807:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:808:12: ( '_' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:808:14: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:811:8: ( '(' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:811:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:813:8: ( ')' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:813:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:815:8: ( '[' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:815:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:817:8: ( ']' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:817:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:820:9: ( '<>' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:820:11: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:821:11: ( '<=' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:821:13: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:822:14: ( '>=' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:822:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:823:11: ( ':+' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:823:13: ':+'
            {
            match(":+"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:824:12: ( ':-' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:824:14: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "STAREQUAL"
    public final void mSTAREQUAL() throws RecognitionException {
        try {
            int _type = STAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:825:11: ( ':*' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:825:13: ':*'
            {
            match(":*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQUAL"

    // $ANTLR start "SLASHEQUAL"
    public final void mSLASHEQUAL() throws RecognitionException {
        try {
            int _type = SLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:826:12: ( ':/' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:826:14: ':/'
            {
            match(":/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQUAL"

    // $ANTLR start "VBAREQUAL"
    public final void mVBAREQUAL() throws RecognitionException {
        try {
            int _type = VBAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:827:11: ( ':|' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:827:13: ':|'
            {
            match(":|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAREQUAL"

    // $ANTLR start "LEFTSHIFT"
    public final void mLEFTSHIFT() throws RecognitionException {
        try {
            int _type = LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:828:11: ( 'shl' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:828:13: 'shl'
            {
            match("shl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFT"

    // $ANTLR start "RIGHTSHIFT"
    public final void mRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:829:12: ( 'shr' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:829:14: 'shr'
            {
            match("shr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFT"

    // $ANTLR start "ARITHRIGHTSHIFT"
    public final void mARITHRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = ARITHRIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:830:17: ( 'sar' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:830:19: 'sar'
            {
            match("sar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARITHRIGHTSHIFT"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:832:6: ( 'mod' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:832:8: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:847:9: ( POINTFLOAT | EXPONENTFLOAT )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:847:11: POINTFLOAT
                    {
                    mPOINTFLOAT(); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:847:24: EXPONENTFLOAT
                    {
                    mEXPONENTFLOAT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "POINTFLOAT"
    public final void mPOINTFLOAT() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:851:2: ( ( DIGITS )? FRACTION | DIGITS DOT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:851:4: ( DIGITS )? FRACTION
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:851:4: ( DIGITS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:851:4: DIGITS
                            {
                            mDIGITS(); 

                            }
                            break;

                    }

                    mFRACTION(); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:851:23: DIGITS DOT
                    {
                    mDIGITS(); 
                    mDOT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "POINTFLOAT"

    // $ANTLR start "FRACTION"
    public final void mFRACTION() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:856:2: ( DOT DIGITS )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:856:4: DOT DIGITS
            {
            mDOT(); 
            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "FRACTION"

    // $ANTLR start "EXPONENTFLOAT"
    public final void mEXPONENTFLOAT() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:860:2: ( ( DIGITS | POINTFLOAT ) Exponent )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:860:4: ( DIGITS | POINTFLOAT ) Exponent
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:860:4: ( DIGITS | POINTFLOAT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:860:5: DIGITS
                    {
                    mDIGITS(); 

                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:860:14: POINTFLOAT
                    {
                    mPOINTFLOAT(); 

                    }
                    break;

            }

            mExponent(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENTFLOAT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:865:2: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:865:4: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:865:16: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:868:7: ( INT )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:868:10: INT
            {
            mINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:871:5: ( '$' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+ | ( MINUS )? ( DIGITS )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='$') ) {
                alt11=1;
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:872:9: '$' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('$'); 
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:872:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:873:9: ( MINUS )? ( DIGITS )*
                    {
                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:873:9: ( MINUS )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:873:9: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:873:16: ( DIGITS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:873:16: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ALPHA_LOWER"
    public final void mALPHA_LOWER() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:878:2: ( 'a' .. 'z' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:878:4: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHA_LOWER"

    // $ANTLR start "ALPHA_UPPER"
    public final void mALPHA_UPPER() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:883:2: ( 'A' .. 'Z' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:883:4: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHA_UPPER"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:887:8: ( ( DIGIT )+ )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:887:10: ( DIGIT )+
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:887:10: ( DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:887:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:890:8: ( '0' .. '9' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:890:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:893:11: ( ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE ) ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )* )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:893:13: ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE ) ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:894:9: ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:897:12: ( ( ' ' | '\\t' )+ )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:897:14: ( ' ' | '\\t' )+
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:897:14: ( ' ' | '\\t' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\t'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:908:2: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:908:4: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:908:8: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\"') ) {
                    alt15=2;
                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:908:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:5: ( ( ( '\\r' )? '\\n' )+ )
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:9: ( ( '\\r' )? '\\n' )+
            {
            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:9: ( ( '\\r' )? '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:10: ( '\\r' )? '\\n'
            	    {
            	    // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:10: ( '\\r' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='\r') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:912:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:8: ( T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | LINE_COMMENT | SUPERSTRICT | STRICT | FRAMEWORK | MODULE | MODULEINFO | IMPORT | INCLUDE | LOCAL | GLOBAL | TYPE | FUNCTION | METHOD | EXTERN | EXTENDS | ABSTRACT | FINAL | FIELD | CONST | VAR | REM | TRUE | FALSE | LONG_TYPE | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BYTE_TYPE | STRING_TYPE | SHORT_TYPE | OBJECT_TYPE | POINTER | NULL | SUPER | SELF | NEW | DELETE | FOR | NEXT | TO | EACHIN | STEP | WHILE | WEND | REPEAT | UNTIL | FOREVER | CONTINUE | SELECT | CASE | DEFAULT | IF | THEN | ELSE | TRY | CATCH | THROW | ASSERT | DEBUGLOG | DEBUGSTOP | EXIT | END | INCBIN | INCBINPTR | INCBINLEN | NOT_TEST | AND_TEST | OR_TEST | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | EQUAL | PERCENT | POWER | COLON | COMMA | TILDE | POUND | BANG | DOLLAR | DOT | UNDERSCORE | LPAREN | RPAREN | LBRACK | RBRACK | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL | LEFTSHIFT | RIGHTSHIFT | ARITHRIGHTSHIFT | MOD | FLOAT | LONG | IDENTIFIER | WHITESPACE | STRING_LITERAL | NEWLINE )
        int alt18=117;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:10: T__123
                {
                mT__123(); 

                }
                break;
            case 2 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:17: T__124
                {
                mT__124(); 

                }
                break;
            case 3 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:24: T__125
                {
                mT__125(); 

                }
                break;
            case 4 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:31: T__126
                {
                mT__126(); 

                }
                break;
            case 5 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:38: T__127
                {
                mT__127(); 

                }
                break;
            case 6 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:45: T__128
                {
                mT__128(); 

                }
                break;
            case 7 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:52: T__129
                {
                mT__129(); 

                }
                break;
            case 8 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:59: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 9 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:72: SUPERSTRICT
                {
                mSUPERSTRICT(); 

                }
                break;
            case 10 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:84: STRICT
                {
                mSTRICT(); 

                }
                break;
            case 11 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:91: FRAMEWORK
                {
                mFRAMEWORK(); 

                }
                break;
            case 12 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:101: MODULE
                {
                mMODULE(); 

                }
                break;
            case 13 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:108: MODULEINFO
                {
                mMODULEINFO(); 

                }
                break;
            case 14 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:119: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 15 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:126: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 16 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:134: LOCAL
                {
                mLOCAL(); 

                }
                break;
            case 17 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:140: GLOBAL
                {
                mGLOBAL(); 

                }
                break;
            case 18 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:147: TYPE
                {
                mTYPE(); 

                }
                break;
            case 19 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:152: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 20 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:161: METHOD
                {
                mMETHOD(); 

                }
                break;
            case 21 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:168: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 22 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:175: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 23 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:183: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 24 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:192: FINAL
                {
                mFINAL(); 

                }
                break;
            case 25 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:198: FIELD
                {
                mFIELD(); 

                }
                break;
            case 26 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:204: CONST
                {
                mCONST(); 

                }
                break;
            case 27 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:210: VAR
                {
                mVAR(); 

                }
                break;
            case 28 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:214: REM
                {
                mREM(); 

                }
                break;
            case 29 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:218: TRUE
                {
                mTRUE(); 

                }
                break;
            case 30 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:223: FALSE
                {
                mFALSE(); 

                }
                break;
            case 31 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:229: LONG_TYPE
                {
                mLONG_TYPE(); 

                }
                break;
            case 32 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:239: INT_TYPE
                {
                mINT_TYPE(); 

                }
                break;
            case 33 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:248: FLOAT_TYPE
                {
                mFLOAT_TYPE(); 

                }
                break;
            case 34 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:259: DOUBLE_TYPE
                {
                mDOUBLE_TYPE(); 

                }
                break;
            case 35 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:271: BYTE_TYPE
                {
                mBYTE_TYPE(); 

                }
                break;
            case 36 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:281: STRING_TYPE
                {
                mSTRING_TYPE(); 

                }
                break;
            case 37 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:293: SHORT_TYPE
                {
                mSHORT_TYPE(); 

                }
                break;
            case 38 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:304: OBJECT_TYPE
                {
                mOBJECT_TYPE(); 

                }
                break;
            case 39 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:316: POINTER
                {
                mPOINTER(); 

                }
                break;
            case 40 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:324: NULL
                {
                mNULL(); 

                }
                break;
            case 41 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:329: SUPER
                {
                mSUPER(); 

                }
                break;
            case 42 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:335: SELF
                {
                mSELF(); 

                }
                break;
            case 43 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:340: NEW
                {
                mNEW(); 

                }
                break;
            case 44 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:344: DELETE
                {
                mDELETE(); 

                }
                break;
            case 45 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:351: FOR
                {
                mFOR(); 

                }
                break;
            case 46 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:355: NEXT
                {
                mNEXT(); 

                }
                break;
            case 47 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:360: TO
                {
                mTO(); 

                }
                break;
            case 48 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:363: EACHIN
                {
                mEACHIN(); 

                }
                break;
            case 49 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:370: STEP
                {
                mSTEP(); 

                }
                break;
            case 50 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:375: WHILE
                {
                mWHILE(); 

                }
                break;
            case 51 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:381: WEND
                {
                mWEND(); 

                }
                break;
            case 52 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:386: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 53 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:393: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 54 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:399: FOREVER
                {
                mFOREVER(); 

                }
                break;
            case 55 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:407: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 56 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:416: SELECT
                {
                mSELECT(); 

                }
                break;
            case 57 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:423: CASE
                {
                mCASE(); 

                }
                break;
            case 58 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:428: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 59 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:436: IF
                {
                mIF(); 

                }
                break;
            case 60 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:439: THEN
                {
                mTHEN(); 

                }
                break;
            case 61 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:444: ELSE
                {
                mELSE(); 

                }
                break;
            case 62 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:449: TRY
                {
                mTRY(); 

                }
                break;
            case 63 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:453: CATCH
                {
                mCATCH(); 

                }
                break;
            case 64 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:459: THROW
                {
                mTHROW(); 

                }
                break;
            case 65 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:465: ASSERT
                {
                mASSERT(); 

                }
                break;
            case 66 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:472: DEBUGLOG
                {
                mDEBUGLOG(); 

                }
                break;
            case 67 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:481: DEBUGSTOP
                {
                mDEBUGSTOP(); 

                }
                break;
            case 68 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:491: EXIT
                {
                mEXIT(); 

                }
                break;
            case 69 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:496: END
                {
                mEND(); 

                }
                break;
            case 70 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:500: INCBIN
                {
                mINCBIN(); 

                }
                break;
            case 71 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:507: INCBINPTR
                {
                mINCBINPTR(); 

                }
                break;
            case 72 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:517: INCBINLEN
                {
                mINCBINLEN(); 

                }
                break;
            case 73 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:527: NOT_TEST
                {
                mNOT_TEST(); 

                }
                break;
            case 74 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:536: AND_TEST
                {
                mAND_TEST(); 

                }
                break;
            case 75 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:545: OR_TEST
                {
                mOR_TEST(); 

                }
                break;
            case 76 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:553: SEMI
                {
                mSEMI(); 

                }
                break;
            case 77 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:558: PLUS
                {
                mPLUS(); 

                }
                break;
            case 78 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:563: MINUS
                {
                mMINUS(); 

                }
                break;
            case 79 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:569: STAR
                {
                mSTAR(); 

                }
                break;
            case 80 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:574: SLASH
                {
                mSLASH(); 

                }
                break;
            case 81 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:580: VBAR
                {
                mVBAR(); 

                }
                break;
            case 82 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:585: AMPER
                {
                mAMPER(); 

                }
                break;
            case 83 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:591: LESS
                {
                mLESS(); 

                }
                break;
            case 84 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:596: GREATER
                {
                mGREATER(); 

                }
                break;
            case 85 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:604: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 86 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:610: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 87 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:618: POWER
                {
                mPOWER(); 

                }
                break;
            case 88 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:624: COLON
                {
                mCOLON(); 

                }
                break;
            case 89 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:630: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 90 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:636: TILDE
                {
                mTILDE(); 

                }
                break;
            case 91 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:642: POUND
                {
                mPOUND(); 

                }
                break;
            case 92 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:648: BANG
                {
                mBANG(); 

                }
                break;
            case 93 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:653: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 94 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:660: DOT
                {
                mDOT(); 

                }
                break;
            case 95 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:664: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 96 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:675: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 97 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:682: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 98 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:689: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 99 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:696: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 100 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:703: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 101 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:712: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 102 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:722: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 103 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:735: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 104 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:745: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 105 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:756: STAREQUAL
                {
                mSTAREQUAL(); 

                }
                break;
            case 106 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:766: SLASHEQUAL
                {
                mSLASHEQUAL(); 

                }
                break;
            case 107 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:777: VBAREQUAL
                {
                mVBAREQUAL(); 

                }
                break;
            case 108 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:787: LEFTSHIFT
                {
                mLEFTSHIFT(); 

                }
                break;
            case 109 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:797: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 

                }
                break;
            case 110 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:808: ARITHRIGHTSHIFT
                {
                mARITHRIGHTSHIFT(); 

                }
                break;
            case 111 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:824: MOD
                {
                mMOD(); 

                }
                break;
            case 112 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:828: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 113 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:834: LONG
                {
                mLONG(); 

                }
                break;
            case 114 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:839: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 115 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:850: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 116 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:861: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 117 :
                // C:\\000_programming\\eclipse_plugins\\workspace\\net.brucey.dltk.blitzmax.core\\src\\net\\brucey\\dltk\\blitzmax\\core\\parsers\\blitzmax.g:1:876: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA3_eotS =
        "\4\uffff\2\6\1\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\2\56\1\60\1\uffff\2\60\1\uffff";
    static final String DFA3_maxS =
        "\1\71\1\145\1\71\1\uffff\2\145\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\2\2\uffff\1\1";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\5",
            "",
            "\12\5\13\uffff\1\3\37\uffff\1\3",
            "\12\5\13\uffff\1\3\37\uffff\1\3",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "847:1: FLOAT : ( POINTFLOAT | EXPONENTFLOAT );";
        }
    }
    static final String DFA5_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\56\1\uffff\1\60\1\uffff";
    static final String DFA5_maxS =
        "\2\71\1\uffff\1\71\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\2",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "849:1: fragment POINTFLOAT : ( ( DIGITS )? FRACTION | DIGITS DOT );";
        }
    }
    static final String DFA6_eotS =
        "\4\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\56\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "860:4: ( DIGITS | POINTFLOAT )";
        }
    }
    static final String DFA18_eotS =
        "\1\56\1\57\1\uffff\22\57\2\uffff\1\140\4\uffff\1\143\1\145\3\uffff"+
        "\1\153\4\uffff\1\154\1\155\1\157\4\uffff\1\56\5\uffff\23\57\1\u0089"+
        "\4\57\1\u0090\14\57\1\u00a2\7\57\20\uffff\1\u00b1\10\57\1\u00ba"+
        "\1\u00bb\1\57\1\u00be\6\57\1\u00c6\1\u00c8\3\57\1\u00cd\1\uffff"+
        "\5\57\1\u00d3\1\uffff\4\57\1\u00d8\3\57\1\u00dd\1\u00de\7\57\1\uffff"+
        "\1\u00e6\1\57\1\u00e8\1\57\1\u00ea\11\57\1\uffff\1\u00f5\1\57\1"+
        "\u00f8\3\57\1\u00fd\1\57\2\uffff\1\u00ff\1\57\1\uffff\7\57\1\uffff"+
        "\1\57\1\uffff\4\57\1\uffff\1\57\1\u010e\1\57\1\u0110\1\u0111\1\uffff"+
        "\1\u0112\3\57\1\uffff\2\57\1\u0118\1\57\2\uffff\5\57\1\u011f\1\57"+
        "\1\uffff\1\u0121\1\uffff\1\u0122\1\uffff\1\57\1\u0124\6\57\1\u012b"+
        "\1\57\1\uffff\2\57\1\uffff\1\57\1\u0131\2\57\1\uffff\1\u0134\1\uffff"+
        "\3\57\1\u0138\1\u0139\1\u013a\1\u013b\6\57\1\u0142\1\uffff\1\57"+
        "\3\uffff\1\u0144\2\57\1\u0147\1\57\1\uffff\1\u0149\5\57\1\uffff"+
        "\1\57\2\uffff\1\u0151\1\uffff\1\u0152\3\57\1\u0156\1\57\1\uffff"+
        "\1\u0158\1\u0159\1\57\1\u015b\1\57\1\uffff\1\u015d\1\u015e\1\uffff"+
        "\1\u015f\2\57\4\uffff\1\57\1\u0164\1\u0165\1\u0166\1\57\1\u016a"+
        "\1\uffff\1\u016b\1\uffff\1\57\1\u016d\1\uffff\1\57\1\uffff\1\u016f"+
        "\1\u0170\1\u0171\3\57\1\u0175\2\uffff\1\u0176\2\57\1\uffff\1\57"+
        "\2\uffff\1\u017a\1\uffff\1\57\3\uffff\2\57\1\u017e\1\57\3\uffff"+
        "\1\u0180\2\57\2\uffff\1\57\1\uffff\1\57\3\uffff\1\u0185\2\57\2\uffff"+
        "\3\57\1\uffff\2\57\1\u018d\1\uffff\1\57\1\uffff\2\57\1\u0191\1\u0192"+
        "\1\uffff\1\u0193\1\57\1\u0195\1\57\1\u0197\1\57\1\u0199\1\uffff"+
        "\1\57\1\u019b\1\u019c\3\uffff\1\u019d\1\uffff\1\57\1\uffff\1\57"+
        "\1\uffff\1\u01a0\3\uffff\1\u01a1\1\u01a2\3\uffff";
    static final String DFA18_eofS =
        "\u01a3\uffff";
    static final String DFA18_minS =
        "\1\11\1\141\1\uffff\2\141\1\145\1\146\1\157\1\154\1\150\1\142\2"+
        "\141\2\145\1\171\1\142\1\164\2\145\1\156\2\uffff\1\60\4\uffff\2"+
        "\75\3\uffff\1\52\4\uffff\3\60\4\uffff\1\56\5\uffff\1\144\1\163\1"+
        "\151\1\143\1\160\1\145\2\154\1\162\1\141\1\156\1\145\1\154\1\157"+
        "\1\162\1\144\1\164\1\160\1\143\1\60\1\143\1\157\1\160\1\165\1\60"+
        "\1\145\2\163\1\144\1\156\1\163\1\162\1\155\1\165\1\142\1\164\1\152"+
        "\1\60\1\162\1\154\1\167\1\164\1\151\1\156\1\164\20\uffff\1\60\2"+
        "\145\1\164\1\150\1\145\1\151\1\160\1\162\2\60\1\145\1\60\1\155\1"+
        "\143\1\141\1\154\1\163\1\141\2\60\1\150\1\157\1\142\1\60\1\uffff"+
        "\1\141\1\147\1\142\2\145\1\60\1\uffff\1\156\1\157\1\164\1\145\1"+
        "\60\1\163\1\145\1\143\2\60\1\145\1\142\1\145\1\141\1\165\2\145\1"+
        "\uffff\1\60\1\154\1\60\1\164\1\60\1\154\1\144\1\151\1\171\1\145"+
        "\1\165\2\145\1\146\1\uffff\1\60\1\156\1\60\1\151\1\162\1\143\1\60"+
        "\1\164\2\uffff\1\60\1\143\1\uffff\1\145\1\164\1\154\1\144\1\145"+
        "\1\164\1\166\1\uffff\1\154\1\uffff\1\157\1\162\1\165\1\151\1\uffff"+
        "\1\154\1\60\1\141\2\60\1\uffff\1\60\1\167\2\162\1\uffff\1\164\1"+
        "\151\1\60\1\150\2\uffff\1\141\1\154\1\164\1\165\1\147\1\60\1\143"+
        "\1\uffff\1\60\1\uffff\1\60\1\uffff\1\145\1\60\1\154\1\160\1\164"+
        "\1\156\1\155\1\154\1\60\1\146\1\uffff\1\156\1\144\1\uffff\1\156"+
        "\1\60\1\164\1\147\1\uffff\1\60\1\uffff\1\164\1\167\1\151\4\60\2"+
        "\145\1\144\1\164\1\144\1\156\1\60\1\uffff\1\154\3\uffff\1\60\1\141"+
        "\1\164\1\60\1\156\1\uffff\1\60\1\164\2\145\2\154\1\uffff\1\164\2"+
        "\uffff\1\60\1\uffff\1\60\1\145\1\150\1\143\1\60\1\145\1\uffff\2"+
        "\60\1\163\1\60\1\164\1\uffff\2\60\1\uffff\1\60\2\157\4\uffff\1\162"+
        "\3\60\1\145\1\60\1\uffff\1\60\1\uffff\1\143\1\60\1\uffff\1\165\1"+
        "\uffff\3\60\1\164\1\157\1\164\1\60\2\uffff\1\60\1\157\1\164\1\uffff"+
        "\1\143\2\uffff\1\60\1\uffff\1\162\3\uffff\1\162\1\156\1\60\1\156"+
        "\3\uffff\1\60\1\164\1\145\2\uffff\1\164\1\uffff\1\145\3\uffff\1"+
        "\60\1\147\1\157\2\uffff\1\144\1\151\1\164\1\uffff\1\151\1\153\1"+
        "\60\1\uffff\1\146\1\uffff\1\162\1\156\2\60\1\uffff\1\60\1\160\1"+
        "\60\1\157\1\60\1\143\1\60\1\uffff\1\157\2\60\3\uffff\1\60\1\uffff"+
        "\1\156\1\uffff\1\164\1\uffff\1\60\3\uffff\2\60\3\uffff";
    static final String DFA18_maxS =
        "\1\176\1\170\1\uffff\2\165\1\157\1\156\1\157\1\154\1\171\1\163"+
        "\1\157\1\141\1\145\1\157\1\171\1\162\1\164\1\165\1\150\1\156\2\uffff"+
        "\1\71\4\uffff\1\76\1\75\3\uffff\1\174\4\uffff\1\146\1\71\1\172\4"+
        "\uffff\1\145\5\uffff\1\144\1\163\1\164\1\143\1\160\2\162\1\154\1"+
        "\162\1\141\2\156\1\154\1\157\1\162\1\144\1\164\1\160\1\164\1\172"+
        "\1\156\1\157\1\160\1\171\1\172\1\162\2\163\1\144\1\156\1\164\1\162"+
        "\1\160\1\165\1\154\1\164\1\152\1\172\1\162\1\154\1\170\1\164\1\151"+
        "\1\156\1\164\20\uffff\1\172\2\145\1\164\1\150\1\145\1\151\1\160"+
        "\1\162\2\172\1\146\1\172\1\155\1\143\1\141\1\154\1\163\1\141\2\172"+
        "\1\150\1\157\1\154\1\172\1\uffff\1\141\1\147\1\142\2\145\1\172\1"+
        "\uffff\1\156\1\157\1\164\1\145\1\172\1\164\1\145\1\143\2\172\1\145"+
        "\1\142\1\145\1\141\1\165\2\145\1\uffff\1\172\1\154\1\172\1\164\1"+
        "\172\1\154\1\144\1\151\1\171\1\145\1\165\2\145\1\146\1\uffff\1\172"+
        "\1\162\1\172\1\151\1\162\1\156\1\172\1\164\2\uffff\1\172\1\143\1"+
        "\uffff\1\145\1\164\1\154\1\144\1\145\1\164\1\166\1\uffff\1\154\1"+
        "\uffff\1\157\1\162\1\165\1\151\1\uffff\1\154\1\172\1\141\2\172\1"+
        "\uffff\1\172\1\167\2\162\1\uffff\1\164\1\151\1\172\1\150\2\uffff"+
        "\1\141\1\154\1\164\1\165\1\147\1\172\1\143\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\145\1\172\1\154\1\160\1\164\1\156\1\155\1\154\1"+
        "\172\1\146\1\uffff\1\156\1\144\1\uffff\1\156\1\172\1\164\1\147\1"+
        "\uffff\1\172\1\uffff\1\164\1\167\1\151\4\172\2\145\1\144\1\164\1"+
        "\144\1\156\1\172\1\uffff\1\154\3\uffff\1\172\1\141\1\164\1\172\1"+
        "\156\1\uffff\1\172\1\164\2\145\1\154\1\163\1\uffff\1\164\2\uffff"+
        "\1\172\1\uffff\1\172\1\145\1\150\1\143\1\172\1\145\1\uffff\2\172"+
        "\1\163\1\172\1\164\1\uffff\2\172\1\uffff\1\172\2\157\4\uffff\1\162"+
        "\3\172\1\145\1\172\1\uffff\1\172\1\uffff\1\143\1\172\1\uffff\1\165"+
        "\1\uffff\3\172\1\164\1\157\1\164\1\172\2\uffff\1\172\1\157\1\164"+
        "\1\uffff\1\143\2\uffff\1\172\1\uffff\1\162\3\uffff\1\162\1\156\1"+
        "\172\1\156\3\uffff\1\172\1\164\1\145\2\uffff\1\164\1\uffff\1\145"+
        "\3\uffff\1\172\1\147\1\157\2\uffff\1\144\1\151\1\164\1\uffff\1\151"+
        "\1\153\1\172\1\uffff\1\146\1\uffff\1\162\1\156\2\172\1\uffff\1\172"+
        "\1\160\1\172\1\157\1\172\1\143\1\172\1\uffff\1\157\2\172\3\uffff"+
        "\1\172\1\uffff\1\156\1\uffff\1\164\1\uffff\1\172\3\uffff\2\172\3"+
        "\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\10\22\uffff\1\114\1\115\1\uffff\1\117\1\120\1\121\1"+
        "\122\2\uffff\1\125\1\126\1\127\1\uffff\1\131\1\132\1\133\1\134\3"+
        "\uffff\1\140\1\141\1\142\1\143\1\uffff\1\161\1\162\1\163\1\164\1"+
        "\165\55\uffff\1\116\1\144\1\145\1\123\1\146\1\124\1\147\1\150\1"+
        "\151\1\152\1\153\1\130\1\135\1\136\1\160\1\137\31\uffff\1\73\6\uffff"+
        "\1\57\21\uffff\1\113\16\uffff\1\105\10\uffff\1\154\1\155\2\uffff"+
        "\1\156\7\uffff\1\55\1\uffff\1\157\4\uffff\1\40\5\uffff\1\76\4\uffff"+
        "\1\112\4\uffff\1\33\1\34\7\uffff\1\47\1\uffff\1\53\1\uffff\1\111"+
        "\12\uffff\1\75\2\uffff\1\104\4\uffff\1\61\1\uffff\1\52\16\uffff"+
        "\1\37\1\uffff\1\22\1\35\1\74\5\uffff\1\71\6\uffff\1\43\1\uffff\1"+
        "\50\1\56\1\uffff\1\63\6\uffff\1\7\5\uffff\1\51\2\uffff\1\45\3\uffff"+
        "\1\30\1\31\1\36\1\41\6\uffff\1\20\1\uffff\1\100\2\uffff\1\32\1\uffff"+
        "\1\77\7\uffff\1\62\1\65\3\uffff\1\4\1\uffff\1\6\1\25\1\uffff\1\60"+
        "\1\uffff\1\12\1\44\1\70\4\uffff\1\14\1\24\1\16\3\uffff\1\106\1\21"+
        "\1\uffff\1\101\1\uffff\1\64\1\42\1\54\3\uffff\1\46\1\1\3\uffff\1"+
        "\26\3\uffff\1\66\1\uffff\1\17\4\uffff\1\72\7\uffff\1\23\3\uffff"+
        "\1\27\1\67\1\102\1\uffff\1\2\1\uffff\1\5\1\uffff\1\13\1\uffff\1"+
        "\107\1\110\1\103\2\uffff\1\15\1\3\1\11";
    static final String DFA18_specialS =
        "\u01a3\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\60\1\62\2\uffff\1\62\22\uffff\1\60\1\45\1\61\1\44\1\46\1"+
            "\37\1\33\1\2\1\51\1\52\1\30\1\26\1\42\1\27\1\47\1\31\12\55\1"+
            "\41\1\25\1\34\1\36\1\35\2\uffff\32\57\1\53\1\uffff\1\54\1\40"+
            "\1\50\1\uffff\1\12\1\17\1\13\1\16\1\1\1\4\1\10\1\57\1\6\2\57"+
            "\1\7\1\5\1\22\1\20\1\21\1\57\1\15\1\3\1\11\1\24\1\14\1\23\3"+
            "\57\1\uffff\1\32\1\uffff\1\43",
            "\1\66\12\uffff\1\64\1\uffff\1\63\11\uffff\1\65",
            "",
            "\1\73\3\uffff\1\72\2\uffff\1\71\13\uffff\1\70\1\67",
            "\1\77\7\uffff\1\76\2\uffff\1\100\2\uffff\1\101\2\uffff\1\74"+
            "\2\uffff\1\75",
            "\1\103\11\uffff\1\102",
            "\1\106\6\uffff\1\104\1\105",
            "\1\107",
            "\1\110",
            "\1\114\6\uffff\1\113\2\uffff\1\112\6\uffff\1\111",
            "\1\115\13\uffff\1\117\4\uffff\1\116",
            "\1\121\15\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\125\11\uffff\1\124",
            "\1\126",
            "\1\127\17\uffff\1\130",
            "\1\131",
            "\1\133\11\uffff\1\134\5\uffff\1\132",
            "\1\136\2\uffff\1\135",
            "\1\137",
            "",
            "",
            "\12\56",
            "",
            "",
            "",
            "",
            "\1\142\1\141",
            "\1\144",
            "",
            "",
            "",
            "\1\150\1\146\1\uffff\1\147\1\uffff\1\151\114\uffff\1\152",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\6\56\32\uffff\6\56",
            "\12\156",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\156\1\uffff\12\55\13\uffff\1\156\37\uffff\1\156",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\163\12\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\167\14\uffff\1\166",
            "\1\171\2\uffff\1\170\2\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\u0080\10\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\20\uffff\1\u0088",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008a\12\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\3\uffff\1\u008f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0091\14\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\1\u0098",
            "\1\u0099",
            "\1\u009a\2\uffff\1\u009b",
            "\1\u009c",
            "\1\u009f\3\uffff\1\u009e\5\uffff\1\u009d",
            "\1\u00a0",
            "\1\u00a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
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
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u00ad\2\57"+
            "\1\u00b0\3\57\1\u00ac\4\57\1\u00ae\1\u00af\1\u00ab\6\57",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bd\1\u00bc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c5\25"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00c7\5"+
            "\57",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cc\11\uffff\1\u00cb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d9\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00f4\21"+
            "\57",
            "\1\u00f7\3\uffff\1\u00f6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb\12\uffff\1\u00fc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fe",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0119",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0120",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0123",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0130\7"+
            "\57",
            "\1\u0132",
            "\1\u0133",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0143",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0145",
            "\1\u0146",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0148",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e\6\uffff\1\u014f",
            "",
            "\1\u0150",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0157",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015c",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0160",
            "\1\u0161",
            "",
            "",
            "",
            "",
            "\1\u0162",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0163\21"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0167",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0169\3"+
            "\57\1\u0168\12\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u016c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u016e",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u017b",
            "",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u017f",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "\1\u0183",
            "",
            "\1\u0184",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0194",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0196",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0198",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u019a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u019e",
            "",
            "\1\u019f",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | LINE_COMMENT | SUPERSTRICT | STRICT | FRAMEWORK | MODULE | MODULEINFO | IMPORT | INCLUDE | LOCAL | GLOBAL | TYPE | FUNCTION | METHOD | EXTERN | EXTENDS | ABSTRACT | FINAL | FIELD | CONST | VAR | REM | TRUE | FALSE | LONG_TYPE | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BYTE_TYPE | STRING_TYPE | SHORT_TYPE | OBJECT_TYPE | POINTER | NULL | SUPER | SELF | NEW | DELETE | FOR | NEXT | TO | EACHIN | STEP | WHILE | WEND | REPEAT | UNTIL | FOREVER | CONTINUE | SELECT | CASE | DEFAULT | IF | THEN | ELSE | TRY | CATCH | THROW | ASSERT | DEBUGLOG | DEBUGSTOP | EXIT | END | INCBIN | INCBINPTR | INCBINLEN | NOT_TEST | AND_TEST | OR_TEST | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | EQUAL | PERCENT | POWER | COLON | COMMA | TILDE | POUND | BANG | DOLLAR | DOT | UNDERSCORE | LPAREN | RPAREN | LBRACK | RBRACK | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL | LEFTSHIFT | RIGHTSHIFT | ARITHRIGHTSHIFT | MOD | FLOAT | LONG | IDENTIFIER | WHITESPACE | STRING_LITERAL | NEWLINE );";
        }
    }
 

}