package org.exercise;

public class Dolphin extends Animal{


    public Dolphin(String food) {
        super(food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ih Ih Ih Ih");
    }
}
