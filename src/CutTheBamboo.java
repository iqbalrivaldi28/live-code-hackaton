import java.util.Scanner;

public class CutTheBamboo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang ruas bambu dipisahkan oleh spasi: ");
        String input = scanner.nextLine();

        String[] lengthsStr = input.split(" ");
        int[] bambooLength = new int[lengthsStr.length];

        for (int i = 0; i < lengthsStr.length; i++) {
            bambooLength[i] = Integer.parseInt(lengthsStr[i]);
        }

        System.out.print("Masukkan jumlah siklus pemotongan: ");
        int cuttingCycles = scanner.nextInt();

        System.out.println("Initial");
        printBamboo(bambooLength);

        for (int i = 1; i <= cuttingCycles; i++) {
            System.out.println("\nCut " + i);
            cutBamboo(bambooLength);
            printBamboo(bambooLength);
        }

        scanner.close();
    }

    public static void cutBamboo(int[] bambooLength) {
        for (int i = 0; i < bambooLength.length; i++) {
            if (bambooLength[i] > 0) {
                bambooLength[i]--;
            }
        }
    }

    public static void printBamboo(int[] bambooLength) {
        for (int length : bambooLength) {
            System.out.print("| ");
            for (int i = 0; i < length; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
