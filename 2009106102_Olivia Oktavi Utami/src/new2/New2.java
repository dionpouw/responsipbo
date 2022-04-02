/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;
 class Microwave{
     public String Name;
     public String Brand;
     public double version;
     private int Price;
     private int  stock;
     private int id; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     //setter
    public double getVersion() {
        return version;
    }
//setter
    public void setVersion(double version) {
        this.version = version;
    }

     
     //getter
    public int getPrice() {
        return Price;
    }
    //setter
    public void setPrice(int price) {
        this.Price = Price;
    }
 //getter
    public int getStock() {
        return stock;
    }
//setter
    public void setStock(int stock) {
        this.stock = stock;
    }    
     
     public Microwave(){
         this.Name = ("cute pink micro for teeneger");
         this.Price = 5000;
         this.Brand = ("MITO");
         this.id = 2009106102;
     }
     void display(){
         System.out.println(this.stock);
         System.out.println(this.version);
     }
     
 }
public class New2 {

    public static void main(String[] args) {

        // read and write menggunaka public 
        Microwave ini = new Microwave();
        System.out.println(" Name  : " + ini.Name);
        
            //read only menggunakan getter     
        int NO = ini.getId();
        System.out.println("id pengguna : " + NO);
 
        int harga = ini.getPrice();
        System.out.println(" Harga : " + harga);
        
        //write only menggunakan setter 
        ini.setStock(10);
        ini.display();
        
        //gabungan dari read dan wrtite dengan setter dan getter 
        
        System.out.println("Brand microwave ini : " + ini.Brand);
        
        ini.setVersion(1.3);
        ini.display();
    }
    
}
