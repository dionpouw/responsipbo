package responsi_modul_4;

public class PerlengkapanSekolah {
    private String namaBarang;
    private int jumlahBarang;

    public PerlengkapanSekolah(String namaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}