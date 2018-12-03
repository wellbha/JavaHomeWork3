import java.util.Scanner;
public class ReverseString18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        System.out.print("The reverse string is: ");
        for ( int i = str.length()-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}
