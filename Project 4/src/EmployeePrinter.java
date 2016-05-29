import java.util.Scanner;
import java.io.*;
public class EmployeePrinter {
	public static void main(String[] args){
		myBinaryHeap<Employee> test = new myBinaryHeap<Employee>( );
		String[] separate;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Type the name of the file to read");
	    String fileName = in.nextLine() + ".txt";
	    String line = null;
	    try {
	        FileReader fileReader = new FileReader(fileName);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	        while((line = bufferedReader.readLine()) != null) {
	        	separate = line.split(" ");
	            Employee newemployee = new Employee(Long.valueOf(separate[0]).longValue(),separate[1]);
	            test.insert(newemployee);
	        }   
	
	        bufferedReader.close();         
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println("Unable to open file '" + fileName + "'");                
	    }
	    catch(IOException ex) {
	        System.out.println("Error reading file '" + fileName + "'");                  
	    }
	    System.out.println("Employee List:");
	    String[] splitter = test.toString().split("id");
	    int increment = 1;
	    for(int i = 1; i < splitter.length; i++){
	    	System.out.println(increment + ". id" + splitter[i]);
	    	increment++;
	    }
	}
	
}
