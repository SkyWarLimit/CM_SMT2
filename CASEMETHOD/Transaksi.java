package CASEMETHOD;
public class Transaksi {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public Transaksi(Pasien pasien, Dokter dokter, int durasiLayanan, int biaya) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    
    }
    
    public int hitungBiaya(){
        return durasiLayanan * 50000;
<<<<<<< HEAD
    }

    void tampilkanTransaksi() {
        System.out.println(pasien.nama +  " (" + durasiLayanan + " jam)" + ": Rp " + biaya);
=======
>>>>>>> c38982c308ebbc2dc52015afd22e437ee22ba015
    }
}