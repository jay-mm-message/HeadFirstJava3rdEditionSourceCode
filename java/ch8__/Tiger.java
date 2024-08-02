package ch8__;

public class Tiger extends Animal {
    Tiger(int age) {
        this.age = age;
    }
    public void bark() {
        this.whoAmI("Tiger", this.age);
        if (this.age > 10) {
            System.out.println("WOW");
        } else {
            System.out.println("wow");
        }
    }
}
