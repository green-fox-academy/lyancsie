import java.util.Scanner;
public class PartyIndicator{
        public static void main(String[] args) {

            {
                Scanner read = new Scanner(System.in);
                System.out.println("How many girls r comin?");
                int girls = read.nextInt();
                System.out.println("How many boys r comin?");
                int boys=read.nextInt();
                if (girls == 0){
                    System.out.println("Sausage party");}
                    else if(girls==boys && girls+boys>=20){System.out.println("Excellent");}
                    else if (girls==boys && girls!=boys){
                    System.out.println("Quite cool party");}
                        else if ((girls+boys)<20){
                            System.out.println("Avg party");}

                        }
                }
}
