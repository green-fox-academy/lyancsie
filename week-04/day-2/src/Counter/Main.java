package Counter;

public class Main {
    public static void main(String[] args) {
Counter x = new Counter();
Counter y = new Counter(5);

        System.out.println(x.number);
        x.add(8);
        x.reset();
        System.out.println(x.number);
        System.out.println(y.number);
    }
}
