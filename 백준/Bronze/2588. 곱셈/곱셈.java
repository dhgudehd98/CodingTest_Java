import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt(); //472
            int b = scan.nextInt(); // 385

            int x = (b % 100) ; // x=85

            int c = (b/100) * 100 * a; //300 * 472
            int d = (x/10) * 10 * a; //
            x %= 10; // 85 %10 = 5
            int e = a * x;
            int total = c + d + e;

            System.out.println(e);
            System.out.println(d/10);
            System.out.println(c/100);
            System.out.println(total);
    }
}