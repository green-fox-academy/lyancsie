package Pirates;

import java.util.Random;

public class Pirate {
  public int getCount() {
    return count;
  }

  private int count = 0;
  private boolean isAlive = true;
  public int state = 0;             //0=alive 1=passed out 2=died
  private boolean isPassedOut = false;
  public boolean isCaptain = false;

  public void drinkSomeRum() {
    if (state == 0) {
      count += 1;
      //System.out.println("Drinking complete.");
    } else
      System.out.println("He's dead or passed out.");
  }

  public void howsItGoingMate() {
    if (state == 0 || state == 1) {
      if (count < 4) {
        System.out.println("Pour me anudder!");
      } else if(state != 2 && count >= 4) {
        state = 1;
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    } else
      System.out.println("He's dead.");

  }

  public void die() {
    state = 2;
  }

  public void brawl(Pirate x) {
    Random rand = new Random();
    int n = rand.nextInt(3);
    System.out.println("n = " + n);
    if (n == 1) {
      this.die();
    } else if (n == 2) {
      x.die();
    } else {
      this.die();
      x.die();
    }
  }
}
