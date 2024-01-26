import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinusZero(List<Integer> arr) {
        // Write your code here
        arr.add(1);
        arr.add(-1);
        arr.add(0);
        arr.add(5);
        arr.add(-4);
        arr.add(3);
        double p = 0;
        double n = 0;
        double z = 0;
        double t = 0;

        /*
                for (int i = 0; i < arr.size(); i++) {
            if (Integer.signum(arr.get(i)) == 1.0) {
                p++;
                t++;
            } else if (Integer.signum(arr.get(i)) == -1.0) {
                n++;
                t++;
            } else {
                z++;
                t++;
            }
        }
         */

        for (Integer integer : arr) {
            if (Integer.signum(integer) == 1.0) {
                p++;
                t++;
            } else if (Integer.signum(integer) == -1.0) {
                n++;
                t++;
            } else {
                z++;
                t++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println("POSITIVE %: " + df.format(p / t));
        System.out.println("NEGATIVE %: " + df.format(n / t));
        System.out.println("ZERO %: " + df.format(z / t));

    }

    public static void main(String[] args) {
        PlusMinus.plusMinusZero(new ArrayList<>());
    }
}