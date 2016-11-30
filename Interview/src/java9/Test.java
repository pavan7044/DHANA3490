package java9;

public class Test {
	
	static String s="";
	public static void main(String[] args) {
		try{
			throw new Exception();
			
		}catch(Exception e){
			try{
				try{
					throw new Exception();
					
				}catch( Exception ex){
					s += "a";
					
				}finally{
					s += "b";
				}
				throw new Exception();
			}catch (Exception ed)
			{
				s +="c";
				
			}
			finally{
				 s += "d";
				 
			}
		}finally {
				s +="e";
				
			}
			System.out.println(s);
		}
	}


