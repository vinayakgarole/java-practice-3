import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = ("" + n).length();
        int sq = n * n;
        int end = sq % (int) Math.pow(10, l);
        if (n == end)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not a Automarphic Number");
    }
}
