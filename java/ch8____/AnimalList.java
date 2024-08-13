package ch8____;

public class AnimalList {
    Animal [] animals;

    public void extendAnimals(Animal [] src, Animal [] dest) {
        int i = 0;
        for (Animal animal : src) {
            dest[i] = animal;
            ++i;
        }
    }
    public AnimalList add(Cat c) {
        if (animals == null) {
            System.out.println("new cat");
            animals = new Animal[1];
            animals[0] = c;
        } else {
            Animal [] new_animals = new Animal[animals.length + 1];
            extendAnimals(animals, new_animals);
            new_animals[new_animals.length-1] = c;
            animals = new_animals;
        }
        return this;
    }
    public AnimalList add(Dog d) {
        if (animals == null) {
            System.out.println("new dog");
            animals = new Animal[1];
            animals[0] = d;
        } else {
            Animal [] new_animals = new Animal[animals.length + 1];
            extendAnimals(animals, new_animals);
            new_animals[new_animals.length-1] = d;
            animals = new_animals;
        }
        return this;
    }
    public AnimalList add(Tiger t) {
        if (animals == null) {
            System.out.println("new tiger");
            animals = new Animal[1];
            animals[0] = t;
        } else {
            Animal [] new_animals = new Animal[animals.length + 1];
            extendAnimals(animals, new_animals);
            new_animals[new_animals.length-1] = t;
            animals = new_animals;
        }
        return this;
    }
    public AnimalList show() {
        for (Animal animal : animals) {
            animal.animalType();
        }
        return this;
    }
}
