
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is a rectangle");
        }
    }
}
