package com.sparta.ge;

public interface Driveable {

    void drive();
    void steer();
    int getGear(int gearboxValue);

    //using the word default methods in interfaces can have body
    default void doSomething(){
        System.out.println("I am doing something");
    }
}
