package org.example.firma;

public class FabrykaOsob {
    public Osoba utworzOsobe(Stanowisko stanowisko) {
        if (stanowisko == null) { return null; }
        switch (stanowisko) {
            case PRACOWNIK: return new Pracownik();
            case KIEROWNIK: return new Kierownik();
            default: return null;
        }
    }
}