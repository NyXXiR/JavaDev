package chap05;

public class StringEqualsExample {

  public static void main(String[] args) {

    // 148p
    String strVar1 = "�Ź�ö";
    String strVar2 = "�Ź�ö";


    int[] x = {};
    int y[] = null;
    int[] z = new int[] {};



    if (strVar1 == strVar2) {
      System.out.println("strVar1�� strVar2�� ���� ���� ������");


    } else {
      System.out.println("strVar1�� strVar2�� ������ �ٸ���");

    }

    if (strVar1.equals(strVar2)) {

    }


  }

}

// 4 3 2 2 3
