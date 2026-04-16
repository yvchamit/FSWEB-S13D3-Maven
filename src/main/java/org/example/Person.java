package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String eyeColor;


    public Person (String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0, 0, null);
    }

    public Person (String firstName, String lastName, int age, double height, double weight, String eyeColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Math.max(0, age);
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }


}
