package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long sayi1 = 0;
        long sayi2 = 1;


        for (int i = 0; i < 100; i++) {
           long toplam = sayi1 + sayi2;
           sayi1 = sayi2;
           sayi2 = toplam;
            System.out.println(sayi1);
        }

    }
}