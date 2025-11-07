import java.util.Scanner;

public class ArrayRataNilai07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input Jumlah Mahasiswa : ");
    int JumlahMahasiswa = input.nextInt();

    int[] NilaiMahasiswa = new int[JumlahMahasiswa];
    double TotalLulus = 0, TotalTidakLulus = 0;
    double CountLulus = 0, CountTidakLulus = 0;

    for (int i = 0; i < NilaiMahasiswa.length; i ++) {
      System.out.print("Input Nilai Mahasiswa Ke-" + (i + 1) + " : ");
      NilaiMahasiswa[i] = input.nextInt();
      }
      for (int i = 0; i < NilaiMahasiswa.length; i++) {
        if (NilaiMahasiswa[i] > 70) {
          TotalLulus += NilaiMahasiswa[i];
          CountLulus++;
        } else {
          TotalTidakLulus += NilaiMahasiswa[i];
          CountTidakLulus++;
        }
    }
    double rataLulus = (CountLulus > 0) ? TotalLulus / CountLulus : 0;
    double rataTidakLulus = (CountTidakLulus > 0) ? TotalTidakLulus /
    CountTidakLulus : 0;

    System.out.println("\nRata-rata nilai lulus = " + rataLulus);
    System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
  }
}

