package com.enigma;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {

    public void findMin() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan ukuran array:");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Masukan jumlah angka kedalam array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }



        int minMissing = 1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minMissing) {
                minMissing = arr[i] + 1;
             }
//            else {
//                System.out.println(minMissing);
//            }
        }

        System.out.println("Nilai array yg hilang adalah: " + minMissing);
    }
}