package PostIT;

public class Main {


    public static void main(String[] args) {

        PostIt obj1 = new PostIt();

        obj1.backgroundColor = "orange";
        obj1.text = "Idea 1";
        obj1.textColor = "blue";

        PostIt obj2 = new PostIt();

        obj2.text = "Awesome!";
        obj2.textColor = "black";
        obj2.backgroundColor="pink";

        PostIt obj3 = new PostIt();

        obj3.text = "Superb!";
        obj3.textColor = "green";
        obj3.backgroundColor = "yellow";

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
