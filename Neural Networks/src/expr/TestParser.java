package expr;

public class TestParser {
	
	public static void main(String[] args){
		
		try {
			
			Expr stupido = Parser.parse("x*2");
			System.out.println("value: "+ stupido.value());
			
		} catch (SyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
