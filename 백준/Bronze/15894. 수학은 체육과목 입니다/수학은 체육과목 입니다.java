
import java.util.Scanner;

/**
 *"한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다.
 * 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
 */
public class Main
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long square = scanner.nextInt();
        long round = 4 * square;

        System.out.println(round);


    }

}




