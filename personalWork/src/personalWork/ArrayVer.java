package personalWork;

import java.util.Scanner;

public class ArrayVer {

  public static void main(String[] args) {
    boolean run = true;

    int scores[];
    int pick;

    Scanner scan = new Scanner(System.in);

    int[][] answers = new int[3][];

    while (run) {
      System.out.println("----------------------------");
      System.out.println("1.�����ο��� - 2.�亯�Է� - 3.�귣�庰 ���� - 4.���� ����/���� �� �귣�� - 5.�귣�庰 �ı� - 6.����");
      System.out.println("----------------------------");
      System.out.println(">>���ϴ� �ൿ�� ������<<");
      pick = scan.nextInt();

      if (pick == 1) {
        System.out.println("���� �ο����� ����ΰ���?");
        System.out.println(answers.length + "��");
      }

      if (pick == 2) {
        for (int i = 0; i < answers.length; i++) {
          System.out.println(i + 1 + "�� ������ ����մϴ�.(��� ���ڷ� �Է�)");
          System.out.println(">>2-1 � �귣�� Ŀ�Ǹ� ���̽��ϱ�?<<");
          System.out.println("1)�ް�Ŀ�� - 2)Ŀ�Ǳ׷糪�� - 3)Ŀ�Ǻ��� - 4)����");
          System.out.print("���� ���> ");
          int brandAnswer = scan.nextInt();
          System.out.println("");

          System.out.println(">>2-2 � �귣�� Ŀ�Ǹ� ���̽��ϱ�?<<");
          System.out.println("������ �귣�� Ŀ�ǿ� ������ �Ű��ּ���.");
          System.out.print("���� ���> ");
          int starAnswer = scan.nextInt();
          System.out.println("");

          System.out.println(">>2-3 �ı⸦ �ۼ��Ͻðڽ��ϱ�? ����:1 / ����:0 <<");
          System.out.print("���� ���> ");
          int reviewAnswer = scan.nextInt();
          System.out.println("");

          answers[i] = new int[] {brandAnswer, starAnswer, reviewAnswer};
        }
      }
      if (pick == 3) {
        double megaStarSum = 0;
        double gruStarSum = 0;
        double brStarSum = 0;
        double bayStarSum = 0;
        int megaCnt = 0;
        int gruCnt = 0;
        int brCnt = 0;
        int bayCnt = 0;
        int[] arr = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
          arr[i] = answers[i][0];
          if (arr[i] == 1) {
            megaStarSum += answers[i][1];
            megaCnt++;
          } else if (arr[i] == 2) {
            gruStarSum += answers[i][1];
            gruCnt++;
          } else if (arr[i] == 3) {
            brStarSum += answers[i][1];
            brCnt++;
          } else if (arr[i] == 4) {
            bayStarSum += answers[i][1];
            bayCnt++;
          }
        }
        double result1 = megaStarSum / megaCnt;
        double result2 = gruStarSum / gruCnt;
        double result3 = brStarSum / brCnt;
        double result4 = bayStarSum / bayCnt;

        String megaAvg = String.format("%.1f", result1);
        String gruAvg = String.format("%.1f", result2);
        String brAvg = String.format("%.1f", result3);
        String bayAvg = String.format("%.1f", result4);

        System.out.println("�귣��� - ��պ��� - �� �����ο� ��");
        System.out.println("�ް�Ŀ��: " + result1 + "(" + megaCnt + ")");
        System.out.println("Ŀ�Ǳ׷糪��: " + gruAvg + "(" + gruCnt + ")");
        System.out.println("�轺Ų���: " + brAvg + "(" + brCnt + ")");
        System.out.println("Ŀ�Ǻ���: " + bayAvg + "(" + bayCnt + ")");

        // String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);

      }



      // answers[0][0] ~ answers[i][0] => � �귣�� �������
      // answers[0][0] ~ answers[0][j] => ������ �� ���� �����
      // answers[i][0] ~[i][1] = � �귣�带 ����� �� ���� �����


      // arr[] = {1,2,3,1}


      if (pick == 4) {
        int arr[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
          arr[i] = answers[i][0];
        }

        int modeNum = 0; // �ֺ�
        int[] index = new int[arr.length + 1]; // ���� ����(count)����
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
          index[arr[i]]++; // count
        }
        for (int i = 0; i < arr.length; i++) {
          if (max < index[i]) {
            max = index[i];
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

    }


  }
}

