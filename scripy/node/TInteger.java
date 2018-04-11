/* This file was generated by SableCC (http://www.sablecc.org/). */

package scripy.node;

import scripy.analysis.*;

@SuppressWarnings("nls")
public final class TInteger extends Token
{
    public TInteger(String text)
    {
        setText(text);
    }

    public TInteger(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInteger(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInteger(this);
    }
}
