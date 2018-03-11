/**
 * User: dennisle
 * Problem #: 12
 * Attempted on: 3/10/18
 * Solved on: 3/10/18
 * Runtime: O(n) + runtime of string.replaceFirst, which does a search so O(logS) where S is length of string
 * 1 = I
 * 5 = V
 * 10 = X
 * 50 = L
 * 100 = C
 * 500 = D
 * 1000 = M
 */
public class IntToRoman {
    KeyValuePair<String, String> four;
    KeyValuePair<String, String> nine;
    KeyValuePair<String, String> fourty;
    KeyValuePair<String, String> ninety;
    KeyValuePair<String, String> fourHundred;
    KeyValuePair<String, String> nineHundred;

    public IntToRoman() {
        this.four = new KeyValuePair<>("IIII", "IV");
        this.nine = new KeyValuePair<>("VIIII", "IX");
        this.fourty = new KeyValuePair<>("XXXX", "XL");
        this.ninety = new KeyValuePair<>("LXXXX", "XC");
        this.fourHundred = new KeyValuePair<>("CCCC", "CD");
        this.nineHundred = new KeyValuePair<>("DCCCC", "CM");
    }

    public String run(int n) {
        String string = "";

        if (n >= 1000) {
            string = divideNumber(n, 1000, "M", string);
            n = n % 1000;
        }

        if (n >= 500) {
            string = divideNumber(n, 500, "D", string);
            n = n % 500;
        }

        if (n >= 100) {
            string = divideNumber(n, 100, "C", string);
            if (n / 400 == 1) {
                string = string.replaceFirst(this.nineHundred.t, this.nineHundred.x);
                string = string.replaceFirst( this.fourHundred.t, this.fourHundred.x);
            }
            n = n % 100;
        }

        if (n >= 50) {
            string = divideNumber(n, 50, "L", string);
            n = n % 50;
        }

        if (n >= 10) {
            string = divideNumber(n, 10, "X", string);
            if (n / 40 == 1) {
                string = string.replaceFirst(this.ninety.t, this.ninety.x);
                string = string.replaceFirst( this.fourty.t, this.fourty.x);
            }
            n = n % 10;
        }

        if (n >= 5) {
            string = divideNumber(n, 5, "V", string);
            n = n % 5;
        }

        string = divideNumber(n, 1, "I", string);

        if (n / 4 == 1) {
            string = string.replaceFirst(this.nine.t, this.nine.x);
            string = string.replaceFirst( this.four.t, this.four.x);
        }

        return string;

    }

    public String divideNumber(int n, int divide, String c, String str) {
        if (n >= divide) {
            int div = n / divide;

            for (int i = 0; i < div; i++) {
                str += c;
            }

        }

        return str;
    }

}
