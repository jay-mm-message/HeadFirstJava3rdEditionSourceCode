package ch8_;

public class Dog implements Animal, Pet {

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

    @Override
    public String byFriendlyPet() {
        String result = "It's good friendly pet.";
        result += "It's " + getClass().getName();
        return result;
    }


}
