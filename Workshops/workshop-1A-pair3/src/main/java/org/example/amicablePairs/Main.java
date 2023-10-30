package org.example.amicablePairs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = s.nextInt();

        System.out.println();

        System.out.print("Enter another number:");
        int num2 = s.nextInt();

        int sum = 0 ;
        int sum2 = 0 ;


        for (int i = 1; i <num1 ; i++) {

            if (num1 % i == 0) {
               sum = sum + i;
            }

        }

        for (int i = 1; i <num2 ; i++) {

            if (num2 % i == 0) {
                sum2 = sum2 + i;
            }

        }

        if (num1 == sum2 && num2 == sum) {
            System.out.println("Bu sayılar arkadaş sayılardır");
        }else {
            System.out.println("Bu sayılar arkadaş sayılar değildir.");
        }



    }
}
