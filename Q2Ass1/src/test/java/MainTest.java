import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testNSolvePhys()
    {
        int [] testNum = { -101, -100, -1, 0, 1 , 2,  50 , 79, 90, 99, 100, 101, 102};
        for(int t = 0; t < testNum.length; t++)
        {
            Main m = new Main();
            if(m.checkRange(testNum[t]))
            {
                int [][] vertices = new int[1000][3];
                int k = 0;
                for(int i = 0; i < testNum[t]; i++)
                {
                    for(int  j = 0; j < 3; j++ )
                    {
                        vertices[i][j] = k;
                        k++;
                    }
                }
                boolean testCase = true;
                for(int i = 0; i < testNum.length; i++)
                {
                    if(m.solvePhys(testNum[i],vertices) == true && (testNum[i] < 1 || testNum[i] > 100))
                    {
                        testCase = false;
                        break;
                    }
                }
                assertTrue(testCase);
            }
            }
    }
    public void testSolveRPhys()
    {
        int[] testIdle = {2 , 3 ,4, 5};
        int[][] vertices1 = {{1,2,3},{-1,-2,-3},{1,2,3},{-1,-2,-3}, {-101, 0 , 101}};
        Main m = new Main();
        boolean valid = true, test = true;
        for(int t = 0; t < testIdle.length; t++)
        {
            for(int i = 0; i < testIdle[t]; i++)
            {
                for(int  j = 0; j < 3; j++)
                {
                    if(vertices1[i][j] < -100 || vertices1[i][j] > 100)
                    {
                        valid  = false;
                    }
                }
            }

            if(m.solvePhys(testIdle[t], vertices1) == true && valid == false)
            {
                test = false;
            }
        }
        assertTrue(test);
    }
    public void testSolveAPhys() // testing answer
    {
        int[] testIdle = {2 , 3 ,4, 5};
        int[][] vertices1 = {{1,2,3},{-1,-2,-3},{1,2,3},{-1,-2,-3}, {-101, 0 , 101}};
        Main m = new Main();
        boolean valid = true, test = true;
        for(int t = 0; t < testIdle.length; t++)
        {
            if((m.solvePhys(testIdle[t], vertices1) == true) && ((testIdle[t] == 3) || (testIdle[t] == 5)))
            {
                test = false;
            }
        }
        assertTrue(test);
    }
}
