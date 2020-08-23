import java.util.Arrays;
import java.util.Scanner;

public class vanayaAndLanterns {
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int n = S.nextInt(); int l = S.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();
        Arrays.sort(arr);

        Double d = Math.max(arr[0],l-arr[n-1]);
        for(int i=0;i<n-1;i++){
            if( d <= (Math.abs(arr[i]-arr[i+1]) / 2)  )
                d= Math.abs(arr[i]-arr[i+1]) /2;
        }
        System.out.println(String.format("%.10f",d));
    }
}
