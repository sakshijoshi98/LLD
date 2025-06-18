package Inheritance;

public class Animal {
    String name;
    private int animalId;

    Animal(){
        name = "Animal";
        animalId = 1;
    }

    void eat(){
        System.out.println("animal is eating banana");
    }
}
