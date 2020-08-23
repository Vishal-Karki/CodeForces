import java.util.Scanner;

public class cutRibbon {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int a= s.nextInt(); int b = s.nextInt(); int c= s.nextInt();
        int x,y,z,p=0,i;
        i=Math.min(a,Math.min(b,c));
        i=n/i;
        for(x=i;x>=0;x--){
            for(y=0;y<=i;y++){
                z=Math.abs((n-(a*x+b*y))/c);
                if((a*x+b*y+c*z)==n){
                    p=Math.max(p,x+y+z);
                }
            }
        }
        System.out.println(p);
    }

}
