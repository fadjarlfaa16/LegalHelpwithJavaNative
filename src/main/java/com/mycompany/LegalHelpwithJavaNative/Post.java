/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legalhelpwithjavanative;

/**
 *
 * @author Administrator
 */
public class Post {
    private String id;
    private String penulis;
    private String konten;
    private String tanggal;

    public Post(String id, String penulis, String konten, String tanggal) {
        this.id = id;
        this.penulis = penulis;
        this.konten = konten;
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKonten() {
        return konten;
    }

    public String getTanggal() {
        return tanggal;
    }
}
