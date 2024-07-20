package ch7;

import java.util.ArrayList;

public class PolymorphicTest {
    public static void main(String [] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Wolf());
        animals.add(new Lion());
        animals.add(new Hippo());

        getType(animals);
    }

    public static void makeNoise(Animal a) {
        a.makeNoise();
    }

    public static void getType(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getName());
            makeNoise(animal);
        }
    }
}
