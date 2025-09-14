
package largernumber;
public class LargerNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 20, 3};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        System.out.println("Largest number: " + max);
    }
}
