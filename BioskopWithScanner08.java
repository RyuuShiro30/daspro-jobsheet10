import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = input.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
                
            }
        }
    }    
}
