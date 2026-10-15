
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch < 'a' || ch > 'z') {
            System.out.println("Not an alphabet");
        } else if ("aeiou".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
