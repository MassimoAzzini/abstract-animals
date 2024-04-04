package org.exercise;

public class Cane extends Animale {

    @Override
    public void verso() {
        System.out.println("bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio crocchette per cani");
    }
}
