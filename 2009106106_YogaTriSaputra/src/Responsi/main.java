/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args)throws IOException {


         // Membuat objek buku menggunakan primary constructor
        buku bukusatu = new buku("Mari Belajar Bersama","Erlangga","Khairul Anwar","Fiksi",2020,50000,100);

        // Print object buku menggunakan getter methods
        System.out.println("Judul Buku      : " + bukusatu.getJudulBuku());
        System.out.println("Penerbit        : " + bukusatu.getPenerbit());
        System.out.println("Pengarang       : " + bukusatu.getPengarang());
        System.out.println("Jenis Buku      : " + bukusatu.getJenisBuku());
        System.out.println("Tahun Penerbit  : " + bukusatu.getTahunPenerbit());
        System.out.println("Harga Buku      : " + bukusatu.getHarga());
        System.out.println("Jumlah Halaman  : " + bukusatu.getJumlahHalaman());

        System.out.println("\n============================================" );

        // Membuat objek buku menggunakan default constructor
        buku bukudua = new buku();

        // Set value to object of buku using setter methods
        bukudua.setJudulBuku("Laskar Pelangi");
        bukudua.setPenerbit("JayaKusuma");
        bukudua.setPengarang("Uji Santoso");  
        bukudua.setJenisBuku("Novel");
        bukudua.setTahunPenerbit(2018);
        bukudua.setHarga(100000);   
        bukudua.setJumlahHalaman(50);


        // Print object buku menggunakan getter methods
        System.out.println("Judul Buku      : " + bukudua.getJudulBuku());
        System.out.println("Penerbit        : " + bukudua.getPenerbit());
        System.out.println("Pengarang       : " + bukudua.getPengarang());
        System.out.println("Jenis Buku      : " + bukudua.getJenisBuku());
        System.out.println("Tahun Penerbit  : " + bukudua.getTahunPenerbit());
        System.out.println("Harga Buku      : " + bukudua.getHarga());
        System.out.println("Jumlah Halaman  : " + bukudua.getJumlahHalaman());
    }
}
