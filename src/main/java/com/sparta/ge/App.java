package com.sparta.ge;

public class App {
    public static void main(String[] args) {
        //private String name = "Georgiana";
        Cat tim = new Cat("Tim", 1, "Siamese");
        Cat bob = new Cat("Bob", 5, "Tabby");
        //Dog jumbo = new Dog("Jumbo", 7,"Maltese");
        Animal jumbo = new Dog("Jumbo", 7,"Maltese");

        System.out.println(jumbo.getClass());
        bob.play();
        //jumbo.play("Leanne");

        //System.out.println(bob);
        //System.out.println(bob.getName() + " is a " + bob.getBreed());

        Animal[] animals = {tim, bob, jumbo};
        doPlay(animals);
    }

    private static void doPlay(Animal[] animals){
        for(Animal animal : animals){
            animal.play();
        }
    }
}
