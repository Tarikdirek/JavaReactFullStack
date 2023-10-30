package org.example.caracterCount;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir isim giriniz:");
        String name = scanner.next();
        char[] nameChar = name.toCharArray();

        HashMap<Character,Integer> eachCharCountMap = new HashMap<Character,Integer>();
        for (char arrayicindekiharfler: nameChar) {
            if (eachCharCountMap.containsKey(arrayicindekiharfler)){
                eachCharCountMap.put(arrayicindekiharfler,eachCharCountMap.get(arrayicindekiharfler)+1);
            } else
            {
                eachCharCountMap.put(arrayicindekiharfler, 1);
            }
        }

        System.out.println(eachCharCountMap);

    }
}
