import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt(); int count;
        for(int i=0;i<T;i++){
            ArrayList<Integer> ans = new ArrayList<>();
            count=0;
            int number = s.nextInt();  int a = number;
            if(number <= 9 || isRound(number)){
                System.out.println(1);
                System.out.println(number);
            }
            else{ int size = 1;
                while(a > 0){
                    if( a%10 != 0 ){
                        ans.add((a%10)*size); count++;
                    }
                    a=a/10; size*=10;
                }
                System.out.println(count);
                for(int k=0;k<ans.size();k++)
                    System.out.print(ans.get(k)+" ");
                System.out.println();

            }

        }
    }
    private static boolean isRound(int a){
        while(a>10){
            int rem = a%10;
            if(rem != 0)
                return false;
            a=a/10;
        }
        return true;
    }
}
