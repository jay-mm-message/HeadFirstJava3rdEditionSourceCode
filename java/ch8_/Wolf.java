package ch8_;

public class Wolf implements Animal {

    @Override
    public void makeNoise() {
        System.out.println(getClass().getName() + " makeNoise");
    }
    
}
