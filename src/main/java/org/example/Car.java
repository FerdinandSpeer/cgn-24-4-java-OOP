package org.example;

public class Car {
    //Properties for Car:
    public String brand;
    public String model;
    public String color;
    public int year;
    public int speed = 0; //initial value kann in den Properties bereits festgelegt werden (Best Practise)

    //Constructor:
    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //"starts"-Methode:
    public void starts(){
        System.out.println(brand + " " + model + " " + color +  " " + year + " starts the engine!");
    }
    //"accelerate"-Methode:
    public void accelerate(){
        speed  = speed + 120; // Hier reicht "speed" weil "speed" in keiner anderen Methode übergeben werden muss?
        System.out.println("The car is accelerating. Current speed is " + speed + " km/h");
    }

}

