package chap06;

public class ScoreEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Student stu = new Student("hong", "01");

    Scores sco = new Scores(89, 91, 88);
    int sum = sco.sum();
    stu.scores = sco;
    System.out.println(stu);
    System.out.println("รัมก :" + sum);
    stu.printScore();
  }

}
