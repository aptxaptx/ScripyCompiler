/* This file was generated by SableCC (http://www.sablecc.org/). */

package scripy.node;

import scripy.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicationMultiplication extends PMultiplication
{
    private PMultiplication _multiplication_;
    private PValue _value_;

    public AMultiplicationMultiplication()
    {
        // Constructor
    }

    public AMultiplicationMultiplication(
        @SuppressWarnings("hiding") PMultiplication _multiplication_,
        @SuppressWarnings("hiding") PValue _value_)
    {
        // Constructor
        setMultiplication(_multiplication_);

        setValue(_value_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicationMultiplication(
            cloneNode(this._multiplication_),
            cloneNode(this._value_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicationMultiplication(this);
    }

    public PMultiplication getMultiplication()
    {
        return this._multiplication_;
    }

    public void setMultiplication(PMultiplication node)
    {
        if(this._multiplication_ != null)
        {
            this._multiplication_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplication_ = node;
    }

    public PValue getValue()
    {
        return this._value_;
    }

    public void setValue(PValue node)
    {
        if(this._value_ != null)
        {
            this._value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._value_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiplication_)
            + toString(this._value_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiplication_ == child)
        {
            this._multiplication_ = null;
            return;
        }

        if(this._value_ == child)
        {
            this._value_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

        if(this._value_ == oldChild)
        {
            setValue((PValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
