package ch8_;

public class Cat implements Animal {

    @Override
    public void makeNoise() {
       System.out.println(getClass().getName() + " makeNoise");
    }
    
}
