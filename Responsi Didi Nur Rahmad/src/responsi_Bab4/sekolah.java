/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi_Bab4;

/**
 *
 * @author D I D I
 */
public class sekolah {

    public String namaSekolah;
    public int jumlahSiswa;

    public sekolah(String namaSekolah, int jumlahMurid) {
        this.namaSekolah = namaSekolah;
        this.jumlahSiswa = jumlahMurid;
    }

    @Override
    public void display() {
        System.out.println("ini sekolah");

    }
}
