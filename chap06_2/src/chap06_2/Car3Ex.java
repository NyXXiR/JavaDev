package chap06_2;

public class Car3Ex {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car3 myCar = new Car3();

    myCar.setGas(5); // myCar�� setGas()�޼ҵ带 ȣ���Ͽ���

    boolean gasState = myCar.isLeftGas();
    if (gasState) {
      System.out.println("���~");
      myCar.run();
    }
    if (myCar.isLeftGas()) {
      System.out.println("������ ������ �ʿ� ����");

    } else {
      System.out.println("���� ���� �ʿ�");
    }

  }

}
