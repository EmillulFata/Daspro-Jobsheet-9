import java.util.Scanner;

public class SearchNilai07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int [] arrNilai = {};
    int key;
    int hasil = 0;
    boolean ditemukan = false;

    System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
    int jumlah = input.nextInt();
    arrNilai = new int[jumlah];

    for (int i = 0; i < arrNilai.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
      arrNilai[i] = input.nextInt();
    }

    System.out.print("Masukkan nilai yang ingin dicari: ");
    key = input.nextInt();

    for (int i = 0; i < arrNilai.length; i++) {
      if (key == arrNilai[i]) {
        hasil = i;
        ditemukan = true;
        break;
      }
    }
    System.out.println();

    if (ditemukan) {
    System.out.println("Nilai "+ key +" Ketemu!, Merupakan Nilai Mahasiswa Ke-" + (hasil + 1));
    } else {
    System.out.println("Nilai Tidak Ditemukan");
    }
  }
}
