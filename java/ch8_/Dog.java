package ch8_;

public class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println(getClass().getName() + " makeNoise");
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass().getName() == obj.getClass().getName()) {
            return true;
        }
        return false;
    }
}
