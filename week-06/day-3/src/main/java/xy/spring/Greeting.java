package xy.spring;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  
  private long id;
  private String content;
  
  private static AtomicLong x = new AtomicLong();
  
  public Greeting(long longId, String content) {
    this.id = longId;
    this.content = content;
  }
  
  public long getLongId() {
    id = x.incrementAndGet();
    return id;
  }
  
  public String getContent() {
    return content;
  }
  
}
