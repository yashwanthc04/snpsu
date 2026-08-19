package java102;

class parents{
	int a=10;
	int b=20;
	
}
public class multilevel extends parents {
	int a=20;
	int b=30;
	void add(int a, int b) {
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		multilevel jj = new multilevel();
		jj.add(2, 3);
	}

}
