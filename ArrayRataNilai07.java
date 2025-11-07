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
      System.out.println("\n Daftar Mahasiswa Yang Lulus : ");
      for (int i = 0; i < NilaiMahasiswa.length; i++) {
        if (NilaiMahasiswa[i] > 70) {
          System.out.println("Mahasiswa Ke-" + i + " Lulus!");
        }
    }
  }
}

