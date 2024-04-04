package org.exercise;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog food");
        Dolphin dolphin = new Dolphin("fish");
        Eagle eagle = new Eagle("meet");
        Sparrow sparrow = new Sparrow("birdseed");

        Animal[] animals = {dog, dolphin, eagle, sparrow};

        for (Animal a: animals){
            a.makeNoise();
            a.sleep();
            a.eats();
        }
    }
}
