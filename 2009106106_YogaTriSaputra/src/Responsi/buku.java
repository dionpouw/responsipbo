/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Asus
 */
public class buku {

//Atribut-----------------------------------------
    private String JudulBuku;
    private String Penerbit;
    private String Pengarang;
    private String JenisBuku;
    private int TahunPenerbit;
    private int Harga;
    private int JumlahHalaman;

    // Default constructor
    public buku() {
        this.JudulBuku= "";
        this.Penerbit = "";
        this.Pengarang = "";
        this.JenisBuku = "";
        this.TahunPenerbit = 0;
        this.Harga = 0;
        this.JumlahHalaman = 0;
    }

    // Primary constructor
    public buku(String JudulBuku, String Penerbit, String Pengarang, String JenisBuku, int TahunPenerbit, int Harga, int JumlahHalaman) {
        this.JudulBuku= JudulBuku;
        this.Penerbit = Penerbit;
        this.Pengarang = Pengarang;
        this.JenisBuku = JenisBuku;
        this.TahunPenerbit = TahunPenerbit;
        this.Harga = Harga;
        this.JumlahHalaman = JumlahHalaman;
    }

    // This is the getter method for JudulBuku
    public String getJudulBuku() {
        return JudulBuku;
    }

    // This is the setter method for JudulBuku
    public void setJudulBuku(String JudulBuku) {
        this.JudulBuku = JudulBuku;
    }

    // This is the getter method for Penerbit
    public String getPenerbit() {
        return Penerbit;
    }

    // This is the setter method for Penerbit
    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    // This is the getter method for Pengarang
    public String getPengarang() {
        return Pengarang;
    }

    // This is the setter method for Pengarang
    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    // This is the getter method for JenisBuku
    public String getJenisBuku() {
        return JenisBuku;
    }

    // This is the setter method for JenisBuku
    public void setJenisBuku(String JenisBuku) {
        this.JenisBuku = JenisBuku;
    }

    // This is the getter method for TahunPenerbit
    public int getTahunPenerbit() {
        return TahunPenerbit;
    }

    // This is the setter method for TahunPenerbit
    public void setTahunPenerbit(int TahunPenerbit) {
        this.TahunPenerbit = TahunPenerbit;
    }

    // This is the getter method for Harga
    public int getHarga() {
        return Harga;
    }

    // This is the setter method for Harga
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    // This is the getter method for JumlahHalaman
    public int getJumlahHalaman() {
        return JumlahHalaman;
    }

    // This is the setter method for JumlahHalaman
    public void setJumlahHalaman(int JumlahHalaman) {
        this.JumlahHalaman = JumlahHalaman;
    }

}