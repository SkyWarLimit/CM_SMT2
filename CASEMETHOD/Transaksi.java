package CASEMETHOD;
public class Transaksi {
    String namaPasien;
    String idDokter;
    String namaDokter;
    double durasiLayanan;
    double biayaLayanan;
    double TARIF_PER_JAM = 50000;
    
    public void tampilkanDetailTransaksi() {
        System.out.println("Nama Pasien: " + namaPasien);
        System.out.println("ID Dokter: " + idDokter);
        System.out.println("Nama Dokter: " + namaDokter);
        System.out.println("Durasi Layanan: " + durasiLayanan + " jam");
        System.out.println("Biaya Layanan: Rp " + String.format("%.0f", biayaLayanan));
    }
}