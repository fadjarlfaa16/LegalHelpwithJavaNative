/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legalhelpwithjavanative;

/**
 *
 * @author Administrator
 */
public class Transaksi {
    private String id;
    private String sender;
    private String receiver;
    private double jumlah;

    public Transaksi(String id, String sender, String receiver, double jumlah) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.jumlah = jumlah;
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public double getJumlah() {
        return jumlah;
    }
}
