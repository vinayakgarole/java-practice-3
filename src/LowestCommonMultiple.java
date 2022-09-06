import java.util.Scanner;

public class LowestCommonMultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i,s,lcm=0,num=0;
        System.out.println("Enter No.of terms: ");
        a=sc.nextInt();
        b=sc.nextInt();
        num=(a>b)?a:b;
        s=a*b;
        for(i=num; i<=s; i++) {
            if(i%a==0 && i%b==0) {
                lcm=i;
                break;
            }
        }
        System.out.println("LCM : "+lcm);
    }
}
