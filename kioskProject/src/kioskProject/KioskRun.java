package kioskProject;

import java.util.Scanner;

public class KioskRun {

  Scanner sc = new Scanner(System.in);
  boolean run = true;
  int selectNum = 0;
  int membershipNum = 0;


  {
    while (run) {


      System.out.println("--------------------");
      System.out.println("1.�޴����� 2.������Է� 3.�ܱ��� 4.����");
      System.out.println("--------------------");
      System.out.println("����> ");
      selectNum = sc.nextInt();

      if (selectNum == 1) {
        // ���� �ϴ� ���: �����ͺ��̽����� select�ؼ� ������ �޴���� ǥ��

      }
      if (selectNum == 2) {
        System.out.println("����� ��ȣ�� �Է��ϼ���");
        System.out.println("�ڵ���/����� ��ȣ �Է�> ");
        membershipNum = sc.nextInt();


        // �̷��� ȸ�������� �Է��� members �����ͺ��̽��� �ʿ���
        // �� ����: name, phoneNumber, membershipNum
        for (int i = 0; i < members.length; i++) {
          // ����ʹ�ȣ�� �ڵ�����ȣ �� �� ������ ��ġ�ϸ� ���μ��� ����
          if (membershipNum.equals(phoneNum) || membershipNum.equals(memberShipNum)) {
            // �Ϲݰ��� �������� ����ʹ�ȣ ������ ���� ������ ����Ǿ�� ��



          }

        }

      }
      if (selectNum == 3) {
        System.out.println("�ܱ����� �����ȵ�");

      }
      if (selectNum == 4) {

      }

    }
    System.out.println("���α׷� ����");
  }

}

