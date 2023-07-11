package JourneyCalculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculators j=new JourneyCalculators();
		double res=j.calculateDistance(speed,time);
	    System.out.println(res);
	
	}

}
