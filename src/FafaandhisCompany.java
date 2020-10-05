import java.util.Scanner;

public class FafaandhisCompany {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int count = 0;
        for(int i =1;i<n;i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
