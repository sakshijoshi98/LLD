package Polymorphism;

public class Cat extends Animal {

    @Override
    void speak(){
        System.out.println("meow....");
    }

    void scratch(){
        System.out.println("scratch....");
    }
}
