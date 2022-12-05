package sec13.exam03_field_method_access.package1;

public class B {
  public B() {
    A a = new A();
    a.field1 = 1;
    a.field2 = 1;
    // private 필드 접근 불가
    // a.field3 = 1;

    a.method1();
    a.method2();
    // private method 접근불가
    // a.method3();

  }
}
