import java.util.Scanner;

public class PrimeNumber16 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        for ( i = 2; i < num; i++) {
            if (num % i == 0)
            break;
        }
        if (i < num) {
                System.out.println("The number is not prime number");
        } else {
                System.out.println("The number is prime number");
        }

    }
}
