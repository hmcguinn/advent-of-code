package adventOfCode2019;

public class DayFour {

	//does not decrease
	public static boolean checkNoDecrease(char[] array) {
		
		for(int i=0; i<=5; i++) {
			if(array[i] <= array[i+1]) {
				if(i==4) {
					return true;
				}
				continue;
			}
			else{
				return false;
			}
		}
		return false;
	}
	
	public static boolean checkAdjacent(char[] array) {
	
		int[] numAr = new int[10]; 
		boolean flag = false;
		for(int i=0; i<6; i++) {
			switch(array[i]) {
				case '0': {
					numAr[0]++; 
					break;
				}
				case '1': {
					numAr[1]++; 
					break;
				}
				case '2': {
					numAr[2]++; 
					break;
				}
				case '3': {
					numAr[3]++; 
					break;
				}
				case '4': {
					numAr[4]++;
					break;

				}
				case '5': {
					numAr[5]++; 
					break;
				}
				case '6': {
					numAr[6]++; 
					break;
				}
				case '7': {
					numAr[7]++; 
					break;
				}
				case '8': {
					numAr[8]++; 
					break;
				}
				case '9': {
					numAr[9]++; 
					break;
				}
			}
		}
		for(int i=0; i<10; i++) {
			if(numAr[i] == 2) {
				flag = true;
			}
		
		}
		if(flag) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		
		int numValid = 0; 
		String numbr = String.valueOf(111122);
		char[] digts = numbr.toCharArray();
		if(checkAdjacent(digts)) {
			System.out.println("adjacent");
		}
		if(checkNoDecrease(digts)) {
			System.out.println("nod");
		}
	
		
		for(int i=248345; i<=746315; i++) {
			String number = String.valueOf(i);
			char[] digits = number.toCharArray();
			
			if(checkNoDecrease(digits) && checkAdjacent(digits)) {
					numValid++;
			}

			
		}
		System.out.println(numValid);
	
		
	
		
	}
}
