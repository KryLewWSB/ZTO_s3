package org.example;

public class Kierownik extends Pracownik{
    private int premiaKierownicza;
    public Kierownik(String imie, String nazwisko, int wyplata, int premiaKierownicza) {
        super(imie, nazwisko, wyplata);
        this.premiaKierownicza = premiaKierownicza;
    }
    public String getPremia(){
        return this.getData() + "\nPremia kierownicza: " + this.premiaKierownicza;
    }
}