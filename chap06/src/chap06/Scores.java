package chap06;

public class Scores {
  private int kor;
  private int math;
  private int eng;

  public Scores(int kor, int math, int eng) {
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }

  public int sum() {
    int sum = kor + math + eng;
    return sum;
  }



  @Override
  public String toString() {
    return "Scores [kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
  }

}
