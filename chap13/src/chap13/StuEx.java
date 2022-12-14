package chap13;

import java.util.*;

public class StuEx {

  public static void main(String[] args) {
    List<Student> lst = new ArrayList<Student>();
    Student stu = new Student(0, "홍", "202212", "마포구");
    lst.add(stu);
    Student stu2 = new Student(1, "홍1", "202213", "마포궁");
    lst.add(stu2);

    // 이렇게 찾으면 이상하게 뜬다. 원본 클래스로 가서 generate > toString을 해줘야 함
    for (Student st : lst) {
      System.out.println(st);
    }
  }
}
