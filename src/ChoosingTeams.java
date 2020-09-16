import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int count = 0;
        for (int i=0;i<n;i++){
            if(arr[i] >= 5)
                break;
            if(arr[i] + k <= 5)
                count++;
        }
        System.out.println(count/3);
       /*
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] >= 5)
                break;
            arr1.add( arr[i] );
        }
        System.out.println(arr1.toString());

        int[] gamesleftarr = new int[arr1.size()];

        for(int i=0;i<arr1.size();i++)
            gamesleftarr[i] = arr1.get(i) + k;

        int count =0;
        System.out.println(Arrays.toString(gamesleftarr));

        for(int i=0;i<gamesleftarr.length;i++) {
            if (gamesleftarr[i] <= 5)
                count++;
        }
        System.out.println(count+" \n"+count/3);*/

    }
}
