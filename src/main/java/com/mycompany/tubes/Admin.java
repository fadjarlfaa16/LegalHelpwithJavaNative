/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes;

import java.util.ArrayList;

import java.util.Scanner;
        
/**
 *
 * @author Administrator
 */
public class Admin extends User {
    private ArrayList<User> listUser = new ArrayList<>();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public Admin() {
    }
    
    public void login(String e_mail, String pw) {
        if (email == e_mail && password == pw) {
            System.out.println("Login berhasil!\n Selamat Datang " + nama + "!");
        }
    };
    public void register(String nama, String email, String password, String hp) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.hp = hp;
        System.out.println("Register berhasil!\n Selamat Datang " + nama + "!");
    }
    public void updateProfile(String nama, String hp) {
        this.nama = nama;
        this.hp = hp;
        System.out.println("Informasi telah diupdate");
    }
    
    public void addUser(User user) {
        listUser.add(user);
    }
    
    public void addTransaksi(Transaksi transaksi) {
        listTransaksi.add(transaksi);
    }
    
    public void getListUser() {
        for (User u : listUser) {
            System.out.println("Nama: " + u.nama + "\nEmail: " + u.email + "\nPassword: " + u.password + "\nNomor Telepon: " + u.hp);
        }
    }
    
    public void getListTransaksi() {
        for (Transaksi t : listTransaksi) {
            System.out.println("ID: " + t.getId() + "\nPengirim: " + t.getSender() + "\nPenerima: " + t.getReceiver() + "\nJumlah: " + t.getJumlah());
        }
    }
    
    public void manipulasiAkun(User user) {
        
    }
    
    public Artikel addArtikel(Admin a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan ID artikel: ");
        String id = s.next();
        System.out.print("Masukkan judul artikel: ");
        String judul = s.next();
        System.out.print("Masukkan isi artikel: ");
        String konten = s.next();
        System.out.print("Masukkan tanggal pembuatan artikel: ");
        String tanggal = s.next();
        return new Artikel(id, judul, nama, konten, tanggal);
    }
    
    public BukuPasal addBukuPasal(Admin a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan ID buku pasal: ");
        String id = s.next();
        System.out.print("Masukkan judul buku pasal: ");
        String judul = s.next();
        System.out.print("Masukkan isi buku pasal: ");
        String konten = s.next();
        System.out.print("Masukkan tanggal pembuatan buku pasal: ");
        String tanggal = s.next();
        return new BukuPasal(id, judul, nama, konten, tanggal);
    }
    
    public void manipulasiForum(Post post) {
        
    }
}
