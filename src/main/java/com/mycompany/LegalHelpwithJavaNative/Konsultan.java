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
public class Konsultan extends User implements ManajemenTransaksi {
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();
    private double saldoAkun;
    double harga;

    public Konsultan(double harga) {
        this.harga = harga;
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
    
    public void receiveBooking(Transaksi transaksi) {
        listTransaksi.add(transaksi);
    }
    
    public void historiTransaksi() {
        for (Transaksi t : listTransaksi) {
            System.out.println("ID transaksi: " + t.getId() + "\nPenerima: " + t.getReceiver() + "\nJumlah: " + t.getJumlah());
        }
    }
    
    public double cekSaldo() {
        return saldoAkun;
    }
    
    public void tambahSaldo(double jumlah) {
        this.saldoAkun += jumlah;
    }
}
