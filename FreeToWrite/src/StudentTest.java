import java.util.Scanner;

public class StudentTest {

  String name;
  String number;
  String address;
  int kor;
  int math;
  int eng;


  public StudentTest(String name, String number, String address) {
    this.name = name;
    this.number = number;
    this.address = address;
  }

  public StudentTest(int kor, int math, int eng) {
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }



  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StudentTest student1 = null;
    StudentTest student2 = null;
    StudentTest student3 = null;
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int selectNum = 0;

    StudentTest[] stu = {student1, student2, student3};


    while (run) {
      System.out.println("1)���������Է� 2)�����Է� 3)������ȸ 4) �������� 5)����");
      System.out.println("�Է�>>");
      // ���⿡ ���� ȭ�� ���� �Է�

      selectNum = sc.nextInt();

      if (selectNum == 1) {
        for (int i = 0; i < stu.length; i++) {

          System.out.println(i + "�� �л� �̸� �Է�");
          String a = sc.next();

          System.out.println(i + "�� �л� ��ȣ �Է�");
          String b = sc.next();

          System.out.println(i + "�� �л� �ּ� �Է�");
          String c = sc.next();

          stu[i] = new StudentTest(a, b, c);

        }
      }
      if (selectNum == 2) {
        for (int i = 0; i < stu.length; i++) {
          System.out.println(i + "�� �л� ���� ���� �Է�");
          stu[i].kor = sc.nextInt();
          System.out.println(i + "�� �л� ���� ���� �Է�");
          stu[i].math = sc.nextInt();
          System.out.println(i + "�� �л� ���� ���� �Է�");
          stu[i].eng = sc.nextInt();
        }
      }
      if (selectNum == 3) {
        System.out.println("���� ���� ����");
        for (int i = 0; i < stu.length; i++) {

          System.out.print(stu[i].kor + " " + stu[i].math + " " + stu[i].eng);
          System.out.println("\n");

        }

      }
      if (selectNum == 4) {
        System.out.println("�� �� �л��� ������ �����ϰ� �ͽ��ϱ�?");
        System.out.println(stu[0].number);
        System.out.println(stu[1].number);
        System.out.println(stu[2].number);

        String answer = sc.next();
        for (int i = 0; i < stu.length; i++) {
          if (answer.equals(stu[i].number)) {
            System.out.println("�ٲٰ� ���� ������ �Է��Ͻʽÿ�");
            System.out.println("1) kor 2) math 3) eng");
            int subjectAnswer = sc.nextInt();
            System.out.println("�ٲٰ� ���� ������ ������ �Է��Ͻʽÿ�");
            int modifiedScore = sc.nextInt();

            for (int j = 0; j < stu.length; j++) {
              if (subjectAnswer == 1) {
                stu[i].kor = modifiedScore;
              }
              if (subjectAnswer == 2) {
                stu[i].math = modifiedScore;
              }
              if (subjectAnswer == 3) {
                stu[i].eng = modifiedScore;
              }
            }

          }
        }
      }


      if (selectNum == 5) {
        System.out.println("program shutdown");
        break;
      }
    }
  }



}


