package main;

import java.util.Scanner;
import model.*;
import service.mobilservice;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mobilservice svc = new mobilservice();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Mobil");
            System.out.println("2. Lihat Data Mobil");
            System.out.println("3. Ubah Data Mobil");
            System.out.println("4. Hapus Data Mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(in.nextLine());

            switch (pilih) {
                case 1 -> {
    System.out.print("Tipe (1=Coupe, 2=Convertible): ");
    int tipe = Integer.parseInt(in.nextLine());

    System.out.print("Merk  : ");  String merk = in.nextLine();
    System.out.print("Model : ");  String model = in.nextLine();
    System.out.print("Tahun : ");  int tahun = Integer.parseInt(in.nextLine());
    System.out.print("Harga : ");  String harga = in.nextLine();

    if (tipe == 1) {
        System.out.print("Jumlah Pintu: ");
        int pintu = Integer.parseInt(in.nextLine());
        svc.tambah(merk, model, tahun, harga, pintu); 
    } else {
        System.out.print("Atap Terbuka (true/false): ");
        boolean atap = Boolean.parseBoolean(in.nextLine());
        svc.tambah(merk, model, tahun, harga, atap);  
    }
}
                case 2 -> svc.tampil();

                case 3 -> {
                    svc.tampil();
                    System.out.print("Nomor data yang diubah: ");
                    int idx = Integer.parseInt(in.nextLine()) - 1;

                    System.out.print("Tipe baru (1=Coupe, 2=Convertible): ");
                    int tipe = Integer.parseInt(in.nextLine());
                    System.out.print("Merk  : ");  String merk = in.nextLine();
                    System.out.print("Model : ");  String model = in.nextLine();
                    System.out.print("Tahun : ");  int tahun = Integer.parseInt(in.nextLine());
                    System.out.print("Harga : ");  String harga = in.nextLine();

                    mobilsport mBaru;
                    if (tipe == 1) {
                        System.out.print("Jumlah Pintu: ");
                        int pintu = Integer.parseInt(in.nextLine());
                        mBaru = new mobilsportcoupe(merk, model, tahun, harga, pintu);
                    } else {
                        System.out.print("Atap Terbuka (true/false): ");
                        boolean atap = Boolean.parseBoolean(in.nextLine());
                        mBaru = new mobilsportconvertible(merk, model, tahun, harga, atap);
                    }
                    svc.ubah(idx, mBaru);
                }

                case 4 -> {
                    svc.tampil();
                    System.out.print("Nomor data yang dihapus: ");
                    int idx = Integer.parseInt(in.nextLine()) - 1;
                    svc.hapus(idx);
                }
            }
        } while (pilih != 5);
    }
}
