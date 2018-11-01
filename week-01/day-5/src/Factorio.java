import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Gimmie the number: ");
        int index = read.nextInt();
        System.out.println(factorio(index));
    }

    public static int factorio(int i) {
        int res = 1;
        for (int k = 1; k <= i; k++) {
            res = res * k;
        }
        return res;
    }
}

