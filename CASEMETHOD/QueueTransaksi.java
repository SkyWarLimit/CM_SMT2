package CASEMETHOD;

public class QueueTransaksi {
    Transaksi [] riwayatTransaksi;
    int front, rear, size,max;

    public boolean isEmpty() {
        return size == 0;
    }

    public QueueTransaksi(int n){
        max = n;
        riwayatTransaksi = new Transaksi[max];
        size = 0;
        front = rear = -1;
    }

    public void enqueue(Transaksi t) {
        if (size == max) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        }
        else {
            rear = (rear + 1) % max;
        }
        riwayatTransaksi[rear] = t;
        size++;
    }

    public void tampilkanRiwayat() {
    if (size == 0) {
        System.out.println("Belum ada transaksi.");
        return;
    }
    System.out.println("=== Riwayat Transaksi ===");
    for (int i = 0; i < size; i++) {
        int idx = (front + i) % riwayatTransaksi.length;
        System.out.println((i + 1) + ".");
        riwayatTransaksi[idx].tampilkanInformasi(); // tampilkan isi transaksi
    }
}
}
