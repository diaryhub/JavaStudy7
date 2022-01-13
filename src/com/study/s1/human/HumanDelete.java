package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanDelete {
	Scanner sc;
	public ArrayList <HumanDTO> delAdress(ArrayList <HumanDTO> ar) {
		HumanSearch hsearch = new HumanSearch();
		HumanDTO humanDTO = hsearch.searchAdress(ar);
		ar.remove(humanDTO);
		System.out.println("삭제 완료");
		return ar;
	}
}
