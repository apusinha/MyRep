
import java.io.File;
import java.io.FilenameFilter;


public class FileInputOutput {
	  
	public static void main(String[] args) {
	      File dir = new File("C:\\Users\\asinha\\Downloads");   // current working directory
	      if (dir.isDirectory()) {
	         // List only files that meet the filtering criteria
	         //  programmed in accept() method of FilenameFilter.
	         String[] files = dir.list( new FilenameFilter() {
	            public boolean accept(File dir, String file) {
	               return file.endsWith(".pdf");
	            }
	         });  // an anonymous inner class as FilenameFilter
	         for (String file : files) {
	            System.out.println(file);
	         }
	      }
	   }
	}
	
	