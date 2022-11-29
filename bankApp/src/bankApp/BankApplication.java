package bankApp;

import java.util.Scanner;

public class BankApplication {
  // ���¸� ���� �� �ִ� ���� 100 ¥�� �迭�� �����Ͽ���.
  private static Account[] accountArray = new Account[100];

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.println("---");
      System.out.println("1.���»��� | 2.���¸�� | 3. ���� | 4.��� | 5.����");
      System.out.println("---");
      System.out.println("����> ");

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
    System.out.println("���α׷� ����");
  }

  // ���»��� ������ ano owner balance ����
  private static void createAccount() {

    System.out.println("---");
    System.out.println("���»���");
    System.out.println("---");
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        accountArray[i] = new Account(null, null, 0);
        System.out.println("���¹�ȣ: ");
        accountArray[i].setAno(sc.next());
        System.out.println("������: ");
        accountArray[i].setOwner(sc.next());
        System.out.println("�ʱ��Աݾ�: ");
        accountArray[i].setBalance(sc.nextInt());
        System.out.println("���: ���°� �����Ǿ����ϴ�.");
        break;
      }
    }
  }

  // ���¸�� �����ֱ�. accountArray[i]�� ���� ����Ʈ
  private static void accountList() {
    System.out.println("---");
    System.out.println("���¸��");
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
    System.out.println("����");
    System.out.println("---");

    System.out.println("���¹�ȣ: ");
    Account inputAccount = findAccount(sc.next());
    System.out.println("���ݾ�: ");
    inputAccount.setBalance(inputAccount.getBalance() + sc.nextInt());
    System.out.println("���: ������ �����Ǿ����ϴ�.");


  }

  private static void withdraw() {
    System.out.println("---");
    System.out.println("���");
    System.out.println("---");


    // findAcc�� �����ϰ� ���¹�ȣ�� �Է��ϸ� accountArray[i]���� ã����.
    System.out.println("���¹�ȣ: ");
    Account inputAccount = findAccount(sc.next());
    System.out.println("��ݾ�: ");
    if (inputAccount.getBalance() < sc.nextInt()) {
      System.out.println("�ܾ��� �����մϴ�");

    } else {
      inputAccount.setBalance(inputAccount.getBalance() - sc.nextInt());
      System.out.println("���: ����� �����Ǿ����ϴ�.");
    }
  }

  // Account �迭���� ano�� ������ Account ��ü ã��
  // ���¹�ȣ�� �Է��ϸ� �ش� ��ȣ�� ���� Account ��ü ����
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

