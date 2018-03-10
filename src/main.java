public class main {
    public static void main(String[] args) {
//        String jewels = "aA";
//        String stones = "aAAbbbb";
//        NumJewelsInStones jewelsInStones = new NumJewelsInStones(jewels, stones);
//        jewelsInStones.bruteForce();
//        jewelsInStones.optimized();

//        int x = 1;
//        int y = 4;
//        HammingDistance hd = new HammingDistance(x, y);
//        hd.bruteForce();

        int n = 44;
        ClimbingStairs stairs = new ClimbingStairs();
        long startTime = System.nanoTime();
//        System.out.println(stairs.runRec(n));
        System.out.println(stairs.runCache(n));
        System.out.println(System.nanoTime() - startTime);
    }
}
