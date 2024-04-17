package day07.encap.practice;

public class BankAccount {

    //필드
    private long balance; //계좌 잔액;
    private String accountNumber; //계좌번호
    private String accountHolder; //이름


    //생성자
    BankAccount(String accountNumber,String accountHolder,long balance){
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    //메서드

    public void deposit(long balance){
        if(balance > 0 ){
        this.balance += balance;
        } else {
            System.out.println("잘못 된 금액입니다.");
        }
    }
    public void withdraw(int balance){
        this.balance -=balance;
    }




    //get

    //계좌 잔액 조회
    public long getBalance() {
        return balance;
    }


    //set

    public void setBalance(long balance) {
        this.balance = balance;
    }
}//class end
