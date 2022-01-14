package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMenu {
	Scanner sc = new Scanner(System.in);

	public void selectMenu() {
		ArrayList<HumanDTO> ar = new ArrayList<>();
		HumanService hs = new HumanService();
		HumanSearch hsearch = new HumanSearch();
		HumanDelete hd = new HumanDelete();
		HumanView hv = new HumanView();
		boolean power = true;
		while (power) {
			System.out.println("1)전체 명단 출력");
			System.out.println("2)이름 정보 검색");
			System.out.println("3)주소록 명단 추가");
			System.out.println("4)주소록 명단 삭제");
			System.out.println("5)종료");
			switch (sc.nextInt()) {
			case 1:
				if(ar.size()<1) {
					System.out.println("먼저 정보를 입력하세요.");
					break;
				}
				hv.view(ar);
				
				break;
			case 2:
				HumanDTO search = hsearch.searchAdress(ar);
				hv.view(search);
				break;
			case 3:
				HumanDTO humanDTO = hs.addAdress(ar);
				ar.add(humanDTO);
				System.out.println("입력 완료");
				break;
			case 4:
				boolean check = hd.delAdress(ar);
				if(check)System.out.println("삭제 완료");
				break;
			case 5:
				System.out.println("시스템 종료");
				power = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
