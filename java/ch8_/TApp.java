package ch8_;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TApp {
    public static void main(String [] args) {

        newLine();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Wolf());
        animals.add(new Lion());

        ArrayList<Object> objects = new ArrayList<Object>();
        for (Animal animal : animals) {
            Object obj = animal;
            objects.add(obj);
        }
        makeNoiseForAllObject(objects);
    }

    public static void makeNoiseForAllObject(ArrayList<Object> objects) {
        for (Object object : objects) {
            if (object instanceof Animal) {
                newLine();
                System.out.println("object instanceof Animal");
                Animal animal = (Animal) object;
                animal.makeNoise();
            } else {
                newLine();
                System.out.println("object instanceof no Animal");
            }
        }
    }

    public static void makeNoiseForAll(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }

    public static void newLine() { System.out.println("\n"); }
}
