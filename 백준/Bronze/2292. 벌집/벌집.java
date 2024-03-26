

import java.util.Scanner;

/**
 * count = 방을 건너다니는 개수
 *
 * count = 1 -> 1번 방 하나에만 있는것
 * count 2부터 봐야함 N값이 1이면 어차피 방이 하나 밖에 없기 때문에
 * count가 1일때라고 그냥 생각하면 Min = min + 6 * count
 * count = 2 -> 2-7번까지 총 6개의 방이 있고,
 * count = 3 -> 8-19번까지 총 12개의 방이 있음..
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 방을 몇번 옮기는지
        int count = 1; //방 이동 횟수
        int min = 2; // 방을 이동할 때 마다 존재하는 각 최소값 : 2

        if(N == 1) System.out.println(1);
        else{
            while(min <= N){
                min = min + (count * 6);//
                count ++;
            }
            System.out.println(count);
        }
    }
}

