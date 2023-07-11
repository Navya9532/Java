package heightConverter;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
        HeightConverter h=new HeightConverter();
        System.out.printf("%.2f",h.convertInchesToFeet(inches));
        scan.close();
	}

}
