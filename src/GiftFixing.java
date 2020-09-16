import java.util.Scanner;

public class GiftFixing {
    private  static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();

        for(int z=0;z<T;z++){
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
                if(min1 > a[i]){
                    min1 = a[i];}
            }
            for(int i=0;i<n;i++){
                b[i]= s.nextInt();
                if(min2 > b[i]){
                    min2 = b[i];
                }
            }
            long count1 = 0; long count2 = 0;
            for(int i : a){
                count1 += Math.abs(min1 - i);
            }
            for(int i : b){
                count2 += Math.abs(min2 -i);
            }
            long sub = 0;
            for(int i =0;i<n;i++){
                if( a[i] > min1 && b[i] > min2){
                    sub += Math.min(  Math.abs(a[i]- min1),Math.abs(b[i]-min2) ) ;
                }
            }
            long ans = count1+count2-sub;
            System.out.println( ans);
        }
    }
}
