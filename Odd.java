//print odd number given range
import java.util.Scanner;
class Odd{
	public static void main(String args[]){
		int n;
		System.out.println("Enter your number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<n;i=i+2){
			System.out.println(i+" ");
		}
	/*	for(int i=0;i<=n;i=i+2){   this logic is even just put i=0
			System.out.println(i+" ");
		}
	*/
	}
}