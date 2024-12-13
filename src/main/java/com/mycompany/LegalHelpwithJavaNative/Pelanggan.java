/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legalhelpwithjavanative;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Pelanggan extends User implements ManajemenTransaksi {
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();
    private ArrayList<Konsultan> listKonsultan = new ArrayList<>();
    private ArrayList<Post> postingan = new ArrayList<>();
    private double saldoAkun;

    public Pelanggan() {
        this.saldoAkun = 0;
    }
    
    public void login(String e_mail, String pw) {
        if (email == e_mail && password == pw) {
            System.out.println("Login berhasil!\n Selamat Datang " + nama + "!\n\n");
        }
    };
    public void register(String nama, String email, String password, String hp) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.hp = hp;
        System.out.println("Register berhasil!\n Selamat Datang " + nama + "!\n\n");
    }
    public void updateProfile(String nama, String hp) {
        this.nama = nama;
        this.hp = hp;
        System.out.println("Informasi telah diupdate");
    }
    
    public Transaksi bookKonsultan(Konsultan konsultan) {
        Scanner s = new Scanner(System.in);
        listKonsultan.add(konsultan);
        System.out.println("Masukkan ID transaksi");
        String id = s.next();
        Transaksi t = new Transaksi(id, nama, konsultan.nama, konsultan.harga);
        listTransaksi.add(t);
        this.saldoAkun -= konsultan.harga;
        konsultan.receiveBooking(t);
        konsultan.tambahSaldo(konsultan.harga);
        return t;
    }
    
    public Post createPost() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan ID post: ");
        String id = s.next();
        System.out.print("Masukkan isi post: ");
        String konten = s.next();
        System.out.print("Masukkan tanggal pembuatan post: ");
        String tanggal = s.next();
        postingan.add(new Post(id, nama, konten, tanggal));
        return new Post(id, nama, konten, tanggal);
    }
    
    public void bacaArtikel(Artikel artikel) {
        System.out.println("--- ID: " + artikel.getId() + " ---");
        System.out.println("------- " + artikel.getJudul() + " -------");
        System.out.println("--- ditulis oleh: " + artikel.getPenulis() + " ---");
        System.out.println("--- dirilis tanggal: " + artikel.getTanggal() + " ---");
        System.out.println(artikel.getKonten());
    }
    
    public void bacaBukuPasal(BukuPasal bukuPasal) {
        System.out.println("--- ID: " + bukuPasal.getId() + " ---");
        System.out.println("------- " + bukuPasal.getJudul() + " -------");
        System.out.println("--- ditulis oleh: " + bukuPasal.getPenulis() + " ---");
        System.out.println("--- dirilis tanggal: " + bukuPasal.getTanggal() + " ---");
        System.out.println(bukuPasal.getKonten());
    }
    
    public void historiTransaksi() {
        for (Transaksi t : listTransaksi) {
            System.out.println("ID transaksi: " + t.getId());
            System.out.println("Penerima: " + t.getReceiver());
            System.out.println("Jumlah: " + t.getJumlah());
        }
    }
    
    public double cekSaldo() {
        return saldoAkun;
    }
    
    public void tambahSaldo(double jumlah) {
        this.saldoAkun += jumlah;
    }
}
