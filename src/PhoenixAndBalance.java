import java.util.Scanner;

public class PhoenixAndBalance {
    private static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int a = s.nextInt();
            int ans_diff ;


           int sum1=0; int sum2=0 ;
           for(int i=1;i<=a;i++){
               if(i< a/2 || i == a)
                   sum1 += Math.pow(2,i);
               else
                   sum2 += Math.pow(2,i);

           }
            ans_diff = Math.abs(sum1 -sum2);
            System.out.println(ans_diff);

        }
    }
}
