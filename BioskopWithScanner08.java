import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][3];
        int pilihan;
        int jumlahPenonton = 0;

        do {
            System.out.println("~MENU~");
            System.out.println("1. Input data penonton: ");
            System.out.println("2. Tampilkan daftar penonton: ");
            System.out.println("3. Exit ");
            System.out.print("Pilih menu: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlahPenonton < penonton.length) {
                        System.out.println();
                        System.out.print("Masukkan nama penonton: ");
                        penonton[jumlahPenonton][0] = input.nextLine();
                        jumlahPenonton++;
                        System.out.println("Data penonton berhasil ditambahkan.");
                    } else {
                        System.out.println("Kapasitas maksimum penonton telah tercapai.");
                    }
                    break;
                    case 2:
                    System.out.println("Daftar Penonton:");
                    if (jumlahPenonton == 0) {
                        System.out.println("Belum ada data penonton.");
                    } else {
                        for (int i = 0; i < jumlahPenonton; i++) {
                            System.out.println((i + 1) + ". " + penonton[i][0]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
            
                default:
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
            System.out.println(); 
        } while (pilihan != 3);
    }
}