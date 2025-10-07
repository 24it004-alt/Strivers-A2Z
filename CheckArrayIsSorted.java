import java.util.Scanner;
public class CheckArrayIsSorted {
    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER ELEMENTS: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean Sorted = checkSorted(arr);
        if (Sorted) {
            System.out.println("ARRAY IS SORTED"); 
        } else {
            System.out.println("ARRAY IS NOT SORTED");
        }

    }
}
