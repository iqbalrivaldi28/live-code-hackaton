package com.enigma;

import java.util.Scanner;

public class MencariNamaGanjil {
    public  void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        StringBuilder result = MencariNamaGanjil(inputString);
        System.out.println("Nama-nama dengan jumlah huruf ganjil: " + result);
    }

    public static StringBuilder MencariNamaGanjil(String value) {
        String[] stringArray = value.split(" ");
        StringBuilder namaGanjil = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() % 2 != 0) {
                if (!namaGanjil.isEmpty()) {
                    namaGanjil.append(", "); // Add space if not empty
                }
                namaGanjil.append(stringArray[i]);
            }
        }

        return namaGanjil;
    }
}