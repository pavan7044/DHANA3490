package java9;
public class Add {
	
	int a,b;
	
	
	   static  void s(){
	  int c;
		  int a=10;
		 int b=20;
	 	c=a+b;
		System.out.println(c);
		
	}

 void r(){
		a=20;
		b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Add q= new Add();
		q.r();
		q.s();
	}
}
