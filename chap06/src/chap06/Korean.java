package chap06;

public class Korean {
  // �ʵ�
  String nation = "���ѹα�";
  String name;
  String ssn;

  // ������
  public Korean(String name, String ssn, String nation) {

    // �˾ƺ��� ���� n,s ���� ����ϴ� ��� �������� this�� ����Ͽ���.
    // name=n;
    // ssn=s;
    this.name = name;
    this.ssn = ssn;
    this.nation = nation;
  }

  public Korean(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }
}

