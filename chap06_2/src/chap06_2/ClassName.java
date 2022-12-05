package chap06_2;

public class ClassName {
  int field1;

  void method1() {}

  static int field2;

  static void method2() {}

  static void method3() {}

  static {
    // 에러나는 내용 주석처리: static 없는 애들은 먼저 생성해줘야 되는데 못해서 에러
    // field1=10;
    // method1();
    field2 = 10;
    method2();
  }
}
