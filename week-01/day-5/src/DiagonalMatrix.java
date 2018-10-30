public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] diagonalMatrix=new int[4][4];
        for(int i=0; i<diagonalMatrix.length; i++){
            diagonalMatrix[i][i]=1;
        }
        for(int i=0;i<diagonalMatrix.length;i++){
            for(int j=0;j<diagonalMatrix.length;j++) {
                System.out.print(diagonalMatrix[i][j]);

            }
            System.out.println();
            }
        }
    }

