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

public class Main {
    public static void main(String[] args) {
        Employee kimwoni = new Employee(502743, "김원희", "개발팀", "사원", "여성", "대전대덕인재", 30000000);
        kimwoni.employeePrinter();
        kimwoni.initSalary(30000000);

        kimwoni.printOncePay();

        //kimwoni.upSalary(2d);
        kimwoni.upSalary(500000);
        kimwoni.printOncePay();



    }
    }





