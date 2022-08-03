package com.sparta.ge;

//Encapsulation - Keeping similar fields and methods together and setting boundaries
//              - Defines how the outside world deals with that object
//Abstraction - Hiding implementation and exposing what someone needs
//Inheritance - A parent class handing down functionally (Object is the great-grandparent)
//Polymorphism - Many forms of a method or class
//             - Overriding, Overloading

//Every class has object class as a parent class
public class Cat extends Animal { //A class can only have one parent

    public Cat(String name, int age, String breed) {
        super(name, age, breed); //super - refers to the parent class
    }

    @Override //Write my own version of the function
    public void play() {
        System.out.println("The cat is playing");
    }
}
