package org.example.anagramCase;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz:");
        String string1 = scanner.next();
        string1.toLowerCase();
        System.out.println();
        System.out.println("İkinci kelimeyi giriniz:");
        String string2 = scanner.next();
        string2.toLowerCase();



        if (!(string1.length() == string2.length())) {
            System.out.println("Girilen iki kelime anagram değildir.");
        }else {
            char[] char1 = string1.toCharArray();
            char[] char2 = string2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            if (Arrays.equals(char1,char2) == true) {
                System.out.println("Girilen iki kelime anagramdır");
            }else {
                System.out.println("Girilen kelimeler anagram değildir.");
            }
        }

    }
}
