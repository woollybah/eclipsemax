// $ANTLR 3.1.2 /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g 2009-07-19 14:47:05

package net.brucey.dltk.blitzmax.core.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class blitzmaxLexer extends Lexer {
    public static final int CONST=16;
    public static final int COMMA=32;
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
    public static final int DOT=57;
    public static final int NEWLINE=5;
    public static final int WEND=69;
    public static final int PLUSEQUAL=63;
    public static final int TO=37;
    public static final int T__128=128;
    public static final int LOCAL=17;
    public static final int FUNCTION=18;
    public static final int INCLUDE=74;
    public static final int GLOBAL=15;
    public static final int SELECT=70;
    public static final int STRING_LITERAL=61;
    public static final int MODULE=76;
    public static final int DOUBLE_TYPE=88;
    public static final int UNTIL=38;
    public static final int RPAREN=22;
    public static final int SUPERSTRICT=4;
    public static final int ASSERT=98;
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
    public static final int NOT_TEST=62;
    public static final int OBJECT_TYPE=25;
    public static final int Exponent=119;
    public static final int DIGITS=117;
    public static final int SLASH=53;
    public static final int WHILE=68;
    public static final int POWER=106;
    public static final int AND_TEST=55;
    public static final int INCBIN=100;
    public static final int LINE_CONTINUATION=60;
    public static final int REM=35;
    public static final int T__129=129;
    public static final int FLOAT_TYPE=87;
    public static final int WHITESPACE=123;
    public static final int VAR=34;
    public static final int DEBUGLOG=78;
    public static final int NEXT=41;
    public static final int INCBINPTR=101;
    public static final int RETURN=20;
    public static final int RIGHTSHIFT=110;
    public static final int MINUSEQUAL=64;
    public static final int IF=79;
    public static final int INCBINLEN=102;
    public static final int EOF=-1;
    public static final int ALPHA_UPPER=122;
    public static final int FOR=36;
    public static final int OR_TEST=51;
    public static final int RBRACK=31;
    public static final int DEFAULT=71;
    public static final int GREATEREQUAL=47;
    public static final int VBAREQUAL=67;
    public static final int STAREQUAL=65;
    public static final int STAR=52;
    public static final int TRY=95;
    public static final int LEFTSHIFT=109;
    public static final int EACHIN=40;

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
    public String getGrammarFileName() { return "/Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g"; }

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:18:8: ( 'endtype' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:18:10: 'endtype'
            {
            match("endtype"); 


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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:19:8: ( 'endmethod' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:19:10: 'endmethod'
            {
            match("endmethod"); 


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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:20:8: ( 'endfunction' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:20:10: 'endfunction'
            {
            match("endfunction"); 


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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:21:8: ( 'endrem' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:21:10: 'endrem'
            {
            match("endrem"); 


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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:22:8: ( 'endselect' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:22:10: 'endselect'
            {
            match("endselect"); 


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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:23:8: ( 'elseif' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:23:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:24:8: ( 'endif' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:24:10: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "LINE_CONTINUATION"
    public final void mLINE_CONTINUATION() throws RecognitionException {
        try {
            int _type = LINE_CONTINUATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:796:2: ( '..' ( '\\r' )? '\\n' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:796:4: '..' ( '\\r' )? '\\n'
            {
            match(".."); 

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:796:9: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:796:10: '\\r'
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
    // $ANTLR end "LINE_CONTINUATION"

    // $ANTLR start "SUPERSTRICT"
    public final void mSUPERSTRICT() throws RecognitionException {
        try {
            int _type = SUPERSTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:799:13: ( 'superstrict' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:799:15: 'superstrict'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:800:8: ( 'strict' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:800:10: 'strict'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:802:11: ( 'framework' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:802:13: 'framework'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:803:8: ( 'module' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:803:10: 'module'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:804:12: ( 'moduleinfo' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:804:14: 'moduleinfo'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:805:8: ( 'import' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:805:10: 'import'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:806:9: ( 'include' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:806:11: 'include'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:808:7: ( 'local' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:808:9: 'local'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:809:8: ( 'global' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:809:10: 'global'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:810:6: ( 'type' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:810:8: 'type'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:811:10: ( 'function' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:811:12: 'function'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:812:8: ( 'method' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:812:10: 'method'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:813:8: ( 'extern' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:813:10: 'extern'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:814:9: ( 'extends' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:814:11: 'extends'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:815:10: ( 'abstract' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:815:12: 'abstract'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:816:7: ( 'final' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:816:9: 'final'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:817:7: ( 'field' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:817:9: 'field'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:818:7: ( 'const' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:818:9: 'const'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:819:5: ( 'var' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:819:7: 'var'
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

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:820:8: ( 'return' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:820:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:822:5: ( 'rem' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:822:7: 'rem'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:824:6: ( 'true' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:824:8: 'true'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:825:7: ( 'false' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:825:9: 'false'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:827:11: ( 'long' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:827:13: 'long'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:828:10: ( 'int' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:828:12: 'int'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:829:12: ( 'float' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:829:14: 'float'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:830:13: ( 'double' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:830:15: 'double'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:831:11: ( 'byte' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:831:13: 'byte'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:832:13: ( 'string' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:832:15: 'string'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:833:12: ( 'short' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:833:14: 'short'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:834:13: ( 'object' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:834:15: 'object'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:835:10: ( 'ptr' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:835:12: 'ptr'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:837:6: ( 'null' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:837:8: 'null'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:838:7: ( 'super' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:838:9: 'super'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:839:6: ( 'self' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:839:8: 'self'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:840:5: ( 'new' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:840:7: 'new'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:841:8: ( 'delete' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:841:10: 'delete'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:920:5: ( 'for' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:920:7: 'for'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:921:6: ( 'next' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:921:8: 'next'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:922:4: ( 'to' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:922:6: 'to'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:923:8: ( 'eachin' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:923:10: 'eachin'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:924:6: ( 'step' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:924:8: 'step'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:925:7: ( 'while' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:925:9: 'while'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:926:6: ( 'wend' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:926:8: 'wend'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:927:8: ( 'repeat' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:927:10: 'repeat'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:928:7: ( 'until' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:928:9: 'until'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:929:9: ( 'forever' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:929:11: 'forever'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:930:10: ( 'continue' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:930:12: 'continue'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:931:8: ( 'select' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:931:10: 'select'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:932:6: ( 'case' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:932:8: 'case'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:933:9: ( 'default' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:933:11: 'default'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:934:4: ( 'if' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:934:6: 'if'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:935:6: ( 'then' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:935:8: 'then'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:936:6: ( 'else' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:936:8: 'else'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:938:5: ( 'try' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:938:7: 'try'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:939:7: ( 'catch' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:939:9: 'catch'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:940:7: ( 'throw' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:940:9: 'throw'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:941:8: ( 'assert' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:941:10: 'assert'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:942:9: ( 'debuglog' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:942:11: 'debuglog'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:943:11: ( 'debugstop' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:943:13: 'debugstop'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:945:6: ( 'exit' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:945:8: 'exit'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:946:5: ( 'end' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:946:7: 'end'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:948:8: ( 'incbin' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:948:10: 'incbin'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:949:11: ( 'incbinptr' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:949:13: 'incbinptr'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:950:11: ( 'incbinlen' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:950:13: 'incbinlen'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:952:10: ( 'not' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:952:12: 'not'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:953:10: ( 'and' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:953:12: 'and'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:954:9: ( 'or' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:954:11: 'or'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:956:6: ( ';' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:956:8: ';'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:957:6: ( '+' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:957:8: '+'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:958:7: ( '-' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:958:9: '-'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:959:6: ( '*' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:959:8: '*'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:960:7: ( '/' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:960:9: '/'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:961:6: ( '|' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:961:8: '|'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:962:7: ( '&' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:962:9: '&'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:963:6: ( '<' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:963:8: '<'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:964:9: ( '>' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:964:11: '>'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:965:7: ( '=' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:965:9: '='
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:966:9: ( '%' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:966:11: '%'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:967:7: ( '^' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:967:9: '^'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:968:8: ( ':' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:968:10: ':'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:969:7: ( ',' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:969:9: ','
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:970:7: ( '~' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:970:9: '~'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:971:7: ( '#' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:971:9: '#'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:972:6: ( '!' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:972:8: '!'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:973:8: ( '$' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:973:10: '$'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:975:5: ( '.' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:975:7: '.'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:976:12: ( '_' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:976:14: '_'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:979:8: ( '(' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:979:10: '('
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:981:8: ( ')' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:981:10: ')'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:983:8: ( '[' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:983:10: '['
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:985:8: ( ']' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:985:10: ']'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:988:9: ( '<>' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:988:11: '<>'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:989:11: ( '<=' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:989:13: '<='
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:990:14: ( '>=' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:990:16: '>='
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:991:11: ( ':+' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:991:13: ':+'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:992:12: ( ':-' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:992:14: ':-'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:993:11: ( ':*' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:993:13: ':*'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:994:12: ( ':/' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:994:14: ':/'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:995:11: ( ':|' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:995:13: ':|'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:996:11: ( 'shl' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:996:13: 'shl'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:997:12: ( 'shr' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:997:14: 'shr'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:998:17: ( 'sar' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:998:19: 'sar'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1000:6: ( 'mod' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1000:8: 'mod'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1015:9: ( POINTFLOAT | EXPONENTFLOAT )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1015:11: POINTFLOAT
                    {
                    mPOINTFLOAT(); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1015:24: EXPONENTFLOAT
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:2: ( ( DIGITS )? FRACTION | DIGITS DOT )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:4: ( DIGITS )? FRACTION
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:4: ( DIGITS )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:4: DIGITS
                            {
                            mDIGITS(); 

                            }
                            break;

                    }

                    mFRACTION(); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1019:23: DIGITS DOT
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1024:2: ( DOT DIGITS )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1024:4: DOT DIGITS
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1028:2: ( ( DIGITS | POINTFLOAT ) Exponent )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1028:4: ( DIGITS | POINTFLOAT ) Exponent
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1028:4: ( DIGITS | POINTFLOAT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1028:5: DIGITS
                    {
                    mDIGITS(); 

                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1028:14: POINTFLOAT
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1033:2: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1033:4: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1033:16: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1036:7: ( INT )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1036:10: INT
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1039:5: ( '$' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+ | ( MINUS )? ( DIGITS )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='$') ) {
                alt10=1;
            }
            else {
                alt10=2;}
            switch (alt10) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1040:9: '$' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('$'); 
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1040:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1041:9: ( MINUS )? ( DIGITS )*
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1041:9: ( MINUS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1041:9: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1041:16: ( DIGITS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1041:16: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1046:2: ( 'a' .. 'z' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1046:4: 'a' .. 'z'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1051:2: ( 'A' .. 'Z' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1051:4: 'A' .. 'Z'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1055:8: ( ( DIGIT )+ )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1055:10: ( DIGIT )+
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1055:10: ( DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1055:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1058:8: ( '0' .. '9' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1058:10: '0' .. '9'
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1061:11: ( ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE ) ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )* )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1061:13: ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE ) ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1062:9: ( ALPHA_LOWER | ALPHA_UPPER | UNDERSCORE | DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
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
            	    break loop12;
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1065:12: ( ( ' ' | '\\t' )+ )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1065:14: ( ' ' | '\\t' )+
            {
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1065:14: ( ' ' | '\\t' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1076:2: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1076:4: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1076:8: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\"') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1076:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:5: ( ( ( '\\r' )? '\\n' )+ | '\\'' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:9: ( ( '\\r' )? '\\n' )+
                    {
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:9: ( ( '\\r' )? '\\n' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:10: ( '\\r' )? '\\n'
                    	    {
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:10: ( '\\r' )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0=='\r') ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1080:11: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }

                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1081:7: '\\'' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('\''); 
                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1081:12: (~ ( '\\n' | '\\r' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1081:12: ~ ( '\\n' | '\\r' )
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
                    	    break loop17;
                        }
                    } while (true);

                    // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1081:26: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1081:27: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:8: ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | LINE_CONTINUATION | SUPERSTRICT | STRICT | FRAMEWORK | MODULE | MODULEINFO | IMPORT | INCLUDE | LOCAL | GLOBAL | TYPE | FUNCTION | METHOD | EXTERN | EXTENDS | ABSTRACT | FINAL | FIELD | CONST | VAR | RETURN | REM | TRUE | FALSE | LONG_TYPE | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BYTE_TYPE | STRING_TYPE | SHORT_TYPE | OBJECT_TYPE | POINTER | NULL | SUPER | SELF | NEW | DELETE | FOR | NEXT | TO | EACHIN | STEP | WHILE | WEND | REPEAT | UNTIL | FOREVER | CONTINUE | SELECT | CASE | DEFAULT | IF | THEN | ELSE | TRY | CATCH | THROW | ASSERT | DEBUGLOG | DEBUGSTOP | EXIT | END | INCBIN | INCBINPTR | INCBINLEN | NOT_TEST | AND_TEST | OR_TEST | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | EQUAL | PERCENT | POWER | COLON | COMMA | TILDE | POUND | BANG | DOLLAR | DOT | UNDERSCORE | LPAREN | RPAREN | LBRACK | RBRACK | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL | LEFTSHIFT | RIGHTSHIFT | ARITHRIGHTSHIFT | MOD | FLOAT | LONG | IDENTIFIER | WHITESPACE | STRING_LITERAL | NEWLINE )
        int alt20=118;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:10: T__124
                {
                mT__124(); 

                }
                break;
            case 2 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:17: T__125
                {
                mT__125(); 

                }
                break;
            case 3 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:24: T__126
                {
                mT__126(); 

                }
                break;
            case 4 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:31: T__127
                {
                mT__127(); 

                }
                break;
            case 5 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:38: T__128
                {
                mT__128(); 

                }
                break;
            case 6 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:45: T__129
                {
                mT__129(); 

                }
                break;
            case 7 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:52: T__130
                {
                mT__130(); 

                }
                break;
            case 8 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:59: LINE_CONTINUATION
                {
                mLINE_CONTINUATION(); 

                }
                break;
            case 9 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:77: SUPERSTRICT
                {
                mSUPERSTRICT(); 

                }
                break;
            case 10 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:89: STRICT
                {
                mSTRICT(); 

                }
                break;
            case 11 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:96: FRAMEWORK
                {
                mFRAMEWORK(); 

                }
                break;
            case 12 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:106: MODULE
                {
                mMODULE(); 

                }
                break;
            case 13 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:113: MODULEINFO
                {
                mMODULEINFO(); 

                }
                break;
            case 14 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:124: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 15 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:131: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 16 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:139: LOCAL
                {
                mLOCAL(); 

                }
                break;
            case 17 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:145: GLOBAL
                {
                mGLOBAL(); 

                }
                break;
            case 18 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:152: TYPE
                {
                mTYPE(); 

                }
                break;
            case 19 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:157: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 20 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:166: METHOD
                {
                mMETHOD(); 

                }
                break;
            case 21 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:173: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 22 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:180: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 23 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:188: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 24 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:197: FINAL
                {
                mFINAL(); 

                }
                break;
            case 25 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:203: FIELD
                {
                mFIELD(); 

                }
                break;
            case 26 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:209: CONST
                {
                mCONST(); 

                }
                break;
            case 27 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:215: VAR
                {
                mVAR(); 

                }
                break;
            case 28 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:219: RETURN
                {
                mRETURN(); 

                }
                break;
            case 29 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:226: REM
                {
                mREM(); 

                }
                break;
            case 30 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:230: TRUE
                {
                mTRUE(); 

                }
                break;
            case 31 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:235: FALSE
                {
                mFALSE(); 

                }
                break;
            case 32 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:241: LONG_TYPE
                {
                mLONG_TYPE(); 

                }
                break;
            case 33 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:251: INT_TYPE
                {
                mINT_TYPE(); 

                }
                break;
            case 34 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:260: FLOAT_TYPE
                {
                mFLOAT_TYPE(); 

                }
                break;
            case 35 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:271: DOUBLE_TYPE
                {
                mDOUBLE_TYPE(); 

                }
                break;
            case 36 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:283: BYTE_TYPE
                {
                mBYTE_TYPE(); 

                }
                break;
            case 37 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:293: STRING_TYPE
                {
                mSTRING_TYPE(); 

                }
                break;
            case 38 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:305: SHORT_TYPE
                {
                mSHORT_TYPE(); 

                }
                break;
            case 39 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:316: OBJECT_TYPE
                {
                mOBJECT_TYPE(); 

                }
                break;
            case 40 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:328: POINTER
                {
                mPOINTER(); 

                }
                break;
            case 41 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:336: NULL
                {
                mNULL(); 

                }
                break;
            case 42 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:341: SUPER
                {
                mSUPER(); 

                }
                break;
            case 43 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:347: SELF
                {
                mSELF(); 

                }
                break;
            case 44 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:352: NEW
                {
                mNEW(); 

                }
                break;
            case 45 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:356: DELETE
                {
                mDELETE(); 

                }
                break;
            case 46 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:363: FOR
                {
                mFOR(); 

                }
                break;
            case 47 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:367: NEXT
                {
                mNEXT(); 

                }
                break;
            case 48 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:372: TO
                {
                mTO(); 

                }
                break;
            case 49 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:375: EACHIN
                {
                mEACHIN(); 

                }
                break;
            case 50 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:382: STEP
                {
                mSTEP(); 

                }
                break;
            case 51 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:387: WHILE
                {
                mWHILE(); 

                }
                break;
            case 52 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:393: WEND
                {
                mWEND(); 

                }
                break;
            case 53 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:398: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 54 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:405: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 55 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:411: FOREVER
                {
                mFOREVER(); 

                }
                break;
            case 56 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:419: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 57 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:428: SELECT
                {
                mSELECT(); 

                }
                break;
            case 58 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:435: CASE
                {
                mCASE(); 

                }
                break;
            case 59 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:440: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 60 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:448: IF
                {
                mIF(); 

                }
                break;
            case 61 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:451: THEN
                {
                mTHEN(); 

                }
                break;
            case 62 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:456: ELSE
                {
                mELSE(); 

                }
                break;
            case 63 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:461: TRY
                {
                mTRY(); 

                }
                break;
            case 64 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:465: CATCH
                {
                mCATCH(); 

                }
                break;
            case 65 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:471: THROW
                {
                mTHROW(); 

                }
                break;
            case 66 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:477: ASSERT
                {
                mASSERT(); 

                }
                break;
            case 67 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:484: DEBUGLOG
                {
                mDEBUGLOG(); 

                }
                break;
            case 68 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:493: DEBUGSTOP
                {
                mDEBUGSTOP(); 

                }
                break;
            case 69 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:503: EXIT
                {
                mEXIT(); 

                }
                break;
            case 70 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:508: END
                {
                mEND(); 

                }
                break;
            case 71 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:512: INCBIN
                {
                mINCBIN(); 

                }
                break;
            case 72 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:519: INCBINPTR
                {
                mINCBINPTR(); 

                }
                break;
            case 73 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:529: INCBINLEN
                {
                mINCBINLEN(); 

                }
                break;
            case 74 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:539: NOT_TEST
                {
                mNOT_TEST(); 

                }
                break;
            case 75 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:548: AND_TEST
                {
                mAND_TEST(); 

                }
                break;
            case 76 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:557: OR_TEST
                {
                mOR_TEST(); 

                }
                break;
            case 77 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:565: SEMI
                {
                mSEMI(); 

                }
                break;
            case 78 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:570: PLUS
                {
                mPLUS(); 

                }
                break;
            case 79 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:575: MINUS
                {
                mMINUS(); 

                }
                break;
            case 80 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:581: STAR
                {
                mSTAR(); 

                }
                break;
            case 81 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:586: SLASH
                {
                mSLASH(); 

                }
                break;
            case 82 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:592: VBAR
                {
                mVBAR(); 

                }
                break;
            case 83 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:597: AMPER
                {
                mAMPER(); 

                }
                break;
            case 84 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:603: LESS
                {
                mLESS(); 

                }
                break;
            case 85 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:608: GREATER
                {
                mGREATER(); 

                }
                break;
            case 86 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:616: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 87 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:622: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 88 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:630: POWER
                {
                mPOWER(); 

                }
                break;
            case 89 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:636: COLON
                {
                mCOLON(); 

                }
                break;
            case 90 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:642: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 91 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:648: TILDE
                {
                mTILDE(); 

                }
                break;
            case 92 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:654: POUND
                {
                mPOUND(); 

                }
                break;
            case 93 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:660: BANG
                {
                mBANG(); 

                }
                break;
            case 94 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:665: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 95 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:672: DOT
                {
                mDOT(); 

                }
                break;
            case 96 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:676: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 97 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:687: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 98 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:694: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 99 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:701: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 100 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:708: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 101 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:715: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 102 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:724: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 103 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:734: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 104 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:747: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 105 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:757: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 106 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:768: STAREQUAL
                {
                mSTAREQUAL(); 

                }
                break;
            case 107 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:778: SLASHEQUAL
                {
                mSLASHEQUAL(); 

                }
                break;
            case 108 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:789: VBAREQUAL
                {
                mVBAREQUAL(); 

                }
                break;
            case 109 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:799: LEFTSHIFT
                {
                mLEFTSHIFT(); 

                }
                break;
            case 110 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:809: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 

                }
                break;
            case 111 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:820: ARITHRIGHTSHIFT
                {
                mARITHRIGHTSHIFT(); 

                }
                break;
            case 112 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:836: MOD
                {
                mMOD(); 

                }
                break;
            case 113 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:840: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 114 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:846: LONG
                {
                mLONG(); 

                }
                break;
            case 115 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:851: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 116 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:862: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 117 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:873: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 118 :
                // /Volumes/Misc Data/programming/java/projects/net.brucey.dltk.blitzmax.core/src/net/brucey/dltk/blitzmax/core/parsers/blitzmax.g:1:888: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA2_eotS =
        "\4\uffff\2\6\1\uffff";
    static final String DFA2_eofS =
        "\7\uffff";
    static final String DFA2_minS =
        "\2\56\1\60\1\uffff\2\60\1\uffff";
    static final String DFA2_maxS =
        "\1\71\1\145\1\71\1\uffff\2\145\1\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\2\uffff\1\1";
    static final String DFA2_specialS =
        "\7\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\5",
            "",
            "\12\5\13\uffff\1\3\37\uffff\1\3",
            "\12\5\13\uffff\1\3\37\uffff\1\3",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1015:1: FLOAT : ( POINTFLOAT | EXPONENTFLOAT );";
        }
    }
    static final String DFA4_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\56\1\uffff\1\60\1\uffff";
    static final String DFA4_maxS =
        "\2\71\1\uffff\1\71\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\2",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1017:1: fragment POINTFLOAT : ( ( DIGITS )? FRACTION | DIGITS DOT );";
        }
    }
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\56\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
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
            return "1028:4: ( DIGITS | POINTFLOAT )";
        }
    }
    static final String DFA20_eotS =
        "\1\55\1\56\1\67\22\56\2\uffff\1\142\4\uffff\1\145\1\147\3\uffff"+
        "\1\155\4\uffff\1\156\1\157\4\uffff\1\55\5\uffff\4\56\3\uffff\17"+
        "\56\1\u0089\4\56\1\u0090\14\56\1\u00a3\7\56\16\uffff\1\u00b2\10"+
        "\56\1\u00bb\1\u00bc\1\56\1\u00bf\6\56\1\u00c7\1\u00c9\3\56\1\u00ce"+
        "\1\uffff\5\56\1\u00d4\1\uffff\4\56\1\u00d9\3\56\1\u00de\1\56\1\u00e0"+
        "\7\56\1\uffff\1\u00e8\1\56\1\u00ea\1\56\1\u00ec\11\56\1\uffff\1"+
        "\u00f7\1\56\1\u00fa\3\56\1\u00ff\1\56\2\uffff\1\u0101\1\56\1\uffff"+
        "\7\56\1\uffff\1\56\1\uffff\4\56\1\uffff\1\56\1\u0110\1\56\1\u0112"+
        "\1\u0113\1\uffff\1\u0114\3\56\1\uffff\2\56\1\u011a\1\56\1\uffff"+
        "\1\56\1\uffff\5\56\1\u0122\1\56\1\uffff\1\u0124\1\uffff\1\u0125"+
        "\1\uffff\1\56\1\u0127\6\56\1\u012e\1\56\1\uffff\2\56\1\uffff\1\56"+
        "\1\u0134\2\56\1\uffff\1\u0137\1\uffff\3\56\1\u013b\1\u013c\1\u013d"+
        "\1\u013e\6\56\1\u0145\1\uffff\1\56\3\uffff\1\u0147\2\56\1\u014a"+
        "\1\56\1\uffff\1\u014c\6\56\1\uffff\1\56\2\uffff\1\u0155\1\uffff"+
        "\1\u0156\3\56\1\u015a\1\56\1\uffff\1\u015c\1\u015d\1\56\1\u015f"+
        "\1\56\1\uffff\1\u0161\1\u0162\1\uffff\1\u0163\2\56\4\uffff\1\56"+
        "\1\u0168\1\u0169\1\u016a\1\56\1\u016e\1\uffff\1\u016f\1\uffff\1"+
        "\56\1\u0171\1\uffff\1\56\1\uffff\1\u0173\1\u0174\1\u0175\1\u0176"+
        "\3\56\1\u017a\2\uffff\1\u017b\2\56\1\uffff\1\56\2\uffff\1\u017f"+
        "\1\uffff\1\56\3\uffff\2\56\1\u0183\1\56\3\uffff\1\u0185\2\56\2\uffff"+
        "\1\56\1\uffff\1\56\4\uffff\1\u018a\2\56\2\uffff\3\56\1\uffff\2\56"+
        "\1\u0192\1\uffff\1\56\1\uffff\2\56\1\u0196\1\u0197\1\uffff\1\u0198"+
        "\1\56\1\u019a\1\56\1\u019c\1\56\1\u019e\1\uffff\1\56\1\u01a0\1\u01a1"+
        "\3\uffff\1\u01a2\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u01a5\3\uffff"+
        "\1\u01a6\1\u01a7\3\uffff";
    static final String DFA20_eofS =
        "\u01a8\uffff";
    static final String DFA20_minS =
        "\1\11\1\141\1\56\2\141\1\145\1\146\1\157\1\154\1\150\1\142\2\141"+
        "\2\145\1\171\1\142\1\164\2\145\1\156\2\uffff\1\60\4\uffff\2\75\3"+
        "\uffff\1\52\4\uffff\2\60\4\uffff\1\56\5\uffff\1\144\1\163\1\151"+
        "\1\143\3\uffff\1\160\1\145\2\154\1\162\1\141\1\156\1\145\1\154\1"+
        "\157\1\162\1\144\1\164\1\160\1\143\1\60\1\143\1\157\1\160\1\165"+
        "\1\60\1\145\2\163\1\144\1\156\1\163\1\162\1\155\1\165\1\142\1\164"+
        "\1\152\1\60\1\162\1\154\1\167\1\164\1\151\1\156\1\164\16\uffff\1"+
        "\60\2\145\1\164\1\150\1\145\1\151\1\160\1\162\2\60\1\145\1\60\1"+
        "\155\1\143\1\141\1\154\1\163\1\141\2\60\1\150\1\157\1\142\1\60\1"+
        "\uffff\1\141\1\147\1\142\2\145\1\60\1\uffff\1\156\1\157\1\164\1"+
        "\145\1\60\1\163\1\145\1\143\1\60\1\165\1\60\1\145\1\142\1\145\1"+
        "\141\1\165\2\145\1\uffff\1\60\1\154\1\60\1\164\1\60\1\154\1\144"+
        "\1\151\1\171\1\145\1\165\2\145\1\146\1\uffff\1\60\1\156\1\60\1\151"+
        "\1\162\1\143\1\60\1\164\2\uffff\1\60\1\143\1\uffff\1\145\1\164\1"+
        "\154\1\144\1\145\1\164\1\166\1\uffff\1\154\1\uffff\1\157\1\162\1"+
        "\165\1\151\1\uffff\1\154\1\60\1\141\2\60\1\uffff\1\60\1\167\2\162"+
        "\1\uffff\1\164\1\151\1\60\1\150\1\uffff\1\162\1\uffff\1\141\1\154"+
        "\1\164\1\165\1\147\1\60\1\143\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\1\145\1\60\1\154\1\160\1\164\1\156\1\155\1\154\1\60\1\146\1\uffff"+
        "\1\156\1\144\1\uffff\1\156\1\60\1\164\1\147\1\uffff\1\60\1\uffff"+
        "\1\164\1\167\1\151\4\60\2\145\1\144\1\164\1\144\1\156\1\60\1\uffff"+
        "\1\154\3\uffff\1\60\1\141\1\164\1\60\1\156\1\uffff\1\60\1\156\1"+
        "\164\2\145\2\154\1\uffff\1\164\2\uffff\1\60\1\uffff\1\60\1\145\1"+
        "\150\1\143\1\60\1\145\1\uffff\2\60\1\163\1\60\1\164\1\uffff\2\60"+
        "\1\uffff\1\60\2\157\4\uffff\1\162\3\60\1\145\1\60\1\uffff\1\60\1"+
        "\uffff\1\143\1\60\1\uffff\1\165\1\uffff\4\60\1\164\1\157\1\164\1"+
        "\60\2\uffff\1\60\1\157\1\164\1\uffff\1\143\2\uffff\1\60\1\uffff"+
        "\1\162\3\uffff\1\162\1\156\1\60\1\156\3\uffff\1\60\1\164\1\145\2"+
        "\uffff\1\164\1\uffff\1\145\4\uffff\1\60\1\147\1\157\2\uffff\1\144"+
        "\1\151\1\164\1\uffff\1\151\1\153\1\60\1\uffff\1\146\1\uffff\1\162"+
        "\1\156\2\60\1\uffff\1\60\1\160\1\60\1\157\1\60\1\143\1\60\1\uffff"+
        "\1\157\2\60\3\uffff\1\60\1\uffff\1\156\1\uffff\1\164\1\uffff\1\60"+
        "\3\uffff\2\60\3\uffff";
    static final String DFA20_maxS =
        "\1\176\1\170\1\71\2\165\1\157\1\156\1\157\1\154\1\171\1\163\1\157"+
        "\1\141\1\145\1\157\1\171\1\162\1\164\1\165\1\150\1\156\2\uffff\1"+
        "\71\4\uffff\1\76\1\75\3\uffff\1\174\4\uffff\1\146\1\172\4\uffff"+
        "\1\145\5\uffff\1\144\1\163\1\164\1\143\3\uffff\1\160\2\162\1\154"+
        "\1\162\1\141\2\156\1\154\1\157\1\162\1\144\1\164\1\160\1\164\1\172"+
        "\1\156\1\157\1\160\1\171\1\172\1\162\2\163\1\144\1\156\1\164\1\162"+
        "\1\164\1\165\1\154\1\164\1\152\1\172\1\162\1\154\1\170\1\164\1\151"+
        "\1\156\1\164\16\uffff\1\172\2\145\1\164\1\150\1\145\1\151\1\160"+
        "\1\162\2\172\1\146\1\172\1\155\1\143\1\141\1\154\1\163\1\141\2\172"+
        "\1\150\1\157\1\154\1\172\1\uffff\1\141\1\147\1\142\2\145\1\172\1"+
        "\uffff\1\156\1\157\1\164\1\145\1\172\1\164\1\145\1\143\1\172\1\165"+
        "\1\172\1\145\1\142\1\145\1\141\1\165\2\145\1\uffff\1\172\1\154\1"+
        "\172\1\164\1\172\1\154\1\144\1\151\1\171\1\145\1\165\2\145\1\146"+
        "\1\uffff\1\172\1\162\1\172\1\151\1\162\1\156\1\172\1\164\2\uffff"+
        "\1\172\1\143\1\uffff\1\145\1\164\1\154\1\144\1\145\1\164\1\166\1"+
        "\uffff\1\154\1\uffff\1\157\1\162\1\165\1\151\1\uffff\1\154\1\172"+
        "\1\141\2\172\1\uffff\1\172\1\167\2\162\1\uffff\1\164\1\151\1\172"+
        "\1\150\1\uffff\1\162\1\uffff\1\141\1\154\1\164\1\165\1\147\1\172"+
        "\1\143\1\uffff\1\172\1\uffff\1\172\1\uffff\1\145\1\172\1\154\1\160"+
        "\1\164\1\156\1\155\1\154\1\172\1\146\1\uffff\1\156\1\144\1\uffff"+
        "\1\156\1\172\1\164\1\147\1\uffff\1\172\1\uffff\1\164\1\167\1\151"+
        "\4\172\2\145\1\144\1\164\1\144\1\156\1\172\1\uffff\1\154\3\uffff"+
        "\1\172\1\141\1\164\1\172\1\156\1\uffff\1\172\1\156\1\164\2\145\1"+
        "\154\1\163\1\uffff\1\164\2\uffff\1\172\1\uffff\1\172\1\145\1\150"+
        "\1\143\1\172\1\145\1\uffff\2\172\1\163\1\172\1\164\1\uffff\2\172"+
        "\1\uffff\1\172\2\157\4\uffff\1\162\3\172\1\145\1\172\1\uffff\1\172"+
        "\1\uffff\1\143\1\172\1\uffff\1\165\1\uffff\4\172\1\164\1\157\1\164"+
        "\1\172\2\uffff\1\172\1\157\1\164\1\uffff\1\143\2\uffff\1\172\1\uffff"+
        "\1\162\3\uffff\1\162\1\156\1\172\1\156\3\uffff\1\172\1\164\1\145"+
        "\2\uffff\1\164\1\uffff\1\145\4\uffff\1\172\1\147\1\157\2\uffff\1"+
        "\144\1\151\1\164\1\uffff\1\151\1\153\1\172\1\uffff\1\146\1\uffff"+
        "\1\162\1\156\2\172\1\uffff\1\172\1\160\1\172\1\157\1\172\1\143\1"+
        "\172\1\uffff\1\157\2\172\3\uffff\1\172\1\uffff\1\156\1\uffff\1\164"+
        "\1\uffff\1\172\3\uffff\2\172\3\uffff";
    static final String DFA20_acceptS =
        "\25\uffff\1\115\1\116\1\uffff\1\120\1\121\1\122\1\123\2\uffff\1"+
        "\126\1\127\1\130\1\uffff\1\132\1\133\1\134\1\135\2\uffff\1\141\1"+
        "\142\1\143\1\144\1\uffff\1\162\1\163\1\164\1\165\1\166\4\uffff\1"+
        "\10\1\137\1\161\51\uffff\1\117\1\145\1\146\1\124\1\147\1\125\1\150"+
        "\1\151\1\152\1\153\1\154\1\131\1\136\1\140\31\uffff\1\74\6\uffff"+
        "\1\60\22\uffff\1\114\16\uffff\1\106\10\uffff\1\155\1\156\2\uffff"+
        "\1\157\7\uffff\1\56\1\uffff\1\160\4\uffff\1\41\5\uffff\1\77\4\uffff"+
        "\1\113\4\uffff\1\33\1\uffff\1\35\7\uffff\1\50\1\uffff\1\54\1\uffff"+
        "\1\112\12\uffff\1\76\2\uffff\1\105\4\uffff\1\62\1\uffff\1\53\16"+
        "\uffff\1\40\1\uffff\1\22\1\36\1\75\5\uffff\1\72\7\uffff\1\44\1\uffff"+
        "\1\51\1\57\1\uffff\1\64\6\uffff\1\7\5\uffff\1\52\2\uffff\1\46\3"+
        "\uffff\1\30\1\31\1\37\1\42\6\uffff\1\20\1\uffff\1\101\2\uffff\1"+
        "\32\1\uffff\1\100\10\uffff\1\63\1\66\3\uffff\1\4\1\uffff\1\6\1\25"+
        "\1\uffff\1\61\1\uffff\1\12\1\45\1\71\4\uffff\1\14\1\24\1\16\3\uffff"+
        "\1\107\1\21\1\uffff\1\102\1\uffff\1\34\1\65\1\43\1\55\3\uffff\1"+
        "\47\1\1\3\uffff\1\26\3\uffff\1\67\1\uffff\1\17\4\uffff\1\73\7\uffff"+
        "\1\23\3\uffff\1\27\1\70\1\103\1\uffff\1\2\1\uffff\1\5\1\uffff\1"+
        "\13\1\uffff\1\110\1\111\1\104\2\uffff\1\15\1\3\1\11";
    static final String DFA20_specialS =
        "\u01a8\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\57\1\61\2\uffff\1\61\22\uffff\1\57\1\45\1\60\1\44\1\46\1"+
            "\37\1\33\1\61\1\50\1\51\1\30\1\26\1\42\1\27\1\2\1\31\12\54\1"+
            "\41\1\25\1\34\1\36\1\35\2\uffff\32\56\1\52\1\uffff\1\53\1\40"+
            "\1\47\1\uffff\1\12\1\17\1\13\1\16\1\1\1\4\1\10\1\56\1\6\2\56"+
            "\1\7\1\5\1\22\1\20\1\21\1\56\1\15\1\3\1\11\1\24\1\14\1\23\3"+
            "\56\1\uffff\1\32\1\uffff\1\43",
            "\1\65\12\uffff\1\63\1\uffff\1\62\11\uffff\1\64",
            "\1\66\1\uffff\12\70",
            "\1\75\3\uffff\1\74\2\uffff\1\73\13\uffff\1\72\1\71",
            "\1\101\7\uffff\1\100\2\uffff\1\102\2\uffff\1\103\2\uffff\1"+
            "\76\2\uffff\1\77",
            "\1\105\11\uffff\1\104",
            "\1\110\6\uffff\1\106\1\107",
            "\1\111",
            "\1\112",
            "\1\116\6\uffff\1\115\2\uffff\1\114\6\uffff\1\113",
            "\1\117\13\uffff\1\121\4\uffff\1\120",
            "\1\123\15\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\127\11\uffff\1\126",
            "\1\130",
            "\1\131\17\uffff\1\132",
            "\1\133",
            "\1\135\11\uffff\1\136\5\uffff\1\134",
            "\1\140\2\uffff\1\137",
            "\1\141",
            "",
            "",
            "\12\55",
            "",
            "",
            "",
            "",
            "\1\144\1\143",
            "\1\146",
            "",
            "",
            "",
            "\1\152\1\150\1\uffff\1\151\1\uffff\1\153\114\uffff\1\154",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\6\55\32\uffff\6\55",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\70\1\uffff\12\54\13\uffff\1\70\37\uffff\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\163\12\uffff\1\162",
            "\1\164",
            "",
            "",
            "",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a\12\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\3\uffff\1\u008f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0091\14\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\1\u0098",
            "\1\u0099",
            "\1\u009b\2\uffff\1\u009c\3\uffff\1\u009a",
            "\1\u009d",
            "\1\u00a0\3\uffff\1\u009f\5\uffff\1\u009e",
            "\1\u00a1",
            "\1\u00a2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u00ae\2\56"+
            "\1\u00b1\3\56\1\u00ad\4\56\1\u00af\1\u00b0\1\u00ac\6\56",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00be\1\u00bd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c6\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00c8\5\56",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cd\11\uffff\1\u00cc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00da\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00df",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00eb",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00f6\21"+
            "\56",
            "\1\u00f9\3\uffff\1\u00f8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd\12\uffff\1\u00fe",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0100",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0111",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\1\u0119",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0123",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0126",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0133\7\56",
            "\1\u0135",
            "\1\u0136",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0146",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0148",
            "\1\u0149",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u014b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152\6\uffff\1\u0153",
            "",
            "\1\u0154",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u015b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u015e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0160",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "",
            "",
            "\1\u0166",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0167\21"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u016b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u016d\3\56"+
            "\1\u016c\12\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0170",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0172",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0180",
            "",
            "",
            "",
            "\1\u0181",
            "\1\u0182",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0184",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u018b",
            "\1\u018c",
            "",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0199",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u019b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u019d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u019f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | LINE_CONTINUATION | SUPERSTRICT | STRICT | FRAMEWORK | MODULE | MODULEINFO | IMPORT | INCLUDE | LOCAL | GLOBAL | TYPE | FUNCTION | METHOD | EXTERN | EXTENDS | ABSTRACT | FINAL | FIELD | CONST | VAR | RETURN | REM | TRUE | FALSE | LONG_TYPE | INT_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BYTE_TYPE | STRING_TYPE | SHORT_TYPE | OBJECT_TYPE | POINTER | NULL | SUPER | SELF | NEW | DELETE | FOR | NEXT | TO | EACHIN | STEP | WHILE | WEND | REPEAT | UNTIL | FOREVER | CONTINUE | SELECT | CASE | DEFAULT | IF | THEN | ELSE | TRY | CATCH | THROW | ASSERT | DEBUGLOG | DEBUGSTOP | EXIT | END | INCBIN | INCBINPTR | INCBINLEN | NOT_TEST | AND_TEST | OR_TEST | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | EQUAL | PERCENT | POWER | COLON | COMMA | TILDE | POUND | BANG | DOLLAR | DOT | UNDERSCORE | LPAREN | RPAREN | LBRACK | RBRACK | NOTEQUAL | LESSEQUAL | GREATEREQUAL | PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | VBAREQUAL | LEFTSHIFT | RIGHTSHIFT | ARITHRIGHTSHIFT | MOD | FLOAT | LONG | IDENTIFIER | WHITESPACE | STRING_LITERAL | NEWLINE );";
        }
    }
 

}