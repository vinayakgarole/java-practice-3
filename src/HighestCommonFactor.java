import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int num2=sc.nextInt();
        int HCF = 1;
        for(int i=1; i<num1; i++) {
            if(num1%i==0)
                HCF=i;
        }
        for(int i=1; i<num2; i++) {
            if(num2%i==0)
                HCF=i;
        }
        System.out.println("HCF is : " +HCF);
    }
}
