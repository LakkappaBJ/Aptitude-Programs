class Fibonacci{
	public static void main(String args[]){
	int n=10;
	int num1=0,num2=1;
	System.out.println("Fibonacci Numbers are");
	for(int i=1;i<=n;i++){
		System.out.println(num1+" ");
		int total=num1+num2;
		num1=num2;
		num2=total;
	}
	}
}