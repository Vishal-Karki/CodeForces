import java.util.Scanner;

public class NewYear {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int n = s.nextInt();
        double min = s.nextInt();
        double timeLeft = 240 - min ; int count=0;
        int solvingTime = 0 ;  boolean flag = false;
        for(int i=1;i<=n;i++){
            solvingTime +=5*i;
            if(solvingTime > timeLeft){
                count =i-1; flag = true; break;
            }
        }
        if(flag)
            System.out.println(count);
        else System.out.println(   n   );
    }
}
