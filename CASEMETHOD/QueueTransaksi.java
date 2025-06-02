package CASEMETHOD;

public class QueueTransaksi {
    Transaksi [] riwayatTransaksi;
    int front, rear, size,max;

    public QueueTransaksi(int n){
        max = n;
        riwayatTransaksi = new Transaksi[max];
        size = 0;
        front = rear = -1;
    }

    public void enqueue(Transaksi t) {
        if (size == riwayatTransaksi.length) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        riwayatTransaksi[rear] = t;
        rear = (rear + 1) % riwayatTransaksi.length;
        size++;
    }

    public void tampilkanRiwayat() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % riwayatTransaksi.length;
            System.out.println((i + 1) + ". " + riwayatTransaksi[idx]);
        }
    }
}
