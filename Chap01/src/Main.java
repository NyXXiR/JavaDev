import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double paidDollar;
    double paidPound;
    int paidDate;
    double sum = 0;
    double exchangeRate;
    boolean run = true;

    while (run) {
      System.out.println("---------�ؿܰ�������----------");
      System.out.println("1.�޷������߰� | 2.�Ŀ������߰� | 3.�������� | 4.����");
      System.out.println("------------------------------");
      System.out.println("���� >");
      int input = sc.nextInt();
      if (input == 1) {
        System.out.println("������ �޷� �ݾ���?");
        paidDollar = sc.nextDouble();
        System.out.println("������ ��¥��?");
        paidDate = sc.nextInt();
        // ��¥�ݿ� �����ȵ�
        double dollarRateCal = 1400;
        sum += paidDollar * dollarRateCal;
        System.out.println("ȯ�� ���� �ݾ�: " + sum);
      }
      if (input == 2) {
        System.out.println("������ �Ŀ�� �ݾ���?");
        paidPound = sc.nextDouble();
        System.out.println("������ ��¥��?");
        paidDate = sc.nextInt();
        double poundRateCal = 1600;
        sum += paidPound * poundRateCal;
        System.out.println("ȯ�� ���� �ݾ�: " + sum);
      }
      if (input == 3) {
        if (sum < 30000) {
          System.out.println("���� �� �Ƴ��� ��");
        } else if (sum < 100000) {
          System.out.println("��� �Թ�");
        } else if (sum < 300000) {
          System.out.println("�Ǹ��� ���");
        } else {
          System.out.println("������ ������;;");
        }
      }
      if (input == 4) {
        run = false;
      }

    }
    System.out.println("���α׷� ����");
  }
}

// ���α׷��� ���
// ����� �����
// �ش�
//
// ����
// ��
//
// ����
//
// ���� ��¥, �ش�
//
// ��¥ �����ݾ�(��ȯ) �Է¹�����
// �� �� �����ߴ��� �����ִ� ���α׷� �ۼ�
//
//
// ��ȭ�� ȯ���� ������ x = �ش� ��¥�� ȯ�� *�����ݾ�
//
// ����= sum of x
//
