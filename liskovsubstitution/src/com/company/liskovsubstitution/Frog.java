package com.company.liskovsubstitution;

public class Frog extends  Amphibian{
    @Override
    public void swim() {
        System.out.println("The Frog is Swimming");
    }

    @Override
    public void walk() {
        System.out.println("The Frog is walking");
    }
}
