package CASEMETHOD;

public class SLLAntrianPasien {
    NodePasien head, tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void tambahAntrian (Pasien pasien){
        NodePasien ndpasien = new NodePasien(pasien, null);
        if (isEmpty()) {
            head = tail = ndpasien;
        } else {
            tail.next = ndpasien;
            tail = ndpasien;
        }
    }

    public Pasien layaniPasien(){
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat melayani pasien");
            return null;
        }
        Pasien dilayani = head.data;
        head = head.next;
        if (head == null ) {
            tail = null;
        } return dilayani;
    }

    public void tampilkanAntrian(){
        if (!isEmpty()) {
            NodePasien current = head;
            System.out.println("Daftar Antrian");
            while (tail != null) {
                current.data.tampilkanInformasi();
                current = current.next;
            }
        }
    }
    public int cekJumlahAntrian(){
        int jumlah = 0;
        NodePasien current = head;
        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }
}
