import java.util.Scanner;

public class Siakad08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
              
        }
       System.out.println("\n============================");
       System.out.println("Rata-rata nilai setiap mata kuliah:");

       for (int j = 0; j<3; j++) {
        double totalPerMatkul = 0;

        for (int i = 0; i < 4; i++) {
            totalPerMatkul += nilai[i][j];
        }
        System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
       }
    }
}

