import java.util.Scanner;
public class Ex1{
    public static void main(String[]args){
        //this one will check if the password is longer than 8 digit/character
        Scanner input=new Scanner(System.in);
		boolean isGood = false;
		while(isGood == false) {
			System.out.println("Type your password.");
			String password = input.nextLine();
			isGood = true;
			if(isLongEnough(password)==false) {
				System.out.println("Password must be longer than 8 characters.");
			isGood=false;
			}
            if(isGood==true) {
				System.out.println("Password is valid.");
			}
        }
    }
    public static boolean isLongEnough(String s) {
        if(s.length()<8) {
        return false;
        }
        else{
        return true;
        }
    }
}