package String;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
	String username="seed";
	String password="infotech";
	

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter User Name");
		String userName=sc.next();
		System.out.println("==============================================================");
		System.out.println("Enter User Name");
		String password1=sc.next();
		if((username.equals(userName)) &&(password.equals(password1))){
			
			System.out.println("successfully Login");
		}
		else {
			System.out.println("invalid login");
		}
	}

}
