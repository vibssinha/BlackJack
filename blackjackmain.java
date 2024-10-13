import java.util.Scanner;

public class blackjackmain {

  public static void main(String[] args) {
    Dealer first = new Dealer();
    int dealerTotal = first.showCardUno() + first.showCardTwo();
    System.out.println("Welcome to single player Black Jack no aces");
    System.out.println("The dealers first card is " + first.showCardUno());
    Player one = new Player();
    int sum = (one.showCardOne() + one.showCardTwo());
    System.out.println("Your first card is " + one.showCardOne() + " and your second card is "
        + one.showCardTwo() + " meaning your total is " + sum);
    System.out.println("Would you like to draw another card?");
    Scanner s = new Scanner(System.in);
    String x = s.nextLine();
    while (x.equalsIgnoreCase("yes")) {
      sum += one.drawAnother();
      if (sum > 21) {
        System.out.println("Your total is " + sum);
        x = "no";
      } else if (sum < 21) {
        System.out.println("Your total is " + sum + ". Would you like to draw another?");
        Scanner a = new Scanner(System.in);
        x = a.nextLine();
      } else {
        System.out.println("Your total is 21");
        x = "no";
      }
    }
    if (sum > 21) {
      System.out.println("You lost");
    } else {
      while (dealerTotal < 15) {
        dealerTotal += first.add();
      }
      System.out.println("The dealers second card is " + first.showCardTwo()
          + " and with any potential added cards, it makes the dealers total is " + dealerTotal);
      if (dealerTotal > 21) {
        System.out.println("You win! :)");
      } else if (sum > dealerTotal) {
        System.out.println("You win!!! :)");
      } else if (sum < dealerTotal) {
        System.out.println("You lost :(");
      } else {
        System.out.println("It's a draw :/");
      }
    }
  }
}
