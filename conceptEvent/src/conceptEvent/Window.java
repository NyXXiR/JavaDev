package conceptEvent;

public class Window {
  class MyActionListener implements MyListener {

    @Override
    public void action() {

    }


  }


  MyButton myBtn;

  Window() { // 사용자 윈도우 만들기
    System.out.println("윈도우 생성");
    MyButton mb = new MyButton();
    this.add(mb);
    mb.addListener(new MyActionListener());

  }

  void add(MyButton myBtn) {
    this.myBtn = myBtn;
    System.out.println("버튼 붙임");
  }

  public static void main(String[] args) {
    new Window();
  }

}
