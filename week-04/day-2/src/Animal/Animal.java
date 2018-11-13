package Animal;

public class Animal {
    static int hunger = 50;
    static int thirst = 50;

    public static void eat(){
        hunger -= 1;
    }

    public static void drink(){
        thirst -= 1;
    }

    public static void play(){
        hunger += 1;
        thirst += 1;
    }

}
