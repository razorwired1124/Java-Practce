import java.util.ArrayList;
import java.util.Collections;

public class Median {

    //(sets.get(sets.size()/2) + sets.get(sets.size()/2 - 1))/2

    public static void mdeian() {

        ArrayList<Integer> test = new ArrayList<>();
        Collections.addAll(test, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27);
        Collections.sort(test);
        System.out.println(test.size());
        System.out.println(test);
        int median;
        median = (test.get(test.size()/2) + test.get(test.size()/2))/2;
        System.out.println(median);

    }

    public static void main(String[] args) {
        Median.mdeian();
    }

}
