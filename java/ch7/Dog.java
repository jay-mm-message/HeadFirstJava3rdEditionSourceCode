package ch7;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        super.makeNoise();
        System.out.println("Dog: " + "wow wow");
    }
}
