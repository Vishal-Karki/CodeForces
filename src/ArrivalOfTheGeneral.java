import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       int n =s.nextInt();
       int[] arr = new int[n];
       int[] ordered = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = s.nextInt();
            ordered[i]=arr[i];
       }
        Arrays.sort(ordered);
        int min = ordered[0]; int max = ordered[n-1];
        boolean flagmax = false;
        int indexMin = 0,indexMax=0;
        for(int i=0;i<n;i++){
            if(arr[i] == min ){
                indexMin = i; }
            if(arr[i] == max &&  !flagmax){
                indexMax = i; flagmax = true;}
            }
        int mindis = n-1-indexMin; int maxdis = indexMax; int ans ;
        if(indexMax < indexMin)
            ans = mindis + maxdis;
        else
            ans = mindis + maxdis -1;

        System.out.print(ans);

    }
}
