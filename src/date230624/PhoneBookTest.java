package date230624;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class PhoneBookTest {
    Scanner sc = new Scanner(System.in);
    HashMap<String,PhoneBook> call = new HashMap <String,PhoneBook>();

    public void bookList(){

        System.out.println("======================");
        System.out.println("1.전화번호 등록");
        System.out.println("2.번화번호 삭제");
        System.out.println("3.전화번소 수정");
        System.out.println("4.전화번호 검색");
        System.out.println("5.전화번호 전체 출력");
        System.out.println("0.프로그램 종료");
        System.out.println("번호입력 >" );
    }

    public void bookStart() {
        call.put("dooly", new PhoneBook("dooly", "010-2324-1111","쌍문동"));
        call.put("ddochi", new PhoneBook("ddochi","010-4533-1212","아프리카"));
        while(true) {
            bookList();
            String menuNumStr = sc.nextLine();
            int  menuNum = Integer.valueOf(menuNumStr);
            switch(menuNum) {
                case 1:
                    upload();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    select();
                    break;
                case 5:
                    showList();
            }

        }
    }

    public void upload() {
        System.out.println("이름 입력하기 :");
        String name = sc.nextLine();
        System.out.println("번호 입력하기 :");
        String phone = sc.nextLine();
        System.out.println("주소 입력하기 :");
        String add = sc.nextLine();

            if(call.get(name) == null) {
                call.put(name, new PhoneBook(name, phone, add));
            } else {
                System.out.println("이미 있는 이름입니다.");
            }
    }
    public void update() {
        System.out.println("이름 입력하기 :");
        String name = sc.nextLine();
        System.out.println("번호 입력하기 :");
        String phone = sc.nextLine();
        System.out.println("주소 입력하기 :");
        String add = sc.nextLine();

        if(call.get(name) != null) {
            call.put(name, new PhoneBook(name, phone, add));
        } else {
            System.out.println("없는 목록입니다.");
        }
    }
    public void delete(){
        System.out.println("이름 입력하기 :");
        String name = sc.nextLine();
        if(call.remove(name) == null) {
            System.out.println("애초에 없는 이름이야.");
        } else {
            System.out.println("삭제했어.");
        }
    }
    public void select() {
        System.out.println("이름 입력하기 :");
        String name = sc.nextLine();
        PhoneBook book = call.get(name);
        if(book == null) {
            System.out.println("없어 이자식아.");
        } else {
            System.out.println(book);
        }
    }

    public void showList() {
        Iterator it = call.keySet().iterator();
        while(it.hasNext()){
            System.out.println(call.get(it.next()));
        }
    }

    public static void main(String[] args) {
        PhoneBookTest test = new PhoneBookTest();
        test.bookStart();



        // 문제)이름, 전화번호 , 주소를 멤버로 갖는 phone 클래스를 만들고  Map을 이용하여 전화번호 정보를 관리하는 프로그램을 작성하시오.
        //(Map의 구조는 key값으로 '이름'을 사용하고 value값으로는 'Phone클래스의 인스턴스'로 한다.)
        //아래 메뉴를 구현하시오.
        //HashMap<String,Phone> 변수명;
        /*
         * 1.전화번호 등록
         * 2.번화번호 삭제
         * 3.전화번소 수정
         * 4.전화번호 검색
         * 5.전화번호 전체 출력
         * 0.프로그램 종료
         *
         * -삭제,검색 기능은 '이름'을 입력받아 처리한다.
         *
         * 실행예시
         * ==========================================
         * 1.전화번호 등록
         * 2.번화번호 삭제
         * 3.전화번소 수정
         * 4.전화번호 검색
         * 5.전화번호 전체 출력
         * 0.프로그램 종료
         *==========================================
         * 번호 입력 >1
         *
         * 새롭게 등록할 전화번호 정보를 입력하세요
         * 이름 >> 홍길동
         * 전화번호 >> 010-1234-5678
         * 주소 >> 대전시 중구 오류동
         *
         *
         *'홍길동' 전화번호 등록 완료!!
         *
         * ==========================================
         * 1.전화번호 등록
         * 2.번화번호 삭제
         * 3.전화번소 수정
         * 4.전화번호 검색
         * 5.전화번호 전체 출력
         * 0.프로그램 종료
         * ===========================================
         * 번호 입력 >1
         * 새롭게 등록할 전화번호 정보를 입력하세요
         * 이름 >> 홍길동
         * '홍길동'은 이미 등록된 사람입니다.
         *
         * ==========================================
         * 1.전화번호 등록
         * 2.번화번호 삭제
         * 3.전화번소 수정
         * 4.전화번호 검색
         * 5.전화번호 전체 출력
         * 0.프로그램 종료
         * =============================================
         * 번호입력>5
         *
         * ------------------------------------------------
         * 번호    이름      전화번호             주소
         * 1   홍길동   010-5554-4349      대전시 중구 오류동
         *
         * ------------------------------------------------
         *
         *  ==========================================
         * 1.전화번호 등록
         * 2.번화번호 삭제
         * 3.전화번소 수정
         * 4.전화번호 검색
         * 5.전화번호 전체 출력
         * 0.프로그램 종료
         * =============================================
         */



    }

}
class PhoneBook{
    private String name;
    private String phone;
    private String add;

    public PhoneBook(String name, String phone, String add) {
        this.name = name;
        this.phone = phone;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}