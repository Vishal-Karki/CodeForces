import java.util.Scanner;
public class IsYourHorseShoeOnTheRoof{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        long s1=s.nextInt(); long s2=s.nextInt(); long s3=s.nextInt(); long s4=s.nextInt();
        int same = 0;
        if(s1 ==s2 || s1 == s3 || s1 == s4)
            same++;
        if(s2 == s3 || s2 ==s4)
            same++;
        if( s3 ==s4)
            same++;
        System.out.print(same);
    }
}