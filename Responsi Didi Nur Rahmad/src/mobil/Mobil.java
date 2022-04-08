/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

class mobil_1{
    public String Merk;
    private String Series;
    public String Warna;
    private int Harga;
    private int Id_Mobil;

    public String getSeries() {
        return Series;
    }

    public void setSeries(String Series) {
        this.Series = Series;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getId_Mobil() {
        return Id_Mobil;
    }

    public void setId_Mobil(int Id_Mobil) {
        this.Id_Mobil = Id_Mobil;
    }
    public mobil_1(){
         this.Id_Mobil = 1001;
         this.Merk = "Fortuner";
         this.Warna = "Hitam";
         this.Series = "SUV";
         this.Harga = 480000000;
         
     }
   
    void Harga1(){
        System.out.println(this.Harga);
    }

}

public class Mobil {
    public static void main(String[] args) {
        System.out.println("ID\tMerk\t\tWarna\tSeries");
        System.out.println("===========================================");
        // read and write menggunaka public 
        mobil_1 mobilDidi = new mobil_1();
        
        //read only menggunakan getter
        int ID = mobilDidi.getId_Mobil();
        String Series = mobilDidi.getSeries();
        
        //write only menggunakan setter 
        mobilDidi.setHarga(100000000);
        
        //gabungan dari read dan wrtite dengan setter dan getter        
        System.out.println(ID + "\t" + mobilDidi.Merk + "\t" + mobilDidi.Warna + "\t" + Series);
        System.out.println("\nHarga :");
        mobilDidi.Harga1();
    }
}

