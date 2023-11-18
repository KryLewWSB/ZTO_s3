package org.example;
import org.example.figury.*;
import org.example.firma.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        circle.draw();
        square.draw();*/

        List<Osoba> listaOsob = new ArrayList<>();
        FabrykaOsob fabrykaOsob = new FabrykaOsob();
        listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.PRACOWNIK));
        listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.KIEROWNIK));
        listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.KIEROWNIK));


        listaOsob.get(0).setImie("Adam");
        listaOsob.get(0).setNazwisko("Kowal");
        listaOsob.get(0).setDzial("Księgowość");
        listaOsob.get(0).setWynagrodzenie(6000);

        for (Osoba osoba : listaOsob) {
            osoba.wypiszDane();
        }

    }
}