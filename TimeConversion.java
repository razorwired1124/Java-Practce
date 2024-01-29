import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            s = "07:05:45PM";
            // Write your code here

            String time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US))
                    .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            System.out.println(time);


            return time;
    }

    public static void main(String[] args) {

            String test = "";
            TimeConversion.timeConversion(test);
    }

}
