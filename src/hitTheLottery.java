import java.util.Scanner;
public class hitTheLottery{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n= s.nextInt();
        int a=n/100; int b = (n%100)/20; int c = ( (n%100)%20)/10; int d = (( (n%100)%20)%10)/5;
        int e =(( (n%100)%20)%10)%5; int ans =a+b+c+d+e;
        System.out.println(ans);
    }
}
