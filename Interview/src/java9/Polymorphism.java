package java9;

public class Polymorphism {

	void Dv(int a,int b,int c){
		
		
		
		System.out.println("first method"+(a+b+c));
	}
	
void Dv(int d,int e){
		
		
		
		System.out.println("second method"+d+""+e);
	}
void Dv(int f){
	
	
	
	System.out.println("third method"+f);
}
void Dv(){
	
	
	
	System.out.println("last method");
}
public static void main(String[] args) {
	Polymorphism B = new Polymorphism();
	B.Dv();
	B.Dv(10);
	B.Dv(12, 15);
	B.Dv(5, 15, 25);
}
	
	
}
