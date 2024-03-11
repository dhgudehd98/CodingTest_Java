import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int first =1 ;
        int second = 1;
        for(int i=0; i<T; i++)
        {
            first = scan.nextInt();
            second = scan.nextInt();
            if((first > 0 && first<10) &&(second>0 && second < 10))
            {
                System.out.println(first + second );
            }
        }

    }
}