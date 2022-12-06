package chap07_1;

public class ChildEx {
  public static void main(String[] args) {

    Parent p2 = new Child();
    Child c2 = (Child) p2;


    if (p2 instanceof Child) {
      System.out.println("true");
    }


    Parent parent = new Child();
    parent.field1 = "data1";

    parent.method1();
    parent.method2();

    /*
     * 불가능 parent.field2 = "data2"; parent.method3();
     */

    Child child = (Child) parent;

    child.field2 = "yyy";
    child.method3();

    // 자동 타입 변환으로는 child의 필드와 메소드를 쓸 수 없지만
    // 강제 타입 변환(casting)을 쓰면 쓸 수 있다.

  }
}
