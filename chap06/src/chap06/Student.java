package chap06;

public class Student {
  public String name;
  public String hakbun;
  public Scores scores;

  public Student(String name, String hakbun) {

    this.name = name;
    this.hakbun = hakbun;
  }

  public void printScore() {
    System.out.println(hakbun + name + scores.sum());
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", hakbun=" + hakbun + ", scores=" + scores + "]";
  }
}
