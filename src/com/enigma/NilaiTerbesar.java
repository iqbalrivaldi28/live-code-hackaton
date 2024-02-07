package com.enigma;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class NilaiTerbesar {


    public void findMinMax() {

        System.out.println("=============================");
        System.out.println("Progam Mencari Nilai TErbesar/Terkecil ");
        System.out.println("=============================");

        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        Integer[] arr = {};
        String inputAgain = "";

        do {
            System.out.print("Masukkan angka: ");
            int input = scan.nextInt();

            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = input;

            System.out.print("Input angka lagi? (y/n): ");

            inputAgain = scanString.nextLine();

            if (inputAgain.equalsIgnoreCase("y")) {
                continue;
            } else if (inputAgain.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Masukkan y/n saja!");
                continue;
            }

        } while(true);

        System.out.println(Arrays.toString(arr));

        int max = 0, min = arr[0];
        for (int data : arr) {
            if (data > max) {
                max = data;
            }
        }

        for (int data : arr) {
            if (data < min) {
                min = data;
            }
        }

        System.out.println("max: "+ max + " min: "+ min);
    }
}