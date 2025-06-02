package CASEMETHOD;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLLAntrianPasien antrian = new SLLAntrianPasien();
        QueueTransaksi riwayat = new QueueTransaksi(100);
        int pilihan;


      do {
            System.out.println("\n=== Sistem Antrian Klinik ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian Pasien");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Tambah Pasien ke Antrian ===");
                    System.out.print("nama : ");
                    String namaPasien = sc.nextLine();
                    System.out.print("NIK : ");
                    String nikPasien = sc.nextLine();
                    System.out.print("keluhan : ");
                    String keluhanPasien = sc.nextLine();

                    Pasien p = new Pasien(namaPasien, nikPasien, keluhanPasien);
                    antrian.tambahAntrian(p);
                    break;

                case 2:
                    System.out.println("\n=== Daftar Antrian Pasien ===");
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        antrian.tampilkanAntrian();
                    }
                    break;

                case 3:
                    System.out.println("\n=== Layani Pasien ===");
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada pasien dalam antrian.");
                    } else {
                        Pasien pasienDilayani = antrian.layaniPasien();
                        System.out.println("Pasien yang dilayani: " + pasienDilayani.nama);
                        System.out.print("Masukkan ID Dokter : ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan nama dokter : ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan durasi layanan (jam) : ");
                        int durasiLayanan = sc.nextInt();
                        sc.nextLine();

                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        Transaksi transaksi = new Transaksi(pasienDilayani, dokter, durasiLayanan,50000);
                        transaksi.hitungBiaya();

                        riwayat.enqueue(transaksi);
                    }
                    break;

                case 4:
                    System.out.println("\n=== Sisa Antrian Pasien ===");
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println(">>sisa pasien dalam antrian: " + antrian.cekJumlahAntrian());
                    }
                    break;

                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem antrian klinik.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
