package in.sv.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class Login implements MethodBeforeAdvice ,AfterAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("are you ready for the tranction ");
		
	}

	public void after(Method method, Object[] args, Object target) throws Throwable {
	// TODO Auto-generated method stub
		
		System.out.println("succefull tarction");
		
	}

}
