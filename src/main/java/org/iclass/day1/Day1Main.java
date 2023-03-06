package org.iclass.day1;

public class Day1Main {

	public static void main(String[] args) {
		
		//기존의 객체를 new 연산으로 직접 생성하는 예시
		//컨트롤러가 가장 (가장 먼저)앞단에서 요청을 처리하는 경우로 예씨
		BuyDao dao=new BuyDao("JDBC");
		BuyDao dao1=new BuyDao();
		
		System.out.println(":::::1. setter 메소드로 의존관계를 설정 ::::");
		//1)dao객체를 service가 사용하게 해줘야됨.방법 1)setter메소드로 전달하기2)생성자로 전달
		BuyService service = new BuyService();
		service.setDao(dao);		
		//2)service 객체를 controller에 전달(사용)하는 방법: 
			
		BuyController controller = new BuyController();
		System.out.println("-------------------------------------------");
		controller.setService(service);		//buycontroller의 @setter를 가져옴
		controller.buy();	//여기서 3줄 출력됨
		
		System.out.println("\n");
		BuyDao dao2 = new BuyDao("mybatis");
		System.out.println(":::::2.커스텀 생성자로 의존관계를 설정 ::::");
		BuyService service2 = new BuyService(dao2);		//같은이름의 서비스이나 이건 커스텀생성자가져오는 서비스
		BuyController controller2 = new BuyController(service);
		controller2.buy();	//여기서 또 3줄 출력
		
		
	}
//스프링에서는 1)2)에 해당하는 의존객체 설정을 자동으로 한다.
	//1.생성자(커스텀생성자) 주입 2. setter주입 3.기본생성자 + 필드 주입
	
}
