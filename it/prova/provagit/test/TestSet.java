package it.prova.provagit.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set<String> setDiStringhe = new HashSet<>();
		
		setDiStringhe.add("ciao");
		setDiStringhe.add("prova");
		setDiStringhe.add("ciao");
		setDiStringhe.add("casa");
		setDiStringhe.add("come");
		setDiStringhe.add("stai");
		setDiStringhe.add("ciao");
		
		System.out.println(setDiStringhe);
		
		System.out.println(setDiStringhe.size());
		setDiStringhe.add("lol");
		System.out.println(setDiStringhe);
		
		
	}

}
