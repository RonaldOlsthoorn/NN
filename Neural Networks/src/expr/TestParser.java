package expr;

public class TestParser {
	
	public static void main(String[] args){
		
		try {
			Expr stupido = Parser.parse("(2*4+5)/2<");
		} catch (SyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
