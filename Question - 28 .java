
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        long num = Math.abs((long) n);
        int count = 0;

        do {
            count++;
            num = num / 10;
        } while (num > 0);

        System.out.println("Number of digits: " + count);
    }
}
