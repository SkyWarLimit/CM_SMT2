package CASEMETHOD;

public class AntrianPasien {
    NodePasien head, tail;
    
 public void tambahPasien(Pasien p) {
        NodePasien newNode = new NodePasien(p, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Pasien berhasil ditambahkan ke antrian.\n");
    }

    public Pasien layaniPasien() {
        if (head == null) return null;
        Pasien p = head.data;
        head = head.next;
        if (head == null) tail = null;
        return p;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.\n");
            return;
        } else {
            System.out.println("Daftar Antrian Pasien: " + antrianSize() + " pasien");
            NodePasien current = head;
            int no = 1;
            while (current != null) {
                System.out.println("Antrian #" + no++);
                current.data.tampilkanInformasi();
                System.out.println();
                current = current.next;
            }
        }
    }

    public int antrianSize() {
        int count = 0;
        NodePasien current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
    
