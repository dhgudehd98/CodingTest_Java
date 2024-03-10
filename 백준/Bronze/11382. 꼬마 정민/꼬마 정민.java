import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
			Scanner scan = new Scanner(System.in);
			
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			
			long total = a + b + c;
			double d = Math.pow(10,12);
			
			if(c>=1 && c<= d) System.out.print(total);
			
	}
}