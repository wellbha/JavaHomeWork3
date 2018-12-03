import java.util.Scanner;

public class MultiplicationTable17 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single digit number for table: ");
        int a = sc.nextInt();
        do {
            for ( i = 1; i <= a; i++){
                System.out.print(i + "  ");
            }
        }while(i < a);
        System.out.println();
        do {
            for (i = 2; i <= a*2; i+=2){
                System.out.print(i + "  ");
            }
        }while (i < a*2);
        System.out.println();
        do {
            for (i = 3; i <= a*3; i+=3){
                System.out.print(i + "  ");
            }
        }while (i < a*3);
    }
}
