package date0520;

public class Dog extends Animal {

    @Override
    public void cry() {
        System.out.println("멍멍 울어요");
    }

    @Override
    public void eat() {
        System.out.println("개가 먹어요");
    }

    @Override
    public void bite() {
        System.out.println("개가 물어요");
    }

    @Override
    public void sleep() {
        System.out.println("개가 자요");
    }
    public void guard(){
        System.out.println("개가 집을 지켜요");
    }
}
