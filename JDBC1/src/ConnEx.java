import java.sql.*;


public class ConnEx {
  private static final String USER_NAME = "java";
  private static final String USER_PASSWORD = "mysql";
  private static final String PROJECT_NAME = "thisisjava";

  public static void main(String args[]) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("����̹� ����");
    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/" + PROJECT_NAME + "?serverTimezone=UTC", USER_NAME,
        USER_PASSWORD);
    System.out.println("���� ����");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select * from student where id=0");


  }
}
