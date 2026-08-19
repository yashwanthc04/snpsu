package java102;

public class armstrong {
	public static void main(String[] args) {
	
	int n = 153, original = n , sum = 0 ;
	
	while (n>0) {
		int digit=n%10;
		sum=sum+(digit*digit*digit*digit);
		n=n/10;
		
	}
	if(sum==original) {
		System.out.println(original+" is an armstrong");
	}else {
		System.out.println(original+" is not an armstrong");

	}
	
	}

}
