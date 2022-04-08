/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsi3;

/**
 *
 * @author Asus
 */
public class main1 {

    public static void main(String[] args) {

        Sistem_digital sisdig = new Sistem_digital(109238, "Cloud Computing", "pak Budi");
        System.out.println("Kode Mata Kuliah = " + sisdig.getKode_mk());
        System.out.println("Materi Pelajaran = " + sisdig.getMateri_pelajaran());
        System.out.println("Dosen Pembimbing = " + sisdig.getDosen());
        sisdig.matkulnote();
        System.out.println("\n\n");
        Sistem_digital sisdig2 = new Sistem_digital(109238, "sisdig", "pak budi");
        sisdig2.setMateri_pelajaran("Internet Of Thing");
        sisdig2.setDosen("Pak Jaka");
        System.out.println("Kode Mata Kuliah = " + sisdig2.getKode_mk());
        System.out.println("Materi Pelajaran = " + sisdig2.getMateri_pelajaran());
        System.out.println("Dosen Pembimbing = " + sisdig2.getDosen());
        sisdig2.matkulnote();

    }

}
