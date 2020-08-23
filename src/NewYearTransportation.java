import java.util.ArrayList;
import java.util.Scanner;

public class NewYearTransportation {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int target= s.nextInt();
        int[] portals = new int[n+1];
        for(int i=1;i<n;i++){
            portals[i] = s.nextInt();}


        ArrayList<Integer> canVisit = new ArrayList<>();
        canVisit.add(1); int i=1;
       while (i < n){
            canVisit.add(portals[i]+i);
            i=portals[i] + i;
        }
       if(canVisit.contains(target))
        System.out.println("YES");
       else System.out.println("NO");
    }
}
