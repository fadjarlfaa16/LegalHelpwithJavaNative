/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.legalhelpwithjavanative;

/**
 *
 * @author Administrator
 */
public class LegalHelpwithJavaNative {

    public static void main(String[] args) {
        Admin admin = new Admin();
        Artikel artikel = new Artikel("id", "Judul", "Penulis", "Konten", "Tanggal");
        BukuPasal bukuPasal = new BukuPasal("id", "judul", "penulis", "konten", "tanggal");
        Konsultan konsultan = new Konsultan(10.00);
        LegalHelpwithJavaNative legalHelp = new LegalHelpwithJavaNative();
        Pelanggan pelanggan = new Pelanggan();
        Post post = new Post("id", "penulis", "konten", "tanggal");
        Transaksi transaksi = new Transaksi("id", "sender", "receiver", 10.00);
       
        System.out.println("Semua objek berhasil diinisialisasi!");
        admin.getListUser();
        admin.addArtikel();
        admin.addBukuPasal();
    }
}
