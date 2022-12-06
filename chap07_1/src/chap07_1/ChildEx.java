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
     * �Ұ��� parent.field2 = "data2"; parent.method3();
     */

    Child child = (Child) parent;

    child.field2 = "yyy";
    child.method3();

    // �ڵ� Ÿ�� ��ȯ���δ� child�� �ʵ�� �޼ҵ带 �� �� ������
    // ���� Ÿ�� ��ȯ(casting)�� ���� �� �� �ִ�.

  }
}
