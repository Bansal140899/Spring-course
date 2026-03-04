package in.sv.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	
	 
	
	public static void main(String[] args) {
		
		
		
		
		Thread.currentThread().setName("ajay");
		
		System.out.println("------App start-------");
//		System.out.println(System.getProperty("user.dir"));
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/in/sv/resource/log4j.properties");
		
		
		BasicConfigurator.configure();
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("this is the fatal message");
		logger.error("this is the error message");
		logger.warn("this is warn message");
		logger.info("this is the info message");
		
		System.out.println("--=======app stops =======");
		
	}

}