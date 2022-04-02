//Responsi Ihsan Magribi 2009106107
package responsi;

public class Responsi {

    public static void main(String[] args) {
    Botol BotolA = new Botol ("Aqua","Bening","1,5 Liter",35);
    Botol BotolB = new Botol ("Mizone","Biru Muda","450 ML",20);    
        System.out.println(BotolA.getMerk());
        System.out.println(BotolA.getWarna());
        System.out.println(BotolA.getKapasitas());
        System.out.println(BotolA.getTinggi());
        BotolA.BotolAqua();
        System.out.println("");
        System.out.println(BotolB.getMerk());
        System.out.println(BotolB.getMerk());
        System.out.println(BotolB.getKapasitas());
        System.out.println(BotolB.getTinggi());
        
    }
}
