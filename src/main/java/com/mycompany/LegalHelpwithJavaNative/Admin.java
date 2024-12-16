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
public class Admin extends User {
    private ArrayList<User> listUser = new ArrayList<>();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public Admin() {
    }
    
    public void login(String e_mail, String pw) {
        if (email == e_mail && password == pw) {
            System.out.println("--- Login berhasil! ---\n Selamat Datang " + nama + "!\n\n");
        }
    };
    public void register(String nama, String email, String password, String hp) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.hp = hp;
        System.out.println("--- Register berhasil! ---\n Selamat Datang " + nama + "!\n\n");
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
        ArrayList<Pelanggan> lP = new ArrayList<>();
        ArrayList<Konsultan> lK = new ArrayList<>();
        for (User u : listUser) {
            if (u instanceof Pelanggan) {
                Pelanggan p = (Pelanggan) u;
                lP.add(p);
            } else if (u instanceof Konsultan) {
                Konsultan k = (Konsultan) u;
                lK.add(k);
            }
        }
        System.out.println("-------- Pelanggan --------");
        System.out.println("---------------------------");
        for (Pelanggan p : lP) {
            System.out.println("Nama: " + p.nama + "\nEmail: " + p.email + "\nPassword: " + p.password + "\nNomor Telepon: " + p.hp + "\nSaldo Akun: " + p.cekSaldo());
            System.out.println("---------------------------");
        }
        System.out.println("");
        System.out.println("-------- Konsultan --------");
        System.out.println("---------------------------");
        for (Konsultan k : lK) {
            System.out.println("Nama: " + k.nama + "\nEmail: " + k.email + "\nPassword: " + k.password + "\nNomor Telepon: " + k.hp + "\nSaldo Akun: " + k.cekSaldo());
            System.out.println("---------------------------");
        }
    }
    
    public void getListTransaksi() {
        System.out.println("-------- Transaksi --------");
        System.out.println("---------------------------");
        for (Transaksi t : listTransaksi) {
            System.out.println("ID: " + t.getId() + "\nPengirim: " + t.getSender() + "\nPenerima: " + t.getReceiver() + "\nJumlah: " + t.getJumlah());
            System.out.println("---------------------------");
        }
    }
    
    public void manipulasiAkun(User user) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan email akun yang ingin dihapus: ");
        String email = s.next();
        
        if(user.getEmail().equals(email)){
            listUser.remove(user);
            System.out.println("Akun Berhasil di hapus!");
        }else {
            System.out.println("Akun dengan email tersebut tidak ditemukan. ");    
        }
    }
    
    public Artikel addArtikel() {
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
    
    public BukuPasal addBukuPasal() {
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
