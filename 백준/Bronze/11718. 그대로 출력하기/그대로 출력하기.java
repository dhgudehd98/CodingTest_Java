

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;

/**
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 *
 *
 * hasNext() => 입력 값 존재 확인 -> 없으면 출력
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str ;
        while(scanner.hasNext())
        {
            str = scanner.nextLine();
            System.out.println(str);
        }



    }
}