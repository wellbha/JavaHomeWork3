import java.util.Scanner;
public class SpecifitValueInArray2 {
    public static void main(String[] args) {
        boolean present = false;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int input = sc.nextInt();
        int a[] = {10, 20, 30, 20, 50, 60};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == input) {
                present = true;
                index = i;
            }
        }
        if ( present == true){
                System.out.println("Value found at the index " + index + " in the array list");
               // break;
        }else{
                System.out.println("The value is not present at the array list");
            }

        }
    }

