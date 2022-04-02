package responsi;


public class Novel {
    private String judul;
    private String penulis;
    private int harga;
    private int jumlah;
    
    public Novel() {
        this.judul = "";
        this.penulis = "";
        this.harga = 0;
        this.jumlah = 0;
    }
    
    public Novel(String judul, String penulis, int harga, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
//    public
//    Novel baru = new Novel();
//    
}
