import java.util.Scanner;

public class ArrayWithOddSum {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int[] arr = new int[n];
            int EvenCount= 0;
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
                if(arr[i] %2 == 0){
                    EvenCount++;
                }
            }
            int OddCount = n - EvenCount;
            if(EvenCount != 0 && EvenCount < n){
                System.out.println("YES");
            }else if(OddCount == n){
                if (n % 2 == 0) {
                    System.out.println("NO");
                }else System.out.println("YES");
            }else if(EvenCount == n){
                System.out.println("NO");
            }




        }
    }
}
