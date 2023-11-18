package org.example;
import org.example.figury.*;
import org.example.firma.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        circle.draw();
        square.draw();*/

        List<Osoba> listaOsob = new ArrayList<>();
        FabrykaOsob fabrykaOsob = new FabrykaOsob();

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Podaj czy chcesz dodać pracownik, kierownik, x - zakończy dodawanie");
            String wartosc = scan.next();
            if(wartosc.equals("x")){
                break;
            }else if(wartosc.equals("pracownik")){
                listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.PRACOWNIK));
                int index = listaOsob.size()-1;

                System.out.println("Podaj imię pracownika: ");
                String imie = scan.next();
                listaOsob.get(index).setImie(imie);

                System.out.println("Podaj nazwisko pracownika: ");
                String nazwisko = scan.next();
                listaOsob.get(index).setNazwisko(nazwisko);

                System.out.println("Podaj dział pracownika: ");
                String dzial = scan.next();
                listaOsob.get(index).setDzial(dzial);

                System.out.println("Podaj wynagrodzenie pracownika: ");
                int wynagrodzenie = scan.nextInt();
                listaOsob.get(index).setWynagrodzenie(wynagrodzenie);

            }else if(wartosc.equals("kierownik")){
                listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.KIEROWNIK));
                int index = listaOsob.size()-1;

                System.out.println("Podaj imię kierownik: ");
                String imie = scan.next();
                listaOsob.get(index).setImie(imie);

                System.out.println("Podaj nazwisko kierownik: ");
                String nazwisko = scan.next();
                listaOsob.get(index).setNazwisko(nazwisko);

                System.out.println("Podaj dział kierownik: ");
                String dzial = scan.next();
                listaOsob.get(index).setDzial(dzial);

                System.out.println("Podaj wynagrodzenie kierownik: ");
                int wynagrodzenie = scan.nextInt();
                listaOsob.get(index).setWynagrodzenie(wynagrodzenie);
            }

        }

        for (Osoba osoba : listaOsob) {
            osoba.wypiszDane();
        }

    }
}