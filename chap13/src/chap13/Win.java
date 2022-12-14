package chap13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Win extends JFrame {
  JButton jb1 = new JButton("새 창");
  JFrame fr1;

  Win() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = this.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(jb1);
    this.setSize(400, 300);
    this.setLocation(500, 500);
    this.setVisible(true);

    jb1.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        jb1.setEnabled(false);
        fr1 = new JFrame("새 창");
        JButton bt1 = new JButton("담기");
        Container c = fr1.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(bt1);

        fr1.setSize(400, 300);
        fr1.setLocation(500, 500);
        fr1.setVisible(true);
        bt1.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
            fr1.setVisible(false);
            jb1.setVisible(true);
          }


        });

      }


    });
  }

  public static void main(String[] args) {
    new Win();
  }
}
