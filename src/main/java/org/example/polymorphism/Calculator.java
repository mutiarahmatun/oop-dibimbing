package org.example.polymorphism;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Runner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.add(5,7,10));
    }
}
