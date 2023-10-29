package org.example;

public class Dog {
    public String name;
    private int age;
    private String gender;
    private int weight;

    private String color;
    public Dog(String name, int age, String gender, int weight, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
    }
    public Dog(String name) {
        this.name = name.equals("") ? "...":name;
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
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Imię: " + this.name;
    }
}