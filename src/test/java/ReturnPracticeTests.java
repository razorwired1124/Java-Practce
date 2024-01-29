import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReturnPracticeTests {

    @Test
    public void returnPracticeOne() {
        int testX = ReturnPractice.oneInt(5);
        Assertions.assertEquals(10, testX);
    }

    @Test
    public void returnPracticeTwo() {
        int testY = ReturnPractice.twoInts(5);
        Assertions.assertEquals(15,testY);
    }

    @Test
    public void returnPracticeThree() {
        int testZ = ReturnPractice.threeInts(5);
        Assertions.assertEquals(40,testZ);
    }
}
