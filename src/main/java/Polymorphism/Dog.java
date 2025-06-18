package Polymorphism;

public class Dog extends Animal {

    @Override
    void speak(){
        System.out.println("Dog speak");
    }

    void wagTail(){
        System.out.println("Dog wag tail");
    }

    private void sayHi(){
        System.out.println("Dog say Hi");
    }
}
