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
public class TarifFile {
        private String provinsi;
        private String kota;
        private double regular;
        private double kilat;
        private double sds;
        private double ons;
        private double hds;

    public TarifFile() {
    }

    public TarifFile(String provinsi, String kota, double regular, double kilat, double sds, double ons, double hds) {
        this.provinsi = provinsi;
        this.kota = kota;
        this.regular = regular;
        this.kilat = kilat;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
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
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the regular
     */
    public double getRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(double regular) {
        this.regular = regular;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    

}

