/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsii;

/**
 *
 * @author ASUS
 */
public class Class_Handphone {
    private String merk;
    private String warna;
    private String harga;
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public merk getOppo() {
        return oppo;
    }

    public void setOppo(merk oppo) {
        this.oppo = oppo;
    }

    public warna getOppo() {
        return oppo;
    }

    public void setOppo(warna oppo) {
        this.oppo = oppo;
    }

    public harga getOppo() {
        return oppo;
    }

    //method
    //   public String getmerk(){
    //      return merk;
    //   }
    //   public void setmerk(String merk){
    //      this.merk = merk;
    //   }
    //   public String getwarna(){
    //       return warna;
    //   }
    //   public void setwarna(String warna){
    //       this.warna = warna;
    //   }
    //   public String getharga(){
    //       return harga;
    //   }
    //   public void setharga(String harga){
    //       this.harga = harga;
    public void setOppo(harga oppo) {
        this.oppo = oppo;
    }
 //   }
    
    //objek dari class handphone
        merk oppo = new merk();
        warna oppo = new warna();
        harga oppo = new harga();
    
    // menggunakan method setter
    oppo.setmerk("oppo");
    oppo.setwarna("hitam");
    oppo.setharga("Empatjuta");
    
    // menggunakan method getter
    System.out.println("merk: " + oppo.getmerk());
    System.out.println("warna: "+ oppo.getwarna());
    System.out.println("harga: "+ oppo.getharga());
    
}
