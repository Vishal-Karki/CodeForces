import java.util.Scanner;

public class iWannaBeTheGuy {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] lvl = new int[n]; boolean flag = false;
        int p = s.nextInt();
        for(int i=0;i<p;i++){
            lvl[s.nextInt() - 1]++;
        }
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            lvl[s.nextInt() - 1]++;
        }
        for(int i=0;i<n;i++){
            if(lvl[i] == 0){
                flag = true; break;}
        }
        if(flag)
            System.out.println("Oh, my keyboard!");
        else System.out.println("I become the guy.");
    }
}
