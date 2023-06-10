package homework.date0520;
/*

⦁ 직원 정보를 가지고 있는 Employee 클래스가 있다.
⦁ 이 클래스를 사용하여 직원들의 사번, 이름, 부서, 직급, 나이, 성별, 연봉, 연락처, 주소 등의 정보를  관리할 것이다.

     Employee e = new Employee();
1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.
2. 생성된 직원의 연봉을 설정할 수 있다.
3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이다. 따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.
4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동일하다.
   단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
 */

public class Employee {
    private int number;
    private String name;
    private String dept;
    private String rank;
    private String gender;
    private long salary;
    private String phoneNumber;
    private String address;
    private double salaryPersent = 0.025; //2.5%
    private boolean isInitSalary = false;

    public Employee(int number, String name, String dept, String rank, String gender, String address, long salary) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.rank = rank;
        this.gender=gender;
        this.address=address;
        this.salary=salary;
        this.phoneNumber=phoneNumber;


    }

    /**
     * 연봉을 제일 처음 설정할 때 사용하는
     *
     * @param salary
     */


    public void initSalary(long salary) {
        if (!this.isInitSalary) {
            this.salary = salary;
            this.isInitSalary = true;
            System.out.println("init salary success!!: " + this.salary);
        } else {
            System.out.println("already init salary: " + this.salary);
        }

    }

    public void printOncePay() {
        long oncePay = (long) ((double) this.salary / 12d - ((double) this.salary / 12d * 0.08d));
        System.out.println("급여: " + oncePay);
    }

    /**
     * 퍼센트로 연봉 올리기
     */
    public void upSalary(double percent) {
        if (percent > this.salaryPersent * 100) {
            System.out.println("to much percent for 2.5% ");
        } else {
            this.salary = this.salary + (long) (this.salary * percent / 100);
        }
    }


    public void employeePrinter() {
        System.out.println("이름: " + name + ", 사원번호: " + number + ", 폰번호: " + phoneNumber + ", 성별: " + gender);
    }
    /**
     * 금액을 더하는 방법
     */
    public void upSalary(long plus) {
        if (plus > (long) (this.salary * this.salaryPersent)) {
            System.out.println("to much plus for 2.5% ");
        } else {
            this.salary = this.salary + plus;
        }
    }

    /**
     * 실적에 따라서 연봉 인상 조건을 변경할 수 있는 메서드
     */
    public void setSalaryPersent(double salaryPersent) {
        this.salaryPersent = salaryPersent / 100;
    }



}
//출력하는 클래스

