package ch8_;

public class Lion implements Animal, Pet {

    @Override
    public void makeNoise() {
        System.out.println(getClass().getName() + " makeNoise");
    }

    @Override
    public String byFriendlyPet() {
        String result = "It's not good friendly pet.";
        result += "It's " + getClass().getName();
        return result;
    }
}
