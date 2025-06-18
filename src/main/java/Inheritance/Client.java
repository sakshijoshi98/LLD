package Inheritance;

public class Client {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

     //   tiger.animalId = 2; // private data members cannot be accessible

        //ConstructorChaining
        // Animal->Tiger->Cat
        // When we initialize cat (child class) , constructors of parents are called first
        // Constructor of Animal->Tiger->Cat is called in the same order when we create (call constructor of cat) cat object.


        cat.eat();

        System.out.println(" ");
    }
}
