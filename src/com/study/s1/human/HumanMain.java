package com.study.s1.human;

import java.util.ArrayList;
import java.util.HashMap;

public class HumanMain {

	public static void main(String[] args) {
		HumanMenu humanMenu = new HumanMenu();
		humanMenu.selectMenu();
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		HashMap<String , ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);
	}	

}
