package homework.date0520;

public class Main {
    public static void main(String[] args) {
        Employee kimwoni = new Employee(1, "Kim woni", "dev", "manager");

        kimwoni.initSalary(30000000);

        kimwoni.printOncePay();

        //kimwoni.upSalary(2d);
        kimwoni.upSalary(500000);
        kimwoni.printOncePay();
    }
}
