package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanDelete {
	Scanner sc;
	public boolean delAdress(ArrayList <HumanDTO> ar) {
		sc=new Scanner(System.in);
		boolean check = false;
		HumanSearch hsearch = new HumanSearch();
		HumanDTO humanDTO = hsearch.searchAdress(ar);
		return ar.remove(humanDTO);
	}
}
