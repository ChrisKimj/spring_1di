package org.iclass.day1di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		//spring-context : bean에 접근하기 위한 가장 앞단에 있는 라이브러리
		//					bean에 접근하기 위해 사용.
		//					bean은 스프링 컨테이너에 저장.
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(BuyConfig.class);
		//결론-1- : 
		//		정의된 생성자로 bean(객체)를 만든다.
		//		여러개 생성자가 정의되어있다면 기본생성자 우선. 다른건 안출력됨
		
		//1.여기까지 코딩하고 실행시키면 객체가 생성된 것을 확인할 수 있다.
		//2.생성된 bean을 가져오기
		Buy2Controller controller = context.getBean(Buy2Controller.class);
		//그래서 컨트롤러랑 서비스랑 다오에 setter메소드 만듦
		
		//3.인스턴스 메소드 buy() 실행하기
		controller.buy();
		
	}
}
	//@Component : bean으로 만들어질 클래스 위에 설정한다. 
				//개발자가 직접 작성한 Class를 Bean으로 등록하기 위한 Annotation 입니다.
	//@Configuration : 설정정보를 갖는 클래스
	//@ComponentScan : basePackages로 지정된 패키지의 모든 클래스를 스캔하겟다.
	
		//@ComponentScan(basePackages = "org.iclass.day1di") : 
			//@Component를 찾아서 bean(객체)을 만들기 위한 스캔이다. 배열형식으로 여러 패키지를 설정할 수 잇다.
	
	
	
	//결론-2- : 프로퍼티 변수에 @Autowired로 bean자동 주입하기(필드주입)
	
	//*참고 : bean정의하는 이외 다른 방법
	//1)xml 2)자바클래스에 @Bean 사용

//주의 : @ComponentScans 는  @ComponenetScan의 배열
	//@Configuration
	//@ComponentScans({ 
		//  @ComponentScan(1.basePackages = "com.baeldung.annotations"), 
		//  @ComponentScan(2.basePackageClasses = VehicleFactoryConfig.class)
		//})
	//class VehicleFactoryConfig {}
	
	

