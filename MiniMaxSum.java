import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {


    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

/*    public static void Result(List<Integer> arr) {
        // Write your code here
        Collections.addAll(arr, 1,5,3,4,6);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
*/
    public static long Result(List<Integer> arr) {
        // Write your code here
        long min = 0;
        long max = 0;
        Collections.addAll(arr, 256741038,623958417,467905213,714532089,938071625);
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            min = min + arr.get(i);
        }
        //System.out.println(arr);
        System.out.print(min);
        System.out.print(" ");
        arr.sort(Collections.reverseOrder());
        for (int j = 0; j < 4; j++) {
            max = max + arr.get(j);
        }
        System.out.print(max);
        //System.out.println(arr);
        return min;
    }

    public static void main(String[] args) {
        MiniMaxSum.Result(new ArrayList<>());
    }

}
