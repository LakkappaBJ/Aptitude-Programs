//Sum of n natural number
import java.util.Scanner;
class SumOfNatural{
	public static void main(String args[]){
		int n,sum=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter your number: ");
		n=r.nextInt();
		for(int num=1;num<=n;num++){
			sum=sum+num;
			System.out.print("+"+num
			
			); //optional
		}
		System.out.println("="+sum);
	}
}