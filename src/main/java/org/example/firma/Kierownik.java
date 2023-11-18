package org.example.firma;

public class Kierownik extends Osoba {
    private Integer premiaKierownicza;
    @Override
    public void przedstawSie() {
        System.out.println("Jestem Kierownikiem.");
    }

    public void setPremiaKierownicza(Integer premiaKierownicza) {
        this.premiaKierownicza = premiaKierownicza;
    }

    @Override
    public void wypiszDane() {
        System.out.println("Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nDział: " + this.dzial +
                "\nWynagrodzenie: " + this.wynagrodzenie +
                "\nPremia kierownicza: " + this.premiaKierownicza);
    }
}