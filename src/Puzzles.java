import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int m = s.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i =0;i<=m-n;i++){
        { if( (Math.abs(arr[i] - arr[i+n-1] )) <= diff)
             diff = Math.abs(arr[i] - arr[i+n-1]);
           }}

        System.out.println(diff);
    }
}
