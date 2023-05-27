package date0520;

public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        Animal[] animal = {tiger, dog};

        for(int i =0 ; i<animal.length; i++) {

            if(animal[i] instanceof Dog) {
                Dog t = (Dog) animal[i];
            }


        }





    }
}
