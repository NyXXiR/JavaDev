package chap09;

public class A {
  A() {
    System.out.println("A ����");
  }

  class B {
    B() {
      System.out.println("B ����");
    }

    int field1;

    // static int field2;
    void method1() {}
    // static void method2(){}
  }
  static class C {
    C() {
      System.out.println("C ����");
    }

    static int field2;

    void method1() {}

    static void method2() {}
  }

  void method() {
    class D {
      D() {
        System.out.println("D ����");

      }
    }
  }

}
