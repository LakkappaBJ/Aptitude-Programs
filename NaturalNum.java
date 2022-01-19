//To print N natural number
import java.util.Scanner;
class NaturalNum{
	public static void main(String args[]){
		int n;
		System.out.println("Enter the number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i+" ");
		}
	}
}