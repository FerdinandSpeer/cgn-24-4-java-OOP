package org.example;

public class Main {
    public static void main(String[] args) {

        Person pommes = new Person("Müller", 35,"0123456789", true);
        Person rotWeiss = new Person("MBauer", 20,"0124566789", true);
        Car vw = new Car ("VW", "Golf", "black", 2020);
        Car ferrari = new Car ("Ferrari", "Enzo", "red", 2023);
        vw.starts();
        vw.accelerate();
        ferrari.starts();
        ferrari.accelerate();

        Person [] phonebook = {pommes, rotWeiss};
    }
    public static void addPerson (Person currywurst) {
        System.out.println();
    }


}