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

        public static void timeConversion() {
            String s = "07:05:45PM";
            // Write your code here

            String time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US))
                    .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            System.out.println(time);


        }

    public static void main(String[] args) {

        TimeConversion.timeConversion();
    }

}
