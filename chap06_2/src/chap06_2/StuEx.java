package chap06_2;

public class StuEx {

  public static void main(String[] args) {
    Student stu;
    stu = new Student("�ӱ���", "20151094", "���� ��������", 91, 80, 70);
    double avg1 = stu.avg();
    System.out.println(avg1);
  }

}
