
import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    Scanner sc = new Scanner(System.in);

    while (run) {
      System.out.println("------------------------------------------------------");
      System.out.println("1.�л��� | 2.�����Է� | 3. ��������Ʈ | 4.�м� | 5.����");
      System.out.println("------------------------------------------------------");
      System.out.println("����> ");

      int selectNo = sc.nextInt();

      if (selectNo == 1) {
        System.out.println("�л���> ");
        studentNum = sc.nextInt();

      } else if (selectNo == 2) {
        scores = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
          System.out.println("scores[" + i + "]> ");
          scores[i] = sc.nextInt();

        }

      } else if (selectNo == 3) {
        // ��������Ʈ ���
        for (int i = 0; i < studentNum; i++) {

          System.out.println("scores[" + i + "]: " + scores[i]);
        }

      } else if (selectNo == 4) {

        // �迭���� �ִ밪 ���Ϸ���, ���� �ϳ��� ������ ���� ���� ������ �ȴ�.
        int max = 0;
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < studentNum - 1; i++) {
          max = scores[i] > scores[i + 1] ? scores[i] : scores[i + 1];
        }

        for (int i = 0; i < studentNum; i++) {

          sum = sum + scores[i];
          avg = sum / studentNum;
        }
        System.out.println("�ְ� ����: " + max);
        System.out.println("��� ����: " + avg);


      } else if (selectNo == 5) {
        run = false;
      }
    }
    System.out.println("���α׷� ����");

  }
}
