

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 0;
        int answer = 0;
        while(i < N)
        {
            int count = 0;
            int number = scanner.nextInt(); // 수 입력하고, 소수 = 약수가 1하고 자기 자신뿐
            for(int j = 1; j<number; j++){//여기서 1만 나오면 소수
                if(number % j == 0) count ++;
            }
            if(count == 1) answer ++;
            i++;
        }
        System.out.println(answer);
    }

}


