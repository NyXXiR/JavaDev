package conceptEvent;

public class Window2 implements MyListener {
  MyButton myBtn;

  Window2() { // ����� ������ �����
    System.out.println("������ ����");
    MyButton mb = new MyButton();
    this.add(mb);
    mb.addListener(this);

  }

  void add(MyButton myBtn) {
    this.myBtn = myBtn;
    System.out.println("��ư ����");
  }

  public static void main(String[] args) {
    new Window2();
  }

  @Override
  public void action() {


  }

}
