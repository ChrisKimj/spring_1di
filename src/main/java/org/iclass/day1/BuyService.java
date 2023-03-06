package org.iclass.day1;


public class BuyService {	//2222222222222222222
	
	private BuyDao dao;		//의존관계의 클래스 : BuyService 객체는 BuyDao 객체를 사용합니다.
	
	public BuyService() {	//기본 생성자
		System.out.println("::::: BuyService 기본 생성자 :::::");
	}
	
	public BuyService(BuyDao dao) {
		System.out.println("::::: BuyService 커스텀 생성자 - BuyDao 객체 주입이 아님  :::::");
		this.dao=dao;
	}

	//의존관계 주입 : setter
	public void setDao(BuyDao dao) {
		this.dao = dao;
	}
	
	//일반 메소드
	public void buy() {
		System.out.println("~~~~~ service buy() ~~~~~ ");
		dao.buy();
		//**********서비스의 바이는 다오를 부름 null포인터익셉션 뜸
	}
	

}
