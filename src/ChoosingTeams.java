import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        Arrays.sort(arr);

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] >= 5)
                break;
            arr1.add( arr[i] );
        }

        


    }
}
