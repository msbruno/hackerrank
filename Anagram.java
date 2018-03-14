public class Anagram {
    public static void main(String[] args) {
        
        String[] a = "cde".split(""); 
        String[] b = "abc".split("");

        Arrays.sort(a);
        Arrays.sort(b);

        int aCount = 0;
        int bCount = 0;
        int deleteCount = 0;
        int compare = 0;
        while (aCount < a.length && bCount < b.length) {
            compare = a[aCount].compareTo(b[bCount]);
            if (compare == 0) {
                aCount++;
                bCount++;
            } else if(compare > 0) {
                bCount++;
                deleteCount++;
            } else if (compare < 0) {
                aCount++;
                deleteCount++;
            }
        }
        
        if (aCount <  a.length -1) {
            deleteCount += a.length - aCount;
        }
        if (bCount <  b.length -1) {
            deleteCount += b.length - bCount;
        }
        System.out.println(deleteCount);
    }
}
