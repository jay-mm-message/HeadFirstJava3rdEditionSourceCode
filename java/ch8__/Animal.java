package ch8__;

abstract public class Animal {
    public int age;
    public void bark() {};
    public void whoAmI(String info, int age) {
        System.out.println("I am a " + info + ", " + age + " years old ");
    };
}
