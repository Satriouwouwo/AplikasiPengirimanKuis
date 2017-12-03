/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TarifFileDao {
        private List <TarifFile> tf= new ArrayList<>();
        
    public void daftarHargaProvinsi(){
        try{ 
          
           Scanner scan = new Scanner(new File("E:/AplikasiPengirimanKuis/DaftarHargaProv.txt"));
           while(scan.hasNextLine()){
               String line = scan.nextLine();
               String[] data = line.split(",");
               String provinsi = data[0].trim();
               String kota = data[1].trim();
               double regular = Double.parseDouble(data[2].trim());
               double kilat = Double.parseDouble(data[3].trim());
               double sds = Double.parseDouble(data[4].trim());
               double ons = Double.parseDouble(data[5].trim());
               double hds = Double.parseDouble(data[6].trim());
               TarifFile tarifFile = new TarifFile(provinsi,kota,regular,kilat,sds,ons,hds);
               getTf().add(tarifFile);
               
           }
       }catch(Exception e){
           System.out.println("eror");       
       }
    }
    
    
    /**
     * @return the tf
     */
    public List <TarifFile> getTf() {
        return tf;
    }

    /**
     * @param tf the tf to set
     */
    public void setTf(List <TarifFile> tf) {
        this.tf = tf;
    }
}
