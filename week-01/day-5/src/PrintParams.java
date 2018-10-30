import java.util.Scanner;
public class PrintParams {
    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many?");
        Scanner read = new Scanner(System.in);
        int i=read.nextInt();
        System.out.println(printParams(i));
    }
    public static String[] printParams(int howmany){
        Scanner read = new Scanner(System.in);
        String[] myArray=new String[howmany];
    for(int i=0;i<howmany;i++){
        myArray[i]=read.next();
            }
return myArray; //magic is needed, it's just a pointer
    }
}
