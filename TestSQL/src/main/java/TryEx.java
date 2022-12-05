
import java.sql.*;

// 참고 웹페이지 https://dhan-description.tistory.com/86

public class TryEx {
  private static Connection conn;
  private static final String USER_NAME = "java";
  private static final String USER_PASSWORD = "mysql";
  private static final String PROJECT_NAME = "thisisjava";

  public static void main(String[] args) {



    try {
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/" + PROJECT_NAME + "?serverTimezone=UTC", USER_NAME,
          USER_PASSWORD);
      System.out.println("success");


      /* SQL문 */
      String bookSelector = "select * from book";

      Statement stmt = conn.createStatement();

      ResultSet resultSet = stmt.executeQuery(bookSelector);

      int cnt = 0;

      while (resultSet.next()) {

        String no = resultSet.getString("bookNo");
        String title = resultSet.getString("bookTitle");
        String author = resultSet.getString("bookAuthor");
        String year = resultSet.getString("bookYear");
        String price = resultSet.getString("bookPrice");
        String publisher = resultSet.getString("bookPublisher");
        System.out.println(
            no + "\t" + title + "\t" + author + "\t" + year + "\t" + price + "\t" + publisher);
        cnt += 1;
      }
      resultSet.close();
      stmt.close();
      conn.close();
      System.out.println("disconnected");


    } catch (SQLException e) {

      System.out.println("SQLException" + e);
    }


  }

}

// Statement(java.sql.Statement): Connection으로 연결한 객체에 query 작업을 실행하게 해준다.
// ex) Statement stmt=conn.createStatement();
//
// executeQuery(): 조회문 실행(select, show 등)
// ex) executeQuery("select * from Example")
// executeUpdate(): create, drop, insert(into), delete, update 등 기능 수행
// ex) executeUpdate("drop table Example")


