import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String a ="hello";String b= "world";
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
        long x1 = s.nextLong();
        long x2 = s.nextLong();
        long x3 = s.nextLong();
        long x4 = s.nextLong();
        long[] arr = new long[]{x1,x2,x3,x4};
        Arrays.sort(arr);
        System.out.println((arr[3] - arr[2]) + " " + (arr[3] - arr[1]) + " " + (arr[3] - arr[0]));
    }
}