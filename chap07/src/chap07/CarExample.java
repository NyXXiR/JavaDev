package chap07;

public class CarExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car car = new Car();

    for (int i = 0; i < 5; i++) {
      int problemLocation = car.run();

      switch (problemLocation) {
        case 1:
          System.out.println("�տ� HankookTire�� ��ü");
          car.frontLeft = new HankookTire("�տ�", 15);
          break;

        case 2:
          System.out.println("�տ� KumhoTire�� ��ü");
          car.frontRight = new KumhoTire("�տ�", 13);
          break;

        case 3:
          break;

        case 4:
          break;
      }
      System.out.println("----------------------------");
    }
  }

}
