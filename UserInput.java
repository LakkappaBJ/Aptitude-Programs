//Provide user input..
import java.util.Scanner;  //Scanner class import
class UserInput{
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in); //object creation
		System.out.println("Enter your Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Your numbers are: "+a+"\n"+b);
	} 
}