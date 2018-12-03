import java.util.Scanner;

public class NumberOfWordsSpace9 {
    public static void main(String[] args) {
        String str;
        int space = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string ");
        str = sc.nextLine();
        for ( int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' '){
                space++;
            }
        }
        System.out.println("Number of words are: " + (space+1));
        System.out.println("Number of spaces are: " + space);
    }
}
