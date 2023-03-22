import java.util.Scanner;

public class PrintRangeBetweenTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a value");
        int value1 = sc.nextInt();
        System.out.println("Insert another value");
        int value2 = sc.nextInt();

        if (value1 < value2) {
            do {
                System.out.println(value1);
                value1++;
            } while (value1 <= value2);
        } else if (value2 < value1) {
            do {
                System.out.println(value2);
                value2++;
            } while (value2 <= value1);
        } else {
            System.out.println("Values are equal");
        }
    }
}
