package com.study.s1.human;

import java.util.ArrayList;
public class AllHuman {
	public void allAdress(ArrayList<HumanDTO> ar) {
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i).getName());
		System.out.println(ar.get(i).getNick());
		System.out.println(ar.get(i).getEmail());
		System.out.println(ar.get(i).getPhone());
		System.out.println(ar.get(i).getBirth());
		}
		System.out.println("출력 완료");
	}
}
