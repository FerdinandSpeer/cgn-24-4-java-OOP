package org.example;

public class Main {
    public static void main(String[] args) {

        Person pommes = new Person("Müller", 35,"0123456789", true);
        Person rotWeiss = new Person("MBauer", 20,"0124566789", true);

        //Basic Challenge:
        Car vw = new Car ("VW", "Golf", "black", 2020);
        Car ferrari = new Car ("Ferrari", "Enzo", "red", 2023);
        // Start methods:
        vw.starts();
        vw.accelerate();
        ferrari.starts();
        ferrari.accelerate();

        //Bonus Challenge:
        PersonChallenge ricardo = new PersonChallenge("Ricardo", 35, "male");
        PersonChallenge ahmad = new PersonChallenge("Ahmad", 40, "male");
        PersonChallenge stefan = new PersonChallenge("Stefan", 55, "male");
        PersonChallenge ferdinand = new PersonChallenge("Ferdinand", 34, "male");
        // Start method:
        ricardo.helloPersonChallenge();
        ahmad.helloPersonChallenge();
        stefan.helloPersonChallenge();
        ferdinand.helloPersonChallenge();


        Person [] phonebook = {pommes, rotWeiss};
    }
    public static void addPerson (Person currywurst) {
        System.out.println();
    }


}