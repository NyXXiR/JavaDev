package chap07_1;

public class DriverEx {
  public static void main(String[] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();
    Vehicle benz = new Vehicle();
    driver.drive(bus);
    driver.drive(taxi);
    driver.drive(benz);
  }
}
