import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0; z<T;z++){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            int min= Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                if(min > Math.abs(arr[i]-arr[i+1])){
                    min = Math.abs(arr[i] - arr[i+1]);
                }
            }
            System.out.println(min);
        }
    }
}
