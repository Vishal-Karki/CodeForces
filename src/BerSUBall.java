import java.util.Arrays;
import java.util.Scanner;

public class BerSUBall {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int noB = s.nextInt();
        int[] Boys = new int[noB];
        for(int i=0;i<noB;i++){
            Boys[i] = s.nextInt();
        }

        int noG = s.nextInt();
        int[] Girls = new int[noG];
        for(int i=0;i<noG;i++){
            Girls[i] = s.nextInt();
        }

        Arrays.sort(Boys);
        Arrays.sort(Girls);

        int i=0,j=0;

        int teams = 0;
       while( i < noB && j < noG ){

           if( Math.abs( Boys[i] - Girls[j] ) <= 1 ){
               i++; j++;
               teams++;}
           else if( Boys[i] < Girls[j])
               i++;
           else if( Boys[i] > Girls[j])
               j++;

       }
        System.out.println(teams);
    }
}
