public class StringDuplicateValueInArray5 {
    public static void main(String[] args) {
        String[] array1 = {"Bhavin","Krish", "Krishna","Hetal"};
        String[] array2 = {"Ramesh", "Krish", "Raj", "Bhavin"};
        System.out.println("The common string in both arrays are: ");
        for ( int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    System.out.print(array1[i] + "  ");
                }
            }
        }
    }
}
