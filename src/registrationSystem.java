import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class registrationSystem {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); s.nextLine();

        Map<String,Integer> user = new HashMap<>();
        String str;
        for(int i=0;i<n;i++){
            str = s.nextLine();
            if( !user.containsKey(str) ){
                System.out.println("OK");
                user.put(str,0);

            }
            else{
                int no = user.get(str).intValue() + 1;
                System.out.println(str+no);
                user.put(str,no);
            }
        }
    }
}
