/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s;

/**
 *
 * @author user
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            TarifFileDao tfd = new TarifFileDao();
            TarifFile tf = new TarifFile();
            tfd.daftarHargaProvinsi();
            
            for(TarifFile tariffile : tfd.getTf()) {
                System.out.println(tariffile.getProvinsi()+ " , " + tariffile.getKota() + " , "+tariffile.getRegular() + " , "  + tariffile.getKilat()+
                        " , " + tariffile.getSds() + " , " + tariffile.getOns() + " , " 
                                + tariffile.getOns()+ " , " + tariffile.getHds());
                
        }
            
    }
    
}
