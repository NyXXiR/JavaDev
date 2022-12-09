package swing02;

import java.awt.Container;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class WinEx extends JFrame implements ActionListener {
  JTextField tf = new JTextField();
  JButton jb = new JButton("삭제");
  JTextArea ta = new JTextArea();
  StudentDB stu;

  WinEx() throws ClassNotFoundException, SQLException {

    stu = new StudentDB();
    // 레이어상 콘텐트펜을 쓰라고
    Container c = this.getContentPane();
    c.setLayout(null);
    tf.setBounds(100, 0, 80, 30);
    c.add(tf);
    jb.setBounds(200, 0, 80, 30);
    jb.addActionListener(this);
    c.add(jb);
    ta.setBounds(100, 100, 200, 200);
    c.add(ta);
    setVisible(true);
    setSize(600, 400);
    setLocation(100, 100);

  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    new WinEx();


  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    try {
      stu.delete(tf.getText());
    } catch (SQLException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    System.out.println("클릭!!");
  }
}
