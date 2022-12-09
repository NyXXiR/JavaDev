package chap09_1;

public class CallListener implements Button.OnClickListener {
  @Override
  public String onClick() {
    return "전화를 겁니다.";
  }

}
