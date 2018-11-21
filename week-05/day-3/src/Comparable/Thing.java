package Comparable;

public class Thing implements Comparable {
  
  private String name;
  private boolean completed;
  
  public Thing(String name) {
    this.name = name;
  }
  
  public void complete() {
    this.completed = true;
  }
  
  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
  
  @Override
  public int compareTo(Object o) {
    if (completed && ((Thing) o).completed) {
      return 0;
    } else if (completed && !((Thing) o).completed)
      return 1;
    else {
      return -1;
    }
  }
}

