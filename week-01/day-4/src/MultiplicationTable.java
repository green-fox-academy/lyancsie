import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Gimmie a number: ");
        Scanner read = new Scanner(System.in);
        int a=read.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(i+" * "+ a +" = " + i*a);
}
    }}
