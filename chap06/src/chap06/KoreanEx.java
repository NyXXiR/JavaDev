package chap06;

public class KoreanEx {

  public static void main(String[] args) {

    Korean k1 = new Korean("���ڹ�", "011225-1234567", "����");

    System.out.println(k1.name);
    System.out.println(k1.ssn);
    System.out.println(k1.nation);

    Korean k2 = new Korean("�ӱ���", "000000-0000000");
    System.out.println(k2.name);
    System.out.println(k2.ssn);
    System.out.println(k2.nation);
  }

}
