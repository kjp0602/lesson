package homework.date0527;

public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }
    public void codding() {
        System.out.println(this.name + " 코딩하기");
    }

    public void compile() {
        System.out.println(this.name + "컴파일하기");
    }

    public void work() {
        codding();
        compile();
    }


}