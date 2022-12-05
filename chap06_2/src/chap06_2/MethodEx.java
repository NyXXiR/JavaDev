package chap06_2;

public class MethodEx {

  int plus(int a, int b) {
    return (a + b);
  }
  // 오버로딩은 클래스 타입/메소드가 같고 뒤에 () 내부의 매개변수 타입, 개수, 순서가 다르다.
  // 리턴 타입은 오버로딩 대상이 아니다(같은 것으로 인식함)
  // int method() {}

  double plus(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
