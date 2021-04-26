
// Program to find Union and Intersection of two unsorted arrays
import java.util.*;

class Solution {
    public int getUnion(int a[], int b[], int n, int m) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        return set.size();
    }

    public int getIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> aSet = new HashSet<>();
        for (int i = 0; i < a.length; i++)
            aSet.add(a[i]);

        HashSet<Integer> commonSet = new HashSet<>();

        for (int i = 0; i < b.length; i++) {
            if (aSet.contains(b[i]))
                commonSet.add(b[i]);
        }

        return commonSet.size();
    }
}

public class UnionIntersectionArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        Solution ob = new Solution();
        System.out.println("Union array count: " + ob.getUnion(a, b, n, m));
        System.out.println("Intersection array count: " + ob.getIntersection(a, b, n, m));

        sc.close();

    }

}

// geeksforgeeks.org