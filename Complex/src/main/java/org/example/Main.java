package org.example;

public class Main
{


    public static void main(String[] args) 
    {
       Complex complex = new Complex(10,10);
       Complex complex2 = new Complex(10,10);

       ServiceComplex serv = new ServiceComplex();
       System.out.println("комплексное число 1: " + complex.str());
       System.out.println("комплексное число 2: " + complex2.str());

       System.out.println("Сложение " + serv.add(complex, complex2).str());
       System.out.println("Разность " + serv.sub(complex, complex2).str());
       System.out.println("Умножение " + serv.mul(complex, complex2).str());

       Complex div = serv.div(complex, complex2);

       System.out.println("Деление " + (div == null ? "На ноль делить нельзя" : div.str()));
        System.out.println("Модуль " + serv.module(complex));
        System.out.println("Совпадение " + serv.equals(complex, complex2));
    }
}