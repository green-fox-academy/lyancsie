public class ReverseElements {
    public static void main(String[] args) {

        int aj[] = {3, 4, 5, 6, 7};
        int temp = 0;
        for (int i = 0; i < aj.length/2; i++) {
            temp=aj[i];
            aj[i]=aj[aj.length-i-1];
            aj[aj.length-i-1]=temp;
        }
        for(int i=0;i<aj.length;i++){
            System.out.println(aj[i]);
        } // páros és páratlan számúra is működik, tesztelve
    }}