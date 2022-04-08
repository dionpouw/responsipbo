/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alatmelukiss;

/**
 *
 * @author ASUS
 */
public class Alatlukis {
    public class kuas extends Alatlukis{
        protected String Warna;
        public String Ukuran;
    
    kuas(String Hijau, String besar, String warna, String ukuran){
        super();
        this.Warna = warna;
        this.Ukuran = ukuran;
    }
    
    kuas(int harga, String warna, String ukuran){
        super();
        this.Warna = warna;
        this.Ukuran = ukuran;
    }
    public void setwarna(String Warna) {
        this.Warna = Warna;
    }
    public void getWarna(String Warna) {
        this.Warna = Warna;
    }
    public void setukuran(String Ukuran){
        this.Ukuran = Ukuran;
    }
    public void getukuran(String Ukuran){ 
        this.Ukuran = Ukuran;
    }
    public void Warna(){
        System.out.println("Hijau");
    }
    public void Ukuran(){
        System.out.println("Kecil");
    }
    
 
    }
}

