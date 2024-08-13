package ch4_;

class Dog {
    int age;

    Dog(int age) {
        this.age = age;
    }

    public void showAge() {
        System.out.println("age: " + age);
    }

    public int calcArea(int a, int b) {
        return a + b;
    }
}


public class DogTestDrive {
    public static void main(String [] args) {
        Dog dog = new Dog(3);
        Dog dog2 = new Dog(3);
        dog.showAge();
        addAge(dog, 5);
        dog.showAge();

        System.out.println("dog isEquals dog2: " + dog.equals(dog2));

        String str1 = "12345";
        String str2 = "12345";
        str2 = "345";

        System.out.println("str1 isEquals str2: " + str1.equals(str2));

        dog.calcArea(12, 2);
        short c = 4;
        dog.calcArea(c, 123);
    }

    public static void addAge(Dog dog, int addNum) {
        dog.age += addNum;
    }
}
