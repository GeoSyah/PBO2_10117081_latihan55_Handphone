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
class Android extends HandPhone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
}
