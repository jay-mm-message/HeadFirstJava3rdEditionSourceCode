package ch7_;

public class Animal {
    String picture;
    String food;
    int hunger;
    int boundaries_hight;
    int boundaries_wight;
    int location_x;
    int location_y;

    public void makeNoise() {
        System.out.println(getClass().getName() + ", make noise");
    }
    public void eat() {
        System.out.println(getClass().getName() + ", eat");
    }
    public void sleep() {}
    public void roam() {
        System.out.println(getClass().getName() + ", roam");
    }
}
