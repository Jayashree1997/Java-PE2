package com.stackroute.pe2;

public class RevAndPalindrome {
    public String revAndPalindrome(String temp){
        String reverse="",input="";
        String output="";

        input=temp;

        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+temp.charAt(i);
        }

        if(reverse.equals((input))){
            output="madam";
        }
        else{
            output="Given String is not a Palindrome";
        }

      return output;
    }

}
