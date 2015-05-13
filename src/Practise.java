import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String  text    ="Ebony lthr Sport sts,Ebony(Dy'mic plus) (TIV)";
		
		String abc =text.replaceAll("\\s+","");
		
		System.out.println(abc);
		
		
		String abc1=abc.replaceAll("\\s+","");
		
		System.out.println(abc1);
		
		
		
		
		
		/*String [] abc1 =abc.split(Pattern.quote("("));
		
		System.out.println(abc1[0]);
		
		System.out.println(abc1[1]);
		
		
		String text1="abc";
		
		String text2=text1+")";
		
		System.out.println(text2);*/
		
		
	    
		
		
		
		
	}

}
