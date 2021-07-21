package com.iu.s1.ex2;

class Member {
	
	public String id;
	
	int age; //default -> 같은 패키지 내에서만 접근 가능
	
	private String name; // 같은 클래스 내에서만 접근 가능
	
//	Member() {
//		접근지정자가 default일 경우
//	}
	
	private Member() {
		this.id = "iu";
		this.age = 29;
		this.name = "ii";
	}
	
	public Member test() {
		return new Member();
	}
		
}
