package PlanetExplorer;

import java.util.Scanner;

public class PlanetExplorer {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		PlanetExplorer1 p=new PlanetExplorer1();
		double res=p.calculateSurfaceArea(radius);
		System.out.printf("%.2f",res);
        scan.close();
	}
	
}
