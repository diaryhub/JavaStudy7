package com.study.s1.human;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class HumanView {

	public void view(HumanDTO humanDTO) {
		
			if(humanDTO == null)
				return;
			
			String pattern = "yyyy년 MM월 dd일";
			SimpleDateFormat sd = new SimpleDateFormat(pattern);
			
			System.out.println("이름 : " + humanDTO.getName());
			System.out.println("별명 : " + humanDTO.getNick());
			System.out.println("이메일 : " + humanDTO.getEmail());
			System.out.println("전화번호 : " + humanDTO.getPhone());
			System.out.println("생일 : " + sd.format(humanDTO.getBirth().getTime()));
		
	}

	public void view(ArrayList<HumanDTO> ar) {

		String pattern = "yyyy년 MM월 dd일";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("이름 : " + ar.get(i).getName());
			System.out.println("별명 : " + ar.get(i).getNick());
			System.out.println("이메일 : " + ar.get(i).getEmail());
			System.out.println("전화번호 : " + ar.get(i).getPhone());
			System.out.println("생일 : " + sd.format(ar.get(i).getBirth().getTime()));
		}
	}
}
