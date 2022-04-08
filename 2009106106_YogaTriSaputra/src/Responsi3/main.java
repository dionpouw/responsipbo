/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi3;

/**
 *
 * @author Asus
 */
public class main {

    public static void main(String[] args) {
        RiceCooker baru = new RiceCooker("RiceCooker", 2, "Panasonic", 20, "White", "Keep Warm");
        System.out.println("Nama Barang    : " + baru.getNamabarang());
        System.out.println("Jumlah Barang  : " + baru.getJumlahbarang());
        System.out.println("Merk Barang    : " + baru.getMerk());
        System.out.println("Berat Barang   : " + baru.getBerat());
        System.out.println("Warna Barang   : " + baru.getWarna());
        System.out.println("Jenis Barang   : " + baru.getJenisbarang());
        //Override
        System.out.println("\n");
        baru.lihat();

        System.out.println("\n=============================================================");
        RiceCooker baru2 = new RiceCooker("RiceCooker", 1, "LG", 15, "Black", "Smart Rice");
        baru2.setMerk("Miyako");
        baru2.setBerat(10);
        baru2.setWarna("Red");
        System.out.println("Nama Barang    : " + baru.getNamabarang());
        System.out.println("Jumlah Barang  : " + baru2.getJumlahbarang());
        System.out.println("Merk Barang    : " + baru2.getMerk());
        System.out.println("Berat Barang   : " + baru2.getBerat());
        System.out.println("Warna Barang   : " + baru2.getWarna());
        System.out.println("Jenis Barang   : " + baru2.getJenisbarang());

        //override
        System.out.println("\n");
        baru.lihat();

    }
}
