package chap06_2;

public class ClassName {
  int field1;

  void method1() {}

  static int field2;

  static void method2() {}

  static void method3() {}

  static {
    // �������� ���� �ּ�ó��: static ���� �ֵ��� ���� ��������� �Ǵµ� ���ؼ� ����
    // field1=10;
    // method1();
    field2 = 10;
    method2();
  }
}
