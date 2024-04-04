package org.exercise;

public class Sparrow extends Animal{


    public Sparrow(String food) {
        super(food);
    }


    @Override
    public void makeNoise() {
        System.out.println("Pio Pio");
    }
}
