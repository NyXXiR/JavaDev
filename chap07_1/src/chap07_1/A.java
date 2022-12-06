
package chap07_1;


class C {
}


class B extends C {
}


public class A {

  public static void main(String[] args) {
    C c = new B();
    // B b = new C();
  }

}
