package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1 <= num2){
            if (num1 % 2 != 0){ // 10/2=0, 11/2=1, 12/2=0, 13/2=1, ......... 19/2=1
                System.out.print(" " + num1); // 11, 13, ....... 19
            }
            num1++;
        }
    }
}
