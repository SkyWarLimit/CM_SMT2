package CASEMETHOD;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("=== Sistem Antrian Klinik ===");
        System.out.println("1. Tambah Pasien ke Antrian");
        System.out.println("2. Lihat Antrian Pasien");
        System.out.println("3. Layani pasien");
        System.out.println("4. Cek sisa antrian pasien");
        System.out.println("5. Lihat riwayat transaksi");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = sc.nextInt();
        sc.nextLine(); // Clear the newline character


        do {
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIK pasien: ");
                    String nik = sc.nextLine();
                    System.out.print("Masukkan keluhan pasien: ");
                    String keluhan = sc.nextLine();
                    Pasien pasien = new Pasien(nama, nik, keluhan);
                   
                    break;
                case 2:
                   
                    break;
                case 3:
                    
                    break;
                case 4:
                 
                    break;
                case 5:
                 
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian klinik.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
