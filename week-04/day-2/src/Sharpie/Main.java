package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie aSharpie = new Sharpie("green", 50);
        aSharpie.inkAmount=8;
        Sharpie bSharpie = new Sharpie ("black", 20);
        System.out.println(bSharpie.inkAmount);
        aSharpie.use();
        System.out.println(aSharpie.inkAmount);
    }
}
