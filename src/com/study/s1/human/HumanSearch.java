package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanSearch {

	private Scanner sc;
	public HumanDTO searchAdress(ArrayList <HumanDTO> ar) {
		System.out.println("이름을 입력하세요.");
		String name = sc.next().trim();
		int search = 0;
		boolean check = true;
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				search = i;
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("이름을 찾을 수 없습니다.");
			return null;
		}
		return ar.get(search);
	}
}
