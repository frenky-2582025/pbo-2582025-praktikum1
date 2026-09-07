import java.util.Scanner;

public class BiodataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Menggunakan String agar NIM panjang tidak error
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan Tinggi (cm): ");
        int tinggi = scanner.nextInt();

        // Membersihkan karakter newline tersisa sebelum membaca String lagi
        scanner.nextLine();

        System.out.print("Masukkan Asal Kota: ");
        String asalKota = scanner.nextLine();

    }
}