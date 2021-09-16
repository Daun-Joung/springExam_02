package green.java.spring.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext atx = new GenericXmlApplicationContext("classpath:applicationContext.xml"); // 여기 클래스파일에서 거기있는 bean을 사용하겠따!
		Dogs mydog = atx.getBean("dogs", Dogs.class );
		
		mydog.getDogsInfo();
	
	}

}
