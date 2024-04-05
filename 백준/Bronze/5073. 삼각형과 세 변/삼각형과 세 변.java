

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
        int[] length = new int[3];

        while(true){
        length[0] = scanner.nextInt();
        length[1] = scanner.nextInt();
        length[2] = scanner.nextInt();
        if(length[0] == 0 && length[1] == 0 && length[2] == 0) break;

        Arrays.sort(length);

        //삼각형 조건에 부합 할 때
        if(length[2] < length[1] + length[0]){
            if(length[0] == length[1] && length[0] == length[2]) System.out.println("Equilateral");
            else if(length[0] == length[1] || length[0] == length[2] || length[1] == length[2])
                System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
        //조건에 부합하지 않을 때
        else System.out.println("Invalid");
        
        }
    }

}



