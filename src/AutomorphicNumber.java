import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {

        int p = 0, d = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");

        int n = sc.nextInt();
        int sq = n * n;

        while (p < n) {
            p = sq % d;
            d = d * 10;
        }

        if (p == n)
            System.out.println(n + " is automorphic");
        else
            System.out.println(n + " is not automorphic");
    }
}
