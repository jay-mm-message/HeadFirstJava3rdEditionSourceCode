package ch8_;

public class Cat implements Animal, Pet {

    @Override
    public void makeNoise() {
       System.out.println(getClass().getName() + " makeNoise");
    }

    @Override
    public String byFriendlyPet() {
        String result = "It's good friendly pet.";
        result += "It's " + getClass().getName();
        return result;
    }
    
}
