/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class mobilsportconvertible extends mobilsport {
    private boolean atapTerbuka;

    
    public mobilsportconvertible(String merk, String model, int tahun, String harga, boolean atapTerbuka) {
        super(merk, model, tahun, harga); 
        this.atapTerbuka = atapTerbuka;
    }

    @Override
    public String info() {
        return "[Convertible] " + super.info() + " | Atap Terbuka: " + (atapTerbuka ? "Ya" : "Tidak");
    }
}

