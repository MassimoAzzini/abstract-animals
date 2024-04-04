package org.exercise;

public class Delfino extends Animale implements Nuotante {


    @Override
    public void verso() {
        System.out.println("Ih Ih Ih Ih");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
