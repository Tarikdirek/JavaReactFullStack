package org.example.fiboacciNumber;

public class Main {
    public static void main(String[] args) {
        float sayi1 = 0;
        float sayi2 = 1;

        for (int i =0; i <100; i++){
            float toplam = sayi1 + sayi2;
            sayi1=sayi2;
            sayi2=toplam;
            System.out.println(sayi1);
        }
    }
}
