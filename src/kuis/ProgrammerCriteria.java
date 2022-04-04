/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import perhitungan.HitungNilai;

/**
 *
 * @author asus
 */
public class ProgrammerCriteria extends InputNilai implements HitungNilai {

    public ProgrammerCriteria(String nama, double tesA, double tesB, double tesC) {
        super(nama, tesA, tesB, tesC);
    }
    
    public void inputTesA(double tesA) {
        this.tesA = tesA;
    }

    public void inputTesB(double tesB) {
        this.tesB = tesB;
    }

    public void inputTesC(double tesC) {
        this.tesC = tesC;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.6 * super.tesA) + (0.15 * super.tesB) + (0.25 * super.tesC);
    }
    
    @Override
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Programmer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Programmer\n";
    }
    
}
