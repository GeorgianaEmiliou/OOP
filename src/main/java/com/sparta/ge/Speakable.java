package com.sparta.ge;

//Interface --> there is no implementation
//Java class can implement as many interfaces as it wants

public interface Speakable {
    //methods - cannot be overridden
    //class - cannot be extended

    public final String NAME = "Georgiana"; //final --> constant (can't be changed during runtime)

    void getAnimalName();
}
