public class VarArgs {
    public static void main(String[] args) {
        sum(1,3,4);
        sum(1,2);
        sum(10,11,13,14);
    }

    public static int sum(int... values){
        //for(type iterating variable:array)
        int sum=0;
        for(int i:values){
            sum=sum+i;
        }
        System.out.println(sum);
      return sum;
    }
}
