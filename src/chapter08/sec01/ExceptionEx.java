package chapter08.sec01;

public class ExceptionEx {
    public static void main(String[] args) {
        int res = 0;
        int num = 10;
        try {
            for (int i = 0; i < 15; i++) {
                res = 100 / num;
                System.out.println(res);
                num--;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("이곳은 언제나 시행되는 블록입니다.");
        }
    }
}
