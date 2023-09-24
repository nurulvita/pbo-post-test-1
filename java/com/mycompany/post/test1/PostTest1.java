/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.post.test1;
import com.films.Film;
import java.util.ArrayList;
/**
 *
 * @author nurul
 */
public class PostTest1 {
    public static void main(String[] args) {
        ArrayList<Film> filmList = new ArrayList<>();

        // Menambahkan objek-objek film ke dalam ArrayList
        filmList.add(new Film("Iron Man", "Jon Favreau")); 
        filmList.add(new Film("The Avengers", "Joss Whedon"));
        filmList.add(new Film("Doctor Strange", "Scott Derrickson"));
        filmList.add(new Film(" Guardians of the Galaxy", "James Gunn"));
        filmList.add(new Film("Ant-man", "Peyton Reed"));

        // Melakukan perulangan untuk menampilkan informasi film)
        for (int i = 0; i < filmList.size(); i++) {
            Film films = filmList.get(i); 
            System.out.println((i + 1) + ". " + "Film berjudul " + films.getJudul() + " disutradarai oleh " + films.getSutradaraFilm() + ".");
        }
    }
}
