package chap07;

public class CarExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car car = new Car();

    for (int i = 0; i < 5; i++) {
      int problemLocation = car.run();

      switch (problemLocation) {
        case 1:
          System.out.println("앞왼 HankookTire로 교체");
          car.frontLeft = new HankookTire("앞왼", 15);
          break;

        case 2:
          System.out.println("앞오 KumhoTire로 교체");
          car.frontRight = new KumhoTire("앞오", 13);
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
