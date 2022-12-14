package chap13;

import java.sql.*;
import java.util.*;

public class StudentDao {
  Connection conn;
  PreparedStatement pstm;
  ResultSet rs;


  void connect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "mysql");
      System.out.println("thisisjava connected");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  int insert(Student stu) {
    String sql = "insert into Student(name, hakbun, address) values (?,?,?)";
    try {
      pstm = conn.prepareStatement(sql);
      pstm.setString(1, stu.name);
      pstm.setString(2, stu.hakbun);
      pstm.setString(3, stu.addr);

      // try-catch했으니까 아래 return 0까지 안 가겠다는 의미
      return pstm.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        pstm.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return 0;

  }

  List<Student> select() {
    List<Student> lst = new ArrayList<Student>();
    String sql = "select id, name, hakbun, address from student";
    try {
      pstm = conn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Student stu = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

        System.out.println(rs.getInt(1) + ", ");
        System.out.println(rs.getString(2) + ", ");
        System.out.println(rs.getString(3) + ", ");
        System.out.println(rs.getString(4) + ", ");


        System.out.println(rs.getInt(1) + ", ");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    StudentDao dao = new StudentDao();
    dao.connect();
    List<Student> list = dao.select();
    for (Student stu : list) {
      System.out.println(stu);
    }
    int res = dao.insert(new Student(999, "김기쁨", "15", "강남구"));
    System.out.println(res + "건이 처리되었습니다.");

  }

}
