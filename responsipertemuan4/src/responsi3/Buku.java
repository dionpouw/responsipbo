package responsi3;


public class Buku extends Alat_tulis {
    private String merkbuku;
    private String warnabuku;
    
    public Buku(String namabuku, String merkbuku, String warnabuku) {
        super(namabuku);
        this.merkbuku = merkbuku;
        this.warnabuku = warnabuku;
    }

    public String getMerkbuku() {
        return merkbuku;
    }

    public void setMerkbuku(String merkbuku) {
        this.merkbuku = merkbuku;
    }

    public String getWarnabuku() {
        return warnabuku;
    }

    public void setWarnabuku(String warnabuku) {
        this.warnabuku = warnabuku;
    }

    public static void main(String[] args){
        Buku baru = new Buku("buku tulis" ,"Sidu", "Merah");
        System.out.println("Nama Buku : " + baru.getNamabuku());
        System.out.println("Merk Buku : " + baru.merkbuku);
        System.out.println("Warna Buku : " + baru.warnabuku);
    }

    
}

