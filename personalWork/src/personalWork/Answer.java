package personalWork;

import java.util.Scanner;

public class Answer {

  int brand;
  int star;
  int reason;


  public Answer(int brand, int star, int reason) {

    this.brand = brand;
    this.star = star;
    this.reason = reason;
  }

  public static void main(String[] args) {
    // ���α׷� ������ chap01 > exercise09 ����

    Scanner sc = new Scanner(System.in);
    int customerNum = 0; // �ʱ�ȭ
    boolean run = true;
    // ������ Answer ����ŭ ���� �ο��� ������ �� ����
    Answer answer1 = null;
    Answer answer2 = null;
    Answer answer3 = null;
    Answer answer4 = null;
    Answer answer5 = null;
    Answer answer6 = null;
    Answer answer7 = null;
    Answer answer8 = null;
    Answer answer9 = null;
    Answer answer10 = null;
    Answer[] answers =
        {answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10};


    // 1. �亯�Է� 2. ��ȣ�귣�� �м� 3. ���� ����/���� �� �귣�� 4. �귣�庰 �ı� 5.����
    // 2-1. �귣�庰 ���� ����(��������+��պ���), 2-2. �귣�� ���� ����
    while (run) {

      System.out.println("------------------------------------------------------");
      System.out.println("1.�����ο��� 2.�亯�Է� 3.�귣�庰 ���� 4.�귣�� ��ȣ ���� 5. ���� ����/���� �� �귣�� 6.����");
      System.out.println("------------------------------------------------------");
      System.out.println("����> ");

      int selectNum = sc.nextInt();

      // 1. �ο���

      if (selectNum == 1) {
        // customerNum = 3���� ����.
        System.out.println("�亯�� �ο� ���� �����ϼ���(�ִ� 10)");
        customerNum = sc.nextInt();

      }
      // 2. �亯�Է�
      if (selectNum == 2) {

        for (int i = 0; i < customerNum; i++) {
          System.out.println((i + 1) + "�� ������ ����մϴ�.(��� ���ڷ� �Է�)");

          System.out.println("� �귣�� Ŀ�Ǹ� ���̽��ϱ�?");
          System.out.println("1) �ް�Ŀ�� 2) Ŀ�Ǳ׷糪�� 3) Ŀ�Ǻ��� 4) �轺Ų���");
          int brandAnswer = sc.nextInt();


          System.out.println("�ش� �귣���� ������ �Ű��ּ���.(1~10���� �Է�)");
          int starAnswer = sc.nextInt();
          System.out.println("�귣�带 ������ �� ���� �߽��ϴ� ��Ҵ�?");
          System.out.println("1) �� 2) �̵��Ÿ� 3)ģ����");
          int reasonAnswer = sc.nextInt();

          answers[i] = new Answer(brandAnswer, starAnswer, reasonAnswer);
        }
      }
      // 3. ��ȣ�귣�� �м�
      // answer1, answer2, answer3�� brand, star, reason�� �����ϰ� ����.
      // �귣�庰 ���� ���� / (������ �� �ο���) ��� ���� ���
      // �귣�� ���� ����
      if (selectNum == 3) {
        // ���� ����
        // ��� ����(�� �����ο���)
        // 4���� ���;� ��- �ް�Ŀ��, Ŀ�Ǳ׷糪��, �轺Ų���, Ŀ�Ǻ���

        double megaStarSum = 0;
        double gruStarSum = 0;
        double brStarSum = 0;
        double bayStarSum = 0;
        int megaCnt = 0;
        int gruCnt = 0;
        int brCnt = 0;
        int bayCnt = 0;


        int[] arr = new int[customerNum];

        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].brand;
          if (arr[i] == 1) {
            megaStarSum += answers[i].star;
            megaCnt++;
          } else if (arr[i] == 2) {
            gruStarSum += answers[i].star;
            gruCnt++;
          } else if (arr[i] == 3) {
            brStarSum += answers[i].star;
            brCnt++;
          } else if (arr[i] == 4) {
            bayStarSum += answers[i].star;
            bayCnt++;
          }
        }
        double result1 = megaStarSum / megaCnt;
        double result2 = megaStarSum / megaCnt;
        double result3 = brStarSum / brCnt;
        double result4 = bayStarSum / bayCnt;

        String megaAvg = String.format("%.1f", result1);
        String gruAvg = String.format("%.1f", result2);
        String brAvg = String.format("%.1f", result3);
        String bayAvg = String.format("%.1f", result4);

        System.out.println("�귣��� - ��պ��� - �� �����ο� ��");
        System.out.println("�ް�Ŀ��: " + megaAvg + "(" + megaCnt + ")");
        System.out.println("Ŀ�Ǳ׷糪��: " + gruAvg + "(" + gruCnt + ")");
        System.out.println("�轺Ų���: " + brAvg + "(" + brCnt + ")");
        System.out.println("Ŀ�Ǻ���: " + bayAvg + "(" + bayCnt + ")");

        // String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);

      }

