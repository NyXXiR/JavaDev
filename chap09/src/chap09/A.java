package chap09;

public class A {
  A() {
    System.out.println("A 持失");
  }

  class B {
    B() {
      System.out.println("B 持失");
    }

    int field1;

    // static int field2;
    void method1() {}
    // static void method2(){}
  }
  static class C {
    C() {
      System.out.println("C 持失");
    }

    static int field2;

    void method1() {}

    static void method2() {}
  }

  void method() {
    class D {
      D() {
        System.out.println("D 持失");

      }
    }
  }

}
