package javaBasics;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();
        input.close();
        int originalNum = num;
        int ReverseNum = 0;

        while(originalNum != 0){
            int remainder = originalNum % 10;
            ReverseNum = ReverseNum * 10 + remainder;
            originalNum = originalNum / 10;
        }

        if(ReverseNum == num){
            System.out.println("The number is palindrome number");
        }
        else{
            System.out.println("The number is not palindrome number");
        }
    }
}
