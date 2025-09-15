
package eligiblevoters;
import java.util.Scanner;
public class EligibleVoters {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of people: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of person " + i + ": ");
            int age = sc.nextInt();
            if (age >= 18) { // Eligible if age >= 18
                count++;
            }
        }
        
        System.out.println("Number of eligible voters: " + count);
    }
    
}
