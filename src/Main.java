import com.enigma.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NilaiTerbesar nilaiTerbesar = new NilaiTerbesar();
        FindMin findMin = new FindMin();
        MencariNamaGanjil mencariNamaGanjil = new MencariNamaGanjil();
        CutBamboo cutBamboo = new CutBamboo();

//        System.out.println("+-----------------------------------------------+");
//        System.out.println("| Selamat Datang di Program Team Terlalu Tampan |");
//        System.out.println("| 1. Mencari NIlai Terbesar dan Terkecil");
//        System.out.println("| 2, Mencari Elemen/NIlai MInus Terbesar HIlang");
//        System.out.println("| 3. Cut The Bamboo");
//        System.out.println("| 4. Mencari Nama Ganjil");
//        System.out.println("| X. Keluar");
//        System.out.println("+-----------------------------------------------+");
//        System.out.println();
//
//        System.out.print("Masukan Pilihan: ");
//        int angka = scanner.nextInt();
        String inputLagi;

        do {
            System.out.println("+-----------------------------------------------+");
            System.out.println("| Selamat Datang di Program Team Terlalu Tampan |");
            System.out.println("| 1. Mencari NIlai Terbesar dan Terkecil");
            System.out.println("| 2, Mencari Elemen/NIlai MInus Terbesar HIlang");
            System.out.println("| 3. Cut The Bamboo");
            System.out.println("| 4. Mencari Nama Ganjil");
            System.out.println("| X. Keluar");
            System.out.println("+-----------------------------------------------+");
            System.out.print("Masukan Pilihan: ");

            int angka = scanner.nextInt();
            switch (angka) {
                case 1:
                    nilaiTerbesar.findMinMax();
                    break;
                case 2:
                    findMin.findMin();
                    break;
                case 3:
                    cutBamboo.main();
                    break;
                case 4:
                    mencariNamaGanjil.main();
                    break;
                default:
                    System.out.println("Angka yg anda masukan salah");
            }

            Scanner inputString = new Scanner(System.in);
            System.out.print("Mau input lagi? (y/n): ");
            inputLagi = inputString.nextLine();

            if (inputLagi.equalsIgnoreCase("y")){
                continue;
            } else if (inputLagi.equalsIgnoreCase("n")){
                break;
            } else {
                System.out.println("Masukan (y/n) saja");
                continue;
            }
        } while (inputLagi.equalsIgnoreCase("y")) ;


    }


}