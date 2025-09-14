
package elementarray;
import java.util.Scanner;
public class ElementArray {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) System.out.println(key + " is found in the array.");
        else System.out.println(key + " is not found in the array.");
    }
    
}
