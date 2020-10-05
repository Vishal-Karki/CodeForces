import java.util.Scanner;

public class MultiplyBy_2_DivideBy_6 {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T= s.nextInt();
        for(int i=0;i<T;i++){
            int n = s.nextInt(); int count  = 0; boolean flag = false;
            if(n==1){
                System.out.println(0);
            }else {
                while(n>1){
                    if(n%6 == 0){
                        n = n/6; count++;
                    }else if(n%3 == 0){
                        n = n*2; count++;
                    }else{
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    System.out.println(-1);
                }else
                    System.out.println(count);
            }
        }
    }
}
