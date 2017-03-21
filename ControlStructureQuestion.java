package ControlStructureEx;


import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ControlStructureQuestion {
	
	
	public static void main(String[] args){
		//Old code
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= (5 - i); j++) {
//				System.out.print(".");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print(i);
//			}
//				System.out.println();
//		}
		
		
		int size = 7;
		int i = 1;
		
		//Rewritten code
		while(i <= size){
			int count = size - i;
			
			String periods = Stream.generate(() -> ".").limit(count).collect(joining());
			String num = String.valueOf(i);
			String numbers = Stream.generate(() -> num).limit(i).collect(joining());

			System.out.println(periods + numbers);
			i++;
		}
		//The size variable could be set to any N value and this would work
	}
	
}
