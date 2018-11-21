package Comparable;

public class Domino implements Comparable {
  
  private final int left;
  private final int right;
  
  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }
  
  public int getLeftSide() {
    return left;
  }
  
  public int getRightSide() {
    return right;
  }
  
  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
  
  @Override
  public int compareTo(Object o) {
    Domino myDomino = (Domino) o;
    if (this.getLeftSide() < myDomino.getLeftSide()) {
      return -1;
    } else if (this.getLeftSide() == myDomino.getLeftSide()) {
      return 0;
    } else return 1;
  }
}
