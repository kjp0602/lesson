package homework.date0527;

public class  Design extends Employee{
    public Design(String name) {
        super(name);
    }
    public void design(){
        System.out.println(this.name + " 디자인하기");
    }


    public void publishing(){
        System.out.println(this.name + " 퍼블하기");
    }

    @Override
    public void work() {
        publishing();
        design();
    }
}
