import java.util.Scanner;

public class BrainsPhotos {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int m = s.nextInt();
        char[][] arr = new char[n][m];
        boolean flag = false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= s.next().charAt(0);
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 'C' || arr[i][j]=='M' || arr[i][j]=='Y'){
                    flag = true;
                }
            }
        }

        if(flag)
            System.out.println("#Color");
        else System.out.println("#Black&White");
    }
}
