package java9;

public class ConstructorOverLoading {
	
	ConstructorOverLoading(int a){
		System.out.println("int single constructor"+a);
	}
	ConstructorOverLoading(int a,int b){
		System.out.println("int single constructor"+a+b);
	}

	ConstructorOverLoading(char ch){
		System.out.println("int single constructor"+ch);
	}
public static void main(String[] args) {
	new ConstructorOverLoading(10);
	new ConstructorOverLoading(15,25);
	new ConstructorOverLoading('p');
}

}

 