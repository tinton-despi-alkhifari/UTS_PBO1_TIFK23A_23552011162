/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Tinton Despi
 */
public class Kendaraan {
    private String platNomor;
    private String model;
    private int tahun;
    private int kapasitasPenumpang;
    private String jenisBahanBakar;

    public Kendaraan(String platNomor, String model, int tahun, int kapasitasPenumpang, String jenisBahanBakar) {
        this.platNomor = platNomor;
        this.model = model;
        this.tahun = tahun;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    // Getter dan Setter (Encapsulation)
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }

    // Polymorphism: Hitung biaya perjalanan
    public double hitungBiayaPerjalanan(double jarak) {
        return 0; // Default, akan di-override oleh subclass
    }
}

    

