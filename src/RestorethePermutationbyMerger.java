import java.util.Scanner;

public class RestorethePermutationbyMerger {
    private static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int[] arr = new int[2*n];
            int[] freq = new int[51];

            for(int i=0;i<2*n;i++){
                arr[i] = s.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                if(freq[ arr[i] ]== 0){
                    System.out.print(arr[i]+" ");
                }

                freq [  arr[i] ]++;
            }
            System.out.println();
        }
    }
}
