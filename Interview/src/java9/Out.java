package java9;

public class Out {
public static void main(String[] args) {
	try{
		
		System.out.println("try bolck");
		System.exit(0);
	}
	finally{
		System.out.println("finally block");
	}
}
}
