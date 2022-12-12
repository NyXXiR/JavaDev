package conceptEvent;

public class Window2 implements MyListener {
  MyButton myBtn;

  Window2() { // 사용자 윈도우 만들기
    System.out.println("윈도우 생성");
    MyButton mb = new MyButton();
    this.add(mb);
    mb.addListener(this);

  }

  void add(MyButton myBtn) {
    this.myBtn = myBtn;
    System.out.println("버튼 붙임");
  }

  public static void main(String[] args) {
    new Window2();
  }

  @Override
  public void action() {


  }

}
