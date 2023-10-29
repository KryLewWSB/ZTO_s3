package org.example;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wyplata;
    public Pracownik(String imie, String nazwisko, int wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }
    public String getData(){
        return "Imię pracownik: " + this.imie +
                "\nNazwisko pracownik:" + this.nazwisko +
                "\nWypłata pracownik:" + this.wyplata;
    }

}
