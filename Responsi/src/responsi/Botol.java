//Responsi Ihsan Magribi 20009106107
package responsi;

class Botol {
    private String Merk;
    private String Warna;
    private String Kapasitas;
    private double Tinggi;
    
    public Botol (String Merk, String Warna, String Kapasitas, double Tinggi){
        this.Merk = Merk;
        this.Warna = Warna;
        this.Kapasitas = Kapasitas;
        this.Tinggi = Tinggi;
    }
    void BotolAqua (){
        System.out.println("Air Pegunungan Asli");
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getKapasitas() {
        return Kapasitas;
    }

    public void setKapasitas(String Kapasitas) {
        this.Kapasitas = Kapasitas;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
}

