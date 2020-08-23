import java.util.Scanner;
public class ele{
    private static Scanner  s= new Scanner(System.in);
    public static void main(String[] args){
        int n = s.nextInt();
       int ans;
      if(n%5 == 0)
          ans = n/5;
      else
          ans = n/5 + 1;

        System.out.println(ans);

    }
}
