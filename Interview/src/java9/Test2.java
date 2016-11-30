package java9;

public class Test2 {
	public static void main(String[] args) {
		
		method1();
		System.out.println("after calling m()");
	}
	static void method1(){
		method2();
	}
	static void method2(){
		method3();
		
	}
	static void method3(){
		throw new NullPoniterException();
	}

}
