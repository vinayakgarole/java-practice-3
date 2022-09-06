import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for (int i=1; i<num; i++) {
            if(i*i==num) {
                System.out.println("Perfect Square Number is "+i);
            }
        }
    }
}
