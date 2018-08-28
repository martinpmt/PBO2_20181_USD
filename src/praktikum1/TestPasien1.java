/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import Poliklinik.Pasien;

/**
 *
 * @author admin
 */
public class TestPasien1 {

    public static void main(String[] args) {
        Pasien cek[] = new Pasien[3];
        cek[0] = new Pasien("Martin");
        cek[0].setTanggalLahir(1999, 11, 3);
        cek[1] = new Pasien("Jono");
        cek[1].setTanggalLahir(1980, 10, 5);
        cek[2] = new Pasien("Jimi");
        cek[2].setTanggalLahir(1994, 8, 17);
        System.out.println("===========================================");
        System.out.println("DAFTAR ANTRIAN POLIKLINIK");
        System.out.println("===========================================");
        System.out.printf("%-5s", "No");
        System.out.printf("%-10s", "Nama");
        System.out.printf("%-10s", "Usia");
        System.out.printf("%-10s", "Nomor Rekam Medis");
        System.out.println("");
        for (int i = 0; i < cek.length; i++) {
            System.out.printf("%-5s", i + 1);
            System.out.printf("%-10s", cek[i].getNama());
            System.out.printf("%-10s", cek[i].getUsia() + " th");
            cek[i].buatNomorRekamMedis();
        }
    }
}
