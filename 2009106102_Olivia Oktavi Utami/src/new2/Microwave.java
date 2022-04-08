
package new2;

    
     public class Microwave{
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

    public Microwave(String Name, String Brand, double version, int Price, int stock, int id) {
        this.Name = Name;
        this.Brand = Brand;
        this.version = version;
        this.Price = Price;
        this.stock = stock;
        this.id = id;
    }
     
    
     void display(){
         System.out.println(this.stock);
         System.out.println(this.version);
     }
     
     }



