/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi3;

/**
 *
 * @author Asus
 */
public class PerabotanRumah {

    private String namabarang;
    private int jumlahbarang;

    public PerabotanRumah(String namabarang, int jumlahbarang) {
        this.namabarang = namabarang;
        this.jumlahbarang = jumlahbarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getJumlahbarang() {
        return jumlahbarang;
    }

    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

public void lihat() {
        System.out.println("Tesss");
    }

}