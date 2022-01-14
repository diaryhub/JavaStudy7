package com.study.s1.human;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class HumanService {
	private Scanner sc;
	
	public HumanDTO addAdress(ArrayList <HumanDTO> ar) {
		sc= new Scanner(System.in);
		HumanDTO humanDTO = new HumanDTO();
		System.out.println("이름 입력:");
		humanDTO.setName(sc.next());
		System.out.println("별명 입력:");
		humanDTO.setNick(sc.next());
		System.out.println("이메일 입력:");
		humanDTO.setEmail(sc.next());
		System.out.println("전화번호 입력:");
		humanDTO.setPhone(sc.next());
		System.out.println("생일 입력:");
		String s = sc.next();
		Calendar ca = Calendar.getInstance();
		int year=Integer.parseInt(s.substring(0,4));
		int month=Integer.parseInt(s.substring(4,6))-1;
		int date=Integer.parseInt(s.substring(6));
		ca.set(year,month,date);
		humanDTO.setBirth(ca);
		
		return humanDTO;
	}
	

}
