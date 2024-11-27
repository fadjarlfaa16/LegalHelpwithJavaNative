/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legalhelpwithjavanative;

/**
 *
 * @author Administrator
 */
public abstract class User {
    protected String nama;
    protected String email;
    protected String password;
    protected String hp;

    public User() {
        this.nama = null;
        this.email = null;
        this.password = null;
        this.hp = null;
    }
    
    public abstract void login(String email, String password);
    public abstract void register(String nama, String email, String password, String hp);
    public abstract void updateProfile(String nama, String hp);
}
