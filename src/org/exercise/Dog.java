package org.exercise;

public class Dog extends Animal{

    public Dog(String food) {
        super(food);
    }


    @Override
    public void makeNoise() {
        System.out.println("bau bau");
    }
}
