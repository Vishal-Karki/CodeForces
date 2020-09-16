import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] DrinkPrices = new int[n];
        for (int i = 0; i < n; i++) {
            DrinkPrices[i] = s.nextInt();
        }
        Arrays.sort(DrinkPrices);

        int days = s.nextInt();
        for (int i = 0; i < days; i++) {
            int money = s.nextInt();

            if( money < DrinkPrices[0])
                System.out.println(0);
            else if( money >= DrinkPrices[n-1])
                System.out.println(n);
            else
            System.out.println(binary(DrinkPrices,money)+1);

        }
    }
    static int binary(int[] arr, int k){
        int left =0;
        int ans = 0;
        int right = arr.length -1;
        int mid ;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid] <= k){
                ans = mid;
                left = mid +1 ;
            }else
                right = mid -1;
        }
        return ans;
    }
}
