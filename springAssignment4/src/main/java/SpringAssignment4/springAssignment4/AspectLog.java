package SpringAssignment4.springAssignment4;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
@Component
public class AspectLog {
	
	@Around("execution(* SpringAssignment4.springAssignment4.Triangle.*(..))")
	public Object logTime(ProceedingJoinPoint jp) throws Throwable{
		long startTime=System.currentTimeMillis();
		Object result=jp.proceed();
		long endTime=System.currentTimeMillis();
		long executionTime=endTime - startTime;
		
		System.out.println(jp.getSignature()+ " executed in "+executionTime+" ms");
		return result;
	}

}
