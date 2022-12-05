package sec13.exam03_field_method_access.package1;

public class A {
  // field

  public int field1;
  int field2;
  private int field3;

  // constructor
  public A() {
    // 클래스 내부일 경우 접근제한자의 영향 받지 않는다.
    field1 = 1;
    field2 = 1;
    field3 = 1;

    method1();
    method2();
    method3();
  }

  // method
  public void method1() {}

  void method2() {}

  private void method3() {}
}
