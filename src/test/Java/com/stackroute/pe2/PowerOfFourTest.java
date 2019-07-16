package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class PowerOfFourTest {
        PowerOfFour powerOfFour;
        @Before
        public void setup() {
            //This method runs, before running an of the testcase
            //This method is used to initialize the required variables
            System.out.println("Inside Before");
            this.powerOfFour= new PowerOfFour();
        }

        @After
        public void tearDown() {
            //This method runs,after running all the testcases
            //This method is used to clear the initialized variables
            System.out.println("Inside After");
            powerOfFour = null;
        }


        @Test
    public void givenAnIntNumShouldBeDivisibleByFour(){
            //Input given as an integer number
        PowerOfFour powerOfFour= new PowerOfFour();
        //Method to check if it is a power of four
        String actualResult= powerOfFour.powerOfFour(16);
        assertEquals("Num is divisible by four",actualResult);
    }
    @Test
    public void givenInputZeroShouldReturnZero(){
        PowerOfFour powerOfFour= new PowerOfFour();
        //Input zero
        String actualResult= powerOfFour.powerOfFour(0);
        //The method returns zero
        assertEquals("Digit is zero",actualResult);
    }


}