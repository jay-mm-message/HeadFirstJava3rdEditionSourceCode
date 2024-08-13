package ch8___;

public class MyAnimalList {
    Animal [] animals;
    private int current_length;

    public MyAnimalList(Animal [] animals, int current_length) {
        this.animals = animals;
        this.current_length = current_length;
    }
    public MyAnimalList add(Dog d) {
        tags("add dog");
        if (this.current_length < animals.length) {
            animals[this.current_length] = d;
            this.current_length++;
        }
        return this;
    }
    public MyAnimalList add(Cat c) {
        tags("add cat");
        if (this.current_length < animals.length) {
            animals[this.current_length] = c;
            this.current_length++;
        }
        return this;
    }
    public MyAnimalList add(Tiger t) {
        tags("add tiger");
        if (this.current_length < animals.length) {
            animals[this.current_length] = t;
            this.current_length++;
        }
        return this;
    }
    public MyAnimalList del_last() {
        tags("del");
        this.current_length = this.current_length - 1;
        return this;    
    }
    public MyAnimalList show() {
        tags("show");
        for (int i = 0 ; i < this.current_length ; ++i) {
            animals[i].whoAmI();
        }
        return this;
    }
    public void tags(String tags) {
        System.out.println("=> call " + tags + " function");
    }
}
