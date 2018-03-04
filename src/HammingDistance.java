/**
 * User: dennisle
 * Problem #461: Hamming Distance
 * Attempted on: 3/3/18
 * Solved on: 3/3/18
 * Runtime: O(logx + logy) since dividing x and y by 2 when converting to binary, then O(1) using XOR
 */
public class HammingDistance {
    private int x;
    private int y;

    public HammingDistance(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public void bruteForce() {
        String xStr = convertToBinary(this.x);
        String yStr = convertToBinary(this.y);
        int count = 0;

        if (xStr.length() < yStr.length()) {
            while (xStr.length() < yStr.length()) {
                xStr = "0" + xStr;
            }
        } else {
            while (yStr.length() < xStr.length()) {
                yStr = "0" + yStr;
            }
        }

        System.out.println(xStr);
        System.out.println(yStr);

        for (int i = 0; i < xStr.length(); i++) {
            int xIndex = (int)xStr.charAt(i);
            int yIndex = (int)yStr.charAt(i);

            int xor = xIndex ^ yIndex;
            if (xor == 1) {
                count++;
            }
        }

        System.out.println("The hamming distance is " + count);
    }

    public String convertToBinary(int i) {
        String string = "";
        int a;

        while (i > 0) {
            a = i % 2;
            string = a + string;
            i = i / 2;
        }

        return string;
    }

}
