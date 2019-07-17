package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RevAndPalindromeTest {
    RevAndPalindrome revAndPalindrome;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables
        System.out.println("Inside Before");
        this.revAndPalindrome = new RevAndPalindrome();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables
        System.out.println("Inside After");
        revAndPalindrome = null;
    }
    @Test
    public void givenAStringShouldReturnItsReverse(){
        //Input must be given as a string
        revAndPalindrome = new RevAndPalindrome();
        //This method returns reverse of a given string
        String actualResult= revAndPalindrome.revAndPalindrome("madam");
        assertEquals("madam",actualResult);
    }
    @Test
    public void givenAReversedStringShouldReturnPallindrome(){
        revAndPalindrome = new RevAndPalindrome();
        //The reversed string is given as input here
        String actualResult= revAndPalindrome.revAndPalindrome("madamm");
        //This method checks if the reversed string is a palindrome or not
        assertEquals("Given String is not a Palindrome",actualResult);

    }
}