import java.util.Scanner;

public class ArrayRataNilai07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] NilaiMahasiswa = new int[10];
    double Total = 0;
    double Rerata = 0;

    for (int i = 0; i < NilaiMahasiswa.length; i ++) {
      System.out.print("Input Nilai Mahasiswa Ke-" + (i + 1) + " : ");
      NilaiMahasiswa[i] = input.nextInt();
      }
      for (int i = 0; i < NilaiMahasiswa.length; i++) {
        Total += NilaiMahasiswa[i];
      }
      Rerata = Total/NilaiMahasiswa.length;
      System.out.println("Rerata Nilai = " +Rerata);
    }
  }

