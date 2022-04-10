
package responsi3;

public class Palu extends AlatTukang {
    private String Ukuran;
    private double Harga;

    Palu(String Merek, String Ukuran, int Harga) {
        super(Merek);
        this.Ukuran = Ukuran;
        this.Harga = Harga;
    }
    Palu(AlatTukang alattukang, String Ukuran, int Harga) {
        super(alattukang.getMerek_Palu());
        this.Ukuran = Ukuran;
        this.Harga = Harga;
    }
    public String getUkuran() {
        return Ukuran;
    }
    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }
    public double getHarga() {
        return Harga;
    }
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
}