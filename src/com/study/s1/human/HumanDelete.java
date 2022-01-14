package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanDelete {
	Scanner sc;
	public ArrayList <HumanDTO> delAdress(ArrayList <HumanDTO> ar) {
		sc=new Scanner(System.in);
		HumanSearch hsearch = new HumanSearch();
		HumanDTO humanDTO = hsearch.searchAdress(ar);
		if(humanDTO == null) return ar;
		ar.remove(humanDTO);
		System.out.println("삭제 완료");
		return ar;
	}
}
