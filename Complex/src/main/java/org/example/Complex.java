package org.example;

public class Complex
{
    Double X, Y;

    public Complex (double x, double y)
    {
        X = x;
        Y = y;
    }
    public double getX() {
        return X;
    }

    public void setX(double x) { X = x;}

    public double getY() {
        return Y;
    }

    public void setY(double y) { Y = y;}
    public String str()
    {
    return X + "+" + Y + "i" ;
    }

}
