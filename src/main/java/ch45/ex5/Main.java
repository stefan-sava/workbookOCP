package ch45.ex5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal bird = new Bird();
        bird.makeSound();
        Mammal dog = new Dog();
        dog.makeSound();
        Bird eagle = new Eagle();
        eagle.makeSound();

    }
}
