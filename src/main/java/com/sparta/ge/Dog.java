package com.sparta.ge;

public class Dog extends Animal implements Speakable{
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void play(String name){ //Overloading
        System.out.println(this.getName() + " is playing with " + name);
    }

    @Override
    public void getAnimalName() {

    }
}
