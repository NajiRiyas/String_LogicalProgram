package com.logicalprogram;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;

public class Sample {
	
	public void removetheduplicatesInString(){
		
		String s = "najimunisabegum";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				char charAt = s.charAt(i);
				if(map.containsKey(charAt)) {
				}
				else {
					map.put(charAt, 1);
				}
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			System.out.println(key);
		}
		
	}

}
