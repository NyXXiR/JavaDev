package conceptEvent;

public class MyButton {

  MyListener myListener;

  void addListener(MyListener myListener) {
    this.myListener = myListener;
    System.out.println("������ ����!");
  }


}
