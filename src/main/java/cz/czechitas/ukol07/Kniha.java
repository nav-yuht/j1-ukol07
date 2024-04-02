package cz.czechitas.ukol07;

import java.awt.*;

public class Kniha {
    private String autor;
    private String nazev;
    private int rokVydani;


    public Kniha(String autor, String nazev, int rokVydani){
        this.autor = autor;
        this.nazev = nazev;
        this.rokVydani = rokVydani;

    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    @Override
    public String toString() { //for a clearer information representation in the class Aplikace when a book is called.
        return "Kniha{" +
                "autor='" + autor + '\'' +
                ", nazev='" + nazev + '\'' +
                ", rokVydani=" + rokVydani +
                '}';
    }


}
