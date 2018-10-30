import java.util.Arrays;
public class Colors {
    public static void main(String[] args) {
        // - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
String myArray[][]=new String[3][3];
String green[] = {"lime", "forest green", "olive", "pale green", "spring green"};
String red[]={"orange red", "red", "tomato", ""};
String violet[]={"orchid", "violet", "pink", "hot pink"};
myArray[0]=green;
myArray[1]=red;
myArray[2]=violet;
for(int i=0;i<myArray.length;i++){
    System.out.println(Arrays.toString(myArray[i]));
}
    }}

