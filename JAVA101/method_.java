package demo;

public class method_ {
	int a = 19;
	static int cc = 123;
	void m1() {
		int a = 10;
		System.out.println("gsdfgsdkl" + a);
	}
	public method_() {
		int b = 10;
		System.out.println("sdf" + b);
	}
	public static void main(String[] args) {
		method_ test = new method_();// object
		test.m1();
		System.out.println("tyhank you"+test.a);
		System.out.println(cc);
		System.out.println(method_.cc);

	}
}
