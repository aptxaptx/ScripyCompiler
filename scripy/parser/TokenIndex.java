/* This file was generated by SableCC (http://www.sablecc.org/). */

package scripy.parser;

import scripy.node.*;
import scripy.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTTab(@SuppressWarnings("unused") TTab node)
    {
        this.index = 0;
    }

    @Override
    public void caseTExMark(@SuppressWarnings("unused") TExMark node)
    {
        this.index = 1;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 2;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 3;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 4;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 5;
    }

    @Override
    public void caseTEquals(@SuppressWarnings("unused") TEquals node)
    {
        this.index = 6;
    }

    @Override
    public void caseTGrt(@SuppressWarnings("unused") TGrt node)
    {
        this.index = 7;
    }

    @Override
    public void caseTGte(@SuppressWarnings("unused") TGte node)
    {
        this.index = 8;
    }

    @Override
    public void caseTLt(@SuppressWarnings("unused") TLt node)
    {
        this.index = 9;
    }

    @Override
    public void caseTLte(@SuppressWarnings("unused") TLte node)
    {
        this.index = 10;
    }

    @Override
    public void caseTLeftPar(@SuppressWarnings("unused") TLeftPar node)
    {
        this.index = 11;
    }

    @Override
    public void caseTRightPar(@SuppressWarnings("unused") TRightPar node)
    {
        this.index = 12;
    }

    @Override
    public void caseTSquareRightBr(@SuppressWarnings("unused") TSquareRightBr node)
    {
        this.index = 13;
    }

    @Override
    public void caseTSquareLeftBr(@SuppressWarnings("unused") TSquareLeftBr node)
    {
        this.index = 14;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 15;
    }

    @Override
    public void caseTSemi(@SuppressWarnings("unused") TSemi node)
    {
        this.index = 16;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 17;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 18;
    }

    @Override
    public void caseTFor(@SuppressWarnings("unused") TFor node)
    {
        this.index = 19;
    }

    @Override
    public void caseTPrint(@SuppressWarnings("unused") TPrint node)
    {
        this.index = 20;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 21;
    }

    @Override
    public void caseTDef(@SuppressWarnings("unused") TDef node)
    {
        this.index = 22;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 23;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 24;
    }

    @Override
    public void caseTIn(@SuppressWarnings("unused") TIn node)
    {
        this.index = 25;
    }

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 26;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 27;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 28;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 29;
    }
}
