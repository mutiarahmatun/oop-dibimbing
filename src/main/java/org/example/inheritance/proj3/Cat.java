package org.example.inheritance.proj3;

class Cat extends Animal implements Pet, Hunter {
    public void play() {
        System.out.println("Cat is playing");
    }

    public void hunt() {
        System.out.println("Cat is hunting");
    }

    @Override
    void speak() {
        System.out.println("Cat is screaming miawwwww");
    }
}
