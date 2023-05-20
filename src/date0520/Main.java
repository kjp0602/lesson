package date0520;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        Animal[] animal = {tiger, dog};

        for(int i =0 ; i<animal.length; i++) {
            animal[i].bite();
            animal[i].sleep();
            animal[i].eat();
        }
        tiger.hunt();
        dog.guard();
    }
}
