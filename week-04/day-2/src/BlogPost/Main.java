package BlogPost;

import PostIT.PostIt;

public class Main {
  public static void main(String[] args) {

    BlogPost post1 = new BlogPost();
    post1.title = "Lorem ipsum";
    post1.authorName = "John Doe";
    post1.publicationDate = "2000.05.04";
    post1.text = "Lorem ipsum dolor sit amet.";

    BlogPost post2 = new BlogPost();
    post2.title = "Wait but why";
    post2.authorName = "Tim Urban";
    post2.publicationDate = "2010.10.10";
    post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost post3 = new BlogPost();
    post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    post3.authorName = "William Turton";
    post3.publicationDate = "2017.03.28";
    post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    BlogPost post4 = new BlogPost();
    post3.title = "AAADAD Engineer Is Trying to Get IBM to Reckon With Trump";
    post3.authorName = "Alan Turton";
    post3.publicationDate = "2010.03.28";
    post3.text = "Jose Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    Blog blog = new Blog();
    blog.add(post1);
    blog.add(post2);
    blog.add(post3);


    blog.delete(0);

    for (int i = 0; i < blog.BlogList.size(); i++) {
      System.out.println(blog.BlogList.get(i));
    }
    blog.update(1,post4);

    for (int i = 0; i < blog.BlogList.size(); i++) {
      System.out.println(blog.BlogList.get(i));
    }
  }
}
