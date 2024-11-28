# UTS_PBO1_TIFK23A_23552011162 
  * Mata Kuliah    : Pemrograman Berorientasi Obyek 1

  * Dosen Pengampu : Muhammad Ikhwan Fathulloh
# Profil
  * Nama        : Tinton Despi Alkhifari
  * NIM         : 23552011162
  * Studi Kasus : Aplikasi Manajemen Transportasi
# Manajemen Transportasi
  * Merupakan studi kasus yang menjelaskan tentang suatu manajemen transportasi yang dimana di dalamnya berisi tentang beberapa transportasi seperti Motor, Mobil dan Bus. Menjelaskan bagaimana cara menghitung rute hingga meilihat penggunaan bahan bakar
# Penjelasan 4 pilar OOP dalam Studi Kasus
1. Encapsulation (Enkapsulasi)
    * Enkapsulasi adalah konsep untuk menyembunyikan detail implementasi dari sebuah kelas dan hanya memberikan akses terbatas melalui metode atau properti tertentu.
    * Implementasi pada kode:
Kelas Kendaraan, Bus, dan SepedaMotor menyembunyikan data mereka seperti nomorPlat, jenis, dan kapasitas. Akses dan modifikasi data ini diatur melalui konstruktor dan metode (getter/setter atau fungsi lainnya seperti hitungBiayaPerjalanan).
Kelas ManajemenTransportasi mungkin memiliki metode untuk mengelola daftar kendaraan, dan akses ke kendaraan tertentu mungkin dilakukan melalui metode yang telah disediakan.
2. Inheritance (Pewarisan)
   * Pewarisan adalah mekanisme untuk memungkinkan sebuah kelas mewarisi sifat dan perilaku dari kelas lain.
   * Implementasi pada kode:
Bus dan SepedaMotor kemungkinan besar merupakan subclass dari kelas Kendaraan. Mereka mewarisi atribut dan metode dari kelas Kendaraan.
Kelas turunan (Bus, SepedaMotor) dapat menambahkan atribut atau metode baru sesuai kebutuhan atau mengubah perilaku dari metode yang diwariskan.
3. Polymorphism (Polimorfisme)
   * Polimorfisme memungkinkan sebuah objek untuk diperlakukan sebagai objek dari tipe induknya, atau memungkinkan metode dengan nama sama memiliki perilaku yang berbeda.
   * Implementasi pada kode:
Objek mobil, bus, dan motor semuanya dideklarasikan sebagai tipe Kendaraan meskipun masing-masing bisa merupakan instance dari Kendaraan, Bus, atau SepedaMotor.
Metode hitungBiayaPerjalanan() dapat diimplementasikan secara berbeda dalam Kendaraan, Bus, dan SepedaMotor. Misalnya, hitungBiayaPerjalanan untuk Bus mungkin mempertimbangkan kapasitas penumpang, sedangkan untuk SepedaMotor mungkin berbeda.
4. Abstraction (Abstraksi)
   * Abstraksi adalah proses menyembunyikan detail kompleks dari suatu sistem dan hanya menampilkan fitur penting kepada pengguna.
   * Implementasi pada kode:
Kelas Kendaraan kemungkinan merupakan kelas abstrak yang tidak diinstansiasi secara langsung, melainkan hanya menyediakan struktur dasar untuk kelas turunannya (Bus, SepedaMotor).
Metode seperti hitungBiayaPerjalanan mungkin dideklarasikan sebagai metode abstrak di Kendaraan, sehingga kelas turunannya wajib mengimplementasikan metode ini.
  

