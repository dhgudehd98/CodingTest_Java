import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 *
 * -1로 고정 시키고 , 'a' ~ 'z'까지 가는데 각각 차이가 1씩 나니까 빼면되네 abcd
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] number = new int[26];
        for(int i = 0; i<26; i++){
            number[i] = -1;
        }
        int k = 0;
        //bakejoon
        for(int i =0; i<str.length(); i++){
           char ch =  str.charAt(i); // ch = ' b ' arr[1] 값이 0 즉 i값으로 변경되야하는디
            if(number[ch - 'a'] == -1) number[ch - 'a'] = i;
            // 아스키코드값 b- a = 1 a a 1
        }

        // a- z까지 arr[1] = - 1
        for(int i = 0; i<26; i++){
            System.out.print(number[i] + " ");
        }






    }
}