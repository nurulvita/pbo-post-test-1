/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.films;

/**
 *
 * @author nurul
 */
public class Film {
    public String judul;
    public String penulisSutradara;

    public Film(String judul, String penulisSutradara) {
        this.judul = judul;
        this.penulisSutradara = penulisSutradara;
    }

    public String getJudul() {
        return judul;
    }

    public String getSutradaraFilm() {
        return penulisSutradara;
    }
}

