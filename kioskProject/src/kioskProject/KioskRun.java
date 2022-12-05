package kioskProject;

import java.util.Scanner;

public class KioskRun {

  Scanner sc = new Scanner(System.in);
  boolean run = true;
  int selectNum = 0;
  int membershipNum = 0;


  {
    while (run) {


      System.out.println("--------------------");
      System.out.println("1.메뉴선택 2.멤버십입력 3.외국어 4.종료");
      System.out.println("--------------------");
      System.out.println("선택> ");
      selectNum = sc.nextInt();

      if (selectNum == 1) {
        // 들어가야 하는 기능: 데이터베이스에서 select해서 가져온 메뉴목록 표시

      }
      if (selectNum == 2) {
        System.out.println("멤버십 번호를 입력하세요");
        System.out.println("핸드폰/멤버십 번호 입력> ");
        membershipNum = sc.nextInt();


        // 이러면 회원정보를 입력할 members 데이터베이스가 필요함
        // 들어갈 정보: name, phoneNumber, membershipNum
        for (int i = 0; i < members.length; i++) {
          // 멤버십번호와 핸드폰번호 중 한 가지와 일치하면 프로세스 진행
          if (membershipNum.equals(phoneNum) || membershipNum.equals(memberShipNum)) {
            // 일반결제 눌렀을때 멤버십번호 눌러도 같은 곳으로 연결되어야 함



          }

        }

      }
      if (selectNum == 3) {
        System.out.println("외국어기능 구현안됨");

      }
      if (selectNum == 4) {

      }

    }
    System.out.println("프로그램 종료");
  }

}

