package chap08;

public class RCEx {

  public static void main(String[] args) {

    RemoteControl rs2 = new RemoteControl() {

      public void turnOn() {
        System.out.println("on");
      }

      public void turnOff() {
        System.out.println("off");
      };

      public void setVolume(int volume) {
        System.out.println("good");
      }
    };
    rs2.turnOn();
    rs2.turnOff();

  }
}
