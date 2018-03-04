/*
* Problem #771: Jewels and Stones
* Attempted on 3/3/18
* Solved on 3/3/18
* Runtime Brute Force: O(SJ) where S = # of char in S, J = # of char in J
* Runtime Optimized: O(J) where J = # of char in J
*/

public class NumJewelsInStones {
    private String J;
    private String S;

    public NumJewelsInStones(String _J, String _S) {
        this.J = _J;
        this.S = _S;
    }

    public void bruteForce() {
        long startTime = System.nanoTime();

        int count = 0;

        for (int i = 0; i < S.length(); i++) {
         for (int j = 0; j < J.length(); j++) {
             if (J.charAt(j) == (S.charAt(i))) {
                 count ++;
             }
         }
        }

        printJewels(count,"Brute Force:");
        System.out.println(System.nanoTime() - startTime);

    }

    public void optimized() {
        long startTime = System.nanoTime();
        int count = 0;

        for (int i = 0; i < J.length(); i++) {
            while (S.indexOf(J.charAt(i)) > -1) {
                int indexOfJ = S.indexOf(J.charAt(i));
                S = S.substring(0, indexOfJ) + S.substring(indexOfJ + 1);
                count ++;
            }
        }

        printJewels(count, "Optimized:");
        System.out.println(System.nanoTime() - startTime);
    }

    public void printJewels(int count, String s) {
        System.out.println(s);
        System.out.println("There are " + count + " jewels in stones.");
    }
}
