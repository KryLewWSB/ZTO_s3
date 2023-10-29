package org.example;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Adam", "Kowalski", 5000);
        Kierownik kierownik = new Kierownik("Adela", "Nowakowska", 8000, 2000);

        System.out.println("Imię pracownik: " + pracownik.imie +
                            "Nazwisko pacownik: " + pracownik.nazwisko +
                            "Wypłata pracownik: " + pracownik.wyplata);
        System.out.println("Imię kierownik: " + kierownik.imie +
                            "Nazwisko kierownik: " + kierownik.nazwisko +
                            "Wypłata kierownik: " + kierownik.wyplata +
                            "Premia kierownicza: "  + kierownik.premiaKierownicza);

    }
}