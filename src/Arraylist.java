import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List lst = new ArrayList();  // A List contains instances of Object. Upcast ArrayList to List
	      lst.add("alpha");            // add() takes Object. String upcast to Object implicitly
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println(lst);     // [alpha, beta, charlie]
	      System.out.println(lst.size());
	 
	      // Get a "iterator" instance from List to iterate thru all the elements of the List
	      Iterator iter = lst.iterator();
	     
	      while (iter.hasNext()) {      // any more element
	         // Retrieve the next element, explicitly downcast from Object back to String
	    	  
	    	  System.out.println(iter.next());
	    	
	      }
	   
	      iter.remove();
	      
	      DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
	      Date date = new Date();
	      
	     // String date2="23 Jan 2015 09:49:59";
	      
	      
		   System.out.println(dateFormat.format(date));
		   
		 Date date1;
		try {
			date1 = dateFormat.parse("23 Jan 2015 09:49:59");
			 System.out.println(dateFormat.format(date1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		 
		System.out.println(date2.equals(date1));

               
		   
		   
	 
		  
		
	}		
	

}
