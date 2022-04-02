/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author Asus
 */
public class laptop {
    private int id;
    private String merk;
    private int weight;
    private String pemilik;
    private String warna;
    private int sizeram;
    private double ukuranlayar;
    //membuat primary constructor

    public laptop(int id,String merk,int weight,String pemilik,String warna,int sizeram,double ukuranlayar){
    this.id = id;
    this.merk = merk;
    this.weight = weight;
    this.pemilik = pemilik;
    this.warna = warna;
    this.sizeram = sizeram;
    this.ukuranlayar = ukuranlayar;
    }

    public laptop(){
        this.id = 0;
        this.merk = "";
        this.weight = 0;
        this.pemilik = "";
        this.warna = "";
        this.sizeram = 0;
        this.ukuranlayar = 0;
    }
    //karena bersifat private dibuat getternya agar bisa diakses
    public int getId() {
        return id;
    }
    public String getMerk(){
    return merk;
    }
    public int getWeight(){
    return weight;
    }
    public String getPemilik(){
    return pemilik;
    }
    public String getWarna(){
    return warna;
    }
    public int getSizeRam(){
    return sizeram;
    }
    public double getUkuranLayar(){
    return ukuranlayar;
    }
    //method dari laptop
    void nyalakanLaptop(){
        System.out.println("Laptop di Nyalakan");
    }

    void gantiwpLaptop(){
        System.out.println("Mengganti Walpaper Laptop");
    }
    void matikanLaptop(){
        System.out.println("Laptop di Matikan");
    }
    void turunkanvol(){
        System.out.println("Volume Suara diturunkan");
}   
    public void setId(int id) {
        this.id = id;
    }
    public void setMerk(String merk){
     this.merk = merk;
    }
    public void setWeight(int weight){
     this.weight = weight;
    }
    public void setPemilik(String pemilik){
     this.pemilik = pemilik;
    }
    public void setWarna(String warna){
     this.warna = warna;
    }
    public void setSizeRam(int sizeram){
     this.sizeram = sizeram;
    }
    public void setUkuranLayar(double ukuranlayar){
     this.ukuranlayar = ukuranlayar;
    }

}
