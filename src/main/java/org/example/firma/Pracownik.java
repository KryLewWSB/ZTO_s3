package org.example.firma;

public class Pracownik extends Osoba {
    @Override
    public void przedstawSie() {
        System.out.println("Jestem pracownikiem.");
    }
    @Override
    public void wypiszDane() {
        System.out.println("Imię: " + this.imie +
                            "\nNazwisko: " + this.nazwisko +
                            "\nDział: " + this.dzial +
                            "\nWynagrodzenie: " + this.wynagrodzenie);
    }
}
