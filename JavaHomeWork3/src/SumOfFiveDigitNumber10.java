import java.util.Scanner;

public class SumOfFiveDigitNumber10 {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Please enter 5 digit number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while ( input > 0){
            int remain = input%10;
            total += remain;
            input = input/10;
        }
        System.out.println("The sum of the individual numbers is: " + total);
    }
}
