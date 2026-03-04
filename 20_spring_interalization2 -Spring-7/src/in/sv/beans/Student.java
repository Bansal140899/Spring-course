package in.sv.beans;
import java.util.Locale;
import java.util.ResourceBundle;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;


public class Student {
	private MessageSource msg;
	
	
	public MessageSource getMsg() {
		return msg;
	}


	public void setMsg(MessageSource msg) {
		this.msg = msg;
	}


	public void display() {
		
	Locale locale  = new Locale("en" ,"US");
	String message = msg.getMessage("key_message",null , locale);
	
		
		System.out.println("HELLO ,HOW ARE YOU  ?");
	
		
	}

}
