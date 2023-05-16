package date230516;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.classNumber = 23010601;
        student.name = "김원희";

        Products products = new Products();
        products.productNumber = 237614;
        products.name = "키보드";
        products.company = "삼성";
        products.price = 23000;

        Employees employees = new Employees();
        employees.number = 23050001;
        employees.name = "이민호";
        employees.phoneNumber = "010-1234-1234";

        PrintInfoAble prs = new Student(23050002, "김종표");

        PrintInfoAble[] printInfoAble = {student, products, employees, prs};
        for(int i = 0; i < printInfoAble.length; i++) {
            printInfoAble[i].printInfo();
        }
    }
}
