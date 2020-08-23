import java.util.Scanner;
public class IQtest{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n = s.nextInt(); int even = 0; int odd=0;int indexEven=0,indexOdd=0;
        for(int i=0;i<n;i++){
            if(s.nextInt()%2 == 0){
                even++;}
            else odd++;
            if(even == 1 && indexEven == 0)
                indexEven=i+1;
            if(odd == 1 && indexOdd == 0)
                indexOdd =i+1;
        }
    if( even == 1)
        System.out.print(indexEven);
    else
        System.out.print(indexOdd);

    }
}