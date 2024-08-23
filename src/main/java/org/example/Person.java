package org.example;

public class Person {
    public String name;
    public int age;
    public String phone;
    public boolean isAlive;

    //Constructor = Methode um das Object zusammenzubauen
    // falls kein Default Constructor gebaut -> Java bildet den Default Constructor z.B. hier "Person ()"
    public Person(String name, int age, String phone, boolean isAlive) {
        // "this" zeigt auf das Attribut des Objektes "name", so kann differenziert werden welcher
        // Wert an die Constructor Methode weitergegeben werden kann
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.isAlive = isAlive;
    }
    public Person(String name, int age, String phone) {
        // Methode "Person()" ist jetzt überladen: es gibt ihn 2mal
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.isAlive = isAlive;
    }
}

