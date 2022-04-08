/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi3;

/**
 *
 * @author Asus
 */
public class RiceCooker extends PerabotanRumah {

    private String merk;
    private int berat;
    private String warna;
    private String jenisbarang;

    RiceCooker(String namabarang, int jumlahbarang, String merk, int berat, String warna, String jenisbarang) {
        super(namabarang, jumlahbarang);
        this.merk = merk;
        this.berat = berat;
        this.warna = warna;
        this.jenisbarang = jenisbarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenisbarang() {
        return jenisbarang;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    @Override
    public void lihat() {
        System.out.println("Merupakan Alat perabot Rumah Tangga");

    }

}
