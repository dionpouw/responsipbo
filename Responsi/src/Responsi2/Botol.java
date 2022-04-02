/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsi2;

    //Mebuat clas objek + atribut
    class Botol{
    private String Merk; // memberikan akses private ke atribut agar tidak bisa diakses secara langsung.
    private String Warna;
    private String Kapasitas;
    Botol(String merk,String warna,String kapasitas)
    {
    this.Merk = merk;
    this.Warna = warna;
    this.Kapasitas = kapasitas;
    }
    //penggunaan seter & geter
    //ini method getter
    // method getter miliki nilai kembalian sesuai tipe data yang diberikan/yang diambil mangkanya ada fungsi return didalamnya.
    public String getmerk() { 
        return Merk; //mengembalikan nilai dari merek
    }
    // ini method setter
    // method setter tidak memiliki nilia kembalian void(kosong)karena method setter hanya write only
    public void setmerk(String Merk) {
        this.Merk = Merk;
    }

    public String getwarna() { //get ini menjadikan method ini hanya read only
        return Warna;
    }

    public void setwarna(String Warna) {
        this.Warna = Warna;
    }

    public String getkapasitas() {
        return Kapasitas;
    }

    public void setkapasitas(String Kapasitas) {
        this.Kapasitas = Kapasitas;
    }

}
