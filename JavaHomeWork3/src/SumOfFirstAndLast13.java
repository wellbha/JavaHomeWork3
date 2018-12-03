import java.util.Scanner;

public class SumOfFirstAndLast13 {
    public static void main(String[] args) {
        int first,last;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        first = n;
        while (first > 10){
            first /= 10;
        }
      //  System.out.println(n);
        last = n%10;
        int total = first + last;
        System.out.println("The first number is: " + first);
        System.out.println("The last number is: " + last);
        System.out.println("The sum of both numbers is: " + total);
    }
}
