package homework.date0527;

public class Main {
    public static void main(String[] args) {
        // 회사원 클래스를 만들고, 출근, 퇴근 메서드가 있어, 이름이랑, 사원번호, 주소
        //method : in(), out(), work() name, number, address
        // 회사원을 상속받은 개발자 클래스를 만들고
        //method : codding(), compile()
        //work()를 오버라이딩 하여 codding(), compile() 실행
        //회사원을 상속받은 디자이너 클래스를 만들고 work()를 오버라이딩해서 디자인하다 출력
        //method : drowing(), publishing()
        //work()를 오버라이딩 하여 drowing(), publishing() 실행
        /*
        회사원들을 모두 출근 시키고, work() 실행
        각 회사원들을 다시 업캐스팅하여 개발자는 compile 실행, 디자이너는 publishing() 실행
         */
        Employee employee1 = new Developer("김원희");
        Employee employee2 = new Design("송제윤");
        Employee employee3 =new Lake("박호수");
        Employee[] emps = {employee1, employee2,employee3};
        for(int i =0; i<emps.length;i++){
            emps[i].in();
            emps[i].work();

            if(emps[i] instanceof Developer) {
                ((Developer) emps[i]).compile();
            } else if(emps[i] instanceof Design) {
                ((Design) emps[i]).publishing();
            }

        }

    }
}
