import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NegativePrefixes {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            int[] locked = new int[n];
            for(int i=0;i<n;i++){
                locked[i] = s.nextInt();
            }

            int[] ans = returnedArray(arr,locked);
            for(int i=0;i<n;i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
    static int[] returnedArray(int[] arr, int[] locked){
        int n = arr.length;
        int[] answer = new int[n];
        ArrayList<Integer> samllArray = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(locked[i] == 0){
                samllArray.add(arr[i]);
            }
        }
        Collections.sort(samllArray);
        int index = 0;
        for(int i=0;i<n;i++){
            if( locked[i] == 0){
                answer[i] = samllArray.get(index++);
            }else{
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
