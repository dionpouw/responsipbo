
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
//    void hapusdatabotol(String merk)
//    {
//        DataBotol.removeIf(item -> item.Merk == (merk));
//    }
//    void ubahdataktm(String merk,String warna,String kapasitas)
//    {   
//        int cek = -1;
//        for(int i=0; i < DataBotol.size(); i++){
//            if(DataBotol.get(i).Merk == merk){
//                cek = i;
//                System.out.println(cek);
//                DataBotol.set(cek,new Botol (merk,warna,kapasitas));
//            }
//        }
//    }
    void showdatabotol()
    {
        for(Botol data:DataBotol)
        {
            System.out.println("Merk Botol : "+data.getmerk()+""+",Warna Botol : "+data.getwarna()+""+",Tanggal Lahir : "+data.getkapasitas()+"");
        }
    }
    public static void main(String[] args) {
    Scanner inputdata = new Scanner (System.in);
    int coba = 1;
    Main btl = new Main();
    while(coba==1){
        System.out.println("------------------------------------------");
        System.out.println(" [1] TAMBAH DATA \n [2] SHOW DATA \n [3] HAPUS DATA \n [4] EDIT DATA \n [0] KELUAR");
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
//        else if(pilihan == 3){
//            String hapusdata;
//            System.out.print("Masukkan Merk : ");
//            hapusdata = inputdata.next();
//            btl.hapusdatabotol(hapusdata);
//        }
//        else if (pilihan == 4){
//            String Masukkan;
//            String Merk;
//            String Warna;
//            String Kapasitas;
//            System.out.print("Merk yang ingin diubah : ");
//            Masukkan = inputdata.next();
//            System.out.print("Merk Botol      : ");
//            Merk = inputdata.next();
//            
//            System.out.print("Warna Botol     : ");
//            Warna = inputdata.next();
//            
//            System.out.print("Kapasitas Botol : ");
//            Kapasitas = inputdata.next();
//            
//            btl.isidatabotol(Masukkan,Merk,Warna,Kapasitas);
//        }
        else if (pilihan == 0){
            System.out.println("RESPONSI 2 PBO");
            System.out.println("");
            break;
        }
    }
    
    }

    private void isidatabotol(String Masukkan, String Merk, String Warna, String Kapasitas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
