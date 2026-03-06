package in.sv.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class Login {

    @Before("execution(* in.sv.service.App.*(..))")
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("Are you ready for the transaction");
    }

    @After("execution(* in.sv.service.App.*(..))")
    public void afterAdvice(JoinPoint jp) {
        System.out.println("Transaction completed");
    }
}