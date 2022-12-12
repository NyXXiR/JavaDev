package usedItemProject;

import java.sql.SQLException;
import java.util.Scanner;

public class projectEx {



  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Scanner sc = new Scanner(System.in);
    int selectNum = 0;
    boolean run = true;
    ItemDB sd = new ItemDB();

    // 각 번호 입력받아 CRUD 가능하게 구현해둠.
    System.out.println("1.select 2.insert 3.delete");


    while (run) {
      selectNum = sc.nextInt();
      if (selectNum == 1) {
        sd.selectData();
      }
      if (selectNum == 2) {
        sd.insertData();
      }
      if (selectNum == 3) {
        sd.deleteData(null);

      }
      // sd.selectAll();
      // sd.deleteData(null);
    }
  }
}
