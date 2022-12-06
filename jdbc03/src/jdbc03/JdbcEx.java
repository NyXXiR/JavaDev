package jdbc03;

import java.sql.*;

public class JdbcEx {
  static Connection conn = null;
  static Statement stmt = null;
  static ResultSet rs = null;

  public static void connect() throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("install complete");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
    System.out.println("접속 완료");
  }



  public static void selectAll() throws SQLException {
    stmt = conn.createStatement();
    rs = stmt.executeQuery("select * from student");
    if (rs.next()) {
      int id = rs.getInt("id");
      String name = rs.getString("name");
      String hakbun = rs.getString("hakbun");
      String address = rs.getString("address");
      System.out.println(name + "," + hakbun + "," + address);
    }
  }

  public static void insert(String name, String hakbun, String address) throws SQLException {
    stmt = conn.createStatement();
    int result = stmt.executeUpdate(
        "insert into student values(0,'" + name + "','" + hakbun + "','" + address + "')");


  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    connect();
    insert("이름", "학번", "주소");
    selectAll();


  }
}

