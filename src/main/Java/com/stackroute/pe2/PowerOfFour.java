package com.stackroute.pe2;

public class PowerOfFour {

    public String powerOfFour(int num) {

        String message = "";
        if (num == 0) {
            message = "Digit is zero";
        }
        else{
        while (num != 0) {
            if (num % 4 == 0)
                message = "Num is divisible by four";
            num = num / 4;
        }
        return message;
     }
        return message;
    }

}
