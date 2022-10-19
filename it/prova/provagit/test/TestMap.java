package it.prova.provagit.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> studenti = new HashMap<>();
		
		studenti.put(1, "luca");
		studenti.put(2, "mario");
		studenti.put(1, "bowser");
		studenti.put(3, "luigi");
		studenti.put(4, "mario");
		studenti.put(5, "bowser");
		studenti.put(6, "fungo");
		
		System.out.println(studenti);
		System.out.println(studenti.keySet());
		for (Integer key : studenti.keySet()) {
			System.out.println(studenti.get(key));
		}
		
	}

}
