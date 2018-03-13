import java.util.*;

public class Array1DPart2 {
    
    int leap;
    int[] game;
    int queryCount;

    public Array1DPart2(int leap, int[] game) {
        this.leap = leap;
        this.game = game;
        this.queryCount = 0;
    }

    public boolean canIWin(int currentPosition) {
        if (currentPosition < 0 || this.game[currentPosition] == 'x') {
            return false;
        }
        
        if (this.game[currentPosition] != 0) {
            this.game[currentPosition] = 'x';
            return false;
        }
        
        int leapedPosition = currentPosition + this.leap;
        int nextFowardPosition = currentPosition + 1;
        int nextBackwardPosition = currentPosition - 1;
        this.game[currentPosition] = 'x';
        
        if (leapedPosition >= game.length || nextFowardPosition >= game.length ) {
            return true;
        }

        return canIWin(leapedPosition) 
                || canIWin(nextFowardPosition) 
                || canIWin(nextBackwardPosition);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game) {
        return new Array1DPart2(leap, game).canIWin(0);
    }
}
