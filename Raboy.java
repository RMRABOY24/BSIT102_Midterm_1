
 import java.util.*;
import java.text.*;
 
public class Raboy{
    public static void main(String[] args) throws Exception {
    		
        Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	String input_bday = "24-5-2001";
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear; 
    	System.out.print("My age: " + age);
    }
}