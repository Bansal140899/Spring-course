package in.sv.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

@Aspect
public class Login  {

	@Before("execution(* in.sv.service.App.*(..))")
	public void log() {
		System.out.println("helloooo kese ho ");
	}

}
