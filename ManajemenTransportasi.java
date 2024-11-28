/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tinton Despi
 */
public class ManajemenTransportasi {
    private List<Kendaraan> daftarKendaraan;

    public ManajemenTransportasi() {
        this.daftarKendaraan = new ArrayList<>();
    }

    public void daftarKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
        System.out.println("Kendaraan berhasil didaftarkan: " + kendaraan.getPlatNomor());
    }

    public void hitungRute(String asal, String tujuan) {
        System.out.println("Menghitung rute dari " + asal + " ke " + tujuan);
        // Logika perhitungan rute
    }

    public void laporanPerjalanan() {
        System.out.println("Laporan Perjalanan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.tampilkanInfo();
        }
    }
}


