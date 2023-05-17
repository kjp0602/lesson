package chapter06.sec01;

public class AccountExample {

    public static void main(String[] args) {

        new AccountExample().start();   //★★★★★★★★ static 메소드를 안쓰기 위해 이렇게 객체를 만듬
    }

    public void start() {
        Account account=new Account("홍길동");
        account.deposit(10000);
        printInfo(account);                  // account 객체를 printInfo에게 전달 해줌
        int amt=account.withdraw(5000);
        System.out.println("출금 금액 : "+amt);
        printInfo(account);
    }

    public void printInfo(Account account) {   //account 객체를 start에게서 전달 받음
        System.out.println("계좌주 : "+account.getAccountOwner());
        System.out.println("잔고 : "+account.getBalance());
    }

}
