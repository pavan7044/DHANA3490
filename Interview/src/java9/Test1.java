package java9;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method return  " +m());

	}
static String  m(){
	try{
		int i=10/0;
		
	}catch(ArithmeticException e){
		return " catch";
	}
	finally{
		return "finally";
	}
	//return null;
	
	}
}
