import java.util.Scanner;

public class MenuSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] Menu = {"Matcha", "RedVelvet", "CaramelMachiato", "Croissant", "Wafel", "Donut"};
        double[] HargaMenu = {20000, 20000, 23000, 27000, 25000, 23000};
        boolean Found = false;

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < Menu.length; i++) {
            System.out.println((i + 1) + ". " + Menu[i] + " = Rp " + HargaMenu[i]);
        }

        System.out.print("Masukkan Nama Menu Yang Ingin Dicari: ");
        String Search = input.nextLine();

        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i].equalsIgnoreCase(Search)) {
                System.out.println("Menu " + Menu[i] + " Tersedia Dengan Harga Rp " + HargaMenu[i]);
                Found = true;
                break;
            }
        }
        if (!Found) {
            System.out.println("Maaf, Menu " + Search + " Tidak Tersedia Di Caffe Kami.");
        }
    }
}
