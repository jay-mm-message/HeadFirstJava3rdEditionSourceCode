package ch8_;

public class Lion implements Animal {

    @Override
    public void makeNoise() {
        System.out.println(getClass().getName() + " makeNoise");
    }
    
}
