public class ReturnPractice {

    // This method returns a single int
    public static int oneInt(int x) {
        return 5 + x;
    }

    public static int twoInts(int x, int y) {
        return x + y;
    }

    public static int threeInts(int x, int y, int z) {
        return x + y - z;
    }

    public static void main(String[] args) {
        System.out.println(oneInt(5));

        System.out.print(twoInts(10, 10));

        System.out.println(threeInts(15 , 15, 15));
    }
}
