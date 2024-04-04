package org.exercise;

public class Passerotto extends Animale implements Volante {

    @Override
    public void verso() {
        System.out.println("Pio Pio");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio semi e briciole");
    }


    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
