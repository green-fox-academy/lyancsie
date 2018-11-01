import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
//improved to n dimensions
//checked --> works
        Scanner read = new Scanner(System.in);
        int size = 0;
        while (size < 1) {
            System.out.println("I'mma draw a diagonal matrix. How many dimensions do you want?");
            size = read.nextInt();
        }
        int[][] diagonalMatrix = new int[size][size];
        for (int i = 0; i < diagonalMatrix.length; i++) {
            diagonalMatrix[i][i] = 1;
        }
        for (int i = 0; i < diagonalMatrix.length; i++) {
            for (int j = 0; j < diagonalMatrix.length; j++) {
                System.out.print(diagonalMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

