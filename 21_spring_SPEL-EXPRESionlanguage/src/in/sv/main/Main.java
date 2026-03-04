package in.sv.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
public static void main(String[] args) {
	
	ExpressionParser parsor = new SpelExpressionParser();
	Expression expression = parsor.parseExpression("'helloe deppak'");
	
	
	Object obj = expression.getValue();
	System.out.println(obj);
	
	
	
}
}
