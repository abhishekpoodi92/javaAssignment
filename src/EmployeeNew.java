
public class EmployeeNew implements Runnable   
{  
	  public static void main (String[] args)  
	  {  
	    System.out.println("This is currently running on the main thread, " +  
	            "the id is: " + Thread.currentThread().getId());  
	    EmployeeNew worker = new EmployeeNew();   
	    Thread thread = new Thread(worker);  
	    thread.start();  
	  }  
	    
	    
	  public void run()   
	  {  
	    System.out.println("This is currently running on a separate thread, " +  
	            "the id is: " + Thread.currentThread().getId());  
	      
	  }  
	}  
