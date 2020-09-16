import java.util.Scanner;

public class EvenArray {
private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++ )
                arr[i] = s.nextInt();

            int outOfPlaceEven = 0;
            int outOfPlaceOdd = 0;
           for(int i=0;i<n;i++){
               if( i%2 ==0){
                   if(arr[i]%2 != 0)
                       outOfPlaceOdd++;
               }
               if(i%2 !=0){
                   if(arr[i]%2 == 0)
                       outOfPlaceEven++;
               }
           }
           if(outOfPlaceEven == outOfPlaceOdd)
               System.out.println(outOfPlaceEven);
           else System.out.println("-1");
        }
    }

}
