package com.enigma;

import java.util.Arrays;
import java.util.Scanner;

public class CutBamboo {
    public void main() {
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        int[] arrRuas = {};

        int bambu = 1;

        do {
            System.out.printf("Masukkan ruas bambu %d : ", bambu);
            int number = input.nextInt();

            bambu++;

            arrRuas = Arrays.copyOf(arrRuas, arrRuas.length + 1);
            arrRuas[arrRuas.length - 1] = number;

            System.out.print("Masukkan Bambu Lagi? : (y/n) ");
            String inputAgain = stringInput.nextLine();

            if (inputAgain.equalsIgnoreCase("y")) {
                continue;
            } else if (inputAgain.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Masukkan y/n saja! \n");
                continue;
            }

        } while (true);

        System.out.print("Maskkan Potongan Bambu: ");
        int numCycles = input.nextInt();

        cuttingBambooCycles(arrRuas, numCycles);
    }

    public static void cuttingBambooCycles(int[] arr, int numCycles) {
        System.out.println("Initials");
        for (int k = 0; k <= arr.length - 1; k++) {
            String dash = "-".repeat(arr[k]);
            System.out.println("|" + dash);
        }

        for (int i = 1; i <= numCycles; i++) {
            System.out.println("Cycle Cuts " + i);
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j] - 1;

                if (arr[j] < 0) {
                    arr[j] = 0;
                }

                String dashCut = "-".repeat(arr[j]);
                System.out.println("|" + dashCut + "\n");
            }
        }
    }
}
