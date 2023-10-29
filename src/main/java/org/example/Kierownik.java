package org.example;

public class Kierownik extends Pracownik{
    int premiaKierownicza;
    public Kierownik(String imie, String nazwisko, int wyplata, int premiaKierownicza) {
        super(imie, nazwisko, wyplata);
        this.premiaKierownicza = premiaKierownicza;
    }
}