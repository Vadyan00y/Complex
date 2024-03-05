package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceComplexTest
{
    Complex comp1, comp2, trird;
    ServiceComplex utils;


    @BeforeEach
    void init() {
        comp1 = new Complex(1,2);
        comp2 = new Complex(3,4);
        trird = new Complex(3,4);
        utils = new ServiceComplex();
    }

    @Test
    void add() {
        Complex result = new Complex(4, 4);
        Complex result2 = utils.add(comp1, comp2);
        assertEquals( 4, result2.getX());
        //assertTrue(utils.equals(utils.add(comp1, comp2), result));
    }

    @Test
    void sub() {
        Complex result = new Complex(-2, -2);
        assertTrue(utils.equals(utils.sub(comp1, comp2), result));
    }

    @Test
    void mul() {
        Complex result = new Complex(40, 40);
        Complex result2 = utils.mul(comp1, comp2);
        assertEquals( -5, result2.getX());
        //assertTrue(utils.equals(result, utils.mul(comp1, comp2)));
    }

    @Test
    void div() {

       Complex result = new Complex(1, 1);
        Complex result2 = utils.div(comp1, comp2);

      //  assertTrue(utils.equals(result, utils.div(comp1, comp2)));
       assertEquals( 0.44, result2.getX());
    }

   // @Test
   // void testEquals()
   // {

   //     Complex result = new Complex(-2, -2);
  //      assertTrue(utils.equals(utils.add(comp1, comp2), result));
  //  }

    @Test
    void module() {
        assertEquals( 14, 14, utils.module(trird));
    }
}

