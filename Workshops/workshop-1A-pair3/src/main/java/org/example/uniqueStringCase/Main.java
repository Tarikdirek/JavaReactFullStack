package org.example.uniqueStringCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String name = scanner.next();
        char[] nameChar = name.toCharArray();


        Arrays.sort(nameChar);

        if (check(nameChar)) {
            System.out.println("Girilen kelime eşsizdir.");
        }else {
            System.out.println("Girilen kelime eşsiz değildir.");
        }



    }
    public  static boolean check(char[] nameChar){
        for (int i = 1; i <nameChar.length ; i++) {
            if (nameChar[i] == nameChar[i-1]) {
                return false;
            }
        }
        return true;
    }
}
