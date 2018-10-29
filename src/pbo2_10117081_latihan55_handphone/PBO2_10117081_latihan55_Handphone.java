/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan55_handphone;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan deskripsi berbagai handphone
 */
public class PBO2_10117081_latihan55_Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android andro = new Android("Samsung","Android","Grand",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        BlackBerry bb = new BlackBerry("Blackberry","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone win = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        win.setWinKeyStore("UUUQIJWORJ");
        win.displayProduct();
        System.out.println("win Key Store : "+win.getWinKeyStore()); 
      
    }
    
}
