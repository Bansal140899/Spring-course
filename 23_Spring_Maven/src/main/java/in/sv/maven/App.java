package in.sv.maven;

//import jdk.internal.misc.FileSystemOption;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
    	
    	System.out.println("======================");
    	
    	
    	
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
        System.out.println("Hello World!");
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("======================");
    }
    
    
    
    
    
    
    
}
