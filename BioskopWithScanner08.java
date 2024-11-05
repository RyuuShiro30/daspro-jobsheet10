import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][3];
        int pilihan;

        do {
            System.out.println("~MENU~");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan nomor baris (0-3): ");
                        baris = input.nextInt();
                        System.out.print("Masukkan nomor kolom (0-2): ");
                        kolom = input.nextInt();
                        input.nextLine(); 

                        if (baris < 0 || baris >= penonton.length || kolom < 0 || kolom >= penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
                        } else if (penonton[baris][kolom] != null) {
                            System.out.println("Kursi di baris " + baris + ", kolom " + kolom + " sudah terisi. Pilih kursi lain.");
                        } else {
                            break; 
                        }
                    }
                    
                    System.out.print("Masukkan nama penonton: ");
                    penonton[baris][kolom] = input.nextLine();
                    System.out.println("Data penonton berhasil ditambahkan di kursi [" + baris + "][" + kolom + "].");
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    boolean kosong = true;
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Kursi [" + i + "][" + j + "]: " + penonton[i][j]);
                                kosong = false;
                            }
                        }
                    }
                    if (kosong) {
                        System.out.println("Belum ada data penonton.");
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

        input.close();
    }
}
