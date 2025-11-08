import java.util.Scanner;

public class Caffe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] Menu = {"Matcha", "RedVelvet", "CaramelMachiato", "Croissant", "Wafel", "Donut"};
        double[] HargaMenu = {20_000, 20_000, 23_000, 27_000, 25_000, 23_000};
        double Total = 0;

        System.out.println("=== Menu Kafe ===");
        for (int i = 0; i < Menu.length; i++) {
            System.out.println((i + 1) + ". " + Menu[i] + " = Rp " + HargaMenu[i]);
        }

        System.out.print("\nInput Jumlah Pesanan: ");
        int jumlahPesanan = input.nextInt();

        String[] Pesanan = new String[jumlahPesanan];
        int[] Banyak = new int[jumlahPesanan];
        double total = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan Nomor Menu ke-" + (i + 1) + ": ");
            int pilihan = input.nextInt();
            if (pilihan < 1 || pilihan > Menu.length) {
                System.out.println("Nomor Menu Tidak Valid!");
                i--;
                continue;
            }
            Pesanan[i] = Menu[pilihan - 1];
            System.out.print("Masukkan Jumlah " + Pesanan[i] + ": ");
            Banyak[i] = input.nextInt();

            Total += HargaMenu[pilihan - 1] * Banyak[i];
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + Pesanan[i] + " x" + Banyak[i]);
        }

        System.out.println("--------------------------");
        System.out.println("Total yang harus dibayar: Rp " + Total);
    }
}