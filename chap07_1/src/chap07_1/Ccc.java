package chap07_1;

class Abs {
}


public class Ccc extends Abs {
  public static void main(String[] args) {
    // 추상 클래스: 생성은 안 되고 상속은 되는 클래스
    // 부모 역할만 맡음.
    // Abs aa = new Abs(); > 불가능
    Ccc cc = new Ccc();
  }
}
