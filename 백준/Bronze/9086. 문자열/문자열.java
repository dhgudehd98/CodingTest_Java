

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 *
 * 출력
 * 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 *
 * 개수 : T
 * scan = > 배열 이용해서
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int T =scan.nextInt();
        String[] str = new String[3];

        for(int i =0; i < T; i++) //값 초기화
        {
            str[i] =scan.next();
        }
        int len ;
        for(int i = 0; i<T; i++)
        {
            len = str[i].length() -1;
            System.out.print(str[i].charAt(0));
            System.out.println(str[i].charAt(len));
        }


    }
}