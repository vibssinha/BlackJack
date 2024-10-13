
public class Player {
  private int cardone;
  private int cardtwo;

  public Player() {
    int num = (int) (Math.random() * 10 + 1);
    int numtwo = (int) (Math.random() * 10 + 1);
    cardone = num;
    cardtwo = numtwo;
  }

  public int showCardOne() {
    return cardone;
  }

  public int showCardTwo() {
    return cardtwo;
  }

  public int drawAnother() {
    int num = (int) (Math.random() * 10 + 1);
    return num;
  }

}
