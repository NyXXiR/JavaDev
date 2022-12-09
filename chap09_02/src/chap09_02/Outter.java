package chap09_02;

public class Outter {
  public void method(int arg) {

    int localVariable = 1;
    // final int arg = 100;

    class Inner {
      public void method() {
        int result = arg + localVariable;
      }
    }
  }
}
