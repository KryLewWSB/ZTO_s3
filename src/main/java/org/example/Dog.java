package org.example;

public class Dog {
    public String name;
    public int age;
    public String gender;
    public int weight;
    public String color;
    public Dog(String name, int age, String gender, int weight, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
    }
    public void walk(String destination){
        System.out.println("Pies poszedł do " + destination);
    }
    public void run(String destination){
        System.out.println("Pies pobiegł do " + destination);
    }
    public void eat(String food){
        System.out.println("Pies zjadł " + food);
    }
    public void sleep(int hours){
        System.out.println("Pies spał " + hours);
    }
}