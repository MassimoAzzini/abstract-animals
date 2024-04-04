package org.exercise;

public class Eagle extends Animal{


    public Eagle(String food) {
        super(food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ahhhh Ahhh");
    }
}
