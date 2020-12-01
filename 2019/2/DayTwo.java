package adventOfCode2019;

import java.util.*; 

public class DayTwo {

	static ArrayList<Integer> list; 
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		 list = new ArrayList<Integer>();
		scan.useDelimiter(",");
		
		while(scan.hasNext()) {
			
				int nextInt = 0;
				String temp = scan.next(); 
				
				try {
					nextInt = Integer.parseInt(temp);
					list.add(nextInt);
				}
				catch(Exception e){
					break;
				}
			
			
		}
		
		System.out.println("Calculating value");
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				ArrayList<Integer> forLoop = cloneList(list);
				forLoop.set(1, i);
				forLoop.set(2, j);

					for(int ii=0; ii<forLoop.size(); ii = ii+4) {
							switch (forLoop.get(ii)) {
								case 1: {
									int first = forLoop.get(ii+1);
									int second = forLoop.get(ii+2);
									int third = forLoop.get(ii+3);
								try {
									opOne(forLoop.get(first), forLoop.get(second), third, forLoop);
								}
								catch(Exception e) {
									break;
								}
									break;
									}
								case 2: {
									
									int first = forLoop.get(ii+1);
									int second = forLoop.get(ii+2);
									int third = forLoop.get(ii+3);
									try {
										opTwo(forLoop.get(first), forLoop.get(second), third, forLoop);					break;
									}
									catch(Exception e) {
										break;
									}	
								}
						
								case 99: {
									ii = 200;
								}
								default: {
									break;
								}
							}
						}
					if(forLoop.get(0) == 19690720) {
						System.out.println("Final i is " + i + " Final j is " + j);
					}
			}
		}
	}
	
	public static void opOne(int first, int second, int store, ArrayList<Integer> opList) {
		int sum = first + second; 
		
		opList.set(store, sum); 
	}
	
	public static void opTwo(int first, int second, int store, ArrayList<Integer> opList) {
		int sum = first * second; 
		
		opList.set(store, sum); 
	}
	
	public static ArrayList<Integer> cloneList(ArrayList listToClone) {
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			int add = (int) listToClone.get(i);
			newList.add(add);
		}
		
		return newList; 
			
	}
	
}
