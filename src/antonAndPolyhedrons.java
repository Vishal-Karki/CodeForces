import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class antonAndPolyhedrons {
    private static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); s.nextLine();
        String[] polyhedrons = new String[n];
        for(int i=0;i<n;i++)
            polyhedrons[i] = s.nextLine();

        Map<String,Integer> shape = new HashMap<>();
        shape.put("Tetrahedron",4);
        shape.put("Cube",6);
        shape.put("Octahedron",8);
        shape.put("Dodecahedron",12);
        shape.put("Icosahedron",20);
        int count =0;
        for(int i=0;i<n;i++){
            count += shape.get(polyhedrons[i]) ;
        }
        System.out.println(count);
    }
}
