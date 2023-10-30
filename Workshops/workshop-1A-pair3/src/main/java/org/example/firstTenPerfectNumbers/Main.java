package org.example.firstTenPerfectNumbers;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        int number = 2;

        System.out.println("The first 10 perfect numbers are:");

        while (count < 100) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }
}
