package service;

import java.util.ArrayList;
import model.mobilsport;
import model.mobilsportcoupe;
import model.mobilsportconvertible;

public class mobilservice {
    private ArrayList<mobilsport> data = new ArrayList<>();

    public void tambah(mobilsport m) {
        data.add(m);
        System.out.println("Data berhasil ditambahkan.");
    }

    public void tambah(String merk, String model, int tahun, String harga, int pintu) { //OVRL
        mobilsport m = new mobilsportcoupe(merk, model, tahun, harga, pintu);
        tambah(m);
    }

    public void tambah(String merk, String model, int tahun, String harga, boolean atapTerbuka) { //OVRL
        mobilsport m = new mobilsportconvertible(merk, model, tahun, harga, atapTerbuka);
        tambah(m);
    }

    public void tampil() {
        if (data.isEmpty()) {
            System.out.println("(Belum ada data)");
        } else {
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i).info());
            }
        }
    }

    public void ubah(int index, mobilsport mBaru) {
        data.set(index, mBaru);
        System.out.println("Data berhasil diubah.");
    }

    public void hapus(int index) {
        data.remove(index);
        System.out.println("Data berhasil dihapus.");
    }
}
