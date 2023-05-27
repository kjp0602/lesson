package homework.date0527;

public class Employee {
    String in;
    String out;
    String name;
    String address;
    String number;

    public Employee(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(this.name+"일하다");

    }

    public void in(){
        System.out.println("출근");

    }

    public void out(){
        System.out.println("퇴근");

    }

}
