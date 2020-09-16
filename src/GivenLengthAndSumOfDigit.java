import java.util.Scanner;

//public class GivenLengthAndSumOfDigit {
//    private static Scanner s = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int length = s.nextInt(); int sum = s.nextInt();
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        int i = (int) Math.pow(10,length-1);
//
//        while (i < (int) Math.pow(10,length) ){
//            if( sum == sum(i)){
//                arr.add(i);
//            }
//            i++;
//        }
//        if( arr.isEmpty() )
//            System.out.println("-1 -1");
//        else System.out.println(Collections.min(arr)+" "+ Collections.max(arr));
//
//    }
//    public static int  sum (int i){
//        int sum =0,y;
//        while(i > 0){
//            y = i%10;
//            sum += y;
//            i=i/10;
//        }
//        return sum;
//    }
//}
public class GivenLengthAndSumOfDigit {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int m = scan.nextInt();
        int s = scan.nextInt();
        int sum = s;
        String minn="";
        for(int i=0;i<m;i++)
            for(int d = 0;d < 10;d++){
                if( (i > 0 || d > 0 || (m==1 && d==0) ) && canSum(m-i-1,sum-d) ){
                    minn =minn + d;
                    sum -= d;
                    break;
                }
            }
        String ans ="";
        for(int i=minn.length()-1;i>=0;i--)
            ans+=minn.charAt(i);

        if(Integer.parseInt(minn) == 0)
            System.out.println("-1 -1");
        else
        System.out.println(minn +" "+ ans);
    }
    static boolean canSum(int m , int s){
        return s >= 0 && s <= 9 * m;
    }

}
