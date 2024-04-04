package org.exercise;

public abstract class Animal {

    private String food;

    public Animal(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void sleep(){
        System.out.println("Zzz");
    }
    public abstract void makeNoise();

    public void eats(){
        System.out.println("I eat " + food);
    };
}
