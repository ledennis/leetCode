import java.util.HashMap;

/**
 * User: dennisle
 * Problem #: 70
 * Attempted on: 3/9/18
 * Solved on: 3/10/18
 * Runtime: O(n/2) + O(n) so essentially O(n)
 */
public class ClimbingStairs {
    private HashMap<Integer, Integer> hashMap;

    public ClimbingStairs() {
        this.hashMap = new HashMap<>();

        this.hashMap.put(1, 1);
        this.hashMap.put(2, 2);
    }

    public int runRec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n - 2 >= 0) {
            return runRec(n - 2) + runRec(n - 1);
        }
        else {
            return runRec(n - 1);
        }
    }

    public int runCache(int n) {
        if (this.hashMap.get(n) != null) {
            return this.hashMap.get(n);
        }

        if (n <= 0) {
            return 0;
        }

        if (n - 2 >= 0) {
            int result = runCache(n - 2) + runCache(n - 1);
            this.hashMap.put(n, result);
            return result;
        } else {
            return 1;
        }
    }


}
