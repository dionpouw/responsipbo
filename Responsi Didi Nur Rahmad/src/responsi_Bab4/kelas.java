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
public class kelas extends sekolah{
    private String namaKelas;
    private int jumlahMurid;
    

    public kelas(String sekolahNamaSekolah, int sekolahJumlahSiswa,String namaKelas, int jumlahMurid) {
        super(sekolahNamaSekolah, sekolahJumlahSiswa);
        this.namaKelas = namaKelas;
        this.jumlahMurid = jumlahMurid;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public int getJumlahMurid() {
        return jumlahMurid;
    }

    public void setJumlahMurid(int jumlahMurid) {
        this.jumlahMurid = jumlahMurid;
    
    }
    
    @Override
    public void display(){
        System.out.println("ini kelas");
        
    }
}
