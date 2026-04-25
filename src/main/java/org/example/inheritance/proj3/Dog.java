package org.example.inheritance.proj3;

class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    void speak() {
        System.out.println("Dog is screaming auwww");
    }
}