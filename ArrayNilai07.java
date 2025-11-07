import java.util.Scanner;

public class ArrayNilai07 { 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] NilaiAkhir = new int [10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Input Nilai Akhir Ke-" + i +" : ");
      NilaiAkhir [i]= input.nextInt(); 
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("Nilai Akhir Ke-" + i + " Adalah " + NilaiAkhir[i]);
      }
    }
  }

