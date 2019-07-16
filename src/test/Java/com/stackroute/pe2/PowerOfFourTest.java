package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class PowerOfFourTest {
        PowerOfFour powerOfFour;
        @Before
        public void setup() {
            System.out.println("Inside Before");
            this.powerOfFour= new PowerOfFour();
        }

        @After
        public void tearDown() {
            System.out.println("Inside After");
            powerOfFour = null;
        }


        @Test
    public void givenAnIntNumShouldBeDivisibleByFour(){
        PowerOfFour powerOfFour= new PowerOfFour();
        String actualResult= powerOfFour.powerOfFour(16);
        assertEquals("Num is divisible by four",actualResult);
    }
    @Test
    public void givenInputZeroShouldReturnZero(){
        PowerOfFour powerOfFour= new PowerOfFour();
        String actualResult= powerOfFour.powerOfFour(0);
        assertEquals("Digit is zero",actualResult);
    }


}