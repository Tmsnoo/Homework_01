package pl.coderslab.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
	
	
	public static Map<Integer, Integer> checkRand(int amount, int interval){
		List <Integer> range = new ArrayList<>();
		int counter=0;
		while(counter <= interval) {
			range.add(counter);
			counter++;
			System.out.println(range);
		}
		Random rad = new Random();
		List <Integer> allValues = new ArrayList<>();
		for(int i = 0; i < amount ; i++ ) {
			allValues.add(rad.nextInt(interval)+1);
		}
		System.out.println(allValues);
		Map<Integer, Integer> outcome = new HashMap<>();
		for (Integer element : range) {
			outcome.put(element, 0);
		}
		for (Integer each : allValues) {
			if(range.contains(each)) {
				outcome.put(range.get(each), outcome.get(each)+1);
			
		}
		}
//		for(Iterator <Integer> it = allValues.iterator(); it.hasNext();) {
//			if(range.contains(allValues.get(i))) {
//				outcome.put(range.get(allValues.get(i)), outcome.get(range.get(allValues.get(i))+1));
//				System.out.println(outcome);
//			}
		
		//for (Integer element : allValues) {
			
	//	}
		return outcome;
		
	}

	public static void main(String[] args) {
		System.out.println(checkRand(100, 66));
		
		
		

	}

}
