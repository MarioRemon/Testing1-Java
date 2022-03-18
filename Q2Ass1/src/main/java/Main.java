import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void Main(String[] args) {
        int n;
        n = input.nextInt();
        Main m = new Main();
            int [][] index = new int[n][3];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < 3; j ++)
                {
                    index[i][j] = input.nextInt();
                }
            }
            m.solvePhys(n, index);
    }
    public boolean checkRange(int n)
    {
        if(n >= 1 && n <= 100)
        {
            return true;
        }
        return false;
    }
    public boolean solvePhys(int n, int[][] index) {
        int sumX = 0, sumY = 0, sumZ = 0;
        Main m = new Main();
        if(!(m.checkRange(n)))
        {
            return false;
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 3; j++) {
                if(index[i][j] < -100 || index[i][j] > 100) {
                       return false;
                }
            }
            sumX += index[i][0];
            sumY += index[i][1];
            sumZ += index[i][2];
        }
            if (sumX == 0 && sumY == 0 && sumZ == 0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            return true;
        }
}