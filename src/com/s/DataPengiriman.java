/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s;

import java.util.Date;

/**
 *
 * @author user
 */
public class DataPengiriman {
    TarifFileDao tfd = new TarifFileDao();
    private double nomorpaket;
    private String kotatujuan;
    private String jenisbarang;
    private double beratbarang;
    private Date tanggalkirim;
    private double panjang;
    private double lebar;
    private double tinggi;
    private String jenislayanan;
    private boolean asuransi;
    private double hargabarang;
    private String pembayaran;
    private double hargaAwal;
    private double hargaAwalKaliBerat;
    private double hargaPlusAsuransi;
    private double nilaiasuransi;
    
    
    

    public DataPengiriman() {
    }

    public DataPengiriman(double nomorpaket, String kotatujuan, String jenisbarang, double beratbarang, Date tanggalkirim, double panjang, double lebar, double tinggi, String jenislayanan, boolean asuransi, double hargabarang, String pembayaran) {
        this.nomorpaket = nomorpaket;
        this.kotatujuan = kotatujuan;
        this.jenisbarang = jenisbarang;
        this.beratbarang = beratbarang;
        this.tanggalkirim = tanggalkirim;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.jenislayanan = jenislayanan;
        this.asuransi = asuransi;
        this.hargabarang = hargabarang;
        this.pembayaran = pembayaran;
    }
        public void getHargaRegular(){
            tfd.daftarHargaProvinsi();
            for (TarifFile tarifile : tfd.getTf()) {
                if(this.getKotatujuan().equalsIgnoreCase(tarifile.getKota()))
                    setHargaAwal(tarifile.getRegular());
                    }
        }
            public void getHargaKilat(){
            tfd.daftarHargaProvinsi();
            for (TarifFile tarifile : tfd.getTf()) {
                if(this.getKotatujuan().equalsIgnoreCase(tarifile.getKota()))
                    setHargaAwal(tarifile.getKilat());
                    }
        }
            public void getHargaSds(){
            tfd.daftarHargaProvinsi();
            for (TarifFile tarifile : tfd.getTf()) {
                if(this.getKotatujuan().equalsIgnoreCase(tarifile.getKota()))
                    setHargaAwal(tarifile.getSds());
                    }
        }
            public void getHargaOns(){
            tfd.daftarHargaProvinsi();
            for (TarifFile tarifile : tfd.getTf()) {
                if(this.getKotatujuan().equalsIgnoreCase(tarifile.getKota()))
                    setHargaAwal(tarifile.getOns());
                    }
        }
            public void getHargaHds(){
            tfd.daftarHargaProvinsi();
            for (TarifFile tarifile : tfd.getTf()) {
                if(this.getKotatujuan().equalsIgnoreCase(tarifile.getKota()))
                    setHargaAwal(tarifile.getHds());
                    }
        }
            
        public static String getRandom(){
        String nopaket = "";
        int random  =(int) (Math.ceil(Math.random()*100));
     
        //nomorpaket = (int)ceil;
         
        nopaket+=random;
        //return nomorpaket;
        return nopaket;
        }
    
        
    /**
     * @return the nomorpaket
     */
    public double getNomorpaket() {
        return nomorpaket;
    }

    /**
     * @param nomorpaket the nomorpaket to set
     */
    public void setNomorpaket(double nomorpaket) {
        this.nomorpaket = nomorpaket;
    }

    /**
     * @return the kotatujuan
     */
    public String getKotatujuan() {
        return kotatujuan;
    }

    /**
     * @param kotatujuan the kotatujuan to set
     */
    public void setKotatujuan(String kotatujuan) {
        this.kotatujuan = kotatujuan;
    }

    /**
     * @return the jenisbarang
     */
    public String getJenisbarang() {
        return jenisbarang;
    }

    /**
     * @param jenisbarang the jenisbarang to set
     */
    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    /**
     * @return the beratbarang
     */
    public double getBeratbarang() {
        return beratbarang;
    }

    /**
     * @param beratbarang the beratbarang to set
     */
    public void setBeratbarang(double beratbarang) {
        this.beratbarang = beratbarang;
    }

    /**
     * @return the tanggalkirim
     */
    public Date getTanggalkirim() {
        return tanggalkirim;
    }

    /**
     * @param tanggalkirim the tanggalkirim to set
     */
    public void setTanggalkirim(Date tanggalkirim) {
        this.tanggalkirim = tanggalkirim;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the jenislayanan
     */
    public String getJenislayanan() {
        return jenislayanan;
    }

    /**
     * @param jenislayanan the jenislayanan to set
     */
    public void setJenislayanan(String jenislayanan) {
        this.jenislayanan = jenislayanan;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargabarang
     */
    public double getHargabarang() {
        return hargabarang;
    }

    /**
     * @param hargabarang the hargabarang to set
     */
    public void setHargabarang(double hargabarang) {
        this.hargabarang = hargabarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the hargaAwal
     */
    public double getHargaAwal() {
        return hargaAwal;
    }

    /**
     * @param hargaAwal the hargaAwal to set
     */
    public void setHargaAwal(double hargaAwal) {
        this.hargaAwal = hargaAwal;
    }

    /**
     * @return the hargaAwalKaliBerat
     */
    public double getHargaAwalKaliBerat() {
        return hargaAwalKaliBerat;
    }

    /**
     * @param hargaAwalKaliBerat the hargaAwalKaliBerat to set
     */
    public void setHargaAwalKaliBerat( ) {
        this.hargaAwalKaliBerat = hargaAwal * beratbarang;
    }

    /**
     * @return the hargaPlusAsuransi
     */
    public double getHargaPlusAsuransi() {
        return hargaPlusAsuransi;
    }

    /**
     * @param hargaPlusAsuransi the hargaPlusAsuransi to set
     */
    public void setHargaPlusAsuransi() {
        if(asuransi==true){
        this.hargaPlusAsuransi = getHargaAwalKaliBerat() + getNilaiasuransi();}
        else if(asuransi==false){
        this.hargaPlusAsuransi = getHargaAwalKaliBerat();
        }
    }

    /**
     * @return the nilaiasuransi
     */
    public double getNilaiasuransi() {
        return nilaiasuransi;
    }

    /**
     * @param nilaiasuransi the nilaiasuransi to set
     */
    public void setNilaiasuransi() {
           this.nilaiasuransi = getHargabarang()* 0.5;
    }
    
    
          
            
    
    
}
