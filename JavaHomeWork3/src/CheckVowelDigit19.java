import java.util.Scanner;
public class CheckVowelDigit19 {
    public static void main(String[] args) {
        String str;
        int total = 0,i;
        float totalchar = 0;
        float totalvowels = 0;
        float totaldigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string ");
        str = sc.nextLine();
        for ( i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            totalchar ++;
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                totalvowels ++;
                //total++;
            }
        }
        for ( i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                totaldigit++;
            }
        }
        float percentageVowel = (totalvowels*100/totalchar);
        float percentageDigit = (totaldigit*100/totalchar);
        System.out.println("Total characters in string: " + totalchar);
        System.out.println("Total Vowels in string : " +totalvowels +"(" + percentageVowel + "%" + ")" );
        System.out.println("Total Digits in string : "+totaldigit +"(" + percentageDigit +"%" + ")");
        //System.out.println(totalchar);
        //System.out.println(totaldigit);
        //System.out.println(totalvowels);
    }
}
