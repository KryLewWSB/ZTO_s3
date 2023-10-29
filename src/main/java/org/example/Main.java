package org.example;
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Azor", 5, "on", 12, "Czarny");
        Dog dog2 = new Dog("Fafik", 7, "on", 9, "Czarny");

        dog1.eat("Kurczak");
        System.out.println(dog1.name + " wiek: " + dog1.getAge() + " lat.");
    }
}