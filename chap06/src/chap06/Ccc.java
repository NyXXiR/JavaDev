package chap06;

class Ddd {
}


public class Ccc {
  Ddd a;

  void mmm(Ddd d) {
    a = d;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Ccc c = new Ccc();
    Ddd d = new Ddd();
    c.mmm(d);
    c.a = d;
  }

}
