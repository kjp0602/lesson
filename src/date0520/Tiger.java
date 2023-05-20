package date0520;

public class Tiger extends Animal{
    @Override
    public void cry() {
        System.out.println("어흥하고 울어요");
    }


    @Override
    public void bite() {
        System.out.println("호랑이가 물어요");
    }

    @Override
    public void sleep() {
        System.out.println("호랑이가 자요");
    }
    public void hunt(){
        System.out.println("호랑이가 사냥해요");
    }
}
