package ch2_____;

public class Dog {
    public int no;
    public void bark() {
        System.out.println("no: " + no + " WOW");
    }
    public static void main(String [] args) {
        Dog [] dogs = new Dog[5];
        for(int i = 0 ; i < 5 ; ++i) {
            dogs[i] = new Dog();
            dogs[i].no = i + 1;
            dogs[i].bark();
        }
        System.out.println();
    }
}
