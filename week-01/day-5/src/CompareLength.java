public class CompareLength {
    public static void main(String[] args) {
        // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
int[] p1 =new int[3];
for(int i=0;i<3;i++){
    p1[i]=(i+1);
}
int[] p2 = new int[2];
for(int i=0;i<2;i++){
    p2[i]=(i+4);
}
  if(p2.length>p1.length){
      System.out.println("p2 has more elements");}
      else{
      System.out.println("p2 has no more elements");
  }
    }
}
