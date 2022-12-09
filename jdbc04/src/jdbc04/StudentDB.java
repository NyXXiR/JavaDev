package jdbc04;

import java.sql.*;

public class StudentDB {

  Connection conn;
  Statement stmt;
  ResultSet rs;

  StudentDB() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
  }

  void selectAll() throws SQLException {
    stmt = conn.createStatement();
    rs = stmt.executeQuery("select * from student");
    while (rs.next()) {
      int id = rs.getInt("id");
      String name = rs.getString("name");
      String hakbun = rs.getString("hakbun");
      String address = rs.getString("address");

      System.out.printf("[%d] %s %s %s \n", id, name, hakbun, address);
    }

  }

  void insert() {
    stmt = conn.createStatement();
    int result = stmt.executeUpdate(
        "insert in;to student values(0,'" + name + "','" + hakbun + "','" + address + "')");

  }

  void delete(int num) throws SQLException {
    stmt = conn.createStatement();
    int result = stmt.executeUpdate("delete from student where name=??? ", num);

  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // TODO Auto-generated method stub
    StudentDB sd = new StudentDB();



  }

}
