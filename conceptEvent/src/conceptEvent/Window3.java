package conceptEvent;


class MyActionListener implements MyListener {

  @Override
  public void action() {

  }

}


public class Window3 {
  MyButton myBtn;

  Window3() { // ����� ������ �����
    System.out.println("������ ����");
    MyButton mb = new MyButton();
    this.add(mb);
    mb.addListener(new MyActionListener());

  }

  void add(MyButton myBtn) {
    this.myBtn = myBtn;
    System.out.println("��ư ����");
  }

  public static void main(String[] args) {
    new Window3();
  }

}
