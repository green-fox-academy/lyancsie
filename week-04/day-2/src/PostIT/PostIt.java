package PostIT;

public class PostIt {
    public String backgroundColor;
    String text;
    String textColor;

    @Override
    public String toString() {
        return "PostIt{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
