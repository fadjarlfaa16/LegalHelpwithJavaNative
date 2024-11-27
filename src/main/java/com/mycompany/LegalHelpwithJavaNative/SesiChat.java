/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legalhelpwithjavanative;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SesiChat {
    private String id;
    private String klien;
    private String konsultan;
    private ArrayList<String> chat = new ArrayList<>();

    public SesiChat(String id, String klien, String konsultan) {
        this.id = id;
        this.klien = klien;
        this.konsultan = konsultan;
    }
    
    public void addChat(String pesan) {
        chat.add(pesan);
    }
    
    public void displayChat() {
        for (String s : chat) {
            System.out.println(s);
        }
    }

    public String getId() {
        return id;
    }
}
