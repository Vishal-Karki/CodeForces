import java.util.ArrayList;
import java.util.Scanner;

public class taxi {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] count = new int[5];
        ArrayList<Integer> groups = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            groups.add(s.nextInt());
            count[ groups.get(i)]++;
        }

        int total = count[4] + count[3] +count[2]/2;
        count[1] -= count[3];
        if(count[2]%2==1){
            total +=1;
            count[1] -= 2;
        }
        if( count[1]> 0)
            total += (count[1]+3)/4 ;

        System.out.println(total);

    }
}