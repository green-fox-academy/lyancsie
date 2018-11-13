package BlogPost;

import java.util.Date;

public class BlogPost {
    String authorName = new String ();
    String title = new String ();
    String text = new String ();
    String publicationDate = new String();

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
