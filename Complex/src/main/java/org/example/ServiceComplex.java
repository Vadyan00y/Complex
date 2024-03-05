package org.example;

public class ServiceComplex
{
    public Complex add(Complex comp1, Complex comp2)
    {
        Complex complex = new Complex(0,0);
        complex.setX(comp1.getX() + comp2.getX());
        complex.setY(comp1.getY() + comp2.getY());
      return complex;

    }
    public Complex sub(Complex comp1, Complex comp2)

    {
        Complex complex = new Complex(0,0);
        complex.setX(comp1.getX() - comp2.getX());
        complex.setY(comp1.getY() - comp2.getY());
        return complex;

    }
    public Complex mul(Complex comp1, Complex comp2)

    {
        Complex complex = new Complex(0,0);
        complex.setX(comp1.getX() * comp2.getX() - comp1.getY() * comp2.getY());
        complex.setY(comp1.getX() * comp2.getY() + comp1.getX() * comp2.getY());
        return complex;

    }
    public Complex div(Complex comp1, Complex comp2)
    {
        if (comp1.getX() == 0 || comp2.getX() == 0)
            return null;
        Complex complex = new Complex(0, 0);
        try
        {
            int cube =(int)(Math.pow(comp2.getX(), 2) + Math.pow(comp2.getY(), 2));
            complex.setX((comp1.getX() * comp2.getX() + comp1.getY() * comp2.getY()) / cube);
            complex.setY((comp1.getY() * comp2.getX() - comp1.getX() * comp2.getY()) /cube);
            return complex;
        }
        catch (Exception e)
        {
        System.out.println("Ошибка" + e.getMessage());
        return null;
        }
    }
    public  double module(Complex complex)
    {
        return  Math.sqrt(Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));

    }
    public boolean equals (Complex comp1, Complex comp2)
    {
        return comp1.getX() == comp2.getX() && comp1.getY() == comp2.getY();
    }
}

