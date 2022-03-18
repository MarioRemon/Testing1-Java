import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{
    @Test
    public void evenWater()
    {
        int[] tests = {-100, 0 , 1, 5, 10, 19, 25, 40, 50, 75, 89, 99, 100, 101, 150,200};
        boolean testCase = true;
        for(int i = 0; i < tests.length; i++)
        {
            Main m = new Main();
            if(m.evenWater(tests[i]) == true && (tests[i] < 1  || tests[i] > 100))
            {
               testCase = false;
                break;
            }
        }
        assertTrue(testCase);
    }


}