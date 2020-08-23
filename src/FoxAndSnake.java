import java.util.Scanner;

public class FoxAndSnake {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n= s.nextInt(); int m = s.nextInt(); boolean set = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2!= 0 && j==0)
                    set = !set;
                if(i%2 ==0){
                    System.out.print("#");
                }else{

                    if(set && j!=m-1){
                        System.out.print(".");
                    }else if(set && j == m-1)
                    System.out.print("#");

                    if(!set && j!=0)
                        System.out.print(".");
                    else if(!set && j==0)
                        System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
