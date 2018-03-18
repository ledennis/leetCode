import java.util.*;

public class main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
//        String jewels = "aA";
//        String stones = "aAAbbbb";
//        NumJewelsInStones jewelsInStones = new NumJewelsInStones(jewels, stones);
//        jewelsInStones.bruteForce();
//        jewelsInStones.optimized();

//        int x = 1;
//        int y = 4;
//        HammingDistance hd = new HammingDistance(x, y);
//        hd.bruteForce();

//        int n = 44;
//        ClimbingStairs stairs = new ClimbingStairs();

//        System.out.println(stairs.runRec(n));
//        System.out.println(stairs.runCache(n));

//        int n = 9;
//        IntToRoman intToRoman = new IntToRoman();
//        System.out.println(intToRoman.run(n));

//        String s = "MCMXCVI";
//        RomanToInt romanToInt = new RomanToInt();
//        System.out.println(romanToInt.runBrute(s));

        MinTimeDiff minTimeDiff = new MinTimeDiff();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
//        timePoints.add("12:00");
//        timePoints.add("12:50");
//        Collections.reverse(timePoints);
//        System.out.println(timePoints);

        System.out.println(minTimeDiff.runList(timePoints));

//        String time = "23:49";
//        Integer hours = Integer.parseInt(time.substring(0, 2));
//        Integer minutes = Integer.parseInt(time.substring(3,5));
//        minutes = (hours * 60) + minutes;
//        System.out.println(minutes);

//        System.out.println(System.nanoTime() - startTime);
    }
}
