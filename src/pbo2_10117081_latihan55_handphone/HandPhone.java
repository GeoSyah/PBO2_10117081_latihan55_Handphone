/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan55_handphone;

/**
 *
 * @author Geo Syah Alkautsar
 */
class HandPhone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public HandPhone(String man, String os, String model, int harga) {
        
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufacture : " +manufacture);
        System.out.println("OS\t: " +operatingSystem);
        System.out.println("Model\t: " +model);
        System.out.println("Harga\t: " +harga);
        
    }
}
