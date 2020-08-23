import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] value = new int[n];
        int sum =0;
        for(int i=0;i<value.length;i++){
            value[i] = s.nextInt();
            sum = sum + value[i];
        }

        Arrays.sort(value); int sum2 = 0;int count=0;
        for(int i = value.length-1 ;i >= 0;i--){
            count++;
            sum2 = sum2 + value[i];
            sum = sum - value[i];
            if( sum2 > sum){
                break;
            }
        }
        System.out.println(count);
    }
}
