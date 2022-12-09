package chap09;

public class AEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    A a = new A();
    A.B b = a.new B();
    A.B c = new A().new B();

    b.field1 = 3;
    b.method1();
  }

}
