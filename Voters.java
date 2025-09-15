
package voters;
import java.util.Scanner;
public class Voters {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (N): ");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.print("Enter minimum age to vote (X): ");
        int X = sc.nextInt();

        int count = 0;
        System.out.println("Enter ages of " + N + " people:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] >= X) {
                count++;
            }
        }

        System.out.println("Number of eligible voters: " + count);
    }
    
}
