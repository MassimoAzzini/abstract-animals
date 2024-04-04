package org.exercise;

public class Main {

    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Cane dog = new Cane();
        Delfino dolphin = new Delfino();
        Aquila eagle = new Aquila();
        Passerotto sparrow = new Passerotto();

        Animale[] animals = {dog, dolphin, eagle, sparrow};

        for (Animale a: animals){
            a.verso();
            a.dormi();
            a.mangia();
            if (a instanceof Volante) faiVolare((Volante) a);
            if (a instanceof Nuotante) faiNuotare((Nuotante) a);
            System.out.println();
        }
    }
}
