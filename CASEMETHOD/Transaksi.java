package CASEMETHOD;
public class Transaksi {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya = 50000;

    public Transaksi(Pasien pasien, Dokter dokter, int durasiLayanan, int biaya) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    
    }
    
    public int hitungBiaya(){
        return durasiLayanan * biaya;
    }
}