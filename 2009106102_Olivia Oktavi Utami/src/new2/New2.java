/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

public class New2 {

    public static void main(String[] args) {

        Microwave object = new Microwave ("mito","ini",17.3,9000,90,456);
        // read and write menggunaka public 

        System.out.println(" Name  : " + object.Name);
        System.out.println(" Name  : " + object.Brand);
        System.out.println(" Name  : " + object.version);
        System.out.println(" Name  : " + object.getPrice());
        System.out.println(" Name  : " + object.getStock());
        
        
        object.Name("olip");
        
         //read only menggunakan getter     
        
        //write only menggunakan setter 
        //ini.setStock(10);
        //ini.display();
        
        //gabungan dari read dan wrtite dengan setter dan getter 
        
        //System.out.println("Brand microwave ini : " + ini.Brand);
        
        //ini.setVersion(1.3);
        //ini.display();
    }
    
}
