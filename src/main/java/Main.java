import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        int w = 0;
        Scanner input = new Scanner(System.in);
        w = input.nextInt();
        Main m = new Main();
        m.evenWater(w);
    }
    public boolean evenWater(int w)
    {
        if((w >= 1) && (w <= 100))
        {
            if(w == 2)
            {
                System.out.println("NO");
            }
            else if((( w - 2) % 2) == 0)
            {
                System.out.println("YES");
                return true;
            }
            else
            {
                System.out.println("NO");
            }
            return true;
        }
        return false;
    }
}
//149951249