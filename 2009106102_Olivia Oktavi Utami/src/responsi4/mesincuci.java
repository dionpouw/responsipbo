
package responsi4;
//subclass atau child
public class mesincuci extends Elektronik {
    private String merek;
    private String nama;
    private double version;
    
//parameter mesin cucu dan elektronik
    public mesincuci(String merek, String nama, double version, String brand, String jenis, int tahunliris) {
        super(brand, jenis, tahunliris);
        this.merek = merek;
        this.nama = nama;
        this.version = version;
    }
//setter dan getter merek, nama, version 
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }


    public static void main(String[] args) {
        
        mesincuci baru = new mesincuci("SHARP", "MESIN CUCI SEKALI BIlas", 9.1, "produk dalam negri", "mesin cuci 3kg", 2021);
        
        System.out.println("jenis elektronik : " + baru.getJenis());
        System.out.println("brand luar negri/dalamnegri : " + baru.getBrand());
        System.out.println("merek mesin cuci : " + baru.merek);
        System.out.println("nama mesin cuci  : " + baru.nama);
        System.out.println("tahun liris mesin cuci : " + baru.getTahunliris());
        System.out.println("versi mesin cuci  : " + baru.version);
        
        baru.setBrand("Produk luar negri");
        baru.setJenis("mesin cuci 2 kg ");
        baru.setTahunliris(2019);
        
        System.out.println("jenis elektronik : " + baru.getJenis());
        System.out.println("brand luar negri/dalamnegri : " + baru.getBrand());
        System.out.println("merek mesin cuci : " + baru.merek);
        System.out.println("nama mesin cuci  : " + baru.nama);
        System.out.println("tahun liris mesin cuci : " + baru.getTahunliris());
        System.out.println("versi mesin cuci  : " + baru.version);
    }
}


