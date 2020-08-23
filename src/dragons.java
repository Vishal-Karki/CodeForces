import java.util.Scanner;

public class dragons {
    private static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        int strength = s.nextInt(); int lvl = s.nextInt();
        int count =0; int temp,temp2;
        int[] x = new int[lvl];
        int[] y = new int[lvl];
         for(int i=0;i<lvl;i++){
             x[i]=s.nextInt();
             y[i]=s.nextInt();
         }
       for(int i=0;i<x.length;i++)
           for(int j=0;j<x.length-i-1;j++) {
               if (x[j] > x[j + 1]) {
                   temp = x[j]; temp2 = y[j];
                   x[j] = x[j + 1];  y[j] = y[j + 1];
                   x[j + 1] = temp;  y[j + 1] = temp2;
               }
           }
          for(int i=0;i<x.length;i++){
              if(strength > x[i]){
                  count++;}

              strength+=y[i];
          }

        if(count == x.length)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
