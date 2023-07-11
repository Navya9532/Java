package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Double fah=scan.nextDouble();
		TemperatureConverter t=new TemperatureConverter();
		double res=t.convertFahrenheitToCelsius(fah);
		System.out.println(res);
		}

}
