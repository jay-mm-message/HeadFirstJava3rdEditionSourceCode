package ch8____;

public class Test {
    public static void main(String [] args) {
        AnimalList animalList = new AnimalList();
        animalList.add(new Cat()).add(new Dog()).add(new Tiger()).show();
    }
}
