import java.util.Scanner;
public class PelindromNumber15 {
    public static void main(String[]args){
        int remainder, temp;
        int reversInput = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int input = sc.nextInt();
        temp = input;
        while (temp != 0){
            remainder = temp%10;
            reversInput = reversInput*10 + remainder;
            temp /=10;
        }
        if ( reversInput == input){
            System.out.println("The given number is Pelindrome number");
        }else {
            System.out.println("The given number is not Pelindrom numbe");
        }
    }
}

