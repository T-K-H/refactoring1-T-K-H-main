/**
 * Judgeクラスは成績を保持し、合否、および、グレードを判定する
 */
public class Judge {
  int score;
  public Judge (int score) {
    this.score = score;
  }
  
  /**
   * 合否を判定する
   * @return 合格であればtrue、そうでなければfalse
   */
  public boolean isPassed() {
    return this.score >= 60;
  }

  /**
   * グレードを返す
   * @return グレードを表現するString
   */
  public String grade() {
    if (this.score >= 90) {
      return "S";
    }else if (this.score >= 80) {
      return "A";
    }else if (this.score >= 70) {
      return "B";
    }else if (this.score >= 60) {
      return "C";
    }else if (this.score >= 50) {
      return "D";
    }else{
      return "F";
    }
  }

    public static void main(String[] args) {
      Judge judge1 = new Judge(85);
      System.out.println("Score: " + judge1.score);
      System.out.println("Pass: " + judge1.isPassed());
      System.out.println("Grade: " + judge1.grade());

      Judge judge2 = new Judge(45);
      System.out.println("Score: " + judge2.score);
      System.out.println("Pass: " + judge2.isPassed());
      System.out.println("Grade: " + judge2.grade());
  }
}
