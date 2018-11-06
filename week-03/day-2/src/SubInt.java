public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static String[] subInt(int id, int[] list) {
        String[] output = new String[list.length];
        String[] list2 = new String[list.length];
        for (int i = 0; i < list2.length; i++) {
            for(int j= 0; j < (list2[j].length()); j++){
                if(list2[j].equals(id)){}
            }
         //   for(int j = 0; j < list.)
        }
        return list2;
    }
}
