package chap05;

public class Baa {
  int a;

  void bbb() {
    System.out.println(a);
  }

  int ccc() {
    return (Integer) a + 10;
  }

  void ddd(int a) {
    bbb();
    this.bbb();
  }

  int eee(int a) {
    return 20;
  }
}
