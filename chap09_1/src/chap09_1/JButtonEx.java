package chap09_1;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class JButtonEx extends JFrame implements ActionListener {
  Button btn;
  JButton btn1 = new JButton("클릭");
  // JLabel lb = new JLabel("aa");

  JButtonEx() {

    Container c = this.getContentPane();
    btn = new Button("연습", c);
    c.setLayout(null);
    btn.setBounds(100, 30, 80, 50);
    // lb.setBounds(100, 200, 80, 50);
    btn1.setBounds(0, 0, 80, 50);
    c.add(btn);
    // c.add(lb);
    c.add(btn1);
    btn.addActionListener(this);
    this.setLocation(600, 500);
    this.setSize(400, 300);
    this.setVisible(true);

  }

  public static void main(String[] args) {

    new JButtonEx();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    btn.setOnclickListener(new CallListener());
    btn.touch();

  }

}


