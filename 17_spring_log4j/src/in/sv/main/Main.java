package in.sv.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	
	 
	
	public static void main(String[] args) {
		
		
		
		Thread.currentThread().setName("ajay");
		System.out.println("------App start-------");
		
		
		
		BasicConfigurator.configure();
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("this is the fatal message");
		logger.error("this is the error message");
		logger.warn("this is warn message");
		logger.info("this is the info message");
		
		System.out.println("--=======app stops =======");
		
	}

}