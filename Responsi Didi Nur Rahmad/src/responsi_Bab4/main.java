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
public class main {

    public static void main(String[] args) {
        kelas tkj = new kelas("SMK TI PRATAMA", 2000, "Kelas TKJ", 1000);
        
        //Override
        tkj.display();
        System.out.println("Nama Sekolah : " + tkj.namaSekolah);
        System.out.println("Jumlah siswa : " + tkj.jumlahSiswa);
        System.out.println("Nama Kelas : " + tkj.getNamaKelas());
        System.out.println("Jumlah Murid : " + tkj.getJumlahMurid());

        tkj.setNamaKelas("Kelas Multimedia");
        tkj.setJumlahMurid(1300);
        
        sekolah smk = new sekolah("SMK 17 AGUSTUS",10);
        
        
        
        System.out.println("-----------------------------------------");
        //Override
        smk.display();
        System.out.println("Nama Sekolah : " + smk.namaSekolah);
        System.out.println("Jumlah siswa : " + smk.jumlahSiswa);
        System.out.println("Nama Kelas : " + tkj.getNamaKelas());
        System.out.println("Jumlah Murid : " + tkj.getJumlahMurid());

    }

}
