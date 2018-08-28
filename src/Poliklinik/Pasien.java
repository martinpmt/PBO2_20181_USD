/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliklinik;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {

    private String nama;
    private Date tanggalLahir;
    private String nomerRekamMedis;

    public Pasien() {

    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        tanggalLahir = new Date(tahun - 1900, bulan - 1, tanggal);
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public int getUsia() {
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }

    public void buatNomorRekamMedis() { //hasilnya yyyyMMdd(3charnama) = 20180824PUS
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        System.out.println(ft.format(date)+nama.toUpperCase().substring(0,3));
    }

}
