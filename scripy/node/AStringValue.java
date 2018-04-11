/* This file was generated by SableCC (http://www.sablecc.org/). */

package scripy.node;

import scripy.analysis.*;

@SuppressWarnings("nls")
public final class AStringValue extends PValue
{
    private TString _string_;

    public AStringValue()
    {
        // Constructor
    }

    public AStringValue(
        @SuppressWarnings("hiding") TString _string_)
    {
        // Constructor
        setString(_string_);

    }

    @Override
    public Object clone()
    {
        return new AStringValue(
            cloneNode(this._string_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringValue(this);
    }

    public TString getString()
    {
        return this._string_;
    }

    public void setString(TString node)
    {
        if(this._string_ != null)
        {
            this._string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._string_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._string_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._string_ == child)
        {
            this._string_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._string_ == oldChild)
        {
            setString((TString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
