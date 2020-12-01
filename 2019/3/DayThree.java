package adventOfCode2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DayThree {

	static boolean[][] firstLine; 
	static boolean[][] secondLine; 
	static int x;
	static int y; 
	static int xx;
	static int yy;
	static boolean flag; 
	static int manhattanDistance; 
	static HashMap<Integer, Integer> hashMap; 
	
	
	public static void main(String args[]) {
		
		firstLine = new boolean[50000][50000]; 
		secondLine = new boolean[50000][50000];
		hashMap = new HashMap<Integer, Integer>(); 
		 manhattanDistance = 1000000; 
		 x = 5000;
			y = 5000;
		
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(",");

		 flag = true;

		while(scan.hasNext()) {
			String inputS = scan.next();

			if(inputS.equals("N")) {
				flag = false;
				x = 25000;
				y = 25000;
				System.out.println("flag changed");
			}

				advance(inputS); 
			
		}
		firstLine[25000][25000] = false; 

		for(int i=0; i<50000; i++) {
			for(int j=0; j<50000; j++) {
				if(firstLine[i][j] == true && secondLine[i][j] == true) {
					System.out.println("collision");
					System.out.println("i is + " + i + " j is " + j);
			//		System.out.println("put");
					hashMap.put(i, j);
				}
			}
		}
		
		
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
		    Integer xxx = entry.getKey();
		    Integer yyy = entry.getValue();
		    getManhattanDistance(xxx,yyy);
		}
		
		System.out.println("X is " + xx + " Y is " + yy);
		System.out.println(manhattanDistance); 
	}
	
	public static void advance(String inputString) {
		
		String newString = "";
		

		switch(inputString.charAt(0)) {

		case 'R': {
			for(int i=1; i<inputString.length(); i++) {
				newString = newString + inputString.charAt(i); 
			}
			int number = 0;
			number = Integer.parseInt(newString); 
			for(int i = 0; i < number; i++) {
				if(flag) {
					firstLine[x +i][y] = true;
				}
				else {
					secondLine[x +i][y] = true;
				}
			}
			x = x + number; 
			break;
		}
		case 'L': {
			for(int i=1; i<inputString.length(); i++) {
				newString = newString + inputString.charAt(i); 
			}
			int number = 0;
			number = Integer.parseInt(newString); 

			for(int i = 0; i < number; i++) {
				if(flag) {
					firstLine[x -i][y] = true;
				}
				else {
					secondLine[x -i][y] = true;
				}
			}
			x = x - number; 
			break;
		}
		case 'U': {
			for(int i=1; i<inputString.length(); i++) {
				newString = newString + inputString.charAt(i); 
			}
			int number = 0;
			number = Integer.parseInt(newString); 

			for(int i=0; i<number; i++) {
				if(flag) {
					firstLine[x][y-i] = true;
				}
				else {
					secondLine[x][y-i] = true;
				}
			}
			y= y - number; 
			break;
		}
		case 'D': {
			for(int i=1; i<inputString.length(); i++) {
				newString = newString + inputString.charAt(i); 
			}
			int number = 0;
			number = Integer.parseInt(newString); 

			
			for(int i = 0; i < number; i++) {
				if(flag) {
					firstLine[x][y+i] = true;
				}
				else {
					secondLine[x][y+i] = true;
				}			
				}
			y= y + number; 
			break;
		}
		
		}
		
	}
	
	public static void getManhattanDistance(int xxxx, int yyyy) { 
		
		
		
		
		
		
		int newM = Math.abs(25000-xxxx) + Math.abs(25000-yyyy);
		System.out.println(newM);

		if(newM < manhattanDistance) {
			manhattanDistance = newM; 
			xx = xxxx; 
			yy = yyyy;
		}
	}
	
	
}
