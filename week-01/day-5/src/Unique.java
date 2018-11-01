public class Unique {
    public static void main(String[] args) {
        System.out.println((unique(new Integer[]{1, 11, 34, 11, 52, 61, 1, 34})));
    }

    public static String unique(Integer arg[]) {
        int num = 0;
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg.length; j++) {
                if (i != j && arg[i] == arg[j] && arg[i] != null && arg[j] != null) {
                    arg[i] = null; //működik, de nem 100%-os
                    num = num + 1;
//teszt a num-ra    System.out.println("num = " + num);
                }
            }
        }
        Integer myNewArray[] = new Integer[arg.length - num];
        for (int i = 0; i < arg.length - num; i++) {
            if (arg[i] != null) {
                for (int j = 0; j < myNewArray.length - 1; j++) {
                    myNewArray[j] = arg[i];

                }
            }

        }
        return myNewArray.toString();

    }
}





