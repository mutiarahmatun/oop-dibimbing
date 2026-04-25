package org.example.inheritance.proj3;

class MainMethod{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // dari Animal
        d.play();
        d.speak();// dari Pet

        Cat c = new Cat();
        c.eat();   // dari Animal
        c.play();  // dari Pet
        c.hunt();  // dari Hunter
        c.speak();
    }
}

