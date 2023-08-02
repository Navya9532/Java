package armstrong;

import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
        int n=scan.nextInt();
        Armstrong armstrong =new Armstrong();
        int res=(int)armstrong.logic(n);
        System.out.println(res);
        if(res==n)
        {
        	System.out.println("Armstrong number");
        }
        else
        {
        	System.out.println("not an Armstrong number");
        }
	}

}
