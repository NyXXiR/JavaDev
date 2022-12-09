package chap09_1;

public class ButtonEx {
  public static void main(String[] args) {
    Button btn = new Button();

    btn.setOnlickListener(new CallListener());
    btn.touch();

    btn.setOnlickListener(new MessageListener());
    btn.touch();
  }
}
