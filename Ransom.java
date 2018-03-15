import java.util.Arrays;
import java.util.Scanner;

public class Ransom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }

        Arrays.sort(magazine);
        Arrays.sort(ransom);

        int ransomCount = 0;
        int magazineCount = 0;
        int result;
        while (ransomCount < ransom.length && magazineCount < magazine.length) {
            result = ransom[ransomCount].compareTo(magazine[magazineCount]);
            if (result == 0) {
                ransomCount++;
                magazineCount++;
            } else if (result > 0) {
                magazineCount++;
            } else if (result < 0) {
                break;
            }
        }
        
        String stringReturn = "Yes";
        if (ransomCount < ransom.length) {
            stringReturn = "No";
        }
        
        System.out.println(stringReturn);
        

    }
}
