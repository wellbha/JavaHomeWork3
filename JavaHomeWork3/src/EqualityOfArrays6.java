import java.util.Arrays;

public class EqualityOfArrays6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 5, 2, 6, 6};

        if (Arrays.equals(a,b)) {
            System.out.println("Both arrays are same");
        }else{
            System.out.println("Both arrays are not same");
        }
    }
}
