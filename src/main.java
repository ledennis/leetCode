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

        int n = 9;
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.run(n));

        System.out.println(System.nanoTime() - startTime);
    }
}
