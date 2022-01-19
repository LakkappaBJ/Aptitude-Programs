import java.util.Scanner;
class SumOfOddEven{
	public static void main(String args[]){
		int n,sum=0;
		System.out.println("Enter range");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0){
			for(int i=0;i<=n;i=i+2){
				sum=sum+i;
			}
		System.out.println("Sum of given even number: "+sum);
		}
		else{
			for(int i=1;i<=n;i=i+2){
				sum=sum+i;
			}
		System.out.println("Sum of given odd number: "+sum);
		}
	}
}