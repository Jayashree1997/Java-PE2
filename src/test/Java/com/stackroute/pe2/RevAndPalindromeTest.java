package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RevAndPalindromeTest {
    com.stackroute.pe2.RevAndPalindrome revAndPalindrome;
    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.revAndPalindrome = new RevAndPalindrome();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        revAndPalindrome = null;
    }
    @Test
    public void GivenAStringShouldReturnItsReverse(){
        revAndPalindrome = new RevAndPalindrome();
        String actualResult= revAndPalindrome.revAndPalindrome("madam");
        assertEquals("madam",actualResult);
    }
    @Test
    public void GivenAReversedStringShouldReturnIfItIsPalindrome(){
        revAndPalindrome = new RevAndPalindrome();
        String actualResult= revAndPalindrome.revAndPalindrome("madam");
        assertEquals("Given String is Palindrome",actualResult);

    }
}