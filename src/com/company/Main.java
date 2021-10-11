package com.company;

class Main {
    public static void main(String[] args) {

        int num = 1234567, reversed;

        for(reversed=0 ;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