      if (selectNum == 4) {
        // �귣�� ��ȣ ����
        double tasteCnt = 0;
        double distanceCnt = 0;
        double kindCnt = 0;
        int[] arr = new int[customerNum];
        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].reason;
          if (arr[i] == 1) {
            tasteCnt++;
          } else if (arr[i] == 2) {
            distanceCnt++;
          } else if (arr[i] == 3) {
            kindCnt++;
          }

        }
        String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);
        String resultDistance = String.format("%.2f", distanceCnt / customerNum * 100);
        String resultKind = String.format("%.2f", kindCnt / customerNum * 100);

        System.out.println("��: " + resultTaste + "%");
        System.out.println("�̵��Ÿ�: " + resultDistance + "%");
        System.out.println("ģ����: " + resultKind + "%");
      }



      // 5. ���� ���� �� �귣��?
      if (selectNum == 5) {
        int[] arr = new int[customerNum];
        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].brand;
        }
        int[] mode = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
          mode[arr[i]]++;
        }
        int modeNum = 0; // �ֺ��
        int modeCnt = 0; // �ֺ�� ����Ƚ��

        for (int i = 0; i < arr.length; i++) {
          if (modeCnt < mode[i]) {

            modeCnt = mode[i];
            modeNum = i;
          }
        }

        if (modeNum == 1) {
          System.out.println("���� ���� �� �귣��� �ް�Ŀ���Դϴ�.");
        } else if (modeNum == 2) {
          System.out.println("���� ���� �� �귣��� Ŀ�Ǳ׷糪���Դϴ�.");
        } else if (modeNum == 3) {
          System.out.println("���� ���� �� �귣��� �轺Ų����Դϴ�.");
        } else if (modeNum == 4) {
          System.out.println("���� ���� �� �귣��� Ŀ�Ǻ����Դϴ�.");
        }
      }

      // 5. ���α׷� ����
      if (selectNum == 6) {
        break;
      }

    }
    System.out.println("����\t�ʹ�\t����\t���");
  }
}


// �ƽ��� ��
// �ֺ󰪸� ����, ���� ���� �� ���� X
// ��ġ�� �ڵ尡
// �־� �����丵�غ���
// ���� ��
// ���ٴ� ����.
// ��Ƶ� ��ü
// �����Ϳ��� ��
// �׸� ������
// �κ��� �ݺ��Ǿ���.
// ���� �����
// ���� ����
// ��ü�� �״��
// �Էµ�.������ �����
// ������ �����ϰ� �;���


//



// 1.
//
// �� ������
// �Է¹��� �� customerNum:2.
// ������ �Է�
// �� �
// �귣�� Ŀ�Ǹ� ���̴°�?(1~4)
// ���귣�忡 ����
//
// �Űܴ޶�(1~10) >starCount++, starRate.nextInt();
// ���ı� �ۼ��� ���� �ֳ�?(Y/N)
// ��(if Y)�ı⸦ �Է��ϼ��� > �Է��� �ı�� �ռ� �Է��� �� �귣�忡 �Ҵ�
// (if N)�� �迭 ��� ���� " "
//
// 3. ��ȣ�귣�� �м�
// 3-1. �귣�庰 ���� ����
// ���� �귣�� ���� �Է� >
//
// ��� ����(���� �� �ο���)
// 3-2.
//
// 4. ���� ���� �� / ���� �� �귣��
// ���Է¹��� �귣�� Ŀ�� count++ �ؼ� �ִ밪/�ּҰ� ���
//
// 5. �귣�庰 �ı� ����
// �� �귣�� �Է� 1~4 / 5. ��ü����
//
// 6. ����


