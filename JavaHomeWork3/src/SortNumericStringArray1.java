import java.util.Arrays;

public class SortNumericStringArray1 {
    public static void main(String[] args) {
        int[] num = {32, 6, 13, 18, 30, 9, 34};
        String[] str = { "Raj","Mahesh","Jag","Bhavin","Sanjay"};
        System.out.println("The original Numeric arrays: "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted Numeric arrays: " + Arrays.toString(num));
        System.out.println("The original String arrays: "+ Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted String arrays: " + Arrays.toString(str));
       // System.out.println();
    }
}
