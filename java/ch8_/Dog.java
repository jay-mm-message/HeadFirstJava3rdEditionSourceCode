package ch8_;

public class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println(getClass().getName() + " makeNoise");
    }
}
