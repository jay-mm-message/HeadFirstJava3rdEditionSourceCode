package ch8__;

public class Dog extends Animal {
    Dog(int age) {
        this.age = age;
    }
    public void bark() {
        this.whoAmI("Dog", this.age);
        if (this.age > 3) {
            System.out.println("WOW");
        } else {
            System.out.println("wow");
        }
    }
}
