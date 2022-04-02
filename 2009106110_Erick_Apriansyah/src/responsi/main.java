/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class main {
ArrayList <laptop> lp;
    main(){
    lp = new ArrayList<>();
    }
    void  tambahData(int id,String merk,int weight,String pemilik,String warna,int sizeram,double ukuranlayar){
    lp.add(new laptop(id,merk,weight,pemilik,warna,sizeram,ukuranlayar));
    }
   /* void hapusData(int no_id){
    lp.removeIf(item -> item.id == (no_id));
    }
    void ubahData(int no_id,int id,String merk,int weight,String pemiliki,String warna,int sizeram,double ukuranlayar){
        int loop = -1;
        for(int i=0; i<lp.size(); i++){
                if (lp.get(i).id == no_id){
                    loop = i;
                    System.out.println(loop);   
                    lp.set(loop,new laptop(id,merk,weight,pemilik,warna,sizeram,ukuranlayar));
                }
            }
    }*/
    void showData(){
        for(laptop lap:lp){
            System.out.println("|==================================|");
            System.out.println("No.Barang      = "+lap.getId());
            System.out.println("Merk Laptop    = "+lap.getMerk());
            System.out.println("Berat Laptop   = "+lap.getWeight());
            System.out.println("Warna Laptop   = "+lap.getWarna());
            System.out.println("Besar Ram      = "+lap.getSizeRam());
            System.out.println("Ukuran Layar   = "+lap.getUkuranLayar());
            System.out.println("|==================================|");
        }}
    public static void main(String[] args) {
    Scanner Masukkan = new Scanner (System.in);
    int Ngulang = 1;
    main lap = new main();
    while(Ngulang==1){
        System.out.println("/======================\\");
        System.out.println("     Laptop Gaming");
        System.out.println("\\======================/");
        System.out.println(" 1. Tambah Data");
        System.out.println(" 2. Lihat Data ");
//        System.out.println(" 3. Ubah Data ");
//        System.out.println(" 4. Lihat Data ");
        System.out.println(" 3. Keluar");
        System.out.println("\\=====================/");
        int pilih;
        System.out.print("Masukkan Pilihanmu : ");
        pilih = Masukkan.nextInt();
        if (pilih == 1){
            int id;
            String merk;
            int berat;
            String pemilik;
            String warna;
            int sizeram;
            double ukuranlayar;
            System.out.print("No.Barang            : ");
            id = Masukkan.nextInt();
            System.out.print("Merk Laptop          : ");
            merk = Masukkan.next();
            System.out.print("Berat Laptop         : ");
            berat = Masukkan.nextInt();
            System.out.print("Pemilik            : ");
            pemilik = Masukkan.next();
            System.out.print("Warna Laptop         : ");
            warna = Masukkan.next();
            System.out.print("Besar Ram            : ");
            sizeram = Masukkan.nextInt();
            System.out.print("Ukuran Layar(inci) : ");
            ukuranlayar = Masukkan.nextDouble();
            lap.tambahData(id,merk,berat,pemilik,warna,sizeram,ukuranlayar);
    }/*else if(pilih == 2){
            int hapus;
            System.out.print("Masukkan No Barang yang ingin dihapus : ");
            hapus = Masukkan.nextInt();
            lap.hapusData(hapus);
    }/*else if(pilih == 3){
            int id;
            String merk;
            int berat;
            String warna;
            int sizeram;
            double ukuranlayar;
            int pilihan;
            System.out.print("Pilih No Barang yang ingin diubah : ");
            System.out.print("No.Barang            : ");
            id = Masukkan.nextInt();
            System.out.print("Merk Laptop          : ");
            merk = Masukkan.next();
            System.out.print("Berat Laptop         : ");
            berat = Masukkan.nextInt();
            System.out.print("Warna Laptop         : ");
            warna = Masukkan.next();
            System.out.print("Besar Ram            : ");
            sizeram = Masukkan.nextInt();
            System.out.println("Ukuran Layar(inci) : ");
            ukuranlayar = Masukkan.nextDouble();
            lap.ubahData(id,merk,berat,warna,sizeram,ukuranlayar);
        }*/else if(pilih == 2){
            lap.showData();
        }else if(pilih == 3){
            System.out.println();
            }
        }
    }  
}
