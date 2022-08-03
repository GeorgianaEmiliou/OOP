package com.sparta.ge;

public class StringExamples {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "Hello";
        String word3 = new String("Hello");
        String word4 = new String("Hello");

        System.out.println(word1.hashCode()); //give us a unique identify of the string
        System.out.println(System.identityHashCode(word1));

        //System.out.println(word1 == word3); //false because it is pointing into two different objects
        //System.out.println(word1 == word2); //true
        //System.out.println(word1.equals(word3)); //true because it compares the values

        System.out.println(new StringBuilder("Manish").reverse().toString());

    }
}
