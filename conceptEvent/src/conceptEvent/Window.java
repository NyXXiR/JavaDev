package conceptEvent;

public class Window {
  class MyActionListener implements MyListener {

    @Override
    public void action() {

    }


  }


  MyButton myBtn;

  Window() { // ����� ������ �����
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
    new Window();
  }

}
