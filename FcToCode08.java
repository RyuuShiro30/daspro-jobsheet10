import java.util.Scanner;

public class FcToCode08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah responden dan jumlah pertanyaan
        int jumlahResponden = 5;
        int jumlahPertanyaan = 3;

        // Membuat array 2D untuk menyimpan data survei
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

        // Meminta input nilai survei dari pengguna
        System.out.println("Masukkan nilai survei (1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = input.nextInt();
            }
        }

        // Menghitung dan menampilkan rata-rata per responden
        System.out.println("\nRata-rata nilai per responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = (double) total / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataRata);
        }

        // Menghitung dan menampilkan rata-rata per pertanyaan
        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = (double) total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }

        // Menghitung dan menampilkan rata-rata keseluruhan
        int totalSemua = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalSemua / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
}