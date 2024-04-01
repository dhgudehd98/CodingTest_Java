

import java.util.Scanner;

/**
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 * 입력
 * 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
 * M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 * 출력
 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
 * 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 *
 *
 * 1. 소수 - 약수가 1하고 자기자신 일단 소수인지 판단하고, 배열안에 값 대입해서 그 배열안에서 최소값을 찾는게 낫겟지 ?
 *
 */
public class Main
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0;
        int min = 0;
        for(int i = M; i<= N ; i++){
            if(answer(i)){
                sum += i; //M값이 소수면 합 하나씩 더 하기
                if(min == 0) min = i; //단 가장 작은 수 하나만 하면 되니까
            }
        }
        if(sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean answer(int number){
        if(number < 2) return false;
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }

}


