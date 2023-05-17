package chapter06.sec01;

public class Account {
    private String accountOwner;   // 계좌주
    private int balance;         // 잔고

    Account(){}
    Account(String accountOwner){         // 계좌 생성
        this.accountOwner=accountOwner;
        balance=0;
    }

    public void deposit(int amount) {      // 입금
        balance+=amount;               // 입금한 금액만큼 잔고 조절
    }

    public int withdraw(int amount) {      // 출금
        if(balance<amount) {
            System.out.println("잔고가 부족합니다.");
            amount=0;                  // 잔고가 부족하면 출금액이 없어야 하기 때문에 반환값을 0으로 지정
        }else {
            balance-=amount;            // 출금한 금액만큼 잔고 조절
        }
        return amount;
    }

    public int getBalance() {            // 잔고 반환
        return balance;
    }

    public String getAccountOwner() {      //계좌주 반환
        return accountOwner;
    }

}
