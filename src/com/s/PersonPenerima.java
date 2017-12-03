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
public class PersonPenerima {
    
     private String nama;
     private String alamat; 
     private String kotaPenerima;
     private int kodeposPenerima;
     private String provinsi;
     private int telpPenerima;

    public PersonPenerima() {
    }

    public PersonPenerima(String nama, String alamat, String kotaPenerima, int kodeposPenerima, String provinsi, int telpPenerima) {
        this.nama = nama;
        this.alamat = alamat;
        this.kotaPenerima = kotaPenerima;
        this.kodeposPenerima = kodeposPenerima;
        this.provinsi = provinsi;
        this.telpPenerima = telpPenerima;
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
     * @return the kotaPenerima
     */
    public String getKotaPenerima() {
        return kotaPenerima;
    }

    /**
     * @param kotaPenerima the kotaPenerima to set
     */
    public void setKotaPenerima(String kotaPenerima) {
        this.kotaPenerima = kotaPenerima;
    }

    /**
     * @return the kodeposPenerima
     */
    public int getKodeposPenerima() {
        return kodeposPenerima;
    }

    /**
     * @param kodeposPenerima the kodeposPenerima to set
     */
    public void setKodeposPenerima(int kodeposPenerima) {
        this.kodeposPenerima = kodeposPenerima;
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
     * @return the telpPenerima
     */
    public int getTelpPenerima() {
        return telpPenerima;
    }

    /**
     * @param telpPenerima the telpPenerima to set
     */
    public void setTelpPenerima(int telpPenerima) {
        this.telpPenerima = telpPenerima;
    }
     
     
     
}
