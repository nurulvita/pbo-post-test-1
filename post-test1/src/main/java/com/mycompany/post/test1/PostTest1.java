/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.post.test1;
/**
 *
 * @author nurul
 */
import java.util.ArrayList;

public class PostTest1 {
    public static void main(String[] args) {
        // Membuat objek-objek film
        Film film1 = new Film("Iron Man", "Jon Favreau");
        Film film2 = new Film("The Avengers", "Joss Whedon");
        Film film3 = new Film("Doctor Strange", "Scott Derrickson");
        Film film4 = new Film("Guardians of the Galaxy", "James Gunn");
        Film film5 = new Film("Ant-man", "Peyton Reed");

        // Menyimpan objek-objek film dalam ArrayList
        ArrayList<Film> films = new ArrayList<>();
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);
        
        System.out.println("==============================================================");
        System.out.println("\t\t\tLIST FILM\t\t");
        System.out.println("==============================================================");

        // Melakukan perulangan untuk menampilkan informasi film
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i); 
            System.out.println((i + 1) + "." + "Film berjudul " + film.getJudul() + " disutradarai oleh " + film.getSutradaraFilm());
        }
    }
}




