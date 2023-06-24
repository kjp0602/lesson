package date230624;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*문제) 학번, 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는 Student클래스를 만든다.
    이 클래스의 생성자에서는 학번, 이름, 국어점수, 영어점수, 수학점수만 매개변수로 받아서
    초기화 처리를 한다.

    이 Student객체는 List에 저장하여 관리한다.

    List에 저장된 데이터들을 학번의 오름차순으로 정렬할 수 있는 내부 정렬 기준을 구현하고,
    총점의 역순으로 정렬하는데 총점이 같으면 이름의 오름차순으로 정렬이 되는 외부 정렬 기준
    클래스를 작성하여 정렬된 결과를 출력하시오.

    (단, 등수는 List에 전체 데이터가 추가된 후에 구해서 저장되도록 한다.)
 *
 */

public class StudentTest {

    // 등수를 구하는 메서드
    public void createRank(List<Student> slist) {
        // std1에 slist가 들어가서 비교함.
        for(int i= 0; i< slist.size(); i++) {
            Student std1 = slist.get(i);

        }
        for (Student std1 : slist) { // 기준 데이터를 구하기위한 반복문
            int rank = 1; // 처음에는 1등으로 설정해두고 시작한다.
            for (Student std2 : slist) { // 비교 대상을 나타내는 반복문
                if (std1.getTotal() < std2.getTotal()) {// 기준값보다 대상값이 크면
                    rank++; // rank증가
                }
            }
            std1.setRank(rank); // 구해진 등수를 Student 객체의 rank 변수에 저장한다.
        }

    }

    public static void main(String[] args) {
        String abc = "aba";

        List<Student> stdList = new ArrayList<Student>();
        Student one = new Student(1, "홍길동", 90, 95, 80);
        stdList.add(one);
        stdList.add(new Student(3, "성춘향", 90, 97, 70));
        stdList.add(new Student(7, "강감찬", 95, 95, 80));
        stdList.add(new Student(5, "변학도", 80, 95, 90));
        stdList.add(new Student(2, "일지매", 100, 85, 80));
        stdList.add(new Student(4, "이순신", 60, 65, 70));
        stdList.add(new Student(6, "이몽룡", 90, 100, 90));

        StudentTest stdTest = new StudentTest();// static이라 객체생성후 호출가능
        stdTest.createRank(stdList);

        System.out.println("정렬전");

        for (Student std : stdList) {
            System.out.println(std);
        }

        System.out.println("----------------------");

        // 학번의 오름차순 정렬하기 (내부정렬 기준)
        Collections.sort(stdList);

        System.out.println("----------------------");

        System.out.println("학번오름차순 정렬후");
        for (Student std : stdList) {
            System.out.println(std);
        }

        System.out.println("----------------------");
        System.out.println("총점내림차순");

        Collections.sort(stdList,new SortByTotal());
        for (Student std : stdList) {
            System.out.println(std);
        }

    }

}

//학번의 오름차순으로 정렬할 수 있는 내부 정렬 기준을 구현
class Student implements Comparable<Student> {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int total;
    private int rank;

    public Student(int num, String name, int kor, int eng, int mat) {
        super();
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.total = kor + eng + mat; // 매개변수로 받진 않지만 총점까지 초기화 시킬수 있다.
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", total="
                + total + ", rank=" + rank + "]";
    }

    //학번의 오름차순으로 정렬할 수 있는 내부 정렬 구현
    @Override
    public int compareTo(Student std) {
        return Integer.compare(this.num, std.getNum()); // if문 쓰지 않은 오름차순 정렬
    }
}

//총점의 역순으로 정렬하는데 총점이 같으면 이름의 오름차순으로 정렬이 되는 외부정렬기준

class SortByTotal implements Comparator<Student> {
    @Override
    public int compare(Student std1,Student std2) {
        if(std1.getTotal() == std2.getTotal()) {
            return std1.getName().compareTo(std2.getName());

        }else {
            return Integer.compare(std1.getTotal(), std2.getTotal())*-1; //역순이니까 -1
        }
    }
}