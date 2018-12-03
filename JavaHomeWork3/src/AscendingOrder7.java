import java.util.Scanner;

public class AscendingOrder7 {
    public static void main(String[] args) {
        int i, temp;
        Scanner sc= new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Please enter the 6 numbers ");
        for ( i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            //System.out.println(a[i]);
        }
        System.out.print("Entered value are: ");
        for ( i=0; i<a.length; i++){
            System.out.print(" " + a[i]);
        }
        //int temp;
        System.out.println();
        System.out.print("In Acending order: ");
        for ( i=0;i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    temp= a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(" " + a[i]);
        }
    }
}
