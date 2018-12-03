import java.util.Scanner;
public class SumOfOddEven11 {
    public static void main(String[] args) {
        int oddcount =0, oddsum =0;
        int evencount =0, evensum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 digit number");
        int input = sc.nextInt();
        while (input > 0){
            int digit = input%10;
            if(digit%2 == 0){
                evencount++;
                evensum += digit;
                input /=10;
            }else{
                oddcount++;
                oddsum += digit;
                input /=10;
            }
        }
        System.out.println("Total even numbers: "+ evencount);
        System.out.println("The sum of even numbers: " + evensum);
        System.out.println("Total odd numbers: " + oddcount);
        System.out.println("The sum of odd numbers: " + oddsum);
    }
}