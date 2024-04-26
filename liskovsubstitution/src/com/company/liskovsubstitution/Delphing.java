package com.company.liskovsubstitution;

public class Delphing extends Amphibian{
    @Override
    public void swim() {
        System.out.println("Delphing is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Mnnn that't not sense");//violed principe liskov
    }

}
