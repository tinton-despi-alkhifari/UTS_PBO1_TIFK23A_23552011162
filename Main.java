/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author Tinton Despi
 */
public class Main {
    public static void main(String[] args) {
        ManajemenTransportasi manajemen = new ManajemenTransportasi();

        Kendaraan mobil = new Kendaraan("B1234XYZ", "Sedan", 2020, 4, "Bensin");
        Kendaraan bus = new Bus("B5678XYZ", "Bus Pariwisata", 2019, 40, "Diesel");
        Kendaraan motor = new SepedaMotor("B9101XYZ", "Matic", 2021, 2, "Bensin");

        manajemen.daftarKendaraan(mobil);
        manajemen.daftarKendaraan(bus);
        manajemen.daftarKendaraan(motor);

        double biayaMobil = mobil.hitungBiayaPerjalanan(50); // jarak 50 km
        double biayaBus = bus.hitungBiayaPerjalanan(50);
        double biayaMotor = motor.hitungBiayaPerjalanan(50);

        System.out.println("Biaya perjalanan mobil: " + biayaMobil);
        System.out.println("Biaya perjalanan bus: " + biayaBus);
        System.out.println("Biaya perjalanan motor: " + biayaMotor);

        manajemen.laporanPerjalanan();
    }
}



    