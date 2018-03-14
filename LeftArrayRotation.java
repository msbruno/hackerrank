package teste;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation
public class LeftRotation {
    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int a[] = { 1, 2, 3, 4, 5 };
        int rotated[] = new int[n];
        int nextPosition = 0;
        for (int i = 0; i < n; i++) {
            nextPosition = i - k;
            if (nextPosition < 0) {
                nextPosition = i + n - (k - n*(k / n));
            }
            rotated[nextPosition] = a[i];
        }
        
        for (int i : rotated) {
            System.out.println(i);
        }
    }
}
