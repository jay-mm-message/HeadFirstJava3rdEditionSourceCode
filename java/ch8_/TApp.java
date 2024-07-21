package ch8_;

import java.util.ArrayList;

public class TApp {
    public static void main(String [] args) {

        newLine();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Wolf());
        animals.add(new Lion());

        makeNoiseForAll(animals);
    }

    public static void makeNoiseForAll(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }

    public static void newLine() { System.out.println("\n"); }
}
