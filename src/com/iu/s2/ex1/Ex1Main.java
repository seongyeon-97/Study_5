package com.iu.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setId("iu");		
		member.setAge(30);
		member.setMuge(600);
		member.setKi(187);
		
		//member.info();
		String id = member.getId();
		System.out.println(id);
		int age = member.getAge();
		System.out.println(age);
		int muge = member.getMuge();
		System.out.println(muge);		
		int ki = member.getKi();
		System.out.println(ki);
		
		
		
		
	}
}
