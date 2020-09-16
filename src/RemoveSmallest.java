import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args)  {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();}


            int index;
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++) {
                for (int j = i+1; j < n; j++) {
                    if ( Math.abs(arr[i] - arr[j]) <= 1 && arr[i] >0 && arr[j] >0) {
                        index = arr[i] > arr[j] ? j : i;
                        arr[index] = 0;
                    }
                }

            }


            int count =0;
            for(int i=0;i<n;i++){
                if( arr[i] != 0)
                    count++;
            }

            if(count == 1)
                System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
