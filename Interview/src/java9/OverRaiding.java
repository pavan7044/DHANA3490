package java9;

  class OverRaiding {
	
	
	void marry(){
		System.out.println("black child");
	}
	

}
  class Child extends OverRaiding{
	 void marry(){
		 System.out.println("white girl");
	 }
	 public static void main(String[] args) {
		new Child().marry();
	}
 }
 