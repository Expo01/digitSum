package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("the sum of the digits is " +  sumDigits(225));
        System.out.println("the sum of the digits is " + sumDigits(-111));
        System.out.println("the sum of the digits is " + sumDigits(9));

    }

    public static int sumDigits(int num){
        int sum = 0;

        if (num < 10){
            return -1;
        }
        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
