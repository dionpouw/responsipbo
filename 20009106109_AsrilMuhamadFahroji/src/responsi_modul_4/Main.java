package responsi_modul_4;

public class Main {
    public static void main(String[] args) {
        Seragam sekolah = new Seragam("Baju Putih", 10, "SMA", "L");
        
        sekolah.setNamaBarang("Baju Pramuka");
        sekolah.setJumlahBarang(5);
        
        System.out.println("Perlengkapan Sekolah");
        System.out.println("Nama Barang           : "+sekolah.getNamaBarang());
        System.out.println("Jumlah Barang         : "+sekolah.getJumlahBarang());
        System.out.println("Kategori (SD/SMP/SMA) : "+sekolah.getKategoriBarang());
        System.out.println("Ukuran Barang         : "+sekolah.getSizeBarang());
    }
}