package responsi;

import responsi.Novel;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static boolean isTrue = true;
    
    // Method beli novel
    static void beli() {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah ingin membeli novel ini (yes/no) : ");
        String iya = input.nextLine();
        if(iya.equals("yes")) {
            System.out.println("Novel Alaska");
            utama();
        } else if(iya.equals("no")) {
            System.out.println("TERIMAKASIH");
            utama();
        } else {
            System.out.println("Input salah");
            beli();
        }
    }
    
    // Method baca novel
    static void baca() {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah ingin membaca novel ini (yes/no) : ");
        String iya = input.nextLine();
        if(iya.equals("yes")) {
            System.out.println("Novel Alaska");
            utama();
        } else if(iya.equals("no")) {
            System.out.println("TERIMAKASIH");
            utama();
        } else {
            System.out.println("Input salah");
            baca();
        }
    }
    
    static void crud() {
        Novel baru = new Novel();
        baru.setJudul("Alaska");
        baru.setPenulis("NISAAFATM");
        baru.setHarga(100000);
        baru.setJumlah(25);
        System.out.println("Daftar Novel");
        System.out.println("Judul   : "+baru.getJudul());
        System.out.println("Penulis : "+baru.getPenulis());
        System.out.println("Harga   : "+baru.getHarga());
        System.out.println("Jumlah  : "+baru.getJumlah());
        System.out.println();
        System.out.println("Tambah Novel Baru");
        Scanner novelbaru = new Scanner(System.in);
        System.out.print("Judul Novel   : ");
        String jnovel = novelbaru.nextLine();
        System.out.print("Penulis Novel : ");
        String pnovel = novelbaru.nextLine();
        System.out.print("Harga Novel   : ");
        int hnovel = novelbaru.nextInt();
        System.out.print("Jumlah Novel  : ");
        int bnovel = novelbaru.nextInt();
        System.out.println("--------------------");
        System.out.println("Judul   : "+jnovel);
        System.out.println("Penulis : "+pnovel);
        System.out.println("Harga   : "+hnovel);
        System.out.println("Jumlah  : "+bnovel);
    }
    
    static void utama() {
        System.out.println("--------------------");
        System.out.println("M E N U");
        System.out.println("1) Beli Novel");
        System.out.println("2) Baca Novel");
        System.out.println("3) CRUD Data Novel");
        System.out.println("0) Keluar");
        Scanner pilih = new Scanner(System.in);
        System.out.print("Pilih Menu : ");
        int menu = pilih.nextInt();
        switch(menu) {
            case 1:
                beli();
                break;
            case 2:
                baca();
                break;
            case 3:
                crud();
                break;
            case 0:
                System.out.println("THANK-YOU");
                System.exit(0);
                break;
            default:
                System.out.println("Input salah");
                utama();
                break;
        }
    }    
                
    public static void main(String[] args) {
        do { 
            utama();
        } while(isTrue); 
    }    
}