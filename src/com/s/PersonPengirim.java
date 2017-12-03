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
public class PersonPengirim {
    private String nama;
    private String alamat;
    private String kotaPengirim;
    private int kodeposPengirim;
    private String provinsi;
    private int telpPengirim;

    public PersonPengirim() {
    }

    public PersonPengirim(String nama, String alamat, String kotaPengirim, int kodeposPengirim, String provinsi, int telpPengirim) {
        this.nama = nama;
        this.alamat = alamat;
        this.kotaPengirim = kotaPengirim;
        this.kodeposPengirim = kodeposPengirim;
        this.provinsi = provinsi;
        this.telpPengirim = telpPengirim;
    }
    
   
    
    
    
    

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kotaPengirim
     */
    public String getKotaPengirim() {
        return kotaPengirim;
    }

    /**
     * @param kotaPengirim the kotaPengirim to set
     */
    public void setKotaPengirim(String kotaPengirim) {
        this.kotaPengirim = kotaPengirim;
    }

    /**
     * @return the kodeposPengirim
     */
    public int getKodeposPengirim() {
        return kodeposPengirim;
    }

    /**
     * @param kodeposPengirim the kodeposPengirim to set
     */
    public void setKodeposPengirim(int kodeposPengirim) {
        this.kodeposPengirim = kodeposPengirim;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the telpPengirim
     */
    public int getTelpPengirim() {
        return telpPengirim;
    }

    /**
     * @param telpPengirim the telpPengirim to set
     */
    public void setTelpPengirim(int telpPengirim) {
        this.telpPengirim = telpPengirim;
    }
       
    
    
}
