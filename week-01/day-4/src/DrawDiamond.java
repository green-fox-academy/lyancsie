import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Gimmie a number: ");
        int howMany = read.nextInt();
        //condition check
        String space = "";
        for (int i=1; i < howMany; i++) {
            space = space + " ";
            //setting the initial number of spaces

            // Check: System.out.println(space);
        }

        String star="*"; //setting the initial number of stars
        for(int k=1;k<howMany;k++)
        {space=space.substring(0,space.length()-1);
        System.out.print(space);
        System.out.print(star);
        System.out.println();
        star=star+"**";}

        star=star.substring(0, star.length() -2);
        space=space+" ";

        for(int k=howMany;k>0;k--){
            if(star.length() > 2){
                    star=star.substring(0, star.length() -2);
            System.out.print(space);
            System.out.print(star);
            space=space+" ";
            System.out.println();}
        }}}