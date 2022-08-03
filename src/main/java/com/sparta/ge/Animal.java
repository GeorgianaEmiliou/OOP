package com.sparta.ge;

public abstract class Animal { //Abstract class cannot be implemented
    //state - what it has
    //behaviour - what it does

    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) { //Constructor
        this.name = name; //this object which is calling this method
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >=1) {
            this.age = age;
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void play(){
        System.out.println("The animal is playing");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
