import java.util.Scanner;

public class RaisingBacteria {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int x = s.nextInt();

        StringBuilder b2=new StringBuilder();
        while( x> 0){
            b2.append(x%2);
            x = x/2;
        }
        int ans =0;
        for(int i =0 ;i<b2.length();i++){
            if(b2.charAt(i) == '1')
            ans++;
        }
        System.out.println(ans);
    }
}
