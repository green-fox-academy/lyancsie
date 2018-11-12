import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.util.Arrays;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"
           System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"
           System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String src) {
        Path source = Paths.get(src);
        String statusArray[][] = new String[3][3];
        List<String> status = new ArrayList<String>();
        try {
            status = Files.readAllLines(source);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < status.size(); i++) {
            for (int j = 0; j < status.size(); j++) {
                statusArray[i][j] = String.valueOf(status.get(i).charAt(j));
                //System.out.println(statusArray[i][j]);
            }
        }
        int oCount = 0;
        int xCount = 0;
        for (int i = 0; i < statusArray.length; i++) { //normal diagonal
            if (statusArray[i][i].equals("O")) {
                oCount += 1;
                xCount = 0;
                if (oCount == 3) {
                    return "O won";
                }
            } else {
                oCount = 0;
                xCount += 1;
                if (xCount == 3) {
                    return "X won";
                }
            }
        }
        oCount = 0;
        xCount = 0;
        for (int j = 0; j < statusArray.length; j++) {                    //inverse diagonal (does not work)
            if (statusArray[statusArray.length - j - 1][j].equals("O")) {
                oCount += 1;
                xCount = 0;
                if (oCount == 3) {
                    return "O won";
                } else {
                    xCount += 1;
                    oCount = 0;
                    if (xCount == 3) {
                        return "X won";
                    }
                }

            }
        }
        oCount = 0;
        xCount = 0;
        for (int i = 0; i < status.size(); i++) {                           //horizontal check in the list
            if (status.get(i).equals("OOO")) {
                return "O won";
            }
            if (status.get(i).equals("XXX")) {
                return "X won";
            }
        }

            for (int j = 0; j < statusArray.length; j++) {
                for (int i = 0; i < statusArray.length; i++) {
                    if (statusArray[i][j].equals("O")) {
                    oCount += 1;
                    xCount = 0;
                    if (oCount == 3) {
                        return "O won";
                    }
                } else {
                    xCount += 1;
                    oCount = 0;
                    if (xCount == 3) {
                        return "X won";
                    }
                }
            }
        }
        return "Draw";
    }
}