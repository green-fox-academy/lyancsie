package Sharpie;

public class Sharpie {
    String color;
    int width;
    static float inkAmount = 100; //if it's static, there is only one inkAmount!
    //when decreasing this value, every object's inkAmount is gonna be decreased (since it belongs to the class)

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public static void use() {
        inkAmount -= 1;
    }
}

