/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Tinton Despi
 */
public class HitungBiayaPerjalanan {
    public class Mobil extends Kendaraan {
    public Mobil(String platNomor, String model, int tahun, int kapasitasPenumpang, String jenisBahanBakar) {
        super(platNomor, model, tahun, kapasitasPenumpang, jenisBahanBakar);
    }

    @Override
    public double hitungBiayaPerjalanan(double jarak) {
        return jarak * 2000; // Contoh perhitungan biaya untuk Mobil
    }
}

public class Bus extends Kendaraan {
    public Bus(String platNomor, String model, int tahun, int kapasitasPenumpang, String jenisBahanBakar) {
        super(platNomor, model, tahun, kapasitasPenumpang, jenisBahanBakar);
    }

    @Override
    public double hitungBiayaPerjalanan(double jarak) {
        return jarak * 5000; // Contoh perhitungan biaya untuk Bus
    }
}

public class SepedaMotor extends Kendaraan {
    public SepedaMotor(String platNomor, String model, int tahun, int kapasitasPenumpang, String jenisBahanBakar) {
        super(platNomor, model, tahun, kapasitasPenumpang, jenisBahanBakar);
    }

    @Override
    public double hitungBiayaPerjalanan(double jarak) {
        return jarak * 1000; // Contoh perhitungan biaya untuk Sepeda Motor
    }
}

}


