import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwap {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T= s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt(); int t = s.nextInt();

            int[] one = new int[n];
            int[] second = new int[n];

            for(int i=0;i<n;i++){
                one[i] =s.nextInt();
            }
            for(int i=0;i<n;i++){
                second[i] =s.nextInt();
            }

            Arrays.sort(one);
            Arrays.sort(second);

            int end = n-1, start =0;
            for (int i=0;i<t;i++){
                if(one[start] < second[end] ){
                    one[start] = second[end];
                    start++; end--;
                }else break;

            }

            int sum =0;
            for(int i=0;i<n;i++){
                sum += one[i];
            }
            System.out.println(sum);

        }
    }
}
