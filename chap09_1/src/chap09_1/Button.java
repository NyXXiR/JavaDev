package chap09_1;

import java.awt.Container;
import javax.swing.*;

public class Button extends JButton {
  OnClickListener listener;
  JLabel lb = new JLabel("¿©±â¿¡");

  Button(String str, Container c) {
    super(str);
    this.setBounds(100, 30, 80, 50);
    lb.setBounds(100, 200, 80, 50);
    c.add(lb);

  }

  void setOnclickListener(OnClickListener listener) {
    this.listener = listener;

  }

  void touch() {
    lb.setText(listener.onClick());
    System.out.println(listener.onClick());

  }

  interface OnClickListener {
    String onClick();
  }

}
