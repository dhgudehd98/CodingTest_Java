import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int price = 0 ;

        if((firstNumber >= 1 && firstNumber <=6) && (secondNumber >= 1 && secondNumber <=6) && (thirdNumber >= 1 && thirdNumber <=6))
        {
        if(firstNumber == secondNumber && secondNumber == thirdNumber ) //3개가 다 같은 경우
        {
            price = 10000 + firstNumber * 1000;
            System.out.println(price);
        }
        else if(firstNumber == secondNumber || firstNumber == thirdNumber){
        price = 1000 + firstNumber * 100;
        System.out.println(price);
        }
        else if(secondNumber == thirdNumber)
        {
        price = 1000 + secondNumber * 100;
        System.out.println(price);
        }
        else {
            int max =  Math.max(firstNumber,Math.max(secondNumber,thirdNumber));
            price = max * 100;
            System.out.println(price);
        }

    }


    }

}