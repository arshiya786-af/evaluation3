package evaluation3.question4;
import java.util.Scanner;
import java.util.regex.*;

public class Demo {

	public static  void main(String args[]){
		System.out.println("username");
		Scanner un=new Scanner (System.in);
		String user=un.nextLine();
		System.out.println("password");
		Scanner pw=new Scanner (System.in);
		String password=pw.next();
		System.out.println("mobilenumber");
		Scanner mn=new Scanner (System.in);
		String mobile=mn.nextLine();
		System.out.println("email");
		Scanner em=new Scanner (System.in);
		String email=em.next();
		Demo d=new Demo();
		 if(Username(user)==true&&Password(password)==true&&mobile(mobile)==true&&Email(email)==true);
		 {
			 System.out.println("username"+user);
			 System.out.println("password"+password);
			 System.out.println("mobile"+mobile);
			 System.out.println("email"+email);
		 }
			 System.out.println("Fill valid details");
		 
		
	}
		
		 public static boolean Username(String user)
		    {
		  
		        String regex = "^[A-Za-z]\\w{5,29}$";
		        Pattern p = Pattern.compile(regex);
		        if (user == null) {
		            return false;
		        }
		        Matcher m = p.matcher(user);
		        return m.matches();
		    }
		
		
			public static boolean Password( String password)
		    {
		  
		        String regex = "^(?=.*[0-9])"
		                       + "(?=.*[a-z])(?=.*[A-Z])"
		                       + "(?=.*[@#$%^&+=])"
		                       + "(?=\\S+$).{8,20}$";
		  
		        // Compile the ReGex
		        Pattern p = Pattern.compile(regex);
		  
		        if (password == null) {
		            return false;
		        }
		  
		        // Pattern class contains matcher() method
		        // to find matching between given password
		        // and regular expression.
		        Matcher m = p.matcher(password);
		  
		        // Return if the password
		        // matched the ReGex
		        return m.matches();
		    }
		  
	
	public static boolean mobile(String mobile)
	{
	      
	    Pattern p = Pattern.compile("(6|7|8|9)?[0-9]{10}");
	    Matcher m = p.matcher(mobile);
	    return (m.find() && m.group().equals(mobile));
	}
	
public static boolean Email(String email)
{
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$";
                          
    Pattern pat = Pattern.compile(emailRegex);
    if (email == null)
        return false;
    return pat.matcher(email).matches();
}
}

