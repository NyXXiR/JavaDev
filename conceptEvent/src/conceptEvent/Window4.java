package conceptEvent;

public class Window4 {
  MyButton myBtn;

  Window4() { // ����� ������ �����
    System.out.println("������ ����");
    MyButton mb = new MyButton();
    this.add(mb);

  }

  void add(MyButton myBtn) {
    this.myBtn = myBtn;
    System.out.println("��ư ����");
  }

  public static void main(String[] args) {
    new Window4();
  }

}
