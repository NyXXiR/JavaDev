import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int balance = 0;

    for (;;) {
      System.out.println(">>");
      int ss = sc.nextInt();
      if (ss == 1) {
        System.out.println("���ݾ�>");
        int sss = sc.nextInt();
        balance += sss;
        System.out.println("�ܾ�>" + balance);
      }
      if (ss == 4) {
        break;
      }
    }



    while (run) {
      System.out.println("----------------------------------");
      System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
      System.out.println("----------------------------------");
      System.out.println("���� >");

      int input = sc.nextInt();
      if (input == 1) {
        int add = sc.nextInt();
        balance += add;
        System.out.println("���� >" + input);
        System.out.println("���ݾ�>" + balance);
      } else if (input == 2) {
        int subtract = sc.nextInt();
        balance -= subtract;
        System.out.println("���� >" + input);
        System.out.println("��ݾ�>" + subtract);
      } else if (input == 3) {
        System.out.println("���� >" + input);
        System.out.println("�ܰ�>" + balance);

      } else if (input == 4) {
        run = false;

      }

    }
    System.out.println("���α׷� ����");
  }
}
