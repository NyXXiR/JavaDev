package chap07_1;

public class Dog extends Animal {

  public Dog() {
    this.kind = "������";
  }

  @Override
  public void sound() {
    // TODO Auto-generated method stub
    System.out.println("bark bark");
  }

}
