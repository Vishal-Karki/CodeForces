import java.util.Scanner;

public class PoliceRecurits {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();

        int policeForce = 0 ;int untreatedCrimes = 0;

        for(int i=0;i<n;i++){
            if(policeForce==0 & arr[i] ==-1)
            untreatedCrimes++;
            else if( arr[i] != -1 ){
                policeForce += arr[i];
            }else if( arr[i] == -1){
                policeForce = policeForce - 1;
            }

        }
        System.out.println(untreatedCrimes);
    }
}
