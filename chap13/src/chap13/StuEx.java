package chap13;

import java.util.*;

public class StuEx {

  public static void main(String[] args) {
    List<Student> lst = new ArrayList<Student>();
    Student stu = new Student(0, "ȫ", "202212", "������");
    lst.add(stu);
    Student stu2 = new Student(1, "ȫ1", "202213", "������");
    lst.add(stu2);

    // �̷��� ã���� �̻��ϰ� ���. ���� Ŭ������ ���� generate > toString�� ����� ��
    for (Student st : lst) {
      System.out.println(st);
    }
  }
}
