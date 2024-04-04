package org.exercise;

public class Aquila extends Animale implements Volante {


    @Override
    public void verso() {
        System.out.println("Ahhhh Ahhh");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio selvaggina");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
