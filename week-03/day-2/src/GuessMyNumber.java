import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        System.out.println("Gimmie the range (for example: 1 100): ");
        Scanner read = new Scanner(System.in);
        int min = read.nextInt();
        int max = read.nextInt();
        Random random = new Random();
        int rand = random.nextInt(max + 1 - min) + min;
        int lives = 5;
        System.out.println("Give me your guess!");
        while (lives > 0) {
            int guess = read.nextInt();
            if (guess == rand) {
                System.out.println("You've won! Wanna play again? Y/N");
                String wannaplay = read.next();
                if (wannaplay.equals("Y") || wannaplay.equals("y")) {
                    game();
                } else System.exit(0);
            } else {
                if (guess > rand) {
                    lives -= 1;
                    System.out.println("Too big! Your remaining lives: " + lives);
                    System.out.println("Give me your guess!");
                } else {
                    lives -= 1;
                    System.out.println("Too small! Your remaining lives: " + lives);
                    System.out.println("Give me your guess!");

                }
            }
        }

        if (lives == 0) {
            System.out.println("Game over! Wanna play again? Y/N");
            String wannaplay = read.next();
            if (wannaplay.equals("Y") || wannaplay.equals("y")) {
                game();
            } else System.exit(0);
        }
    }
}