/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi3;

/**
 *
 * @author Asus
 */
public class Sistem_digital extends Mata_kuliah {

    private String materi_pelajaran;
    private String dosen;

    Sistem_digital(int kode_mk, String materi_pelajaran, String dosen) {
        super(kode_mk);
        this.materi_pelajaran = materi_pelajaran;
        this.dosen = dosen;
    }

    Sistem_digital(Mata_kuliah mata_kuliah, String materi_pelajaran, String dosen) {
        super(mata_kuliah.getKode_mk());
        this.materi_pelajaran = materi_pelajaran;
        this.dosen = dosen;
    }

    public String getMateri_pelajaran() {
        return materi_pelajaran;
    }

    public void setMateri_pelajaran(String materi_pelajaran) {
        this.materi_pelajaran = materi_pelajaran;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    @Override
    public void matkulnote() {
        System.out.println("Dengan Mata Kuliah Sistem Digital");
    }

    @Override
    public void matkulnote2() {
        System.out.println("Industry 4.0");
    }
}
