public class ReturnPractice {

    // This method returns a single int
    public static int oneInt(int x) {
        return 5 + x;
    }

    public static int twoInts(int y) {
        return oneInt(5) + y;
    }

    public static int threeInts(int z) {
        return oneInt(10) + twoInts(10) + z;
    }

    public static void main(String[] args) {
        System.out.println(oneInt(5));

        System.out.println(twoInts(10));

        System.out.println(threeInts(15));
    }
}
