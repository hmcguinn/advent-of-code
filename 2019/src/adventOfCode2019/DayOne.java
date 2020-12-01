package adventOfCode2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOne {
	
	public static void main(String args[]) {

		
		Scanner scan = new Scanner(System.in);
		sumFuel = 0; 

	while(scan.hasNext()) {
		String l = scan.nextLine();
		
		
		int nextScan = Integer.parseInt(l); 
		
		getFuel(nextScan);
	}
		System.out.println(sumFuel);
	
	
		
	}


	private static int sumFuel;
	

	public static void getFuel(int toCalc) {
	
		int newFuel = (toCalc / 3) - 2;
		if(newFuel > 0) {
			sumFuel += newFuel;
		}
		
		// System.out.println(newFuel);
		
		if(newFuel > 0) {
			getFuel(newFuel);
		}
		
		
	}

	
	
}
