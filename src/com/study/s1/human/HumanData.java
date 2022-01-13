package com.study.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanData {
	Scanner sc = new Scanner(System.in);
	public void selectMenu() {
		ArrayList<HumanDTO> ar = new ArrayList<>();
		HumanService hs = new HumanService();
		HumanSearch hsearch = new HumanSearch();
		HumanDelete hd = new HumanDelete();
		AllHuman ah = new AllHuman();
		boolean power = true;
		while (power) {
			System.out.println("1)전체 명단 출력");
			System.out.println("2)이름 정보 검색");
			System.out.println("3)주소록 명단 추가");
			System.out.println("4)주소록 명단 삭제");
			System.out.println("5)종료");
			switch (sc.nextInt()) {
			case 1:
				if(ar==null) {
					System.out.println("먼저 정보를 입력하세요.");
					break;
				}
				ah.allAdress(ar);
				break;
			case 2:
				HumanDTO search = hsearch.searchAdress(ar);
				System.out.println("이름:"+search.getName());
				System.out.println("별명:"+search.getNick());
				System.out.println("이메일:"+search.getEmail());
				System.out.println("전화번호:"+search.getPhone());
				System.out.println("생일:"+search.getBirth());
				System.out.println();
				break;
			case 3:
				HumanDTO humanDTO = hs.addAdress(ar);
				ar.add(humanDTO);
				System.out.println("입력 완료");
				break;
			case 4:
				hd.delAdress(ar);
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
