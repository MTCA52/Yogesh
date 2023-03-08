import java.util.Scanner;
public class Armstrong2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Armstrong numbers in the array: ");
        for (int i = 0; i < size; i++) {
            int number = arr[i];
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }
            if (sum == originalNumber) {
                System.out.print(originalNumber + " ");
            }
        }
    }
}