import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number");
        long number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i<= number; i++) {
            sum += i;
        }
            System.out.println("The sum is " + sum);
    }
}
