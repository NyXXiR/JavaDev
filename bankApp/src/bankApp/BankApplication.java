package bankApp;

import java.util.Scanner;

public class BankApplication {
  // 계좌를 만들 수 있는 공간 100 짜리 배열을 선언하였음.
  private static Account[] accountArray = new Account[100];

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.println("---");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
      System.out.println("---");
      System.out.println("선택> ");

      int selectNum = sc.nextInt();

      if (selectNum == 1) {
        createAccount();
      } else if (selectNum == 2) {
        accountList();
      } else if (selectNum == 3) {
        deposit();
      } else if (selectNum == 4) {
        withdraw();
      } else if (selectNum == 5) {
        run = false;


      }
    }
    System.out.println("프로그램 종료");
  }

  // 계좌생성 변수는 ano owner balance 있음
  private static void createAccount() {

    System.out.println("---");
    System.out.println("계좌생성");
    System.out.println("---");
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        accountArray[i] = new Account(null, null, 0);
        System.out.println("계좌번호: ");
        accountArray[i].setAno(sc.next());
        System.out.println("계좌주: ");
        accountArray[i].setOwner(sc.next());
        System.out.println("초기입금액: ");
        accountArray[i].setBalance(sc.nextInt());
        System.out.println("결과: 계좌가 생성되었습니다.");
        break;
      }
    }
  }

  // 계좌목록 보여주기. accountArray[i]를 전부 프린트
  private static void accountList() {
    System.out.println("---");
    System.out.println("계좌목록");
    System.out.println("---");
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        break;
      }
      System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
          + accountArray[i].getBalance());
    }

  }

  private static void deposit() {
    System.out.println("---");
    System.out.println("예금");
    System.out.println("---");

    System.out.println("계좌번호: ");
    Account inputAccount = findAccount(sc.next());
    System.out.println("예금액: ");
    inputAccount.setBalance(inputAccount.getBalance() + sc.nextInt());
    System.out.println("결과: 예금이 성공되었습니다.");


  }

  private static void withdraw() {
    System.out.println("---");
    System.out.println("출금");
    System.out.println("---");


    // findAcc를 실행하고 계좌번호를 입력하면 accountArray[i]번이 찾아짐.
    System.out.println("계좌번호: ");
    Account inputAccount = findAccount(sc.next());
    System.out.println("출금액: ");
    if (inputAccount.getBalance() < sc.nextInt()) {
      System.out.println("잔액이 부족합니다");

    } else {
      inputAccount.setBalance(inputAccount.getBalance() - sc.nextInt());
      System.out.println("결과: 출금이 성공되었습니다.");
    }
  }

  // Account 배열에서 ano와 동일한 Account 객체 찾기
  // 계좌번호를 입력하면 해당 번호를 가진 Account 객체 리턴
  private static Account findAccount(String ano) {

    Account foundAccount = null;
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i].getAno().equals(ano)) {
        foundAccount = accountArray[i];
        break;
      }
    }
    return foundAccount;
  }
}

