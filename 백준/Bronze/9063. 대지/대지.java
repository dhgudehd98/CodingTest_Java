

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**

 */
public class Main
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] x = new int[count];
        int[] y = new int[count];
        int square = 0 ;

        for(int i = 0; i<count; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        square = (x[count-1] - x[0]) * (y[count-1] - y[0]);
        System.out.println(square);


    }

}




