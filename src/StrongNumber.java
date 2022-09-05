import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num, sum = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = sc.nextInt();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            num = num / 10;
            sum = sum + fact;
        }
        if (temp == sum) {
            System.out.println(sum + " Number is Strong");
        } else
            System.out.println(sum + " Number is not Strong");
    }
}

