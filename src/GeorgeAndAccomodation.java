import java.util.Scanner;

public class GeorgeAndAccomodation {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];int count=0;
        for(int i=0;i<n;i++){
            p[i] = s.nextInt();
            q[i] = s.nextInt();
            if(q[i] - p[i] >= 2)
                count++;
        }
        System.out.println(count);
    }
}
