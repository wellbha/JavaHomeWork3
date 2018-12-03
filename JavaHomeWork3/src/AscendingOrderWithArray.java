import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderWithArray {
    public static void main(String[] args) {
        int i;
        int[] numArray = new int[5];
        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter the 5 numbers");
        for (i=0; i<numArray.length; i++){
            numArray[i] = sc.nextInt();
        }
        System.out.println("The entered values are: "+ Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Entered values in Ascending order: "+ Arrays.toString(numArray));
    }

}
