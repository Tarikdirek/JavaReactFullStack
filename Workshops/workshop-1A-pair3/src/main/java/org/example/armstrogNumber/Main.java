package org.example.armstrogNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();

        c = n;

        for (a = n; a > 0; a /= 10)
        {
            count++;
        }


        a = n;
        sum = 0;


        for (; n > 0; n /= 10)
        {
            b = n % 10;
            sum += Math.pow(b, count);
        }

        if (sum == c)
        {
            System.out.println(c + " is an Armstrong number");
        }
        else
        {
            System.out.println(c + " is not an Armstrong number");
        }












    }
}
