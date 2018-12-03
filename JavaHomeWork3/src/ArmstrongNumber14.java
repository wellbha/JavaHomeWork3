import java.util.Scanner;

public class ArmstrongNumber14 {
    public static void main(String[] args) {
        int temp, remain, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        temp = num;
        while (num > 0){

            remain = num%10;
            num = num/10;
            total = total + remain*remain*remain;
        }
        if (temp == total){
            System.out.println("The number is Armstrong number");
        }else {
            System.out.println("The number is not Armstrong number");
        }
    }
}
