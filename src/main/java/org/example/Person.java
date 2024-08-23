package org.example;

import java.util.Objects;

/**BOILERPLATE (Code der für jede Klasse benötigt wird)
 * Klasse
 * Attribute der Klasse (Zugriffsrechte klären private/public)
 * CONSTRUCTOR Methode
 * GETTER Methoden
 * SETTER Methoden
 * EQUALS Methode
 * HASHCODE Methode
 * TOSTRING Methode
 */
public class Person {
    //Information hiding: Attribute innerhalb einer Klasse generell immer auf private
    private String name;
    private int age;
    private String phone;
    private boolean alive;

    //Constructor = Methode um das Object zusammenzubauen
    // falls kein Default Constructor gebaut -> Java bildet den Default Constructor z.B. hier "Person ()"
    public Person(String name, int age, String phone, boolean isAlive) {
        // "this" zeigt auf das Attribut des Objektes "name", so kann differenziert werden welcher
        // Wert an die Constructor Methode weitergegeben werden kann
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.alive = isAlive;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        return age;
    }
    public boolean isAlive(){
        return alive;
    }

    //SETTER = Schreib Zugriff auf bestimmtes "private" Feld
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override //Override überschreibt eine Standard Methode
    public String toString(){
        return "Person{name= "+ name +
                ", age= "+ age+
                ", phone= " + phone +
                ", alive? = "+alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && alive == person.alive && Objects.equals(name, person.name) && Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone, alive);
    }

    public Person(String name, int age, String phone) {
        // Methode "Person()" ist jetzt überladen: es gibt ihn 2mal
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.alive = alive;
    }
}

