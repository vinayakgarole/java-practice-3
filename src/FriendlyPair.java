import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Input the second Number: ");
        int num2 = sc.nextInt();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if ((sum_num1 == num2) && (sum_num2 == num1)) {
            System.out.println("These number are Friendly");
        } else
            System.out.println("These number are not Friendly");
    }
}
