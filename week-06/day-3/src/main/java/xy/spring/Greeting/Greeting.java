package xy.spring.Greeting;

public class Greeting {
  
  private int longId;
  private String content;
  
  public Greeting(int longId, String content) {
    this.longId = longId;
    this.content = content;
  }
  
  public int getLongId() {
    return longId;
  }
  
  public String getContent() {
    return content;
  }
  
}
