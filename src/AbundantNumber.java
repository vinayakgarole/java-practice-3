import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        int n, i, sum = 0, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) ;
        {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > n) {
            System.out.println("It is a Abundant Number: " + n);
            x = sum + i;
            System.out.println("Abundant Number : " + x);
        } else {
            System.out.println("It is not a Abundant Number: " + n);
        }
    }
}
