import java.util.Scanner;

public class games {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++)
            for(int j=0;j<2;j++)
                arr[i][j]= s.nextInt();

         int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                if( arr[i][0] == arr[j][1] && i!=j)
                    count++;
                }
        System.out.print(count);
    }
}
