import java.util.Scanner;

public class kefaSubarray {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(maxSubarr(arr,n));
    }
    static int maxSubarr(int[] arr,int m){
        int max =1; int count=1;

        for(int i=0;i<m-1;i++){

            if( arr[i]<=arr[i+1] )
                count++;
            else
                count=1;

            max = Math.max(max,count);
        }
        return max;
    }
}

