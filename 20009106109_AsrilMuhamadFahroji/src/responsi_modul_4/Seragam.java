package responsi_modul_4;

public class Seragam extends PerlengkapanSekolah {
    private String kategoriBarang;
    private String sizeBarang;

    public Seragam(String namaBarang, int jumlahBarang, 
            String kategoriBarang, String sizeBarang) {
            super(namaBarang, jumlahBarang);
            this.kategoriBarang = kategoriBarang;
            this.sizeBarang = sizeBarang;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public String getSizeBarang() {
        return sizeBarang;
    }

    public void setSizeBarang(String sizeBarang) {
        this.sizeBarang = sizeBarang;
    }
}