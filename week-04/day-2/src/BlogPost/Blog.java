package BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> BlogList = new ArrayList<BlogPost>();

   public void add(BlogPost blogPost) {
    BlogList.add(blogPost);
  }

  public void delete(int index) {
    if (index < BlogList.size()) {
      BlogList.remove(index);
    }
  }

  public void update(int index, BlogPost blogPost) {
    if (index < BlogList.size()) {
      BlogList.set(index, blogPost);
    }
  }
}