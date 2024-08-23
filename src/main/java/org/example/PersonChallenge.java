package org.example;

public class PersonChallenge {
    public String name;
    public int age;
    public String gender;

    public PersonChallenge(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void helloPersonChallenge(){
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }
}
