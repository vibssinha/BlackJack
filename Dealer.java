
public class Dealer {
  private int one;
  private int two;

  public Dealer() {
    int ONE = (int) (Math.random() * 10 + 1);
    int TWO = (int) (Math.random() * 10 + 1);
    one = ONE;
    two = TWO;
  }

  public int showCardUno() {
    return one;
  }

  public int showCardTwo() {
    return two;
  }

  public int add() {
    int C = (int) (Math.random() * 10 + 1);
    return C;
  }

}
