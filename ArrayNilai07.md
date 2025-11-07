1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < nilaiAkhir.length; i++) {
System. out.print ("Masukkan nilai akhir ke-"+i+" : ") ;
nilaiAkhir[i] = sc.nextInt () ;
}
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
> 70):
for (int i = 0; i < nilaiAkhir.length; i++) {
if (nilaiAkhir[i] > 70) {
System. out. println ("Mahasiswa ke-"+i+" lulus!") ;
  }
}
Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,

Jawaban : 
1. Tidak ada perubahan. karena ukuran nilai array-nya sama
2. Kondisi i < nilaiAkhir.length berarti perulangan akan terus berjalan selama
nilai i lebih kecil dari jumlah elemen array nilaiAkhir.
3. Alur :
   1. Program membuat array NilaiAkhir untuk menyimpan 10 nilai mahasiswa.
   2. Menggunakan loop for pertama untuk meminta pengguna menginputkan
      nilai-nilai mahasiswa.
   3. Loop for kedua digunakan untuk memeriksa tiap nilai.
   4. Hanya nilai yang lebih besar dari 70 yang akan ditampilkan dengan pesan
      “Mahasiswa ke-i lulus!”.
   5. Mahasiswa dengan nilai ≤ 70 tidak akan muncul di output.
4. -