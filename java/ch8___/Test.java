package ch8___;

public class Test {
    public static void main(String [] args) {

        Animal [] animals = {new Dog(), new Cat(), new Tiger()};

        MyAnimalList list = new MyAnimalList(animals, animals.length);

        list.show().del_last().show().add(new Dog()).show();
    }
}
