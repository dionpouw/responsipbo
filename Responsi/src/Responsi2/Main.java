
package Responsi2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    ArrayList<Botol> DataBotol;//Membuat array pada pada class botol
    Main()
    {
        DataBotol = new ArrayList<>();
    }
    
    void isidatabotol(String merk,String warna,String kapasitas)
    {
        DataBotol.add(new Botol (merk,warna,kapasitas));
    }
    void showdatabotol()
    {
        for(Botol data:DataBotol)
        {
            System.out.println("Merk Botol : "+data.getmerk()+""+",Warna Botol : "+data.getwarna()+""+",Tanggal Lahir : "+data.getkapsitas()+"");
        }
    }
    public static void main(String[] args) {
    Scanner inputdata = new Scanner (System.in);
    int coba = 1;
    Main btl = new Main();
    while(coba==1){
        System.out.println("------------------------------------------");
        System.out.println(" [1] TAMBAH DATA \n [2] SHOW DATA ");
        System.out.println("------------------------------------------");
        int pilihan;
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = inputdata.nextInt();
        if (pilihan == 1){
            String Merk;
            String Warna;
            String Kapasitas;
            System.out.print("Merk Botol      : ");
            Merk = inputdata.next();
            
            System.out.print("Warna Botol     : ");
            Warna = inputdata.next();
            
            System.out.print("Kapasitas Botol : ");
            Kapasitas = inputdata.next();
            
            btl.isidatabotol(Merk,Warna,Kapasitas);
        }
        else if (pilihan == 2){
            btl.showdatabotol();
        }
    }
    
    }
}
