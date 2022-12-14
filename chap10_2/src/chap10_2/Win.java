package chap10_2;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;

public class Win extends JFrame {
  JLabel jb = new JLabel("여기");
  JTextField tf = new JTextField("검색", 10);
  JButton btn = new JButton("클릭");

  Win() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = this.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(jb);
    c.add(tf);
    c.add(btn);
    Thread th = new Thread() {
      public void run() {
        for(;;) { LocalDateTime now = LocalDateTime.now();
        jb.setText(now.getSecond() + "초");
      }
    }
   
    btn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // 텍스트박스에 입력한 값을 받아서 sout
        try {
          int num = Integer.parseInt(tf.getText());
          System.out.println(num);

          if (num >= 100) {
            throw new MyNumException("100 이상");
          }
        } catch (NumberFormatException event) {
          JOptionPane.showMessageDialog(null, "조졋다리");
          event.printStackTrace();
          System.out.println("숫자만 입력!");
        } catch (MyNumException event2) {
          System.out.println("예외 발생");
        } finally {
          JOptionPane.showMessageDialog(null, "end!");
        }

      }
    
    };
    tf.addFocusListener(new FocusListener() {

      @Override
      public void focusGained(FocusEvent e) {

      }

      @Override
      public void focusLost(FocusEvent e) {

      }



    });
    this.setLocation(500, 400);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new Win();
  }

}
