import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고,
 * 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 *
 * 출력
 * 각 테스트 케이스에 대해 P를 출력한다.
 *
 * 3 str[0] = ABC 3번씩 반복
 *
 * ABC =str[0]
 * c = AAA
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // 몇번 반복할지 기입
        int num = scan.nextInt();
        int repeat ;
       String str;

        //값 초기화
        for(int i = 0; i<num; i++)
        {
            repeat = scan.nextInt();
            str = scan.next();
            //AAABBBCCC
            for(int j = 0; j<str.length(); j++)
            {
                for(int k = 0; k<repeat; k++)
                {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();

        }
        
    }
}