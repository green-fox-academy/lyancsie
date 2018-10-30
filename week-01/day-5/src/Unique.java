        public class Unique {
            public static void main(String[] args) {
                System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
            }
            public static int[] unique(int arg[]){
                for(int i=0;i<arg.length;i++){
                for(int j=0;j<arg.length;j++){
                    if(i != j && arg[i]==arg[j]){
                        arg[i]=0; //működik, de nem 100%-os
                    }
                }}
                for(int i=0; i<arg.length;i++){
                    System.out.println(arg[i]);
                }
                return arg;
            }}




