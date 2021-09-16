package green.java.spring.exam;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {

		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("start"+signatureStr); 

			System.out.println("핵심 기능 전  공통 기능 " + System.currentTimeMillis());

		try {
			Object obj = joinpoint.proceed(); 
			return obj;
		} finally {
				System.out.println("핵심 기능 후 공통 기능 " + System.currentTimeMillis());

			System.out.println("end" + signatureStr );
		}
	}

}
// AOP 관심사를 모듈화하는 작업 - 클래스든 메소드든 상관없이, 핵심적인 것은 아예 뜯어서관리하고 필요할 때마다 사용한다.