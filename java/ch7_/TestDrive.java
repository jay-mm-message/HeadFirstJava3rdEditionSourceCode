package ch7_;

class Vet {
    public void giveShot(Animal a) {
        a.makeNoise();
    }
}

public class TestDrive {
    public static void main(String [] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for(Animal animal : animals) {
            animal.eat();
            animal.roam();
        }

        Dog dog = new Dog();
        Cat cat = new Cat();

        Vet vet = new Vet();
        vet.giveShot(cat);
        vet.giveShot(dog);
    }
}
