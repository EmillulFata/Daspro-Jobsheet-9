1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian? 
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

Jawaban :
1. Akan terjadi error, karena type data yang dideklarasikan pada program adalah type data Integer yang artinya hanya bisa menyimpan bilangan bulat bukan bilangan desimal.
2. Modifikasi
3. Penjelasan : Perintah for digunakan untuk mengulang proses menampilkan isi array. Setiap kali perulangan berjalan, System.out.println(bil[i]) akan mencetak nilai dari elemen array ke-i. Jadi program akan menampilkan semua isi array (bil[0] sampai bil[3]) satu per satu ke layar.
4. Program akan error saat dijalankan, karena saat i = 4 program akan mengakses bil [4] sedangkan bilangan 4 tidak ada di program. Jadi harus menggunakan i < 4 agar program bisa berjalan tanpa ada error.