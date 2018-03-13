import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the uniqueRecycledPairs function below.
     */
    static long uniqueRecycledPairs(int[] A) {
        String value;
        String compareValue;
        int count = 0;
        int sum = 0;
        for (int i =0; i < A.length; i++) {
            count = 0;
            value = new StringBuilder(String.valueOf(A[i])).reverse().toString();
            if (value == "x") {
                continue;
            }
            for (int j = i + 1; j < A.length; j++) {
                compareValue = String.valueOf(A[j]);
                if (compareValue == "x") {
                    continue;
                } else if (value.equals(compareValue)) {
                    if (count == 0) {
                        count++;
                    } else {
                        count--;
                    }
                    A[j] = 'x';
                }
            }
            sum += count;
        }
        return sum;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] A = new int[n];

        String[] AItems = scan.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        long result = uniqueRecycledPairs(A);
        scan.close();
    }
}
