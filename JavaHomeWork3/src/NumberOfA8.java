import java.util.Scanner;
public class NumberOfA8 {
    public static void main(String[] args) {
        String str;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string ");
        str = sc.nextLine();
        for ( int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a'){
                total++;
            }
        }
        System.out.println("Total number of 'a' in the string is: " + total);
    }
}
