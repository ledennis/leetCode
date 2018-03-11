/**
 * User: dennisle
 * Problem #: 13
 * Attempted on: 3/10/18
 * Solved on: 3/10/18
 * Runtime: O(s) where s equals length of string
 * 1 = I
 * 5 = V
 * 10 = X
 * 50 = L
 * 100 = C
 * 500 = D
 * 1000 = M
 * MDCLXVI
 */
public class RomanToInt {

    public RomanToInt() {

    }

    public int runBrute(String s) {
        int n = 0;

        while (s.length() > 0 && s.charAt(0) == 'M') {
            n += 1000;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("CM")) {
            n += 900;
            s = s.substring(2);
        }

        while (s.length() > 0 && s.charAt(0) == 'D') {
            n += 500;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("CD")) {
            n += 400;
            s = s.substring(2);
        }

        while (s.length() > 0 && s.charAt(0) == 'C') {
            n += 100;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("XC")) {
            n += 90;
            s = s.substring(2);
        }

        while (s.length() > 0 && s.charAt(0) == 'L') {
            n += 50;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("XL")) {
            n += 40;
            s = s.substring(2);
        }

        while (s.length() > 0 && s.charAt(0) == 'X') {
            n += 10;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("IX")) {
            n += 9;
            s = s.substring(2);
        }

        while (s.length() > 0 && s.charAt(0) == 'V') {
            n += 5;
            s = s.substring(1);
        }

        if (s.length() >= 2 && s.substring(0, 2).equals("IV")) {
            n += 4;
            s = s.substring(2);
        }

        n += s.length();

        return n;
    }

}
