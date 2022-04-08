
package responsi4;


public class Elektronik {
    
    //pirvate class yang hanya bisa di akses sesama classnya
    private String brand;
    private String jenis;
    private int tahunliris;
    
    //constructo 
    public Elektronik(String brand, String jenis, int tahunliris){
        this.brand = brand;
        this.jenis = jenis;
        this.tahunliris = tahunliris;
    }
//setter dan getter brand, jenis, tahun liris
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTahunliris() {
        return tahunliris;
    }

    public void setTahunliris(int tahunliris) {
        this.tahunliris = tahunliris;
    }
           
}
