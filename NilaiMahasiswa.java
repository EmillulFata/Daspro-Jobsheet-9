import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Jumlah Mahasiswa: ");
        int jumlah = input.nextInt();

        int[] Nilai = new int[jumlah];
        int Total = 0, Rerata;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Input Nilai Mahasiswa ke-" + (i+1) + ": ");
            Nilai[i] = input.nextInt();
        }

        int NilaiTertinggi = Nilai[0];
        int NilaiTerendah = Nilai[0];
        for (int i = 0; i < jumlah; i++) {
            Total += Nilai[i];
            if (Nilai[i] > NilaiTertinggi) NilaiTertinggi = Nilai[i];
            if (Nilai[i] < NilaiTerendah) NilaiTerendah = Nilai[i];
        }

        Rerata = Total / jumlah;

        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + Nilai[i]);
        }
        System.out.println("Nilai Rata-Rata: " + Rerata);
        System.out.println("Nilai Tertinggi: " + NilaiTertinggi);
        System.out.println("Nilai Terendah: " + NilaiTerendah);
    }
}

